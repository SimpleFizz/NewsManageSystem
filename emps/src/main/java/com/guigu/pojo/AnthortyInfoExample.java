package com.guigu.pojo;

import java.util.ArrayList;
import java.util.List;

public class AnthortyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnthortyInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andAnthortyIdIsNull() {
            addCriterion("anthorty_id is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdIsNotNull() {
            addCriterion("anthorty_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdEqualTo(Integer value) {
            addCriterion("anthorty_id =", value, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdNotEqualTo(Integer value) {
            addCriterion("anthorty_id <>", value, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdGreaterThan(Integer value) {
            addCriterion("anthorty_id >", value, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("anthorty_id >=", value, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdLessThan(Integer value) {
            addCriterion("anthorty_id <", value, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdLessThanOrEqualTo(Integer value) {
            addCriterion("anthorty_id <=", value, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdIn(List<Integer> values) {
            addCriterion("anthorty_id in", values, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdNotIn(List<Integer> values) {
            addCriterion("anthorty_id not in", values, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_id between", value1, value2, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_id not between", value1, value2, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidIsNull() {
            addCriterion("anthorty_pid is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidIsNotNull() {
            addCriterion("anthorty_pid is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidEqualTo(Integer value) {
            addCriterion("anthorty_pid =", value, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidNotEqualTo(Integer value) {
            addCriterion("anthorty_pid <>", value, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidGreaterThan(Integer value) {
            addCriterion("anthorty_pid >", value, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("anthorty_pid >=", value, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidLessThan(Integer value) {
            addCriterion("anthorty_pid <", value, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidLessThanOrEqualTo(Integer value) {
            addCriterion("anthorty_pid <=", value, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidIn(List<Integer> values) {
            addCriterion("anthorty_pid in", values, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidNotIn(List<Integer> values) {
            addCriterion("anthorty_pid not in", values, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_pid between", value1, value2, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidNotBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_pid not between", value1, value2, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyNameIsNull() {
            addCriterion("anthorty_name is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyNameIsNotNull() {
            addCriterion("anthorty_name is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyNameEqualTo(String value) {
            addCriterion("anthorty_name =", value, "anthortyName");
            return (Criteria) this;
        }

        public Criteria andAnthortyNameNotEqualTo(String value) {
            addCriterion("anthorty_name <>", value, "anthortyName");
            return (Criteria) this;
        }

        public Criteria andAnthortyNameGreaterThan(String value) {
            addCriterion("anthorty_name >", value, "anthortyName");
            return (Criteria) this;
        }

        public Criteria andAnthortyNameGreaterThanOrEqualTo(String value) {
            addCriterion("anthorty_name >=", value, "anthortyName");
            return (Criteria) this;
        }

        public Criteria andAnthortyNameLessThan(String value) {
            addCriterion("anthorty_name <", value, "anthortyName");
            return (Criteria) this;
        }

        public Criteria andAnthortyNameLessThanOrEqualTo(String value) {
            addCriterion("anthorty_name <=", value, "anthortyName");
            return (Criteria) this;
        }

        public Criteria andAnthortyNameLike(String value) {
            addCriterion("anthorty_name like", value, "anthortyName");
            return (Criteria) this;
        }

        public Criteria andAnthortyNameNotLike(String value) {
            addCriterion("anthorty_name not like", value, "anthortyName");
            return (Criteria) this;
        }

        public Criteria andAnthortyNameIn(List<String> values) {
            addCriterion("anthorty_name in", values, "anthortyName");
            return (Criteria) this;
        }

        public Criteria andAnthortyNameNotIn(List<String> values) {
            addCriterion("anthorty_name not in", values, "anthortyName");
            return (Criteria) this;
        }

        public Criteria andAnthortyNameBetween(String value1, String value2) {
            addCriterion("anthorty_name between", value1, value2, "anthortyName");
            return (Criteria) this;
        }

        public Criteria andAnthortyNameNotBetween(String value1, String value2) {
            addCriterion("anthorty_name not between", value1, value2, "anthortyName");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlIsNull() {
            addCriterion("anthorty_url is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlIsNotNull() {
            addCriterion("anthorty_url is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlEqualTo(String value) {
            addCriterion("anthorty_url =", value, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlNotEqualTo(String value) {
            addCriterion("anthorty_url <>", value, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlGreaterThan(String value) {
            addCriterion("anthorty_url >", value, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("anthorty_url >=", value, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlLessThan(String value) {
            addCriterion("anthorty_url <", value, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlLessThanOrEqualTo(String value) {
            addCriterion("anthorty_url <=", value, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlLike(String value) {
            addCriterion("anthorty_url like", value, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlNotLike(String value) {
            addCriterion("anthorty_url not like", value, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlIn(List<String> values) {
            addCriterion("anthorty_url in", values, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlNotIn(List<String> values) {
            addCriterion("anthorty_url not in", values, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlBetween(String value1, String value2) {
            addCriterion("anthorty_url between", value1, value2, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlNotBetween(String value1, String value2) {
            addCriterion("anthorty_url not between", value1, value2, "anthortyUrl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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