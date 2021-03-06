package com.prueba.model.wshistory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.prueba.model.ExampleBase;
import com.prueba.model.CriteriaBase;
public class WsHistoryExample extends ExampleBase {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_ws_history
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_ws_history
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_ws_history
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ws_history
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    public WsHistoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ws_history
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ws_history
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ws_history
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ws_history
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ws_history
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ws_history
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ws_history
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ws_history
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ws_history
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ws_history
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_ws_history
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andServicerequestdateIsNull() {
            addCriterion("serviceRequestDate is null");
            return (Criteria) this;
        }

        public Criteria andServicerequestdateIsNotNull() {
            addCriterion("serviceRequestDate is not null");
            return (Criteria) this;
        }

        public Criteria andServicerequestdateEqualTo(Date value) {
            addCriterion("serviceRequestDate =", value, "servicerequestdate");
            return (Criteria) this;
        }

        public Criteria andServicerequestdateNotEqualTo(Date value) {
            addCriterion("serviceRequestDate <>", value, "servicerequestdate");
            return (Criteria) this;
        }

        public Criteria andServicerequestdateGreaterThan(Date value) {
            addCriterion("serviceRequestDate >", value, "servicerequestdate");
            return (Criteria) this;
        }

        public Criteria andServicerequestdateGreaterThanOrEqualTo(Date value) {
            addCriterion("serviceRequestDate >=", value, "servicerequestdate");
            return (Criteria) this;
        }

        public Criteria andServicerequestdateLessThan(Date value) {
            addCriterion("serviceRequestDate <", value, "servicerequestdate");
            return (Criteria) this;
        }

        public Criteria andServicerequestdateLessThanOrEqualTo(Date value) {
            addCriterion("serviceRequestDate <=", value, "servicerequestdate");
            return (Criteria) this;
        }

        public Criteria andServicerequestdateIn(List<Date> values) {
            addCriterion("serviceRequestDate in", values, "servicerequestdate");
            return (Criteria) this;
        }

        public Criteria andServicerequestdateNotIn(List<Date> values) {
            addCriterion("serviceRequestDate not in", values, "servicerequestdate");
            return (Criteria) this;
        }

        public Criteria andServicerequestdateBetween(Date value1, Date value2) {
            addCriterion("serviceRequestDate between", value1, value2, "servicerequestdate");
            return (Criteria) this;
        }

        public Criteria andServicerequestdateNotBetween(Date value1, Date value2) {
            addCriterion("serviceRequestDate not between", value1, value2, "servicerequestdate");
            return (Criteria) this;
        }

        public Criteria andServiceIsNull() {
            addCriterion("service is null");
            return (Criteria) this;
        }

