package com.guigu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentWriteGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentWriteGradeExample() {
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

        public Criteria andWriteGradeIdIsNull() {
            addCriterion("write_grade_id is null");
            return (Criteria) this;
        }

        public Criteria andWriteGradeIdIsNotNull() {
            addCriterion("write_grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andWriteGradeIdEqualTo(Integer value) {
            addCriterion("write_grade_id =", value, "writeGradeId");
            return (Criteria) this;
        }

        public Criteria andWriteGradeIdNotEqualTo(Integer value) {
            addCriterion("write_grade_id <>", value, "writeGradeId");
            return (Criteria) this;
        }

        public Criteria andWriteGradeIdGreaterThan(Integer value) {
            addCriterion("write_grade_id >", value, "writeGradeId");
            return (Criteria) this;
        }

        public Criteria andWriteGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("write_grade_id >=", value, "writeGradeId");
            return (Criteria) this;
        }

        public Criteria andWriteGradeIdLessThan(Integer value) {
            addCriterion("write_grade_id <", value, "writeGradeId");
            return (Criteria) this;
        }

        public Criteria andWriteGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("write_grade_id <=", value, "writeGradeId");
            return (Criteria) this;
        }

        public Criteria andWriteGradeIdIn(List<Integer> values) {
            addCriterion("write_grade_id in", values, "writeGradeId");
            return (Criteria) this;
        }

        public Criteria andWriteGradeIdNotIn(List<Integer> values) {
            addCriterion("write_grade_id not in", values, "writeGradeId");
            return (Criteria) this;
        }

        public Criteria andWriteGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("write_grade_id between", value1, value2, "writeGradeId");
            return (Criteria) this;
        }

        public Criteria andWriteGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("write_grade_id not between", value1, value2, "writeGradeId");
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

        public Criteria andWriteGradeSubjectIsNull() {
            addCriterion("write_grade_subject is null");
            return (Criteria) this;
        }

        public Criteria andWriteGradeSubjectIsNotNull() {
            addCriterion("write_grade_subject is not null");
            return (Criteria) this;
        }

        public Criteria andWriteGradeSubjectEqualTo(String value) {
            addCriterion("write_grade_subject =", value, "writeGradeSubject");
            return (Criteria) this;
        }

        public Criteria andWriteGradeSubjectNotEqualTo(String value) {
            addCriterion("write_grade_subject <>", value, "writeGradeSubject");
            return (Criteria) this;
        }

        public Criteria andWriteGradeSubjectGreaterThan(String value) {
            addCriterion("write_grade_subject >", value, "writeGradeSubject");
            return (Criteria) this;
        }

        public Criteria andWriteGradeSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("write_grade_subject >=", value, "writeGradeSubject");
            return (Criteria) this;
        }

        public Criteria andWriteGradeSubjectLessThan(String value) {
            addCriterion("write_grade_subject <", value, "writeGradeSubject");
            return (Criteria) this;
        }

        public Criteria andWriteGradeSubjectLessThanOrEqualTo(String value) {
            addCriterion("write_grade_subject <=", value, "writeGradeSubject");
            return (Criteria) this;
        }

        public Criteria andWriteGradeSubjectLike(String value) {
            addCriterion("write_grade_subject like", value, "writeGradeSubject");
            return (Criteria) this;
        }

        public Criteria andWriteGradeSubjectNotLike(String value) {
            addCriterion("write_grade_subject not like", value, "writeGradeSubject");
            return (Criteria) this;
        }

        public Criteria andWriteGradeSubjectIn(List<String> values) {
            addCriterion("write_grade_subject in", values, "writeGradeSubject");
            return (Criteria) this;
        }

        public Criteria andWriteGradeSubjectNotIn(List<String> values) {
            addCriterion("write_grade_subject not in", values, "writeGradeSubject");
            return (Criteria) this;
        }

        public Criteria andWriteGradeSubjectBetween(String value1, String value2) {
            addCriterion("write_grade_subject between", value1, value2, "writeGradeSubject");
            return (Criteria) this;
        }

        public Criteria andWriteGradeSubjectNotBetween(String value1, String value2) {
            addCriterion("write_grade_subject not between", value1, value2, "writeGradeSubject");
            return (Criteria) this;
        }

        public Criteria andWriteGradeIsNull() {
            addCriterion("write_grade is null");
            return (Criteria) this;
        }

        public Criteria andWriteGradeIsNotNull() {
            addCriterion("write_grade is not null");
            return (Criteria) this;
        }

        public Criteria andWriteGradeEqualTo(String value) {
            addCriterion("write_grade =", value, "writeGrade");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNotEqualTo(String value) {
            addCriterion("write_grade <>", value, "writeGrade");
            return (Criteria) this;
        }

        public Criteria andWriteGradeGreaterThan(String value) {
            addCriterion("write_grade >", value, "writeGrade");
            return (Criteria) this;
        }

        public Criteria andWriteGradeGreaterThanOrEqualTo(String value) {
            addCriterion("write_grade >=", value, "writeGrade");
            return (Criteria) this;
        }

        public Criteria andWriteGradeLessThan(String value) {
            addCriterion("write_grade <", value, "writeGrade");
            return (Criteria) this;
        }

        public Criteria andWriteGradeLessThanOrEqualTo(String value) {
            addCriterion("write_grade <=", value, "writeGrade");
            return (Criteria) this;
        }

        public Criteria andWriteGradeLike(String value) {
            addCriterion("write_grade like", value, "writeGrade");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNotLike(String value) {
            addCriterion("write_grade not like", value, "writeGrade");
            return (Criteria) this;
        }

        public Criteria andWriteGradeIn(List<String> values) {
            addCriterion("write_grade in", values, "writeGrade");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNotIn(List<String> values) {
            addCriterion("write_grade not in", values, "writeGrade");
            return (Criteria) this;
        }

        public Criteria andWriteGradeBetween(String value1, String value2) {
            addCriterion("write_grade between", value1, value2, "writeGrade");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNotBetween(String value1, String value2) {
            addCriterion("write_grade not between", value1, value2, "writeGrade");
            return (Criteria) this;
        }

        public Criteria andWriteGradeTimeIsNull() {
            addCriterion("write_grade_time is null");
            return (Criteria) this;
        }

        public Criteria andWriteGradeTimeIsNotNull() {
            addCriterion("write_grade_time is not null");
            return (Criteria) this;
        }

        public Criteria andWriteGradeTimeEqualTo(Date value) {
            addCriterion("write_grade_time =", value, "writeGradeTime");
            return (Criteria) this;
        }

        public Criteria andWriteGradeTimeNotEqualTo(Date value) {
            addCriterion("write_grade_time <>", value, "writeGradeTime");
            return (Criteria) this;
        }

        public Criteria andWriteGradeTimeGreaterThan(Date value) {
            addCriterion("write_grade_time >", value, "writeGradeTime");
            return (Criteria) this;
        }

        public Criteria andWriteGradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("write_grade_time >=", value, "writeGradeTime");
            return (Criteria) this;
        }

        public Criteria andWriteGradeTimeLessThan(Date value) {
            addCriterion("write_grade_time <", value, "writeGradeTime");
            return (Criteria) this;
        }

        public Criteria andWriteGradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("write_grade_time <=", value, "writeGradeTime");
            return (Criteria) this;
        }

        public Criteria andWriteGradeTimeIn(List<Date> values) {
            addCriterion("write_grade_time in", values, "writeGradeTime");
            return (Criteria) this;
        }

        public Criteria andWriteGradeTimeNotIn(List<Date> values) {
            addCriterion("write_grade_time not in", values, "writeGradeTime");
            return (Criteria) this;
        }

        public Criteria andWriteGradeTimeBetween(Date value1, Date value2) {
            addCriterion("write_grade_time between", value1, value2, "writeGradeTime");
            return (Criteria) this;
        }

        public Criteria andWriteGradeTimeNotBetween(Date value1, Date value2) {
            addCriterion("write_grade_time not between", value1, value2, "writeGradeTime");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNoteIsNull() {
            addCriterion("write_grade_note is null");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNoteIsNotNull() {
            addCriterion("write_grade_note is not null");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNoteEqualTo(String value) {
            addCriterion("write_grade_note =", value, "writeGradeNote");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNoteNotEqualTo(String value) {
            addCriterion("write_grade_note <>", value, "writeGradeNote");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNoteGreaterThan(String value) {
            addCriterion("write_grade_note >", value, "writeGradeNote");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNoteGreaterThanOrEqualTo(String value) {
            addCriterion("write_grade_note >=", value, "writeGradeNote");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNoteLessThan(String value) {
            addCriterion("write_grade_note <", value, "writeGradeNote");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNoteLessThanOrEqualTo(String value) {
            addCriterion("write_grade_note <=", value, "writeGradeNote");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNoteLike(String value) {
            addCriterion("write_grade_note like", value, "writeGradeNote");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNoteNotLike(String value) {
            addCriterion("write_grade_note not like", value, "writeGradeNote");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNoteIn(List<String> values) {
            addCriterion("write_grade_note in", values, "writeGradeNote");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNoteNotIn(List<String> values) {
            addCriterion("write_grade_note not in", values, "writeGradeNote");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNoteBetween(String value1, String value2) {
            addCriterion("write_grade_note between", value1, value2, "writeGradeNote");
            return (Criteria) this;
        }

        public Criteria andWriteGradeNoteNotBetween(String value1, String value2) {
            addCriterion("write_grade_note not between", value1, value2, "writeGradeNote");
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