package com.guigu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuditionInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuditionInfoExample() {
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

        public Criteria andAuditionIdIsNull() {
            addCriterion("audition_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditionIdIsNotNull() {
            addCriterion("audition_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditionIdEqualTo(Integer value) {
            addCriterion("audition_id =", value, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdNotEqualTo(Integer value) {
            addCriterion("audition_id <>", value, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdGreaterThan(Integer value) {
            addCriterion("audition_id >", value, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("audition_id >=", value, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdLessThan(Integer value) {
            addCriterion("audition_id <", value, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdLessThanOrEqualTo(Integer value) {
            addCriterion("audition_id <=", value, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdIn(List<Integer> values) {
            addCriterion("audition_id in", values, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdNotIn(List<Integer> values) {
            addCriterion("audition_id not in", values, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdBetween(Integer value1, Integer value2) {
            addCriterion("audition_id between", value1, value2, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("audition_id not between", value1, value2, "auditionId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeIsNull() {
            addCriterion("audition_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeIsNotNull() {
            addCriterion("audition_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeEqualTo(Date value) {
            addCriterion("audition_time =", value, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeNotEqualTo(Date value) {
            addCriterion("audition_time <>", value, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeGreaterThan(Date value) {
            addCriterion("audition_time >", value, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audition_time >=", value, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeLessThan(Date value) {
            addCriterion("audition_time <", value, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeLessThanOrEqualTo(Date value) {
            addCriterion("audition_time <=", value, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeIn(List<Date> values) {
            addCriterion("audition_time in", values, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeNotIn(List<Date> values) {
            addCriterion("audition_time not in", values, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeBetween(Date value1, Date value2) {
            addCriterion("audition_time between", value1, value2, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeNotBetween(Date value1, Date value2) {
            addCriterion("audition_time not between", value1, value2, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionAddrIsNull() {
            addCriterion("audition_addr is null");
            return (Criteria) this;
        }

        public Criteria andAuditionAddrIsNotNull() {
            addCriterion("audition_addr is not null");
            return (Criteria) this;
        }

        public Criteria andAuditionAddrEqualTo(String value) {
            addCriterion("audition_addr =", value, "auditionAddr");
            return (Criteria) this;
        }

        public Criteria andAuditionAddrNotEqualTo(String value) {
            addCriterion("audition_addr <>", value, "auditionAddr");
            return (Criteria) this;
        }

        public Criteria andAuditionAddrGreaterThan(String value) {
            addCriterion("audition_addr >", value, "auditionAddr");
            return (Criteria) this;
        }

        public Criteria andAuditionAddrGreaterThanOrEqualTo(String value) {
            addCriterion("audition_addr >=", value, "auditionAddr");
            return (Criteria) this;
        }

        public Criteria andAuditionAddrLessThan(String value) {
            addCriterion("audition_addr <", value, "auditionAddr");
            return (Criteria) this;
        }

        public Criteria andAuditionAddrLessThanOrEqualTo(String value) {
            addCriterion("audition_addr <=", value, "auditionAddr");
            return (Criteria) this;
        }

        public Criteria andAuditionAddrLike(String value) {
            addCriterion("audition_addr like", value, "auditionAddr");
            return (Criteria) this;
        }

        public Criteria andAuditionAddrNotLike(String value) {
            addCriterion("audition_addr not like", value, "auditionAddr");
            return (Criteria) this;
        }

        public Criteria andAuditionAddrIn(List<String> values) {
            addCriterion("audition_addr in", values, "auditionAddr");
            return (Criteria) this;
        }

        public Criteria andAuditionAddrNotIn(List<String> values) {
            addCriterion("audition_addr not in", values, "auditionAddr");
            return (Criteria) this;
        }

        public Criteria andAuditionAddrBetween(String value1, String value2) {
            addCriterion("audition_addr between", value1, value2, "auditionAddr");
            return (Criteria) this;
        }

        public Criteria andAuditionAddrNotBetween(String value1, String value2) {
            addCriterion("audition_addr not between", value1, value2, "auditionAddr");
            return (Criteria) this;
        }

        public Criteria andAuditionCourseIsNull() {
            addCriterion("audition_course is null");
            return (Criteria) this;
        }

        public Criteria andAuditionCourseIsNotNull() {
            addCriterion("audition_course is not null");
            return (Criteria) this;
        }

        public Criteria andAuditionCourseEqualTo(String value) {
            addCriterion("audition_course =", value, "auditionCourse");
            return (Criteria) this;
        }

        public Criteria andAuditionCourseNotEqualTo(String value) {
            addCriterion("audition_course <>", value, "auditionCourse");
            return (Criteria) this;
        }

        public Criteria andAuditionCourseGreaterThan(String value) {
            addCriterion("audition_course >", value, "auditionCourse");
            return (Criteria) this;
        }

        public Criteria andAuditionCourseGreaterThanOrEqualTo(String value) {
            addCriterion("audition_course >=", value, "auditionCourse");
            return (Criteria) this;
        }

        public Criteria andAuditionCourseLessThan(String value) {
            addCriterion("audition_course <", value, "auditionCourse");
            return (Criteria) this;
        }

        public Criteria andAuditionCourseLessThanOrEqualTo(String value) {
            addCriterion("audition_course <=", value, "auditionCourse");
            return (Criteria) this;
        }

        public Criteria andAuditionCourseLike(String value) {
            addCriterion("audition_course like", value, "auditionCourse");
            return (Criteria) this;
        }

        public Criteria andAuditionCourseNotLike(String value) {
            addCriterion("audition_course not like", value, "auditionCourse");
            return (Criteria) this;
        }

        public Criteria andAuditionCourseIn(List<String> values) {
            addCriterion("audition_course in", values, "auditionCourse");
            return (Criteria) this;
        }

        public Criteria andAuditionCourseNotIn(List<String> values) {
            addCriterion("audition_course not in", values, "auditionCourse");
            return (Criteria) this;
        }

        public Criteria andAuditionCourseBetween(String value1, String value2) {
            addCriterion("audition_course between", value1, value2, "auditionCourse");
            return (Criteria) this;
        }

        public Criteria andAuditionCourseNotBetween(String value1, String value2) {
            addCriterion("audition_course not between", value1, value2, "auditionCourse");
            return (Criteria) this;
        }

        public Criteria andAuditionDescIsNull() {
            addCriterion("audition_desc is null");
            return (Criteria) this;
        }

        public Criteria andAuditionDescIsNotNull() {
            addCriterion("audition_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAuditionDescEqualTo(String value) {
            addCriterion("audition_desc =", value, "auditionDesc");
            return (Criteria) this;
        }

        public Criteria andAuditionDescNotEqualTo(String value) {
            addCriterion("audition_desc <>", value, "auditionDesc");
            return (Criteria) this;
        }

        public Criteria andAuditionDescGreaterThan(String value) {
            addCriterion("audition_desc >", value, "auditionDesc");
            return (Criteria) this;
        }

        public Criteria andAuditionDescGreaterThanOrEqualTo(String value) {
            addCriterion("audition_desc >=", value, "auditionDesc");
            return (Criteria) this;
        }

        public Criteria andAuditionDescLessThan(String value) {
            addCriterion("audition_desc <", value, "auditionDesc");
            return (Criteria) this;
        }

        public Criteria andAuditionDescLessThanOrEqualTo(String value) {
            addCriterion("audition_desc <=", value, "auditionDesc");
            return (Criteria) this;
        }

        public Criteria andAuditionDescLike(String value) {
            addCriterion("audition_desc like", value, "auditionDesc");
            return (Criteria) this;
        }

        public Criteria andAuditionDescNotLike(String value) {
            addCriterion("audition_desc not like", value, "auditionDesc");
            return (Criteria) this;
        }

        public Criteria andAuditionDescIn(List<String> values) {
            addCriterion("audition_desc in", values, "auditionDesc");
            return (Criteria) this;
        }

        public Criteria andAuditionDescNotIn(List<String> values) {
            addCriterion("audition_desc not in", values, "auditionDesc");
            return (Criteria) this;
        }

        public Criteria andAuditionDescBetween(String value1, String value2) {
            addCriterion("audition_desc between", value1, value2, "auditionDesc");
            return (Criteria) this;
        }

        public Criteria andAuditionDescNotBetween(String value1, String value2) {
            addCriterion("audition_desc not between", value1, value2, "auditionDesc");
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