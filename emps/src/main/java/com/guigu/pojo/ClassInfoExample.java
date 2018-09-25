package com.guigu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClassInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassInfoExample() {
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdIsNull() {
            addCriterion("discipline_id is null");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdIsNotNull() {
            addCriterion("discipline_id is not null");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdEqualTo(Integer value) {
            addCriterion("discipline_id =", value, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdNotEqualTo(Integer value) {
            addCriterion("discipline_id <>", value, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdGreaterThan(Integer value) {
            addCriterion("discipline_id >", value, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("discipline_id >=", value, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdLessThan(Integer value) {
            addCriterion("discipline_id <", value, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdLessThanOrEqualTo(Integer value) {
            addCriterion("discipline_id <=", value, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdIn(List<Integer> values) {
            addCriterion("discipline_id in", values, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdNotIn(List<Integer> values) {
            addCriterion("discipline_id not in", values, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdBetween(Integer value1, Integer value2) {
            addCriterion("discipline_id between", value1, value2, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("discipline_id not between", value1, value2, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdIsNull() {
            addCriterion("syllabus_id is null");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdIsNotNull() {
            addCriterion("syllabus_id is not null");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdEqualTo(Integer value) {
            addCriterion("syllabus_id =", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdNotEqualTo(Integer value) {
            addCriterion("syllabus_id <>", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdGreaterThan(Integer value) {
            addCriterion("syllabus_id >", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("syllabus_id >=", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdLessThan(Integer value) {
            addCriterion("syllabus_id <", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdLessThanOrEqualTo(Integer value) {
            addCriterion("syllabus_id <=", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdIn(List<Integer> values) {
            addCriterion("syllabus_id in", values, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdNotIn(List<Integer> values) {
            addCriterion("syllabus_id not in", values, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdBetween(Integer value1, Integer value2) {
            addCriterion("syllabus_id between", value1, value2, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("syllabus_id not between", value1, value2, "syllabusId");
            return (Criteria) this;
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

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNumberIsNull() {
            addCriterion("class_number is null");
            return (Criteria) this;
        }

        public Criteria andClassNumberIsNotNull() {
            addCriterion("class_number is not null");
            return (Criteria) this;
        }

        public Criteria andClassNumberEqualTo(Integer value) {
            addCriterion("class_number =", value, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberNotEqualTo(Integer value) {
            addCriterion("class_number <>", value, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberGreaterThan(Integer value) {
            addCriterion("class_number >", value, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_number >=", value, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberLessThan(Integer value) {
            addCriterion("class_number <", value, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberLessThanOrEqualTo(Integer value) {
            addCriterion("class_number <=", value, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberIn(List<Integer> values) {
            addCriterion("class_number in", values, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberNotIn(List<Integer> values) {
            addCriterion("class_number not in", values, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberBetween(Integer value1, Integer value2) {
            addCriterion("class_number between", value1, value2, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("class_number not between", value1, value2, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassStartTimeIsNull() {
            addCriterion("class_start_time is null");
            return (Criteria) this;
        }

        public Criteria andClassStartTimeIsNotNull() {
            addCriterion("class_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andClassStartTimeEqualTo(Date value) {
            addCriterion("class_start_time =", value, "classStartTime");
            return (Criteria) this;
        }

        public Criteria andClassStartTimeNotEqualTo(Date value) {
            addCriterion("class_start_time <>", value, "classStartTime");
            return (Criteria) this;
        }

        public Criteria andClassStartTimeGreaterThan(Date value) {
            addCriterion("class_start_time >", value, "classStartTime");
            return (Criteria) this;
        }

        public Criteria andClassStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("class_start_time >=", value, "classStartTime");
            return (Criteria) this;
        }

        public Criteria andClassStartTimeLessThan(Date value) {
            addCriterion("class_start_time <", value, "classStartTime");
            return (Criteria) this;
        }

        public Criteria andClassStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("class_start_time <=", value, "classStartTime");
            return (Criteria) this;
        }

        public Criteria andClassStartTimeIn(List<Date> values) {
            addCriterion("class_start_time in", values, "classStartTime");
            return (Criteria) this;
        }

        public Criteria andClassStartTimeNotIn(List<Date> values) {
            addCriterion("class_start_time not in", values, "classStartTime");
            return (Criteria) this;
        }

        public Criteria andClassStartTimeBetween(Date value1, Date value2) {
            addCriterion("class_start_time between", value1, value2, "classStartTime");
            return (Criteria) this;
        }

        public Criteria andClassStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("class_start_time not between", value1, value2, "classStartTime");
            return (Criteria) this;
        }

        public Criteria andClassEndTimeIsNull() {
            addCriterion("class_end_time is null");
            return (Criteria) this;
        }

        public Criteria andClassEndTimeIsNotNull() {
            addCriterion("class_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andClassEndTimeEqualTo(Date value) {
            addCriterion("class_end_time =", value, "classEndTime");
            return (Criteria) this;
        }

        public Criteria andClassEndTimeNotEqualTo(Date value) {
            addCriterion("class_end_time <>", value, "classEndTime");
            return (Criteria) this;
        }

        public Criteria andClassEndTimeGreaterThan(Date value) {
            addCriterion("class_end_time >", value, "classEndTime");
            return (Criteria) this;
        }

        public Criteria andClassEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("class_end_time >=", value, "classEndTime");
            return (Criteria) this;
        }

        public Criteria andClassEndTimeLessThan(Date value) {
            addCriterion("class_end_time <", value, "classEndTime");
            return (Criteria) this;
        }

        public Criteria andClassEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("class_end_time <=", value, "classEndTime");
            return (Criteria) this;
        }

        public Criteria andClassEndTimeIn(List<Date> values) {
            addCriterion("class_end_time in", values, "classEndTime");
            return (Criteria) this;
        }

        public Criteria andClassEndTimeNotIn(List<Date> values) {
            addCriterion("class_end_time not in", values, "classEndTime");
            return (Criteria) this;
        }

        public Criteria andClassEndTimeBetween(Date value1, Date value2) {
            addCriterion("class_end_time between", value1, value2, "classEndTime");
            return (Criteria) this;
        }

        public Criteria andClassEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("class_end_time not between", value1, value2, "classEndTime");
            return (Criteria) this;
        }

        public Criteria andClassIsuesdIsNull() {
            addCriterion("class_isuesd is null");
            return (Criteria) this;
        }

        public Criteria andClassIsuesdIsNotNull() {
            addCriterion("class_isuesd is not null");
            return (Criteria) this;
        }

        public Criteria andClassIsuesdEqualTo(String value) {
            addCriterion("class_isuesd =", value, "classIsuesd");
            return (Criteria) this;
        }

        public Criteria andClassIsuesdNotEqualTo(String value) {
            addCriterion("class_isuesd <>", value, "classIsuesd");
            return (Criteria) this;
        }

        public Criteria andClassIsuesdGreaterThan(String value) {
            addCriterion("class_isuesd >", value, "classIsuesd");
            return (Criteria) this;
        }

        public Criteria andClassIsuesdGreaterThanOrEqualTo(String value) {
            addCriterion("class_isuesd >=", value, "classIsuesd");
            return (Criteria) this;
        }

        public Criteria andClassIsuesdLessThan(String value) {
            addCriterion("class_isuesd <", value, "classIsuesd");
            return (Criteria) this;
        }

        public Criteria andClassIsuesdLessThanOrEqualTo(String value) {
            addCriterion("class_isuesd <=", value, "classIsuesd");
            return (Criteria) this;
        }

        public Criteria andClassIsuesdLike(String value) {
            addCriterion("class_isuesd like", value, "classIsuesd");
            return (Criteria) this;
        }

        public Criteria andClassIsuesdNotLike(String value) {
            addCriterion("class_isuesd not like", value, "classIsuesd");
            return (Criteria) this;
        }

        public Criteria andClassIsuesdIn(List<String> values) {
            addCriterion("class_isuesd in", values, "classIsuesd");
            return (Criteria) this;
        }

        public Criteria andClassIsuesdNotIn(List<String> values) {
            addCriterion("class_isuesd not in", values, "classIsuesd");
            return (Criteria) this;
        }

        public Criteria andClassIsuesdBetween(String value1, String value2) {
            addCriterion("class_isuesd between", value1, value2, "classIsuesd");
            return (Criteria) this;
        }

        public Criteria andClassIsuesdNotBetween(String value1, String value2) {
            addCriterion("class_isuesd not between", value1, value2, "classIsuesd");
            return (Criteria) this;
        }

        public Criteria andClassStateIsNull() {
            addCriterion("class_state is null");
            return (Criteria) this;
        }

        public Criteria andClassStateIsNotNull() {
            addCriterion("class_state is not null");
            return (Criteria) this;
        }

        public Criteria andClassStateEqualTo(String value) {
            addCriterion("class_state =", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateNotEqualTo(String value) {
            addCriterion("class_state <>", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateGreaterThan(String value) {
            addCriterion("class_state >", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateGreaterThanOrEqualTo(String value) {
            addCriterion("class_state >=", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateLessThan(String value) {
            addCriterion("class_state <", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateLessThanOrEqualTo(String value) {
            addCriterion("class_state <=", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateLike(String value) {
            addCriterion("class_state like", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateNotLike(String value) {
            addCriterion("class_state not like", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateIn(List<String> values) {
            addCriterion("class_state in", values, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateNotIn(List<String> values) {
            addCriterion("class_state not in", values, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateBetween(String value1, String value2) {
            addCriterion("class_state between", value1, value2, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateNotBetween(String value1, String value2) {
            addCriterion("class_state not between", value1, value2, "classState");
            return (Criteria) this;
        }

        public Criteria andClassDescIsNull() {
            addCriterion("class_desc is null");
            return (Criteria) this;
        }

        public Criteria andClassDescIsNotNull() {
            addCriterion("class_desc is not null");
            return (Criteria) this;
        }

        public Criteria andClassDescEqualTo(String value) {
            addCriterion("class_desc =", value, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescNotEqualTo(String value) {
            addCriterion("class_desc <>", value, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescGreaterThan(String value) {
            addCriterion("class_desc >", value, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescGreaterThanOrEqualTo(String value) {
            addCriterion("class_desc >=", value, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescLessThan(String value) {
            addCriterion("class_desc <", value, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescLessThanOrEqualTo(String value) {
            addCriterion("class_desc <=", value, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescLike(String value) {
            addCriterion("class_desc like", value, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescNotLike(String value) {
            addCriterion("class_desc not like", value, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescIn(List<String> values) {
            addCriterion("class_desc in", values, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescNotIn(List<String> values) {
            addCriterion("class_desc not in", values, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescBetween(String value1, String value2) {
            addCriterion("class_desc between", value1, value2, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescNotBetween(String value1, String value2) {
            addCriterion("class_desc not between", value1, value2, "classDesc");
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