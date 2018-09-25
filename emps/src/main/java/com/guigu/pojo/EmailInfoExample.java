package com.guigu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmailInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmailInfoExample() {
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

        public Criteria andEmailIdIsNull() {
            addCriterion("email_id is null");
            return (Criteria) this;
        }

        public Criteria andEmailIdIsNotNull() {
            addCriterion("email_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmailIdEqualTo(Integer value) {
            addCriterion("email_id =", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotEqualTo(Integer value) {
            addCriterion("email_id <>", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdGreaterThan(Integer value) {
            addCriterion("email_id >", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_id >=", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLessThan(Integer value) {
            addCriterion("email_id <", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLessThanOrEqualTo(Integer value) {
            addCriterion("email_id <=", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdIn(List<Integer> values) {
            addCriterion("email_id in", values, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotIn(List<Integer> values) {
            addCriterion("email_id not in", values, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdBetween(Integer value1, Integer value2) {
            addCriterion("email_id between", value1, value2, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("email_id not between", value1, value2, "emailId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andEmailTitleIsNull() {
            addCriterion("email_title is null");
            return (Criteria) this;
        }

        public Criteria andEmailTitleIsNotNull() {
            addCriterion("email_title is not null");
            return (Criteria) this;
        }

        public Criteria andEmailTitleEqualTo(String value) {
            addCriterion("email_title =", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotEqualTo(String value) {
            addCriterion("email_title <>", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleGreaterThan(String value) {
            addCriterion("email_title >", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleGreaterThanOrEqualTo(String value) {
            addCriterion("email_title >=", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleLessThan(String value) {
            addCriterion("email_title <", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleLessThanOrEqualTo(String value) {
            addCriterion("email_title <=", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleLike(String value) {
            addCriterion("email_title like", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotLike(String value) {
            addCriterion("email_title not like", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleIn(List<String> values) {
            addCriterion("email_title in", values, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotIn(List<String> values) {
            addCriterion("email_title not in", values, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleBetween(String value1, String value2) {
            addCriterion("email_title between", value1, value2, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotBetween(String value1, String value2) {
            addCriterion("email_title not between", value1, value2, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailContentIsNull() {
            addCriterion("email_content is null");
            return (Criteria) this;
        }

        public Criteria andEmailContentIsNotNull() {
            addCriterion("email_content is not null");
            return (Criteria) this;
        }

        public Criteria andEmailContentEqualTo(String value) {
            addCriterion("email_content =", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentNotEqualTo(String value) {
            addCriterion("email_content <>", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentGreaterThan(String value) {
            addCriterion("email_content >", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentGreaterThanOrEqualTo(String value) {
            addCriterion("email_content >=", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentLessThan(String value) {
            addCriterion("email_content <", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentLessThanOrEqualTo(String value) {
            addCriterion("email_content <=", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentLike(String value) {
            addCriterion("email_content like", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentNotLike(String value) {
            addCriterion("email_content not like", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentIn(List<String> values) {
            addCriterion("email_content in", values, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentNotIn(List<String> values) {
            addCriterion("email_content not in", values, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentBetween(String value1, String value2) {
            addCriterion("email_content between", value1, value2, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentNotBetween(String value1, String value2) {
            addCriterion("email_content not between", value1, value2, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailTimeIsNull() {
            addCriterion("email_time is null");
            return (Criteria) this;
        }

        public Criteria andEmailTimeIsNotNull() {
            addCriterion("email_time is not null");
            return (Criteria) this;
        }

        public Criteria andEmailTimeEqualTo(Date value) {
            addCriterion("email_time =", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeNotEqualTo(Date value) {
            addCriterion("email_time <>", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeGreaterThan(Date value) {
            addCriterion("email_time >", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("email_time >=", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeLessThan(Date value) {
            addCriterion("email_time <", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeLessThanOrEqualTo(Date value) {
            addCriterion("email_time <=", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeIn(List<Date> values) {
            addCriterion("email_time in", values, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeNotIn(List<Date> values) {
            addCriterion("email_time not in", values, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeBetween(Date value1, Date value2) {
            addCriterion("email_time between", value1, value2, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeNotBetween(Date value1, Date value2) {
            addCriterion("email_time not between", value1, value2, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailManIsNull() {
            addCriterion("email_man is null");
            return (Criteria) this;
        }

        public Criteria andEmailManIsNotNull() {
            addCriterion("email_man is not null");
            return (Criteria) this;
        }

        public Criteria andEmailManEqualTo(String value) {
            addCriterion("email_man =", value, "emailMan");
            return (Criteria) this;
        }

        public Criteria andEmailManNotEqualTo(String value) {
            addCriterion("email_man <>", value, "emailMan");
            return (Criteria) this;
        }

        public Criteria andEmailManGreaterThan(String value) {
            addCriterion("email_man >", value, "emailMan");
            return (Criteria) this;
        }

        public Criteria andEmailManGreaterThanOrEqualTo(String value) {
            addCriterion("email_man >=", value, "emailMan");
            return (Criteria) this;
        }

        public Criteria andEmailManLessThan(String value) {
            addCriterion("email_man <", value, "emailMan");
            return (Criteria) this;
        }

        public Criteria andEmailManLessThanOrEqualTo(String value) {
            addCriterion("email_man <=", value, "emailMan");
            return (Criteria) this;
        }

        public Criteria andEmailManLike(String value) {
            addCriterion("email_man like", value, "emailMan");
            return (Criteria) this;
        }

        public Criteria andEmailManNotLike(String value) {
            addCriterion("email_man not like", value, "emailMan");
            return (Criteria) this;
        }

        public Criteria andEmailManIn(List<String> values) {
            addCriterion("email_man in", values, "emailMan");
            return (Criteria) this;
        }

        public Criteria andEmailManNotIn(List<String> values) {
            addCriterion("email_man not in", values, "emailMan");
            return (Criteria) this;
        }

        public Criteria andEmailManBetween(String value1, String value2) {
            addCriterion("email_man between", value1, value2, "emailMan");
            return (Criteria) this;
        }

        public Criteria andEmailManNotBetween(String value1, String value2) {
            addCriterion("email_man not between", value1, value2, "emailMan");
            return (Criteria) this;
        }

        public Criteria andEmailAddrIsNull() {
            addCriterion("email_addr is null");
            return (Criteria) this;
        }

        public Criteria andEmailAddrIsNotNull() {
            addCriterion("email_addr is not null");
            return (Criteria) this;
        }

        public Criteria andEmailAddrEqualTo(String value) {
            addCriterion("email_addr =", value, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrNotEqualTo(String value) {
            addCriterion("email_addr <>", value, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrGreaterThan(String value) {
            addCriterion("email_addr >", value, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrGreaterThanOrEqualTo(String value) {
            addCriterion("email_addr >=", value, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrLessThan(String value) {
            addCriterion("email_addr <", value, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrLessThanOrEqualTo(String value) {
            addCriterion("email_addr <=", value, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrLike(String value) {
            addCriterion("email_addr like", value, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrNotLike(String value) {
            addCriterion("email_addr not like", value, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrIn(List<String> values) {
            addCriterion("email_addr in", values, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrNotIn(List<String> values) {
            addCriterion("email_addr not in", values, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrBetween(String value1, String value2) {
            addCriterion("email_addr between", value1, value2, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrNotBetween(String value1, String value2) {
            addCriterion("email_addr not between", value1, value2, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailStateIsNull() {
            addCriterion("email_state is null");
            return (Criteria) this;
        }

        public Criteria andEmailStateIsNotNull() {
            addCriterion("email_state is not null");
            return (Criteria) this;
        }

        public Criteria andEmailStateEqualTo(String value) {
            addCriterion("email_state =", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateNotEqualTo(String value) {
            addCriterion("email_state <>", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateGreaterThan(String value) {
            addCriterion("email_state >", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateGreaterThanOrEqualTo(String value) {
            addCriterion("email_state >=", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateLessThan(String value) {
            addCriterion("email_state <", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateLessThanOrEqualTo(String value) {
            addCriterion("email_state <=", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateLike(String value) {
            addCriterion("email_state like", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateNotLike(String value) {
            addCriterion("email_state not like", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateIn(List<String> values) {
            addCriterion("email_state in", values, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateNotIn(List<String> values) {
            addCriterion("email_state not in", values, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateBetween(String value1, String value2) {
            addCriterion("email_state between", value1, value2, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateNotBetween(String value1, String value2) {
            addCriterion("email_state not between", value1, value2, "emailState");
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