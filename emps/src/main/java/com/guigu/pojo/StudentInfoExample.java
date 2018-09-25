package com.guigu.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentInfoExample() {
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

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNull() {
            addCriterion("student_sex is null");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNotNull() {
            addCriterion("student_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSexEqualTo(String value) {
            addCriterion("student_sex =", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotEqualTo(String value) {
            addCriterion("student_sex <>", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThan(String value) {
            addCriterion("student_sex >", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThanOrEqualTo(String value) {
            addCriterion("student_sex >=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThan(String value) {
            addCriterion("student_sex <", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThanOrEqualTo(String value) {
            addCriterion("student_sex <=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLike(String value) {
            addCriterion("student_sex like", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotLike(String value) {
            addCriterion("student_sex not like", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexIn(List<String> values) {
            addCriterion("student_sex in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotIn(List<String> values) {
            addCriterion("student_sex not in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexBetween(String value1, String value2) {
            addCriterion("student_sex between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotBetween(String value1, String value2) {
            addCriterion("student_sex not between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentAgeIsNull() {
            addCriterion("student_age is null");
            return (Criteria) this;
        }

        public Criteria andStudentAgeIsNotNull() {
            addCriterion("student_age is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAgeEqualTo(Integer value) {
            addCriterion("student_age =", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeNotEqualTo(Integer value) {
            addCriterion("student_age <>", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeGreaterThan(Integer value) {
            addCriterion("student_age >", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_age >=", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeLessThan(Integer value) {
            addCriterion("student_age <", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeLessThanOrEqualTo(Integer value) {
            addCriterion("student_age <=", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeIn(List<Integer> values) {
            addCriterion("student_age in", values, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeNotIn(List<Integer> values) {
            addCriterion("student_age not in", values, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeBetween(Integer value1, Integer value2) {
            addCriterion("student_age between", value1, value2, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("student_age not between", value1, value2, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneIsNull() {
            addCriterion("student_tellphone is null");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneIsNotNull() {
            addCriterion("student_tellphone is not null");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneEqualTo(String value) {
            addCriterion("student_tellphone =", value, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneNotEqualTo(String value) {
            addCriterion("student_tellphone <>", value, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneGreaterThan(String value) {
            addCriterion("student_tellphone >", value, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("student_tellphone >=", value, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneLessThan(String value) {
            addCriterion("student_tellphone <", value, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneLessThanOrEqualTo(String value) {
            addCriterion("student_tellphone <=", value, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneLike(String value) {
            addCriterion("student_tellphone like", value, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneNotLike(String value) {
            addCriterion("student_tellphone not like", value, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneIn(List<String> values) {
            addCriterion("student_tellphone in", values, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneNotIn(List<String> values) {
            addCriterion("student_tellphone not in", values, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneBetween(String value1, String value2) {
            addCriterion("student_tellphone between", value1, value2, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneNotBetween(String value1, String value2) {
            addCriterion("student_tellphone not between", value1, value2, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNull() {
            addCriterion("student_email is null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNotNull() {
            addCriterion("student_email is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailEqualTo(String value) {
            addCriterion("student_email =", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotEqualTo(String value) {
            addCriterion("student_email <>", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThan(String value) {
            addCriterion("student_email >", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThanOrEqualTo(String value) {
            addCriterion("student_email >=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThan(String value) {
            addCriterion("student_email <", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThanOrEqualTo(String value) {
            addCriterion("student_email <=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLike(String value) {
            addCriterion("student_email like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotLike(String value) {
            addCriterion("student_email not like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIn(List<String> values) {
            addCriterion("student_email in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotIn(List<String> values) {
            addCriterion("student_email not in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailBetween(String value1, String value2) {
            addCriterion("student_email between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotBetween(String value1, String value2) {
            addCriterion("student_email not between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardIsNull() {
            addCriterion("student_idcard is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardIsNotNull() {
            addCriterion("student_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardEqualTo(String value) {
            addCriterion("student_idcard =", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardNotEqualTo(String value) {
            addCriterion("student_idcard <>", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardGreaterThan(String value) {
            addCriterion("student_idcard >", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("student_idcard >=", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardLessThan(String value) {
            addCriterion("student_idcard <", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardLessThanOrEqualTo(String value) {
            addCriterion("student_idcard <=", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardLike(String value) {
            addCriterion("student_idcard like", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardNotLike(String value) {
            addCriterion("student_idcard not like", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardIn(List<String> values) {
            addCriterion("student_idcard in", values, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardNotIn(List<String> values) {
            addCriterion("student_idcard not in", values, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardBetween(String value1, String value2) {
            addCriterion("student_idcard between", value1, value2, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardNotBetween(String value1, String value2) {
            addCriterion("student_idcard not between", value1, value2, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIsNull() {
            addCriterion("student_address is null");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIsNotNull() {
            addCriterion("student_address is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAddressEqualTo(String value) {
            addCriterion("student_address =", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotEqualTo(String value) {
            addCriterion("student_address <>", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressGreaterThan(String value) {
            addCriterion("student_address >", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("student_address >=", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLessThan(String value) {
            addCriterion("student_address <", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLessThanOrEqualTo(String value) {
            addCriterion("student_address <=", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLike(String value) {
            addCriterion("student_address like", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotLike(String value) {
            addCriterion("student_address not like", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIn(List<String> values) {
            addCriterion("student_address in", values, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotIn(List<String> values) {
            addCriterion("student_address not in", values, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressBetween(String value1, String value2) {
            addCriterion("student_address between", value1, value2, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotBetween(String value1, String value2) {
            addCriterion("student_address not between", value1, value2, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayIsNull() {
            addCriterion("student_birthday is null");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayIsNotNull() {
            addCriterion("student_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayEqualTo(String value) {
            addCriterion("student_birthday =", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayNotEqualTo(String value) {
            addCriterion("student_birthday <>", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayGreaterThan(String value) {
            addCriterion("student_birthday >", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("student_birthday >=", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayLessThan(String value) {
            addCriterion("student_birthday <", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayLessThanOrEqualTo(String value) {
            addCriterion("student_birthday <=", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayLike(String value) {
            addCriterion("student_birthday like", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayNotLike(String value) {
            addCriterion("student_birthday not like", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayIn(List<String> values) {
            addCriterion("student_birthday in", values, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayNotIn(List<String> values) {
            addCriterion("student_birthday not in", values, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayBetween(String value1, String value2) {
            addCriterion("student_birthday between", value1, value2, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayNotBetween(String value1, String value2) {
            addCriterion("student_birthday not between", value1, value2, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolIsNull() {
            addCriterion("student_school is null");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolIsNotNull() {
            addCriterion("student_school is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolEqualTo(String value) {
            addCriterion("student_school =", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolNotEqualTo(String value) {
            addCriterion("student_school <>", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolGreaterThan(String value) {
            addCriterion("student_school >", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("student_school >=", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolLessThan(String value) {
            addCriterion("student_school <", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolLessThanOrEqualTo(String value) {
            addCriterion("student_school <=", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolLike(String value) {
            addCriterion("student_school like", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolNotLike(String value) {
            addCriterion("student_school not like", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolIn(List<String> values) {
            addCriterion("student_school in", values, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolNotIn(List<String> values) {
            addCriterion("student_school not in", values, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolBetween(String value1, String value2) {
            addCriterion("student_school between", value1, value2, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolNotBetween(String value1, String value2) {
            addCriterion("student_school not between", value1, value2, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentQqIsNull() {
            addCriterion("student_qq is null");
            return (Criteria) this;
        }

        public Criteria andStudentQqIsNotNull() {
            addCriterion("student_qq is not null");
            return (Criteria) this;
        }

        public Criteria andStudentQqEqualTo(String value) {
            addCriterion("student_qq =", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotEqualTo(String value) {
            addCriterion("student_qq <>", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqGreaterThan(String value) {
            addCriterion("student_qq >", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqGreaterThanOrEqualTo(String value) {
            addCriterion("student_qq >=", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqLessThan(String value) {
            addCriterion("student_qq <", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqLessThanOrEqualTo(String value) {
            addCriterion("student_qq <=", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqLike(String value) {
            addCriterion("student_qq like", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotLike(String value) {
            addCriterion("student_qq not like", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqIn(List<String> values) {
            addCriterion("student_qq in", values, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotIn(List<String> values) {
            addCriterion("student_qq not in", values, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqBetween(String value1, String value2) {
            addCriterion("student_qq between", value1, value2, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotBetween(String value1, String value2) {
            addCriterion("student_qq not between", value1, value2, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentParentsNameIsNull() {
            addCriterion("student_parents_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentParentsNameIsNotNull() {
            addCriterion("student_parents_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentParentsNameEqualTo(String value) {
            addCriterion("student_parents_name =", value, "studentParentsName");
            return (Criteria) this;
        }

        public Criteria andStudentParentsNameNotEqualTo(String value) {
            addCriterion("student_parents_name <>", value, "studentParentsName");
            return (Criteria) this;
        }

        public Criteria andStudentParentsNameGreaterThan(String value) {
            addCriterion("student_parents_name >", value, "studentParentsName");
            return (Criteria) this;
        }

        public Criteria andStudentParentsNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_parents_name >=", value, "studentParentsName");
            return (Criteria) this;
        }

        public Criteria andStudentParentsNameLessThan(String value) {
            addCriterion("student_parents_name <", value, "studentParentsName");
            return (Criteria) this;
        }

        public Criteria andStudentParentsNameLessThanOrEqualTo(String value) {
            addCriterion("student_parents_name <=", value, "studentParentsName");
            return (Criteria) this;
        }

        public Criteria andStudentParentsNameLike(String value) {
            addCriterion("student_parents_name like", value, "studentParentsName");
            return (Criteria) this;
        }

        public Criteria andStudentParentsNameNotLike(String value) {
            addCriterion("student_parents_name not like", value, "studentParentsName");
            return (Criteria) this;
        }

        public Criteria andStudentParentsNameIn(List<String> values) {
            addCriterion("student_parents_name in", values, "studentParentsName");
            return (Criteria) this;
        }

        public Criteria andStudentParentsNameNotIn(List<String> values) {
            addCriterion("student_parents_name not in", values, "studentParentsName");
            return (Criteria) this;
        }

        public Criteria andStudentParentsNameBetween(String value1, String value2) {
            addCriterion("student_parents_name between", value1, value2, "studentParentsName");
            return (Criteria) this;
        }

        public Criteria andStudentParentsNameNotBetween(String value1, String value2) {
            addCriterion("student_parents_name not between", value1, value2, "studentParentsName");
            return (Criteria) this;
        }

        public Criteria andStudentParentsPhoneIsNull() {
            addCriterion("student_parents_phone is null");
            return (Criteria) this;
        }

        public Criteria andStudentParentsPhoneIsNotNull() {
            addCriterion("student_parents_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStudentParentsPhoneEqualTo(String value) {
            addCriterion("student_parents_phone =", value, "studentParentsPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentsPhoneNotEqualTo(String value) {
            addCriterion("student_parents_phone <>", value, "studentParentsPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentsPhoneGreaterThan(String value) {
            addCriterion("student_parents_phone >", value, "studentParentsPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("student_parents_phone >=", value, "studentParentsPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentsPhoneLessThan(String value) {
            addCriterion("student_parents_phone <", value, "studentParentsPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentsPhoneLessThanOrEqualTo(String value) {
            addCriterion("student_parents_phone <=", value, "studentParentsPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentsPhoneLike(String value) {
            addCriterion("student_parents_phone like", value, "studentParentsPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentsPhoneNotLike(String value) {
            addCriterion("student_parents_phone not like", value, "studentParentsPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentsPhoneIn(List<String> values) {
            addCriterion("student_parents_phone in", values, "studentParentsPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentsPhoneNotIn(List<String> values) {
            addCriterion("student_parents_phone not in", values, "studentParentsPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentsPhoneBetween(String value1, String value2) {
            addCriterion("student_parents_phone between", value1, value2, "studentParentsPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentsPhoneNotBetween(String value1, String value2) {
            addCriterion("student_parents_phone not between", value1, value2, "studentParentsPhone");
            return (Criteria) this;
        }

        public Criteria andStudentProIsNull() {
            addCriterion("student_pro is null");
            return (Criteria) this;
        }

        public Criteria andStudentProIsNotNull() {
            addCriterion("student_pro is not null");
            return (Criteria) this;
        }

        public Criteria andStudentProEqualTo(String value) {
            addCriterion("student_pro =", value, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProNotEqualTo(String value) {
            addCriterion("student_pro <>", value, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProGreaterThan(String value) {
            addCriterion("student_pro >", value, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProGreaterThanOrEqualTo(String value) {
            addCriterion("student_pro >=", value, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProLessThan(String value) {
            addCriterion("student_pro <", value, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProLessThanOrEqualTo(String value) {
            addCriterion("student_pro <=", value, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProLike(String value) {
            addCriterion("student_pro like", value, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProNotLike(String value) {
            addCriterion("student_pro not like", value, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProIn(List<String> values) {
            addCriterion("student_pro in", values, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProNotIn(List<String> values) {
            addCriterion("student_pro not in", values, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProBetween(String value1, String value2) {
            addCriterion("student_pro between", value1, value2, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProNotBetween(String value1, String value2) {
            addCriterion("student_pro not between", value1, value2, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProCityIsNull() {
            addCriterion("student_pro_city is null");
            return (Criteria) this;
        }

        public Criteria andStudentProCityIsNotNull() {
            addCriterion("student_pro_city is not null");
            return (Criteria) this;
        }

        public Criteria andStudentProCityEqualTo(String value) {
            addCriterion("student_pro_city =", value, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityNotEqualTo(String value) {
            addCriterion("student_pro_city <>", value, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityGreaterThan(String value) {
            addCriterion("student_pro_city >", value, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityGreaterThanOrEqualTo(String value) {
            addCriterion("student_pro_city >=", value, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityLessThan(String value) {
            addCriterion("student_pro_city <", value, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityLessThanOrEqualTo(String value) {
            addCriterion("student_pro_city <=", value, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityLike(String value) {
            addCriterion("student_pro_city like", value, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityNotLike(String value) {
            addCriterion("student_pro_city not like", value, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityIn(List<String> values) {
            addCriterion("student_pro_city in", values, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityNotIn(List<String> values) {
            addCriterion("student_pro_city not in", values, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityBetween(String value1, String value2) {
            addCriterion("student_pro_city between", value1, value2, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityNotBetween(String value1, String value2) {
            addCriterion("student_pro_city not between", value1, value2, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentTypeIsNull() {
            addCriterion("student_type is null");
            return (Criteria) this;
        }

        public Criteria andStudentTypeIsNotNull() {
            addCriterion("student_type is not null");
            return (Criteria) this;
        }

        public Criteria andStudentTypeEqualTo(String value) {
            addCriterion("student_type =", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotEqualTo(String value) {
            addCriterion("student_type <>", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeGreaterThan(String value) {
            addCriterion("student_type >", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("student_type >=", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeLessThan(String value) {
            addCriterion("student_type <", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeLessThanOrEqualTo(String value) {
            addCriterion("student_type <=", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeLike(String value) {
            addCriterion("student_type like", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotLike(String value) {
            addCriterion("student_type not like", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeIn(List<String> values) {
            addCriterion("student_type in", values, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotIn(List<String> values) {
            addCriterion("student_type not in", values, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeBetween(String value1, String value2) {
            addCriterion("student_type between", value1, value2, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotBetween(String value1, String value2) {
            addCriterion("student_type not between", value1, value2, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentIspayIsNull() {
            addCriterion("student_ispay is null");
            return (Criteria) this;
        }

        public Criteria andStudentIspayIsNotNull() {
            addCriterion("student_ispay is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIspayEqualTo(String value) {
            addCriterion("student_ispay =", value, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayNotEqualTo(String value) {
            addCriterion("student_ispay <>", value, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayGreaterThan(String value) {
            addCriterion("student_ispay >", value, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayGreaterThanOrEqualTo(String value) {
            addCriterion("student_ispay >=", value, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayLessThan(String value) {
            addCriterion("student_ispay <", value, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayLessThanOrEqualTo(String value) {
            addCriterion("student_ispay <=", value, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayLike(String value) {
            addCriterion("student_ispay like", value, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayNotLike(String value) {
            addCriterion("student_ispay not like", value, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayIn(List<String> values) {
            addCriterion("student_ispay in", values, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayNotIn(List<String> values) {
            addCriterion("student_ispay not in", values, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayBetween(String value1, String value2) {
            addCriterion("student_ispay between", value1, value2, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayNotBetween(String value1, String value2) {
            addCriterion("student_ispay not between", value1, value2, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentSateIsNull() {
            addCriterion("student_sate is null");
            return (Criteria) this;
        }

        public Criteria andStudentSateIsNotNull() {
            addCriterion("student_sate is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSateEqualTo(Integer value) {
            addCriterion("student_sate =", value, "studentSate");
            return (Criteria) this;
        }

        public Criteria andStudentSateNotEqualTo(Integer value) {
            addCriterion("student_sate <>", value, "studentSate");
            return (Criteria) this;
        }

        public Criteria andStudentSateGreaterThan(Integer value) {
            addCriterion("student_sate >", value, "studentSate");
            return (Criteria) this;
        }

        public Criteria andStudentSateGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_sate >=", value, "studentSate");
            return (Criteria) this;
        }

        public Criteria andStudentSateLessThan(Integer value) {
            addCriterion("student_sate <", value, "studentSate");
            return (Criteria) this;
        }

        public Criteria andStudentSateLessThanOrEqualTo(Integer value) {
            addCriterion("student_sate <=", value, "studentSate");
            return (Criteria) this;
        }

        public Criteria andStudentSateIn(List<Integer> values) {
            addCriterion("student_sate in", values, "studentSate");
            return (Criteria) this;
        }

        public Criteria andStudentSateNotIn(List<Integer> values) {
            addCriterion("student_sate not in", values, "studentSate");
            return (Criteria) this;
        }

        public Criteria andStudentSateBetween(Integer value1, Integer value2) {
            addCriterion("student_sate between", value1, value2, "studentSate");
            return (Criteria) this;
        }

        public Criteria andStudentSateNotBetween(Integer value1, Integer value2) {
            addCriterion("student_sate not between", value1, value2, "studentSate");
            return (Criteria) this;
        }

        public Criteria andStudentMarkIsNull() {
            addCriterion("student_mark is null");
            return (Criteria) this;
        }

        public Criteria andStudentMarkIsNotNull() {
            addCriterion("student_mark is not null");
            return (Criteria) this;
        }

        public Criteria andStudentMarkEqualTo(String value) {
            addCriterion("student_mark =", value, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkNotEqualTo(String value) {
            addCriterion("student_mark <>", value, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkGreaterThan(String value) {
            addCriterion("student_mark >", value, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkGreaterThanOrEqualTo(String value) {
            addCriterion("student_mark >=", value, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkLessThan(String value) {
            addCriterion("student_mark <", value, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkLessThanOrEqualTo(String value) {
            addCriterion("student_mark <=", value, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkLike(String value) {
            addCriterion("student_mark like", value, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkNotLike(String value) {
            addCriterion("student_mark not like", value, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkIn(List<String> values) {
            addCriterion("student_mark in", values, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkNotIn(List<String> values) {
            addCriterion("student_mark not in", values, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkBetween(String value1, String value2) {
            addCriterion("student_mark between", value1, value2, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkNotBetween(String value1, String value2) {
            addCriterion("student_mark not between", value1, value2, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentDescIsNull() {
            addCriterion("student_desc is null");
            return (Criteria) this;
        }

        public Criteria andStudentDescIsNotNull() {
            addCriterion("student_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStudentDescEqualTo(String value) {
            addCriterion("student_desc =", value, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescNotEqualTo(String value) {
            addCriterion("student_desc <>", value, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescGreaterThan(String value) {
            addCriterion("student_desc >", value, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescGreaterThanOrEqualTo(String value) {
            addCriterion("student_desc >=", value, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescLessThan(String value) {
            addCriterion("student_desc <", value, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescLessThanOrEqualTo(String value) {
            addCriterion("student_desc <=", value, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescLike(String value) {
            addCriterion("student_desc like", value, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescNotLike(String value) {
            addCriterion("student_desc not like", value, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescIn(List<String> values) {
            addCriterion("student_desc in", values, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescNotIn(List<String> values) {
            addCriterion("student_desc not in", values, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescBetween(String value1, String value2) {
            addCriterion("student_desc between", value1, value2, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescNotBetween(String value1, String value2) {
            addCriterion("student_desc not between", value1, value2, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentNumberIsNull() {
            addCriterion("student_number is null");
            return (Criteria) this;
        }

        public Criteria andStudentNumberIsNotNull() {
            addCriterion("student_number is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNumberEqualTo(String value) {
            addCriterion("student_number =", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotEqualTo(String value) {
            addCriterion("student_number <>", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberGreaterThan(String value) {
            addCriterion("student_number >", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("student_number >=", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberLessThan(String value) {
            addCriterion("student_number <", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberLessThanOrEqualTo(String value) {
            addCriterion("student_number <=", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberLike(String value) {
            addCriterion("student_number like", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotLike(String value) {
            addCriterion("student_number not like", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberIn(List<String> values) {
            addCriterion("student_number in", values, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotIn(List<String> values) {
            addCriterion("student_number not in", values, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberBetween(String value1, String value2) {
            addCriterion("student_number between", value1, value2, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotBetween(String value1, String value2) {
            addCriterion("student_number not between", value1, value2, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIsNull() {
            addCriterion("student_password is null");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIsNotNull() {
            addCriterion("student_password is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordEqualTo(String value) {
            addCriterion("student_password =", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotEqualTo(String value) {
            addCriterion("student_password <>", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordGreaterThan(String value) {
            addCriterion("student_password >", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("student_password >=", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLessThan(String value) {
            addCriterion("student_password <", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLessThanOrEqualTo(String value) {
            addCriterion("student_password <=", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLike(String value) {
            addCriterion("student_password like", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotLike(String value) {
            addCriterion("student_password not like", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIn(List<String> values) {
            addCriterion("student_password in", values, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotIn(List<String> values) {
            addCriterion("student_password not in", values, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordBetween(String value1, String value2) {
            addCriterion("student_password between", value1, value2, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotBetween(String value1, String value2) {
            addCriterion("student_password not between", value1, value2, "studentPassword");
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