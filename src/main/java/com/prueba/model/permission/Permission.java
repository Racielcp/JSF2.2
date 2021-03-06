package com.prueba.model.permission;

import java.io.Serializable;

import com.prueba.model.EntityBase;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import com.prueba.constraints.XSS;
import com.prueba.gui.importer.ConstraintImportField;
import com.prueba.gui.importer.ConstraintImportTable;

@XmlRootElement
@ConstraintImportTable(keys={"id"})
public class Permission extends EntityBase implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_permission.id
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
	@NotNull
	@ConstraintImportField(columnName="id",messageError="error.permission.id",pattern="^(\\-)?\\d+(\\.\\d+)?$",isPK=true,isCompulsory=true)
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_permission.name
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
	@XSS
	@NotNull
	@Size(min=0,max=255)
	@ConstraintImportField(columnName="name",messageError="error.permission.name",pattern=".+",isPK=false,isCompulsory=false)
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_permission
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_permission.id
     *
     * @return the value of t_permission.id
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_permission.id
     *
     * @param id the value for t_permission.id
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_permission.name
     *
     * @return the value of t_permission.name
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_permission.name
     *
     * @param name the value for t_permission.name
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Permission other = (Permission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }
}
