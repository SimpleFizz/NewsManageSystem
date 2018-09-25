package com.guigu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluationInfoExample() {
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

        public Criteria andEvaluationIdIsNull() {
            addCriterion("evaluation_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdIsNotNull() {
            addCriterion("evaluation_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdEqualTo(Integer value) {
            addCriterion("evaluation_id =", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotEqualTo(Integer value) {
            addCriterion("evaluation_id <>", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdGreaterThan(Integer value) {
            addCriterion("evaluation_id >", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluation_id >=", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdLessThan(Integer value) {
            addCriterion("evaluation_id <", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdLessThanOrEqualTo(Integer value) {
            addCriterion("evaluation_id <=", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdIn(List<Integer> values) {
            addCriterion("evaluation_id in", values, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotIn(List<Integer> values) {
            addCriterion("evaluation_id not in", values, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_id between", value1, value2, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_id not between", value1, value2, "evaluationId");
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

        public Criteria andEvaluationTitleIsNull() {
            addCriterion("evaluation_title is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTitleIsNotNull() {
            addCriterion("evaluation_title is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTitleEqualTo(String value) {
            addCriterion("evaluation_title =", value, "evaluationTitle");
            return (Criteria) this;
        }

        public Criteria andEvaluationTitleNotEqualTo(String value) {
            addCriterion("evaluation_title <>", value, "evaluationTitle");
            return (Criteria) this;
        }

        public Criteria andEvaluationTitleGreaterThan(String value) {
            addCriterion("evaluation_title >", value, "evaluationTitle");
            return (Criteria) this;
        }

        public Criteria andEvaluationTitleGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation_title >=", value, "evaluationTitle");
            return (Criteria) this;
        }

        public Criteria andEvaluationTitleLessThan(String value) {
            addCriterion("evaluation_title <", value, "evaluationTitle");
            return (Criteria) this;
        }

        public Criteria andEvaluationTitleLessThanOrEqualTo(String value) {
            addCriterion("evaluation_title <=", value, "evaluationTitle");
            return (Criteria) this;
        }

        public Criteria andEvaluationTitleLike(String value) {
            addCriterion("evaluation_title like", value, "evaluationTitle");
            return (Criteria) this;
        }

        public Criteria andEvaluationTitleNotLike(String value) {
            addCriterion("evaluation_title not like", value, "evaluationTitle");
            return (Criteria) this;
        }

        public Criteria andEvaluationTitleIn(List<String> values) {
            addCriterion("evaluation_title in", values, "evaluationTitle");
            return (Criteria) this;
        }

        public Criteria andEvaluationTitleNotIn(List<String> values) {
            addCriterion("evaluation_title not in", values, "evaluationTitle");
            return (Criteria) this;
        }

        public Criteria andEvaluationTitleBetween(String value1, String value2) {
            addCriterion("evaluation_title between", value1, value2, "evaluationTitle");
            return (Criteria) this;
        }

        public Criteria andEvaluationTitleNotBetween(String value1, String value2) {
            addCriterion("evaluation_title not between", value1, value2, "evaluationTitle");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentIsNull() {
            addCriterion("evaluation_content is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentIsNotNull() {
            addCriterion("evaluation_content is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentEqualTo(String value) {
            addCriterion("evaluation_content =", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotEqualTo(String value) {
            addCriterion("evaluation_content <>", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentGreaterThan(String value) {
            addCriterion("evaluation_content >", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation_content >=", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentLessThan(String value) {
            addCriterion("evaluation_content <", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentLessThanOrEqualTo(String value) {
            addCriterion("evaluation_content <=", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentLike(String value) {
            addCriterion("evaluation_content like", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotLike(String value) {
            addCriterion("evaluation_content not like", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentIn(List<String> values) {
            addCriterion("evaluation_content in", values, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotIn(List<String> values) {
            addCriterion("evaluation_content not in", values, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentBetween(String value1, String value2) {
            addCriterion("evaluation_content between", value1, value2, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotBetween(String value1, String value2) {
            addCriterion("evaluation_content not between", value1, value2, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationCourseIsNull() {
            addCriterion("evaluation_course is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationCourseIsNotNull() {
            addCriterion("evaluation_course is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationCourseEqualTo(String value) {
            addCriterion("evaluation_course =", value, "evaluationCourse");
            return (Criteria) this;
        }

        public Criteria andEvaluationCourseNotEqualTo(String value) {
            addCriterion("evaluation_course <>", value, "evaluationCourse");
            return (Criteria) this;
        }

        public Criteria andEvaluationCourseGreaterThan(String value) {
            addCriterion("evaluation_course >", value, "evaluationCourse");
            return (Criteria) this;
        }

        public Criteria andEvaluationCourseGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation_course >=", value, "evaluationCourse");
            return (Criteria) this;
        }

        public Criteria andEvaluationCourseLessThan(String value) {
            addCriterion("evaluation_course <", value, "evaluationCourse");
            return (Criteria) this;
        }

        public Criteria andEvaluationCourseLessThanOrEqualTo(String value) {
            addCriterion("evaluation_course <=", value, "evaluationCourse");
            return (Criteria) this;
        }

        public Criteria andEvaluationCourseLike(String value) {
            addCriterion("evaluation_course like", value, "evaluationCourse");
            return (Criteria) this;
        }

        public Criteria andEvaluationCourseNotLike(String value) {
            addCriterion("evaluation_course not like", value, "evaluationCourse");
            return (Criteria) this;
        }

        public Criteria andEvaluationCourseIn(List<String> values) {
            addCriterion("evaluation_course in", values, "evaluationCourse");
            return (Criteria) this;
        }

        public Criteria andEvaluationCourseNotIn(List<String> values) {
            addCriterion("evaluation_course not in", values, "evaluationCourse");
            return (Criteria) this;
        }

        public Criteria andEvaluationCourseBetween(String value1, String value2) {
            addCriterion("evaluation_course between", value1, value2, "evaluationCourse");
            return (Criteria) this;
        }

        public Criteria andEvaluationCourseNotBetween(String value1, String value2) {
            addCriterion("evaluation_course not between", value1, value2, "evaluationCourse");
            return (Criteria) this;
        }

        public Criteria andEvaluationTeacherIsNull() {
            addCriterion("evaluation_teacher is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTeacherIsNotNull() {
            addCriterion("evaluation_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTeacherEqualTo(String value) {
            addCriterion("evaluation_teacher =", value, "evaluationTeacher");
            return (Criteria) this;
        }

        public Criteria andEvaluationTeacherNotEqualTo(String value) {
            addCriterion("evaluation_teacher <>", value, "evaluationTeacher");
            return (Criteria) this;
        }

        public Criteria andEvaluationTeacherGreaterThan(String value) {
            addCriterion("evaluation_teacher >", value, "evaluationTeacher");
            return (Criteria) this;
        }

        public Criteria andEvaluationTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation_teacher >=", value, "evaluationTeacher");
            return (Criteria) this;
        }

        public Criteria andEvaluationTeacherLessThan(String value) {
            addCriterion("evaluation_teacher <", value, "evaluationTeacher");
            return (Criteria) this;
        }

        public Criteria andEvaluationTeacherLessThanOrEqualTo(String value) {
            addCriterion("evaluation_teacher <=", value, "evaluationTeacher");
            return (Criteria) this;
        }

        public Criteria andEvaluationTeacherLike(String value) {
            addCriterion("evaluation_teacher like", value, "evaluationTeacher");
            return (Criteria) this;
        }

        public Criteria andEvaluationTeacherNotLike(String value) {
            addCriterion("evaluation_teacher not like", value, "evaluationTeacher");
            return (Criteria) this;
        }

        public Criteria andEvaluationTeacherIn(List<String> values) {
            addCriterion("evaluation_teacher in", values, "evaluationTeacher");
            return (Criteria) this;
        }

        public Criteria andEvaluationTeacherNotIn(List<String> values) {
            addCriterion("evaluation_teacher not in", values, "evaluationTeacher");
            return (Criteria) this;
        }

        public Criteria andEvaluationTeacherBetween(String value1, String value2) {
            addCriterion("evaluation_teacher between", value1, value2, "evaluationTeacher");
            return (Criteria) this;
        }

        public Criteria andEvaluationTeacherNotBetween(String value1, String value2) {
            addCriterion("evaluation_teacher not between", value1, value2, "evaluationTeacher");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIsNull() {
            addCriterion("evaluation_time is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIsNotNull() {
            addCriterion("evaluation_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeEqualTo(Date value) {
            addCriterion("evaluation_time =", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotEqualTo(Date value) {
            addCriterion("evaluation_time <>", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeGreaterThan(Date value) {
            addCriterion("evaluation_time >", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evaluation_time >=", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeLessThan(Date value) {
            addCriterion("evaluation_time <", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeLessThanOrEqualTo(Date value) {
            addCriterion("evaluation_time <=", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIn(List<Date> values) {
            addCriterion("evaluation_time in", values, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotIn(List<Date> values) {
            addCriterion("evaluation_time not in", values, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeBetween(Date value1, Date value2) {
            addCriterion("evaluation_time between", value1, value2, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotBetween(Date value1, Date value2) {
            addCriterion("evaluation_time not between", value1, value2, "evaluationTime");
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