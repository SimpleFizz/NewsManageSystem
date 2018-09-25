package com.guigu.pojo;

import java.util.ArrayList;
import java.util.List;

public class DataDictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataDictionaryExample() {
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

        public Criteria andDataIdIsNull() {
            addCriterion("data_id is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("data_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(Integer value) {
            addCriterion("data_id =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(Integer value) {
            addCriterion("data_id <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(Integer value) {
            addCriterion("data_id >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_id >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(Integer value) {
            addCriterion("data_id <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(Integer value) {
            addCriterion("data_id <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<Integer> values) {
            addCriterion("data_id in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<Integer> values) {
            addCriterion("data_id not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(Integer value1, Integer value2) {
            addCriterion("data_id between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(Integer value1, Integer value2) {
            addCriterion("data_id not between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataContentIsNull() {
            addCriterion("data_content is null");
            return (Criteria) this;
        }

        public Criteria andDataContentIsNotNull() {
            addCriterion("data_content is not null");
            return (Criteria) this;
        }

        public Criteria andDataContentEqualTo(String value) {
            addCriterion("data_content =", value, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentNotEqualTo(String value) {
            addCriterion("data_content <>", value, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentGreaterThan(String value) {
            addCriterion("data_content >", value, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentGreaterThanOrEqualTo(String value) {
            addCriterion("data_content >=", value, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentLessThan(String value) {
            addCriterion("data_content <", value, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentLessThanOrEqualTo(String value) {
            addCriterion("data_content <=", value, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentLike(String value) {
            addCriterion("data_content like", value, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentNotLike(String value) {
            addCriterion("data_content not like", value, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentIn(List<String> values) {
            addCriterion("data_content in", values, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentNotIn(List<String> values) {
            addCriterion("data_content not in", values, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentBetween(String value1, String value2) {
            addCriterion("data_content between", value1, value2, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataContentNotBetween(String value1, String value2) {
            addCriterion("data_content not between", value1, value2, "dataContent");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_type >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("data_type like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("data_type not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataDescIsNull() {
            addCriterion("data_desc is null");
            return (Criteria) this;
        }

        public Criteria andDataDescIsNotNull() {
            addCriterion("data_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDataDescEqualTo(String value) {
            addCriterion("data_desc =", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescNotEqualTo(String value) {
            addCriterion("data_desc <>", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescGreaterThan(String value) {
            addCriterion("data_desc >", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescGreaterThanOrEqualTo(String value) {
            addCriterion("data_desc >=", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescLessThan(String value) {
            addCriterion("data_desc <", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescLessThanOrEqualTo(String value) {
            addCriterion("data_desc <=", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescLike(String value) {
            addCriterion("data_desc like", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescNotLike(String value) {
            addCriterion("data_desc not like", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescIn(List<String> values) {
            addCriterion("data_desc in", values, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescNotIn(List<String> values) {
            addCriterion("data_desc not in", values, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescBetween(String value1, String value2) {
            addCriterion("data_desc between", value1, value2, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescNotBetween(String value1, String value2) {
            addCriterion("data_desc not between", value1, value2, "dataDesc");
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