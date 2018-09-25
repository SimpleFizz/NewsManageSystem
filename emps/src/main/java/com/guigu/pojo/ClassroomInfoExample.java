package com.guigu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClassroomInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassroomInfoExample() {
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

        public Criteria andClassroomIdIsNull() {
            addCriterion("classroom_id is null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIsNotNull() {
            addCriterion("classroom_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdEqualTo(Integer value) {
            addCriterion("classroom_id =", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotEqualTo(Integer value) {
            addCriterion("classroom_id <>", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThan(Integer value) {
            addCriterion("classroom_id >", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classroom_id >=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThan(Integer value) {
            addCriterion("classroom_id <", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThanOrEqualTo(Integer value) {
            addCriterion("classroom_id <=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIn(List<Integer> values) {
            addCriterion("classroom_id in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotIn(List<Integer> values) {
            addCriterion("classroom_id not in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdBetween(Integer value1, Integer value2) {
            addCriterion("classroom_id between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classroom_id not between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomNameIsNull() {
            addCriterion("classroom_name is null");
            return (Criteria) this;
        }

        public Criteria andClassroomNameIsNotNull() {
            addCriterion("classroom_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomNameEqualTo(String value) {
            addCriterion("classroom_name =", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotEqualTo(String value) {
            addCriterion("classroom_name <>", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameGreaterThan(String value) {
            addCriterion("classroom_name >", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameGreaterThanOrEqualTo(String value) {
            addCriterion("classroom_name >=", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameLessThan(String value) {
            addCriterion("classroom_name <", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameLessThanOrEqualTo(String value) {
            addCriterion("classroom_name <=", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameLike(String value) {
            addCriterion("classroom_name like", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotLike(String value) {
            addCriterion("classroom_name not like", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameIn(List<String> values) {
            addCriterion("classroom_name in", values, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotIn(List<String> values) {
            addCriterion("classroom_name not in", values, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameBetween(String value1, String value2) {
            addCriterion("classroom_name between", value1, value2, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotBetween(String value1, String value2) {
            addCriterion("classroom_name not between", value1, value2, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomMaxIsNull() {
            addCriterion("classroom_max is null");
            return (Criteria) this;
        }

        public Criteria andClassroomMaxIsNotNull() {
            addCriterion("classroom_max is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomMaxEqualTo(Integer value) {
            addCriterion("classroom_max =", value, "classroomMax");
            return (Criteria) this;
        }

        public Criteria andClassroomMaxNotEqualTo(Integer value) {
            addCriterion("classroom_max <>", value, "classroomMax");
            return (Criteria) this;
        }

        public Criteria andClassroomMaxGreaterThan(Integer value) {
            addCriterion("classroom_max >", value, "classroomMax");
            return (Criteria) this;
        }

        public Criteria andClassroomMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("classroom_max >=", value, "classroomMax");
            return (Criteria) this;
        }

        public Criteria andClassroomMaxLessThan(Integer value) {
            addCriterion("classroom_max <", value, "classroomMax");
            return (Criteria) this;
        }

        public Criteria andClassroomMaxLessThanOrEqualTo(Integer value) {
            addCriterion("classroom_max <=", value, "classroomMax");
            return (Criteria) this;
        }

        public Criteria andClassroomMaxIn(List<Integer> values) {
            addCriterion("classroom_max in", values, "classroomMax");
            return (Criteria) this;
        }

        public Criteria andClassroomMaxNotIn(List<Integer> values) {
            addCriterion("classroom_max not in", values, "classroomMax");
            return (Criteria) this;
        }

        public Criteria andClassroomMaxBetween(Integer value1, Integer value2) {
            addCriterion("classroom_max between", value1, value2, "classroomMax");
            return (Criteria) this;
        }

        public Criteria andClassroomMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("classroom_max not between", value1, value2, "classroomMax");
            return (Criteria) this;
        }

        public Criteria andClassroomInfoIsNull() {
            addCriterion("classroom_info is null");
            return (Criteria) this;
        }

        public Criteria andClassroomInfoIsNotNull() {
            addCriterion("classroom_info is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomInfoEqualTo(String value) {
            addCriterion("classroom_info =", value, "classroomInfo");
            return (Criteria) this;
        }

        public Criteria andClassroomInfoNotEqualTo(String value) {
            addCriterion("classroom_info <>", value, "classroomInfo");
            return (Criteria) this;
        }

        public Criteria andClassroomInfoGreaterThan(String value) {
            addCriterion("classroom_info >", value, "classroomInfo");
            return (Criteria) this;
        }

        public Criteria andClassroomInfoGreaterThanOrEqualTo(String value) {
            addCriterion("classroom_info >=", value, "classroomInfo");
            return (Criteria) this;
        }

        public Criteria andClassroomInfoLessThan(String value) {
            addCriterion("classroom_info <", value, "classroomInfo");
            return (Criteria) this;
        }

        public Criteria andClassroomInfoLessThanOrEqualTo(String value) {
            addCriterion("classroom_info <=", value, "classroomInfo");
            return (Criteria) this;
        }

        public Criteria andClassroomInfoLike(String value) {
            addCriterion("classroom_info like", value, "classroomInfo");
            return (Criteria) this;
        }

        public Criteria andClassroomInfoNotLike(String value) {
            addCriterion("classroom_info not like", value, "classroomInfo");
            return (Criteria) this;
        }

        public Criteria andClassroomInfoIn(List<String> values) {
            addCriterion("classroom_info in", values, "classroomInfo");
            return (Criteria) this;
        }

        public Criteria andClassroomInfoNotIn(List<String> values) {
            addCriterion("classroom_info not in", values, "classroomInfo");
            return (Criteria) this;
        }

        public Criteria andClassroomInfoBetween(String value1, String value2) {
            addCriterion("classroom_info between", value1, value2, "classroomInfo");
            return (Criteria) this;
        }

        public Criteria andClassroomInfoNotBetween(String value1, String value2) {
            addCriterion("classroom_info not between", value1, value2, "classroomInfo");
            return (Criteria) this;
        }

        public Criteria andClassroomRemarkIsNull() {
            addCriterion("classroom_remark is null");
            return (Criteria) this;
        }

        public Criteria andClassroomRemarkIsNotNull() {
            addCriterion("classroom_remark is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomRemarkEqualTo(String value) {
            addCriterion("classroom_remark =", value, "classroomRemark");
            return (Criteria) this;
        }

        public Criteria andClassroomRemarkNotEqualTo(String value) {
            addCriterion("classroom_remark <>", value, "classroomRemark");
            return (Criteria) this;
        }

        public Criteria andClassroomRemarkGreaterThan(String value) {
            addCriterion("classroom_remark >", value, "classroomRemark");
            return (Criteria) this;
        }

        public Criteria andClassroomRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("classroom_remark >=", value, "classroomRemark");
            return (Criteria) this;
        }

        public Criteria andClassroomRemarkLessThan(String value) {
            addCriterion("classroom_remark <", value, "classroomRemark");
            return (Criteria) this;
        }

        public Criteria andClassroomRemarkLessThanOrEqualTo(String value) {
            addCriterion("classroom_remark <=", value, "classroomRemark");
            return (Criteria) this;
        }

        public Criteria andClassroomRemarkLike(String value) {
            addCriterion("classroom_remark like", value, "classroomRemark");
            return (Criteria) this;
        }

        public Criteria andClassroomRemarkNotLike(String value) {
            addCriterion("classroom_remark not like", value, "classroomRemark");
            return (Criteria) this;
        }

        public Criteria andClassroomRemarkIn(List<String> values) {
            addCriterion("classroom_remark in", values, "classroomRemark");
            return (Criteria) this;
        }

        public Criteria andClassroomRemarkNotIn(List<String> values) {
            addCriterion("classroom_remark not in", values, "classroomRemark");
            return (Criteria) this;
        }

        public Criteria andClassroomRemarkBetween(String value1, String value2) {
            addCriterion("classroom_remark between", value1, value2, "classroomRemark");
            return (Criteria) this;
        }

        public Criteria andClassroomRemarkNotBetween(String value1, String value2) {
            addCriterion("classroom_remark not between", value1, value2, "classroomRemark");
            return (Criteria) this;
        }

        public Criteria andClassroomMarkIsNull() {
            addCriterion("classroom_mark is null");
            return (Criteria) this;
        }

        public Criteria andClassroomMarkIsNotNull() {
            addCriterion("classroom_mark is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomMarkEqualTo(String value) {
            addCriterion("classroom_mark =", value, "classroomMark");
            return (Criteria) this;
        }

        public Criteria andClassroomMarkNotEqualTo(String value) {
            addCriterion("classroom_mark <>", value, "classroomMark");
            return (Criteria) this;
        }

        public Criteria andClassroomMarkGreaterThan(String value) {
            addCriterion("classroom_mark >", value, "classroomMark");
            return (Criteria) this;
        }

        public Criteria andClassroomMarkGreaterThanOrEqualTo(String value) {
            addCriterion("classroom_mark >=", value, "classroomMark");
            return (Criteria) this;
        }

        public Criteria andClassroomMarkLessThan(String value) {
            addCriterion("classroom_mark <", value, "classroomMark");
            return (Criteria) this;
        }

        public Criteria andClassroomMarkLessThanOrEqualTo(String value) {
            addCriterion("classroom_mark <=", value, "classroomMark");
            return (Criteria) this;
        }

        public Criteria andClassroomMarkLike(String value) {
            addCriterion("classroom_mark like", value, "classroomMark");
            return (Criteria) this;
        }

        public Criteria andClassroomMarkNotLike(String value) {
            addCriterion("classroom_mark not like", value, "classroomMark");
            return (Criteria) this;
        }

        public Criteria andClassroomMarkIn(List<String> values) {
            addCriterion("classroom_mark in", values, "classroomMark");
            return (Criteria) this;
        }

        public Criteria andClassroomMarkNotIn(List<String> values) {
            addCriterion("classroom_mark not in", values, "classroomMark");
            return (Criteria) this;
        }

        public Criteria andClassroomMarkBetween(String value1, String value2) {
            addCriterion("classroom_mark between", value1, value2, "classroomMark");
            return (Criteria) this;
        }

        public Criteria andClassroomMarkNotBetween(String value1, String value2) {
            addCriterion("classroom_mark not between", value1, value2, "classroomMark");
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