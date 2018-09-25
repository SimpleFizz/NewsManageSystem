package com.guigu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendanceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceInfoExample() {
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

        public Criteria andAttendanceIdIsNull() {
            addCriterion("attendance_id is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdIsNotNull() {
            addCriterion("attendance_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdEqualTo(Integer value) {
            addCriterion("attendance_id =", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdNotEqualTo(Integer value) {
            addCriterion("attendance_id <>", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdGreaterThan(Integer value) {
            addCriterion("attendance_id >", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attendance_id >=", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdLessThan(Integer value) {
            addCriterion("attendance_id <", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdLessThanOrEqualTo(Integer value) {
            addCriterion("attendance_id <=", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdIn(List<Integer> values) {
            addCriterion("attendance_id in", values, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdNotIn(List<Integer> values) {
            addCriterion("attendance_id not in", values, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdBetween(Integer value1, Integer value2) {
            addCriterion("attendance_id between", value1, value2, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attendance_id not between", value1, value2, "attendanceId");
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

        public Criteria andAttendanceDescIsNull() {
            addCriterion("attendance_desc is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceDescIsNotNull() {
            addCriterion("attendance_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceDescEqualTo(String value) {
            addCriterion("attendance_desc =", value, "attendanceDesc");
            return (Criteria) this;
        }

        public Criteria andAttendanceDescNotEqualTo(String value) {
            addCriterion("attendance_desc <>", value, "attendanceDesc");
            return (Criteria) this;
        }

        public Criteria andAttendanceDescGreaterThan(String value) {
            addCriterion("attendance_desc >", value, "attendanceDesc");
            return (Criteria) this;
        }

        public Criteria andAttendanceDescGreaterThanOrEqualTo(String value) {
            addCriterion("attendance_desc >=", value, "attendanceDesc");
            return (Criteria) this;
        }

        public Criteria andAttendanceDescLessThan(String value) {
            addCriterion("attendance_desc <", value, "attendanceDesc");
            return (Criteria) this;
        }

        public Criteria andAttendanceDescLessThanOrEqualTo(String value) {
            addCriterion("attendance_desc <=", value, "attendanceDesc");
            return (Criteria) this;
        }

        public Criteria andAttendanceDescLike(String value) {
            addCriterion("attendance_desc like", value, "attendanceDesc");
            return (Criteria) this;
        }

        public Criteria andAttendanceDescNotLike(String value) {
            addCriterion("attendance_desc not like", value, "attendanceDesc");
            return (Criteria) this;
        }

        public Criteria andAttendanceDescIn(List<String> values) {
            addCriterion("attendance_desc in", values, "attendanceDesc");
            return (Criteria) this;
        }

        public Criteria andAttendanceDescNotIn(List<String> values) {
            addCriterion("attendance_desc not in", values, "attendanceDesc");
            return (Criteria) this;
        }

        public Criteria andAttendanceDescBetween(String value1, String value2) {
            addCriterion("attendance_desc between", value1, value2, "attendanceDesc");
            return (Criteria) this;
        }

        public Criteria andAttendanceDescNotBetween(String value1, String value2) {
            addCriterion("attendance_desc not between", value1, value2, "attendanceDesc");
            return (Criteria) this;
        }

        public Criteria andAttendanceStateIsNull() {
            addCriterion("attendance_state is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceStateIsNotNull() {
            addCriterion("attendance_state is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceStateEqualTo(String value) {
            addCriterion("attendance_state =", value, "attendanceState");
            return (Criteria) this;
        }

        public Criteria andAttendanceStateNotEqualTo(String value) {
            addCriterion("attendance_state <>", value, "attendanceState");
            return (Criteria) this;
        }

        public Criteria andAttendanceStateGreaterThan(String value) {
            addCriterion("attendance_state >", value, "attendanceState");
            return (Criteria) this;
        }

        public Criteria andAttendanceStateGreaterThanOrEqualTo(String value) {
            addCriterion("attendance_state >=", value, "attendanceState");
            return (Criteria) this;
        }

        public Criteria andAttendanceStateLessThan(String value) {
            addCriterion("attendance_state <", value, "attendanceState");
            return (Criteria) this;
        }

        public Criteria andAttendanceStateLessThanOrEqualTo(String value) {
            addCriterion("attendance_state <=", value, "attendanceState");
            return (Criteria) this;
        }

        public Criteria andAttendanceStateLike(String value) {
            addCriterion("attendance_state like", value, "attendanceState");
            return (Criteria) this;
        }

        public Criteria andAttendanceStateNotLike(String value) {
            addCriterion("attendance_state not like", value, "attendanceState");
            return (Criteria) this;
        }

        public Criteria andAttendanceStateIn(List<String> values) {
            addCriterion("attendance_state in", values, "attendanceState");
            return (Criteria) this;
        }

        public Criteria andAttendanceStateNotIn(List<String> values) {
            addCriterion("attendance_state not in", values, "attendanceState");
            return (Criteria) this;
        }

        public Criteria andAttendanceStateBetween(String value1, String value2) {
            addCriterion("attendance_state between", value1, value2, "attendanceState");
            return (Criteria) this;
        }

        public Criteria andAttendanceStateNotBetween(String value1, String value2) {
            addCriterion("attendance_state not between", value1, value2, "attendanceState");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeIsNull() {
            addCriterion("attendance_time is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeIsNotNull() {
            addCriterion("attendance_time is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeEqualTo(Date value) {
            addCriterion("attendance_time =", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeNotEqualTo(Date value) {
            addCriterion("attendance_time <>", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeGreaterThan(Date value) {
            addCriterion("attendance_time >", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("attendance_time >=", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeLessThan(Date value) {
            addCriterion("attendance_time <", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeLessThanOrEqualTo(Date value) {
            addCriterion("attendance_time <=", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeIn(List<Date> values) {
            addCriterion("attendance_time in", values, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeNotIn(List<Date> values) {
            addCriterion("attendance_time not in", values, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeBetween(Date value1, Date value2) {
            addCriterion("attendance_time between", value1, value2, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeNotBetween(Date value1, Date value2) {
            addCriterion("attendance_time not between", value1, value2, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceRemarkIsNull() {
            addCriterion("attendance_remark is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceRemarkIsNotNull() {
            addCriterion("attendance_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceRemarkEqualTo(String value) {
            addCriterion("attendance_remark =", value, "attendanceRemark");
            return (Criteria) this;
        }

        public Criteria andAttendanceRemarkNotEqualTo(String value) {
            addCriterion("attendance_remark <>", value, "attendanceRemark");
            return (Criteria) this;
        }

        public Criteria andAttendanceRemarkGreaterThan(String value) {
            addCriterion("attendance_remark >", value, "attendanceRemark");
            return (Criteria) this;
        }

        public Criteria andAttendanceRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("attendance_remark >=", value, "attendanceRemark");
            return (Criteria) this;
        }

        public Criteria andAttendanceRemarkLessThan(String value) {
            addCriterion("attendance_remark <", value, "attendanceRemark");
            return (Criteria) this;
        }

        public Criteria andAttendanceRemarkLessThanOrEqualTo(String value) {
            addCriterion("attendance_remark <=", value, "attendanceRemark");
            return (Criteria) this;
        }

        public Criteria andAttendanceRemarkLike(String value) {
            addCriterion("attendance_remark like", value, "attendanceRemark");
            return (Criteria) this;
        }

        public Criteria andAttendanceRemarkNotLike(String value) {
            addCriterion("attendance_remark not like", value, "attendanceRemark");
            return (Criteria) this;
        }

        public Criteria andAttendanceRemarkIn(List<String> values) {
            addCriterion("attendance_remark in", values, "attendanceRemark");
            return (Criteria) this;
        }

        public Criteria andAttendanceRemarkNotIn(List<String> values) {
            addCriterion("attendance_remark not in", values, "attendanceRemark");
            return (Criteria) this;
        }

        public Criteria andAttendanceRemarkBetween(String value1, String value2) {
            addCriterion("attendance_remark between", value1, value2, "attendanceRemark");
            return (Criteria) this;
        }

        public Criteria andAttendanceRemarkNotBetween(String value1, String value2) {
            addCriterion("attendance_remark not between", value1, value2, "attendanceRemark");
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