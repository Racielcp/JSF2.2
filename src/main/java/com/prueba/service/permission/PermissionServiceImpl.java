package com.prueba.service.permission;

			
			
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.model.permission.Permission;
import com.prueba.persistence.permission.PermissionMapper;
import com.prueba.persistence.PaginationContext;
import com.prueba.model.permission.PermissionExample;
import com.prueba.model.permission.PermissionExample.Criteria;
import com.prueba.util.introspector.BeanProxy;
import com.prueba.util.Constants;

/**
 * Servicio que gestiona todas las operaciones CRUD 
 * sobre objetos Permission.
 * Esta clase a parte de gestionar dichas operaciones CRUD se puede extender
 * para realizar otro tipo de procesamientos sobre los objetos Permission.
 *
 */ 
 
@Service("permissionService")
@Transactional(readOnly = true, isolation=Isolation.READ_COMMITTED)
public class PermissionServiceImpl implements PermissionService {
	@Autowired
	private PermissionMapper permissionMapper;
	private PermissionExample example;
	private BeanProxy proxyEntity;
	private BeanProxy proxyCriteria;
	
	public PermissionServiceImpl() {
		try
		{
			proxyCriteria = new BeanProxy(Criteria.class);
			proxyEntity = new BeanProxy(Permission.class);
		}catch (Exception e) {
			LOGGER.error("Error los proxy de los servicios Permission : "+e.getMessage());
		}
	}
	
	@Transactional(readOnly=false, propagation = Propagation.REQUIRED)
	public void add(Permission aPermission) {
		permissionMapper.insert(aPermission);
	}
	
	@Transactional(readOnly=false, propagation = Propagation.REQUIRED)
	public void update(Permission aPermission) {
					permissionMapper.updateByPrimaryKey(aPermission);
			}
	
	@Transactional(readOnly=false, propagation = Propagation.REQUIRED)
	public void update(Permission aPermission, PermissionExample aPermissionExample) {
					permissionMapper.updateByExample(aPermission, aPermissionExample);
			}

		@Transactional(readOnly=false, propagation = Propagation.REQUIRED)
	public void delete(Permission aPermission) {
					PermissionExample aPermissionExample = new PermissionExample();
			aPermissionExample.createCriteria().andIdEqualTo(aPermission.getId());
			permissionMapper.deleteByExample(aPermissionExample);
			}
		
	
	@Transactional(readOnly=false, propagation = Propagation.REQUIRED)
	public void delete(PermissionExample aPermissionExample) {
					permissionMapper.deleteByExample(aPermissionExample);
			}

	public List<Permission> getAll() {		
		return permissionMapper.selectByExample(new PermissionExample());
	}

	public List<Permission> getAll(PermissionExample aPermissionExample) {		
		return permissionMapper.selectByExample(aPermissionExample);
	}
	
	public int getTotal(){
		return permissionMapper.countByExample(new PermissionExample());
	}
	
	public int getTotal(PermissionExample aPermissionExample){
		return permissionMapper.countByExample(aPermissionExample);
	}	

		
	//Borra todos los datos de la tabla
	@Transactional(readOnly=false, propagation = Propagation.REQUIRED)
	public void deleteAllData(){
			permissionMapper.deleteAllData();
		}
	
	public List<Permission> findSearch(PermissionExample example,
			PaginationContext paginationContext, int page) {
		if(page < 1)
		{
			page = 1;
		}
		this.example = example;
		paginationContext.setSkipResults(paginationContext.getMaxResults() * (page - 1));
		paginationContext.updateTotalCount(permissionMapper.countByExample(example));
		example.setLimit(paginationContext.getSkipResults() + paginationContext.getMaxResults());
		example.setOffset(paginationContext.getSkipResults());
		return  permissionMapper.selectByExamplePagination(example);
	}

	public List<Permission> getPaginated(String operation, PaginationContext paginationContext) { //previous,next,first,last,
		List<Permission> permissions = null;
		if (operation==null){
			paginationContext.firstPage();
		}
		else if (operation.equalsIgnoreCase(Constants.PREVIOUS)){
			paginationContext.previousPage();
		}
		else if (operation.equalsIgnoreCase(Constants.NEXT)){
			paginationContext.nextPage();
		}
		else if (operation.equalsIgnoreCase(Constants.LAST)){
			paginationContext.lastPage();
		}
		else
		{
			paginationContext.firstPage();
		}
		// Acceso a la paginacion
		// Acceso a la paginacion
		example.setLimit(paginationContext.getSkipResults() + paginationContext.getMaxResults());
		example.setOffset(paginationContext.getSkipResults());
		paginationContext.updateTotalCount(permissionMapper.countByExample(example));
		permissions = permissionMapper.selectByExamplePagination(example);

		// Imprime los resultados
		String msg = String.format(
				"skipResults %d de un total de %d records, en paginas de %d ",
				paginationContext.getSkipResults(), paginationContext
						.getTotalCount(), paginationContext.getMaxResults());
		LOGGER.debug(msg);
		return permissions;
	}
	
	@Override
	public List<Permission> getPaginated(PermissionExample example) {
		return permissionMapper.selectByExamplePagination(example);
	}
	
	@Transactional(readOnly=false, propagation = Propagation.REQUIRED)
	public void updateOrInsert(Permission aPermission,String[] conditions) throws NoSuchMethodException, NoSuchFieldException, InvocationTargetException,IllegalAccessException{		
		PermissionExample tableConditions = new PermissionExample();
		if (conditions.length>0){
			tableConditions= createUpdateCriteria(aPermission,tableConditions,conditions);			
			int rows = permissionMapper.updateByExample(aPermission, tableConditions);
			if (rows==0){
				permissionMapper.insert(aPermission);
			}
		}
		else
		{
			permissionMapper.insert(aPermission);
		}
	}
	
	private PermissionExample createUpdateCriteria(Permission aPermission,PermissionExample tableConditions,String[] conditions) throws NoSuchMethodException, NoSuchFieldException, InvocationTargetException,IllegalAccessException {
		int numberOfConditions=conditions.length;
		Criteria criteria = tableConditions.createCriteria();
		proxyCriteria.setBean(criteria);
		proxyEntity.setBean(aPermission);
		for (int i=0;i<numberOfConditions;i++){
			String condition=conditions[i];
			condition= condition.replace("_", "");
			Object value = proxyEntity.get(condition);
			if(value != null){
				proxyCriteria.invoke(getNameMethod(condition), new Class<?>[]{value.getClass()}, new Object[] {value});
			}
		}
		return tableConditions;
	}
	
	private String getNameMethod(String key){
		StringBuffer buffer = new StringBuffer();
		buffer.append("and");
		buffer.append(key.substring(0, 1).toUpperCase());
		buffer.append(key.substring(1,key.length()));
		buffer.append("EqualTo");
		return buffer.toString();
	}
}
	