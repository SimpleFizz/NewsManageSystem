package com.guigu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrackRecordInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrackRecordInfoExample() {
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

        public Criteria andTrackRecordIdIsNull() {
            addCriterion("track_record_id is null");
            return (Criteria) this;
        }

        public Criteria andTrackRecordIdIsNotNull() {
            addCriterion("track_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrackRecordIdEqualTo(Integer value) {
            addCriterion("track_record_id =", value, "trackRecordId");
            return (Criteria) this;
        }

        public Criteria andTrackRecordIdNotEqualTo(Integer value) {
            addCriterion("track_record_id <>", value, "trackRecordId");
            return (Criteria) this;
        }

        public Criteria andTrackRecordIdGreaterThan(Integer value) {
            addCriterion("track_record_id >", value, "trackRecordId");
            return (Criteria) this;
        }

        public Criteria andTrackRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("track_record_id >=", value, "trackRecordId");
            return (Criteria) this;
        }

        public Criteria andTrackRecordIdLessThan(Integer value) {
            addCriterion("track_record_id <", value, "trackRecordId");
            return (Criteria) this;
        }

        public Criteria andTrackRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("track_record_id <=", value, "trackRecordId");
            return (Criteria) this;
        }

        public Criteria andTrackRecordIdIn(List<Integer> values) {
            addCriterion("track_record_id in", values, "trackRecordId");
            return (Criteria) this;
        }

        public Criteria andTrackRecordIdNotIn(List<Integer> values) {
            addCriterion("track_record_id not in", values, "trackRecordId");
            return (Criteria) this;
        }

        public Criteria andTrackRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("track_record_id between", value1, value2, "trackRecordId");
            return (Criteria) this;
        }

        public Criteria andTrackRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("track_record_id not between", value1, value2, "trackRecordId");
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

        public Criteria andTrackRecordTitleIsNull() {
            addCriterion("track_record_title is null");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTitleIsNotNull() {
            addCriterion("track_record_title is not null");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTitleEqualTo(String value) {
            addCriterion("track_record_title =", value, "trackRecordTitle");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTitleNotEqualTo(String value) {
            addCriterion("track_record_title <>", value, "trackRecordTitle");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTitleGreaterThan(String value) {
            addCriterion("track_record_title >", value, "trackRecordTitle");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTitleGreaterThanOrEqualTo(String value) {
            addCriterion("track_record_title >=", value, "trackRecordTitle");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTitleLessThan(String value) {
            addCriterion("track_record_title <", value, "trackRecordTitle");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTitleLessThanOrEqualTo(String value) {
            addCriterion("track_record_title <=", value, "trackRecordTitle");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTitleLike(String value) {
            addCriterion("track_record_title like", value, "trackRecordTitle");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTitleNotLike(String value) {
            addCriterion("track_record_title not like", value, "trackRecordTitle");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTitleIn(List<String> values) {
            addCriterion("track_record_title in", values, "trackRecordTitle");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTitleNotIn(List<String> values) {
            addCriterion("track_record_title not in", values, "trackRecordTitle");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTitleBetween(String value1, String value2) {
            addCriterion("track_record_title between", value1, value2, "trackRecordTitle");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTitleNotBetween(String value1, String value2) {
            addCriterion("track_record_title not between", value1, value2, "trackRecordTitle");
            return (Criteria) this;
        }

        public Criteria andTrackRecordContentIsNull() {
            addCriterion("track_record_content is null");
            return (Criteria) this;
        }

        public Criteria andTrackRecordContentIsNotNull() {
            addCriterion("track_record_content is not null");
            return (Criteria) this;
        }

        public Criteria andTrackRecordContentEqualTo(String value) {
            addCriterion("track_record_content =", value, "trackRecordContent");
            return (Criteria) this;
        }

        public Criteria andTrackRecordContentNotEqualTo(String value) {
            addCriterion("track_record_content <>", value, "trackRecordContent");
            return (Criteria) this;
        }

        public Criteria andTrackRecordContentGreaterThan(String value) {
            addCriterion("track_record_content >", value, "trackRecordContent");
            return (Criteria) this;
        }

        public Criteria andTrackRecordContentGreaterThanOrEqualTo(String value) {
            addCriterion("track_record_content >=", value, "trackRecordContent");
            return (Criteria) this;
        }

        public Criteria andTrackRecordContentLessThan(String value) {
            addCriterion("track_record_content <", value, "trackRecordContent");
            return (Criteria) this;
        }

        public Criteria andTrackRecordContentLessThanOrEqualTo(String value) {
            addCriterion("track_record_content <=", value, "trackRecordContent");
            return (Criteria) this;
        }

        public Criteria andTrackRecordContentLike(String value) {
            addCriterion("track_record_content like", value, "trackRecordContent");
            return (Criteria) this;
        }

        public Criteria andTrackRecordContentNotLike(String value) {
            addCriterion("track_record_content not like", value, "trackRecordContent");
            return (Criteria) this;
        }

        public Criteria andTrackRecordContentIn(List<String> values) {
            addCriterion("track_record_content in", values, "trackRecordContent");
            return (Criteria) this;
        }

        public Criteria andTrackRecordContentNotIn(List<String> values) {
            addCriterion("track_record_content not in", values, "trackRecordContent");
            return (Criteria) this;
        }

        public Criteria andTrackRecordContentBetween(String value1, String value2) {
            addCriterion("track_record_content between", value1, value2, "trackRecordContent");
            return (Criteria) this;
        }

        public Criteria andTrackRecordContentNotBetween(String value1, String value2) {
            addCriterion("track_record_content not between", value1, value2, "trackRecordContent");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTimeIsNull() {
            addCriterion("track_record_time is null");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTimeIsNotNull() {
            addCriterion("track_record_time is not null");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTimeEqualTo(Date value) {
            addCriterion("track_record_time =", value, "trackRecordTime");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTimeNotEqualTo(Date value) {
            addCriterion("track_record_time <>", value, "trackRecordTime");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTimeGreaterThan(Date value) {
            addCriterion("track_record_time >", value, "trackRecordTime");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("track_record_time >=", value, "trackRecordTime");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTimeLessThan(Date value) {
            addCriterion("track_record_time <", value, "trackRecordTime");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("track_record_time <=", value, "trackRecordTime");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTimeIn(List<Date> values) {
            addCriterion("track_record_time in", values, "trackRecordTime");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTimeNotIn(List<Date> values) {
            addCriterion("track_record_time not in", values, "trackRecordTime");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTimeBetween(Date value1, Date value2) {
            addCriterion("track_record_time between", value1, value2, "trackRecordTime");
            return (Criteria) this;
        }

        public Criteria andTrackRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("track_record_time not between", value1, value2, "trackRecordTime");
            return (Criteria) this;
        }

        public Criteria andEnrollmentIsNull() {
            addCriterion("enrollment is null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentIsNotNull() {
            addCriterion("enrollment is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentEqualTo(Integer value) {
            addCriterion("enrollment =", value, "enrollment");
            return (Criteria) this;
        }

        public Criteria andEnrollmentNotEqualTo(Integer value) {
            addCriterion("enrollment <>", value, "enrollment");
            return (Criteria) this;
        }

        public Criteria andEnrollmentGreaterThan(Integer value) {
            addCriterion("enrollment >", value, "enrollment");
            return (Criteria) this;
        }

        public Criteria andEnrollmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("enrollment >=", value, "enrollment");
            return (Criteria) this;
        }

        public Criteria andEnrollmentLessThan(Integer value) {
            addCriterion("enrollment <", value, "enrollment");
            return (Criteria) this;
        }

        public Criteria andEnrollmentLessThanOrEqualTo(Integer value) {
            addCriterion("enrollment <=", value, "enrollment");
            return (Criteria) this;
        }

        public Criteria andEnrollmentIn(List<Integer> values) {
            addCriterion("enrollment in", values, "enrollment");
            return (Criteria) this;
        }

        public Criteria andEnrollmentNotIn(List<Integer> values) {
            addCriterion("enrollment not in", values, "enrollment");
            return (Criteria) this;
        }

        public Criteria andEnrollmentBetween(Integer value1, Integer value2) {
            addCriterion("enrollment between", value1, value2, "enrollment");
            return (Criteria) this;
        }

        public Criteria andEnrollmentNotBetween(Integer value1, Integer value2) {
            addCriterion("enrollment not between", value1, value2, "enrollment");
            return (Criteria) this;
        }

        public Criteria andNextRecordTimeIsNull() {
            addCriterion("next_record_time is null");
            return (Criteria) this;
        }

        public Criteria andNextRecordTimeIsNotNull() {
            addCriterion("next_record_time is not null");
            return (Criteria) this;
        }

        public Criteria andNextRecordTimeEqualTo(Date value) {
            addCriterion("next_record_time =", value, "nextRecordTime");
            return (Criteria) this;
        }

        public Criteria andNextRecordTimeNotEqualTo(Date value) {
            addCriterion("next_record_time <>", value, "nextRecordTime");
            return (Criteria) this;
        }

        public Criteria andNextRecordTimeGreaterThan(Date value) {
            addCriterion("next_record_time >", value, "nextRecordTime");
            return (Criteria) this;
        }

        public Criteria andNextRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("next_record_time >=", value, "nextRecordTime");
            return (Criteria) this;
        }

        public Criteria andNextRecordTimeLessThan(Date value) {
            addCriterion("next_record_time <", value, "nextRecordTime");
            return (Criteria) this;
        }

        public Criteria andNextRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("next_record_time <=", value, "nextRecordTime");
            return (Criteria) this;
        }

        public Criteria andNextRecordTimeIn(List<Date> values) {
            addCriterion("next_record_time in", values, "nextRecordTime");
            return (Criteria) this;
        }

        public Criteria andNextRecordTimeNotIn(List<Date> values) {
            addCriterion("next_record_time not in", values, "nextRecordTime");
            return (Criteria) this;
        }

        public Criteria andNextRecordTimeBetween(Date value1, Date value2) {
            addCriterion("next_record_time between", value1, value2, "nextRecordTime");
            return (Criteria) this;
        }

        public Criteria andNextRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("next_record_time not between", value1, value2, "nextRecordTime");
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