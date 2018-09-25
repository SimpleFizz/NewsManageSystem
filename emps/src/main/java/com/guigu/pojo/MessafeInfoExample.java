package com.guigu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessafeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessafeInfoExample() {
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

        public Criteria andMessafeIdIsNull() {
            addCriterion("messafe_id is null");
            return (Criteria) this;
        }

        public Criteria andMessafeIdIsNotNull() {
            addCriterion("messafe_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessafeIdEqualTo(Integer value) {
            addCriterion("messafe_id =", value, "messafeId");
            return (Criteria) this;
        }

        public Criteria andMessafeIdNotEqualTo(Integer value) {
            addCriterion("messafe_id <>", value, "messafeId");
            return (Criteria) this;
        }

        public Criteria andMessafeIdGreaterThan(Integer value) {
            addCriterion("messafe_id >", value, "messafeId");
            return (Criteria) this;
        }

        public Criteria andMessafeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("messafe_id >=", value, "messafeId");
            return (Criteria) this;
        }

        public Criteria andMessafeIdLessThan(Integer value) {
            addCriterion("messafe_id <", value, "messafeId");
            return (Criteria) this;
        }

        public Criteria andMessafeIdLessThanOrEqualTo(Integer value) {
            addCriterion("messafe_id <=", value, "messafeId");
            return (Criteria) this;
        }

        public Criteria andMessafeIdIn(List<Integer> values) {
            addCriterion("messafe_id in", values, "messafeId");
            return (Criteria) this;
        }

        public Criteria andMessafeIdNotIn(List<Integer> values) {
            addCriterion("messafe_id not in", values, "messafeId");
            return (Criteria) this;
        }

        public Criteria andMessafeIdBetween(Integer value1, Integer value2) {
            addCriterion("messafe_id between", value1, value2, "messafeId");
            return (Criteria) this;
        }

        public Criteria andMessafeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("messafe_id not between", value1, value2, "messafeId");
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

        public Criteria andMessafeContentIsNull() {
            addCriterion("messafe_content is null");
            return (Criteria) this;
        }

        public Criteria andMessafeContentIsNotNull() {
            addCriterion("messafe_content is not null");
            return (Criteria) this;
        }

        public Criteria andMessafeContentEqualTo(String value) {
            addCriterion("messafe_content =", value, "messafeContent");
            return (Criteria) this;
        }

        public Criteria andMessafeContentNotEqualTo(String value) {
            addCriterion("messafe_content <>", value, "messafeContent");
            return (Criteria) this;
        }

        public Criteria andMessafeContentGreaterThan(String value) {
            addCriterion("messafe_content >", value, "messafeContent");
            return (Criteria) this;
        }

        public Criteria andMessafeContentGreaterThanOrEqualTo(String value) {
            addCriterion("messafe_content >=", value, "messafeContent");
            return (Criteria) this;
        }

        public Criteria andMessafeContentLessThan(String value) {
            addCriterion("messafe_content <", value, "messafeContent");
            return (Criteria) this;
        }

        public Criteria andMessafeContentLessThanOrEqualTo(String value) {
            addCriterion("messafe_content <=", value, "messafeContent");
            return (Criteria) this;
        }

        public Criteria andMessafeContentLike(String value) {
            addCriterion("messafe_content like", value, "messafeContent");
            return (Criteria) this;
        }

        public Criteria andMessafeContentNotLike(String value) {
            addCriterion("messafe_content not like", value, "messafeContent");
            return (Criteria) this;
        }

        public Criteria andMessafeContentIn(List<String> values) {
            addCriterion("messafe_content in", values, "messafeContent");
            return (Criteria) this;
        }

        public Criteria andMessafeContentNotIn(List<String> values) {
            addCriterion("messafe_content not in", values, "messafeContent");
            return (Criteria) this;
        }

        public Criteria andMessafeContentBetween(String value1, String value2) {
            addCriterion("messafe_content between", value1, value2, "messafeContent");
            return (Criteria) this;
        }

        public Criteria andMessafeContentNotBetween(String value1, String value2) {
            addCriterion("messafe_content not between", value1, value2, "messafeContent");
            return (Criteria) this;
        }

        public Criteria andMessafeManIsNull() {
            addCriterion("messafe_man is null");
            return (Criteria) this;
        }

        public Criteria andMessafeManIsNotNull() {
            addCriterion("messafe_man is not null");
            return (Criteria) this;
        }

        public Criteria andMessafeManEqualTo(String value) {
            addCriterion("messafe_man =", value, "messafeMan");
            return (Criteria) this;
        }

        public Criteria andMessafeManNotEqualTo(String value) {
            addCriterion("messafe_man <>", value, "messafeMan");
            return (Criteria) this;
        }

        public Criteria andMessafeManGreaterThan(String value) {
            addCriterion("messafe_man >", value, "messafeMan");
            return (Criteria) this;
        }

        public Criteria andMessafeManGreaterThanOrEqualTo(String value) {
            addCriterion("messafe_man >=", value, "messafeMan");
            return (Criteria) this;
        }

        public Criteria andMessafeManLessThan(String value) {
            addCriterion("messafe_man <", value, "messafeMan");
            return (Criteria) this;
        }

        public Criteria andMessafeManLessThanOrEqualTo(String value) {
            addCriterion("messafe_man <=", value, "messafeMan");
            return (Criteria) this;
        }

        public Criteria andMessafeManLike(String value) {
            addCriterion("messafe_man like", value, "messafeMan");
            return (Criteria) this;
        }

        public Criteria andMessafeManNotLike(String value) {
            addCriterion("messafe_man not like", value, "messafeMan");
            return (Criteria) this;
        }

        public Criteria andMessafeManIn(List<String> values) {
            addCriterion("messafe_man in", values, "messafeMan");
            return (Criteria) this;
        }

        public Criteria andMessafeManNotIn(List<String> values) {
            addCriterion("messafe_man not in", values, "messafeMan");
            return (Criteria) this;
        }

        public Criteria andMessafeManBetween(String value1, String value2) {
            addCriterion("messafe_man between", value1, value2, "messafeMan");
            return (Criteria) this;
        }

        public Criteria andMessafeManNotBetween(String value1, String value2) {
            addCriterion("messafe_man not between", value1, value2, "messafeMan");
            return (Criteria) this;
        }

        public Criteria andMessafePhoneIsNull() {
            addCriterion("messafe_phone is null");
            return (Criteria) this;
        }

        public Criteria andMessafePhoneIsNotNull() {
            addCriterion("messafe_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMessafePhoneEqualTo(String value) {
            addCriterion("messafe_phone =", value, "messafePhone");
            return (Criteria) this;
        }

        public Criteria andMessafePhoneNotEqualTo(String value) {
            addCriterion("messafe_phone <>", value, "messafePhone");
            return (Criteria) this;
        }

        public Criteria andMessafePhoneGreaterThan(String value) {
            addCriterion("messafe_phone >", value, "messafePhone");
            return (Criteria) this;
        }

        public Criteria andMessafePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("messafe_phone >=", value, "messafePhone");
            return (Criteria) this;
        }

        public Criteria andMessafePhoneLessThan(String value) {
            addCriterion("messafe_phone <", value, "messafePhone");
            return (Criteria) this;
        }

        public Criteria andMessafePhoneLessThanOrEqualTo(String value) {
            addCriterion("messafe_phone <=", value, "messafePhone");
            return (Criteria) this;
        }

        public Criteria andMessafePhoneLike(String value) {
            addCriterion("messafe_phone like", value, "messafePhone");
            return (Criteria) this;
        }

        public Criteria andMessafePhoneNotLike(String value) {
            addCriterion("messafe_phone not like", value, "messafePhone");
            return (Criteria) this;
        }

        public Criteria andMessafePhoneIn(List<String> values) {
            addCriterion("messafe_phone in", values, "messafePhone");
            return (Criteria) this;
        }

        public Criteria andMessafePhoneNotIn(List<String> values) {
            addCriterion("messafe_phone not in", values, "messafePhone");
            return (Criteria) this;
        }

        public Criteria andMessafePhoneBetween(String value1, String value2) {
            addCriterion("messafe_phone between", value1, value2, "messafePhone");
            return (Criteria) this;
        }

        public Criteria andMessafePhoneNotBetween(String value1, String value2) {
            addCriterion("messafe_phone not between", value1, value2, "messafePhone");
            return (Criteria) this;
        }

        public Criteria andMessafeTimeIsNull() {
            addCriterion("messafe_time is null");
            return (Criteria) this;
        }

        public Criteria andMessafeTimeIsNotNull() {
            addCriterion("messafe_time is not null");
            return (Criteria) this;
        }

        public Criteria andMessafeTimeEqualTo(Date value) {
            addCriterion("messafe_time =", value, "messafeTime");
            return (Criteria) this;
        }

        public Criteria andMessafeTimeNotEqualTo(Date value) {
            addCriterion("messafe_time <>", value, "messafeTime");
            return (Criteria) this;
        }

        public Criteria andMessafeTimeGreaterThan(Date value) {
            addCriterion("messafe_time >", value, "messafeTime");
            return (Criteria) this;
        }

        public Criteria andMessafeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("messafe_time >=", value, "messafeTime");
            return (Criteria) this;
        }

        public Criteria andMessafeTimeLessThan(Date value) {
            addCriterion("messafe_time <", value, "messafeTime");
            return (Criteria) this;
        }

        public Criteria andMessafeTimeLessThanOrEqualTo(Date value) {
            addCriterion("messafe_time <=", value, "messafeTime");
            return (Criteria) this;
        }

        public Criteria andMessafeTimeIn(List<Date> values) {
            addCriterion("messafe_time in", values, "messafeTime");
            return (Criteria) this;
        }

        public Criteria andMessafeTimeNotIn(List<Date> values) {
            addCriterion("messafe_time not in", values, "messafeTime");
            return (Criteria) this;
        }

        public Criteria andMessafeTimeBetween(Date value1, Date value2) {
            addCriterion("messafe_time between", value1, value2, "messafeTime");
            return (Criteria) this;
        }

        public Criteria andMessafeTimeNotBetween(Date value1, Date value2) {
            addCriterion("messafe_time not between", value1, value2, "messafeTime");
            return (Criteria) this;
        }

        public Criteria andMessafeStateIsNull() {
            addCriterion("messafe_state is null");
            return (Criteria) this;
        }

        public Criteria andMessafeStateIsNotNull() {
            addCriterion("messafe_state is not null");
            return (Criteria) this;
        }

        public Criteria andMessafeStateEqualTo(String value) {
            addCriterion("messafe_state =", value, "messafeState");
            return (Criteria) this;
        }

        public Criteria andMessafeStateNotEqualTo(String value) {
            addCriterion("messafe_state <>", value, "messafeState");
            return (Criteria) this;
        }

        public Criteria andMessafeStateGreaterThan(String value) {
            addCriterion("messafe_state >", value, "messafeState");
            return (Criteria) this;
        }

        public Criteria andMessafeStateGreaterThanOrEqualTo(String value) {
            addCriterion("messafe_state >=", value, "messafeState");
            return (Criteria) this;
        }

        public Criteria andMessafeStateLessThan(String value) {
            addCriterion("messafe_state <", value, "messafeState");
            return (Criteria) this;
        }

        public Criteria andMessafeStateLessThanOrEqualTo(String value) {
            addCriterion("messafe_state <=", value, "messafeState");
            return (Criteria) this;
        }

        public Criteria andMessafeStateLike(String value) {
            addCriterion("messafe_state like", value, "messafeState");
            return (Criteria) this;
        }

        public Criteria andMessafeStateNotLike(String value) {
            addCriterion("messafe_state not like", value, "messafeState");
            return (Criteria) this;
        }

        public Criteria andMessafeStateIn(List<String> values) {
            addCriterion("messafe_state in", values, "messafeState");
            return (Criteria) this;
        }

        public Criteria andMessafeStateNotIn(List<String> values) {
            addCriterion("messafe_state not in", values, "messafeState");
            return (Criteria) this;
        }

        public Criteria andMessafeStateBetween(String value1, String value2) {
            addCriterion("messafe_state between", value1, value2, "messafeState");
            return (Criteria) this;
        }

        public Criteria andMessafeStateNotBetween(String value1, String value2) {
            addCriterion("messafe_state not between", value1, value2, "messafeState");
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