        public Criteria andServiceIsNotNull() {
            addCriterion("service is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEqualTo(String value) {
            addCriterion("service =", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotEqualTo(String value) {
            addCriterion("service <>", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThan(String value) {
            addCriterion("service >", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThanOrEqualTo(String value) {
            addCriterion("service >=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThan(String value) {
            addCriterion("service <", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThanOrEqualTo(String value) {
            addCriterion("service <=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLike(String value) {
            addCriterion("service like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotLike(String value) {
            addCriterion("service not like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceIn(List<String> values) {
            addCriterion("service in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotIn(List<String> values) {
            addCriterion("service not in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceBetween(String value1, String value2) {
            addCriterion("service between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotBetween(String value1, String value2) {
            addCriterion("service not between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andResponseformatIsNull() {
            addCriterion("responseFormat is null");
            return (Criteria) this;
        }

        public Criteria andResponseformatIsNotNull() {
            addCriterion("responseFormat is not null");
            return (Criteria) this;
        }

        public Criteria andResponseformatEqualTo(String value) {
            addCriterion("responseFormat =", value, "responseformat");
            return (Criteria) this;
        }

        public Criteria andResponseformatNotEqualTo(String value) {
            addCriterion("responseFormat <>", value, "responseformat");
            return (Criteria) this;
        }

        public Criteria andResponseformatGreaterThan(String value) {
            addCriterion("responseFormat >", value, "responseformat");
            return (Criteria) this;
        }

        public Criteria andResponseformatGreaterThanOrEqualTo(String value) {
            addCriterion("responseFormat >=", value, "responseformat");
            return (Criteria) this;
        }

        public Criteria andResponseformatLessThan(String value) {
            addCriterion("responseFormat <", value, "responseformat");
            return (Criteria) this;
        }

        public Criteria andResponseformatLessThanOrEqualTo(String value) {
            addCriterion("responseFormat <=", value, "responseformat");
            return (Criteria) this;
        }

        public Criteria andResponseformatLike(String value) {
            addCriterion("responseFormat like", value, "responseformat");
            return (Criteria) this;
        }

        public Criteria andResponseformatNotLike(String value) {
            addCriterion("responseFormat not like", value, "responseformat");
            return (Criteria) this;
        }

        public Criteria andResponseformatIn(List<String> values) {
            addCriterion("responseFormat in", values, "responseformat");
            return (Criteria) this;
        }

        public Criteria andResponseformatNotIn(List<String> values) {
            addCriterion("responseFormat not in", values, "responseformat");
            return (Criteria) this;
        }

        public Criteria andResponseformatBetween(String value1, String value2) {
            addCriterion("responseFormat between", value1, value2, "responseformat");
            return (Criteria) this;
        }

        public Criteria andResponseformatNotBetween(String value1, String value2) {
            addCriterion("responseFormat not between", value1, value2, "responseformat");
            return (Criteria) this;
        }

        public Criteria andServicenameIsNull() {
            addCriterion("serviceName is null");
            return (Criteria) this;
        }

        public Criteria andServicenameIsNotNull() {
            addCriterion("serviceName is not null");
            return (Criteria) this;
        }

        public Criteria andServicenameEqualTo(String value) {
            addCriterion("serviceName =", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotEqualTo(String value) {
            addCriterion("serviceName <>", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameGreaterThan(String value) {
            addCriterion("serviceName >", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameGreaterThanOrEqualTo(String value) {
            addCriterion("serviceName >=", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLessThan(String value) {
            addCriterion("serviceName <", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLessThanOrEqualTo(String value) {
            addCriterion("serviceName <=", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLike(String value) {
            addCriterion("serviceName like", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotLike(String value) {
            addCriterion("serviceName not like", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameIn(List<String> values) {
            addCriterion("serviceName in", values, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotIn(List<String> values) {
            addCriterion("serviceName not in", values, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameBetween(String value1, String value2) {
            addCriterion("serviceName between", value1, value2, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotBetween(String value1, String value2) {
            addCriterion("serviceName not between", value1, value2, "servicename");
            return (Criteria) this;
        }

        public Criteria andNumberofelementsIsNull() {
            addCriterion("numberOfElements is null");
            return (Criteria) this;
        }

        public Criteria andNumberofelementsIsNotNull() {
            addCriterion("numberOfElements is not null");
            return (Criteria) this;
        }

        public Criteria andNumberofelementsEqualTo(Integer value) {
            addCriterion("numberOfElements =", value, "numberofelements");
            return (Criteria) this;
        }

        public Criteria andNumberofelementsNotEqualTo(Integer value) {
            addCriterion("numberOfElements <>", value, "numberofelements");
            return (Criteria) this;
        }

        public Criteria andNumberofelementsGreaterThan(Integer value) {
            addCriterion("numberOfElements >", value, "numberofelements");
            return (Criteria) this;
        }

        public Criteria andNumberofelementsGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberOfElements >=", value, "numberofelements");
            return (Criteria) this;
        }

        public Criteria andNumberofelementsLessThan(Integer value) {
            addCriterion("numberOfElements <", value, "numberofelements");
            return (Criteria) this;
        }

        public Criteria andNumberofelementsLessThanOrEqualTo(Integer value) {
            addCriterion("numberOfElements <=", value, "numberofelements");
            return (Criteria) this;
        }

        public Criteria andNumberofelementsIn(List<Integer> values) {
            addCriterion("numberOfElements in", values, "numberofelements");
            return (Criteria) this;
        }

        public Criteria andNumberofelementsNotIn(List<Integer> values) {
            addCriterion("numberOfElements not in", values, "numberofelements");
            return (Criteria) this;
        }

        public Criteria andNumberofelementsBetween(Integer value1, Integer value2) {
            addCriterion("numberOfElements between", value1, value2, "numberofelements");
            return (Criteria) this;
        }

        public Criteria andNumberofelementsNotBetween(Integer value1, Integer value2) {
            addCriterion("numberOfElements not between", value1, value2, "numberofelements");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_ws_history
     *
     * @mbggenerated do_not_delete_during_merge Tue Oct 08 08:20:18 CEST 2013
     */
public static class Criteria extends GeneratedCriteria implements CriteriaBase{

	 	public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return this;
        }
    	 	 	public Criteria andNumberofelementsLike(String value) {
            addCriterion("numberofelements like", value, "numberofelements");
            return this;
        }
    	 	 	 	 	public Criteria andServicerequestdateLike(String value) {
            addCriterion("servicerequestdate like", value, "servicerequestdate");
            return this;
        }
    	 	public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return this;
        }
    	 

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_ws_history
     *
     * @mbggenerated Tue Oct 08 08:20:18 CEST 2013
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
