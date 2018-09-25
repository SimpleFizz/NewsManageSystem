package com.guigu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffInfoExample() {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNull() {
            addCriterion("staff_sex is null");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNotNull() {
            addCriterion("staff_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSexEqualTo(String value) {
            addCriterion("staff_sex =", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotEqualTo(String value) {
            addCriterion("staff_sex <>", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThan(String value) {
            addCriterion("staff_sex >", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThanOrEqualTo(String value) {
            addCriterion("staff_sex >=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThan(String value) {
            addCriterion("staff_sex <", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThanOrEqualTo(String value) {
            addCriterion("staff_sex <=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLike(String value) {
            addCriterion("staff_sex like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotLike(String value) {
            addCriterion("staff_sex not like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexIn(List<String> values) {
            addCriterion("staff_sex in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotIn(List<String> values) {
            addCriterion("staff_sex not in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexBetween(String value1, String value2) {
            addCriterion("staff_sex between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotBetween(String value1, String value2) {
            addCriterion("staff_sex not between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffAgeIsNull() {
            addCriterion("staff_age is null");
            return (Criteria) this;
        }

        public Criteria andStaffAgeIsNotNull() {
            addCriterion("staff_age is not null");
            return (Criteria) this;
        }

        public Criteria andStaffAgeEqualTo(Integer value) {
            addCriterion("staff_age =", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeNotEqualTo(Integer value) {
            addCriterion("staff_age <>", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeGreaterThan(Integer value) {
            addCriterion("staff_age >", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_age >=", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeLessThan(Integer value) {
            addCriterion("staff_age <", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeLessThanOrEqualTo(Integer value) {
            addCriterion("staff_age <=", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeIn(List<Integer> values) {
            addCriterion("staff_age in", values, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeNotIn(List<Integer> values) {
            addCriterion("staff_age not in", values, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeBetween(Integer value1, Integer value2) {
            addCriterion("staff_age between", value1, value2, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_age not between", value1, value2, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceIsNull() {
            addCriterion("staff_native_place is null");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceIsNotNull() {
            addCriterion("staff_native_place is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceEqualTo(String value) {
            addCriterion("staff_native_place =", value, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceNotEqualTo(String value) {
            addCriterion("staff_native_place <>", value, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceGreaterThan(String value) {
            addCriterion("staff_native_place >", value, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("staff_native_place >=", value, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceLessThan(String value) {
            addCriterion("staff_native_place <", value, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("staff_native_place <=", value, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceLike(String value) {
            addCriterion("staff_native_place like", value, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceNotLike(String value) {
            addCriterion("staff_native_place not like", value, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceIn(List<String> values) {
            addCriterion("staff_native_place in", values, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceNotIn(List<String> values) {
            addCriterion("staff_native_place not in", values, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceBetween(String value1, String value2) {
            addCriterion("staff_native_place between", value1, value2, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceNotBetween(String value1, String value2) {
            addCriterion("staff_native_place not between", value1, value2, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardIsNull() {
            addCriterion("staff_idcard is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardIsNotNull() {
            addCriterion("staff_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardEqualTo(String value) {
            addCriterion("staff_idcard =", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardNotEqualTo(String value) {
            addCriterion("staff_idcard <>", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardGreaterThan(String value) {
            addCriterion("staff_idcard >", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("staff_idcard >=", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardLessThan(String value) {
            addCriterion("staff_idcard <", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardLessThanOrEqualTo(String value) {
            addCriterion("staff_idcard <=", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardLike(String value) {
            addCriterion("staff_idcard like", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardNotLike(String value) {
            addCriterion("staff_idcard not like", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardIn(List<String> values) {
            addCriterion("staff_idcard in", values, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardNotIn(List<String> values) {
            addCriterion("staff_idcard not in", values, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardBetween(String value1, String value2) {
            addCriterion("staff_idcard between", value1, value2, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardNotBetween(String value1, String value2) {
            addCriterion("staff_idcard not between", value1, value2, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffBrithdayIsNull() {
            addCriterion("staff_brithday is null");
            return (Criteria) this;
        }

        public Criteria andStaffBrithdayIsNotNull() {
            addCriterion("staff_brithday is not null");
            return (Criteria) this;
        }

        public Criteria andStaffBrithdayEqualTo(Date value) {
            addCriterion("staff_brithday =", value, "staffBrithday");
            return (Criteria) this;
        }

        public Criteria andStaffBrithdayNotEqualTo(Date value) {
            addCriterion("staff_brithday <>", value, "staffBrithday");
            return (Criteria) this;
        }

        public Criteria andStaffBrithdayGreaterThan(Date value) {
            addCriterion("staff_brithday >", value, "staffBrithday");
            return (Criteria) this;
        }

        public Criteria andStaffBrithdayGreaterThanOrEqualTo(Date value) {
            addCriterion("staff_brithday >=", value, "staffBrithday");
            return (Criteria) this;
        }

        public Criteria andStaffBrithdayLessThan(Date value) {
            addCriterion("staff_brithday <", value, "staffBrithday");
            return (Criteria) this;
        }

        public Criteria andStaffBrithdayLessThanOrEqualTo(Date value) {
            addCriterion("staff_brithday <=", value, "staffBrithday");
            return (Criteria) this;
        }

        public Criteria andStaffBrithdayIn(List<Date> values) {
            addCriterion("staff_brithday in", values, "staffBrithday");
            return (Criteria) this;
        }

        public Criteria andStaffBrithdayNotIn(List<Date> values) {
            addCriterion("staff_brithday not in", values, "staffBrithday");
            return (Criteria) this;
        }

        public Criteria andStaffBrithdayBetween(Date value1, Date value2) {
            addCriterion("staff_brithday between", value1, value2, "staffBrithday");
            return (Criteria) this;
        }

        public Criteria andStaffBrithdayNotBetween(Date value1, Date value2) {
            addCriterion("staff_brithday not between", value1, value2, "staffBrithday");
            return (Criteria) this;
        }

        public Criteria andStaffOfficePhoneIsNull() {
            addCriterion("staff_office_phone is null");
            return (Criteria) this;
        }

        public Criteria andStaffOfficePhoneIsNotNull() {
            addCriterion("staff_office_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStaffOfficePhoneEqualTo(String value) {
            addCriterion("staff_office_phone =", value, "staffOfficePhone");
            return (Criteria) this;
        }

        public Criteria andStaffOfficePhoneNotEqualTo(String value) {
            addCriterion("staff_office_phone <>", value, "staffOfficePhone");
            return (Criteria) this;
        }

        public Criteria andStaffOfficePhoneGreaterThan(String value) {
            addCriterion("staff_office_phone >", value, "staffOfficePhone");
            return (Criteria) this;
        }

        public Criteria andStaffOfficePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("staff_office_phone >=", value, "staffOfficePhone");
            return (Criteria) this;
        }

        public Criteria andStaffOfficePhoneLessThan(String value) {
            addCriterion("staff_office_phone <", value, "staffOfficePhone");
            return (Criteria) this;
        }

        public Criteria andStaffOfficePhoneLessThanOrEqualTo(String value) {
            addCriterion("staff_office_phone <=", value, "staffOfficePhone");
            return (Criteria) this;
        }

        public Criteria andStaffOfficePhoneLike(String value) {
            addCriterion("staff_office_phone like", value, "staffOfficePhone");
            return (Criteria) this;
        }

        public Criteria andStaffOfficePhoneNotLike(String value) {
            addCriterion("staff_office_phone not like", value, "staffOfficePhone");
            return (Criteria) this;
        }

        public Criteria andStaffOfficePhoneIn(List<String> values) {
            addCriterion("staff_office_phone in", values, "staffOfficePhone");
            return (Criteria) this;
        }

        public Criteria andStaffOfficePhoneNotIn(List<String> values) {
            addCriterion("staff_office_phone not in", values, "staffOfficePhone");
            return (Criteria) this;
        }

        public Criteria andStaffOfficePhoneBetween(String value1, String value2) {
            addCriterion("staff_office_phone between", value1, value2, "staffOfficePhone");
            return (Criteria) this;
        }

        public Criteria andStaffOfficePhoneNotBetween(String value1, String value2) {
            addCriterion("staff_office_phone not between", value1, value2, "staffOfficePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilePhoneIsNull() {
            addCriterion("staff_mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andStaffMobilePhoneIsNotNull() {
            addCriterion("staff_mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStaffMobilePhoneEqualTo(String value) {
            addCriterion("staff_mobile_phone =", value, "staffMobilePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilePhoneNotEqualTo(String value) {
            addCriterion("staff_mobile_phone <>", value, "staffMobilePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilePhoneGreaterThan(String value) {
            addCriterion("staff_mobile_phone >", value, "staffMobilePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("staff_mobile_phone >=", value, "staffMobilePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilePhoneLessThan(String value) {
            addCriterion("staff_mobile_phone <", value, "staffMobilePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("staff_mobile_phone <=", value, "staffMobilePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilePhoneLike(String value) {
            addCriterion("staff_mobile_phone like", value, "staffMobilePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilePhoneNotLike(String value) {
            addCriterion("staff_mobile_phone not like", value, "staffMobilePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilePhoneIn(List<String> values) {
            addCriterion("staff_mobile_phone in", values, "staffMobilePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilePhoneNotIn(List<String> values) {
            addCriterion("staff_mobile_phone not in", values, "staffMobilePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilePhoneBetween(String value1, String value2) {
            addCriterion("staff_mobile_phone between", value1, value2, "staffMobilePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("staff_mobile_phone not between", value1, value2, "staffMobilePhone");
            return (Criteria) this;
        }

        public Criteria andStaffEamilIsNull() {
            addCriterion("staff_eamil is null");
            return (Criteria) this;
        }

        public Criteria andStaffEamilIsNotNull() {
            addCriterion("staff_eamil is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEamilEqualTo(String value) {
            addCriterion("staff_eamil =", value, "staffEamil");
            return (Criteria) this;
        }

        public Criteria andStaffEamilNotEqualTo(String value) {
            addCriterion("staff_eamil <>", value, "staffEamil");
            return (Criteria) this;
        }

        public Criteria andStaffEamilGreaterThan(String value) {
            addCriterion("staff_eamil >", value, "staffEamil");
            return (Criteria) this;
        }

        public Criteria andStaffEamilGreaterThanOrEqualTo(String value) {
            addCriterion("staff_eamil >=", value, "staffEamil");
            return (Criteria) this;
        }

        public Criteria andStaffEamilLessThan(String value) {
            addCriterion("staff_eamil <", value, "staffEamil");
            return (Criteria) this;
        }

        public Criteria andStaffEamilLessThanOrEqualTo(String value) {
            addCriterion("staff_eamil <=", value, "staffEamil");
            return (Criteria) this;
        }

        public Criteria andStaffEamilLike(String value) {
            addCriterion("staff_eamil like", value, "staffEamil");
            return (Criteria) this;
        }

        public Criteria andStaffEamilNotLike(String value) {
            addCriterion("staff_eamil not like", value, "staffEamil");
            return (Criteria) this;
        }

        public Criteria andStaffEamilIn(List<String> values) {
            addCriterion("staff_eamil in", values, "staffEamil");
            return (Criteria) this;
        }

        public Criteria andStaffEamilNotIn(List<String> values) {
            addCriterion("staff_eamil not in", values, "staffEamil");
            return (Criteria) this;
        }

        public Criteria andStaffEamilBetween(String value1, String value2) {
            addCriterion("staff_eamil between", value1, value2, "staffEamil");
            return (Criteria) this;
        }

        public Criteria andStaffEamilNotBetween(String value1, String value2) {
            addCriterion("staff_eamil not between", value1, value2, "staffEamil");
            return (Criteria) this;
        }

        public Criteria andStaffAddrIsNull() {
            addCriterion("staff_addr is null");
            return (Criteria) this;
        }

        public Criteria andStaffAddrIsNotNull() {
            addCriterion("staff_addr is not null");
            return (Criteria) this;
        }

        public Criteria andStaffAddrEqualTo(String value) {
            addCriterion("staff_addr =", value, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrNotEqualTo(String value) {
            addCriterion("staff_addr <>", value, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrGreaterThan(String value) {
            addCriterion("staff_addr >", value, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrGreaterThanOrEqualTo(String value) {
            addCriterion("staff_addr >=", value, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrLessThan(String value) {
            addCriterion("staff_addr <", value, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrLessThanOrEqualTo(String value) {
            addCriterion("staff_addr <=", value, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrLike(String value) {
            addCriterion("staff_addr like", value, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrNotLike(String value) {
            addCriterion("staff_addr not like", value, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrIn(List<String> values) {
            addCriterion("staff_addr in", values, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrNotIn(List<String> values) {
            addCriterion("staff_addr not in", values, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrBetween(String value1, String value2) {
            addCriterion("staff_addr between", value1, value2, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrNotBetween(String value1, String value2) {
            addCriterion("staff_addr not between", value1, value2, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffQqIsNull() {
            addCriterion("staff_qq is null");
            return (Criteria) this;
        }

        public Criteria andStaffQqIsNotNull() {
            addCriterion("staff_qq is not null");
            return (Criteria) this;
        }

        public Criteria andStaffQqEqualTo(String value) {
            addCriterion("staff_qq =", value, "staffQq");
            return (Criteria) this;
        }

        public Criteria andStaffQqNotEqualTo(String value) {
            addCriterion("staff_qq <>", value, "staffQq");
            return (Criteria) this;
        }

        public Criteria andStaffQqGreaterThan(String value) {
            addCriterion("staff_qq >", value, "staffQq");
            return (Criteria) this;
        }

        public Criteria andStaffQqGreaterThanOrEqualTo(String value) {
            addCriterion("staff_qq >=", value, "staffQq");
            return (Criteria) this;
        }

        public Criteria andStaffQqLessThan(String value) {
            addCriterion("staff_qq <", value, "staffQq");
            return (Criteria) this;
        }

        public Criteria andStaffQqLessThanOrEqualTo(String value) {
            addCriterion("staff_qq <=", value, "staffQq");
            return (Criteria) this;
        }

        public Criteria andStaffQqLike(String value) {
            addCriterion("staff_qq like", value, "staffQq");
            return (Criteria) this;
        }

        public Criteria andStaffQqNotLike(String value) {
            addCriterion("staff_qq not like", value, "staffQq");
            return (Criteria) this;
        }

        public Criteria andStaffQqIn(List<String> values) {
            addCriterion("staff_qq in", values, "staffQq");
            return (Criteria) this;
        }

        public Criteria andStaffQqNotIn(List<String> values) {
            addCriterion("staff_qq not in", values, "staffQq");
            return (Criteria) this;
        }

        public Criteria andStaffQqBetween(String value1, String value2) {
            addCriterion("staff_qq between", value1, value2, "staffQq");
            return (Criteria) this;
        }

        public Criteria andStaffQqNotBetween(String value1, String value2) {
            addCriterion("staff_qq not between", value1, value2, "staffQq");
            return (Criteria) this;
        }

        public Criteria andStaffEntryTimeIsNull() {
            addCriterion("staff_entry_time is null");
            return (Criteria) this;
        }

        public Criteria andStaffEntryTimeIsNotNull() {
            addCriterion("staff_entry_time is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEntryTimeEqualTo(Date value) {
            addCriterion("staff_entry_time =", value, "staffEntryTime");
            return (Criteria) this;
        }

        public Criteria andStaffEntryTimeNotEqualTo(Date value) {
            addCriterion("staff_entry_time <>", value, "staffEntryTime");
            return (Criteria) this;
        }

        public Criteria andStaffEntryTimeGreaterThan(Date value) {
            addCriterion("staff_entry_time >", value, "staffEntryTime");
            return (Criteria) this;
        }

        public Criteria andStaffEntryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("staff_entry_time >=", value, "staffEntryTime");
            return (Criteria) this;
        }

        public Criteria andStaffEntryTimeLessThan(Date value) {
            addCriterion("staff_entry_time <", value, "staffEntryTime");
            return (Criteria) this;
        }

        public Criteria andStaffEntryTimeLessThanOrEqualTo(Date value) {
            addCriterion("staff_entry_time <=", value, "staffEntryTime");
            return (Criteria) this;
        }

        public Criteria andStaffEntryTimeIn(List<Date> values) {
            addCriterion("staff_entry_time in", values, "staffEntryTime");
            return (Criteria) this;
        }

        public Criteria andStaffEntryTimeNotIn(List<Date> values) {
            addCriterion("staff_entry_time not in", values, "staffEntryTime");
            return (Criteria) this;
        }

        public Criteria andStaffEntryTimeBetween(Date value1, Date value2) {
            addCriterion("staff_entry_time between", value1, value2, "staffEntryTime");
            return (Criteria) this;
        }

        public Criteria andStaffEntryTimeNotBetween(Date value1, Date value2) {
            addCriterion("staff_entry_time not between", value1, value2, "staffEntryTime");
            return (Criteria) this;
        }

        public Criteria andStaffEductionLevelIsNull() {
            addCriterion("staff_eduction_level is null");
            return (Criteria) this;
        }

        public Criteria andStaffEductionLevelIsNotNull() {
            addCriterion("staff_eduction_level is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEductionLevelEqualTo(String value) {
            addCriterion("staff_eduction_level =", value, "staffEductionLevel");
            return (Criteria) this;
        }

        public Criteria andStaffEductionLevelNotEqualTo(String value) {
            addCriterion("staff_eduction_level <>", value, "staffEductionLevel");
            return (Criteria) this;
        }

        public Criteria andStaffEductionLevelGreaterThan(String value) {
            addCriterion("staff_eduction_level >", value, "staffEductionLevel");
            return (Criteria) this;
        }

        public Criteria andStaffEductionLevelGreaterThanOrEqualTo(String value) {
            addCriterion("staff_eduction_level >=", value, "staffEductionLevel");
            return (Criteria) this;
        }

        public Criteria andStaffEductionLevelLessThan(String value) {
            addCriterion("staff_eduction_level <", value, "staffEductionLevel");
            return (Criteria) this;
        }

        public Criteria andStaffEductionLevelLessThanOrEqualTo(String value) {
            addCriterion("staff_eduction_level <=", value, "staffEductionLevel");
            return (Criteria) this;
        }

        public Criteria andStaffEductionLevelLike(String value) {
            addCriterion("staff_eduction_level like", value, "staffEductionLevel");
            return (Criteria) this;
        }

        public Criteria andStaffEductionLevelNotLike(String value) {
            addCriterion("staff_eduction_level not like", value, "staffEductionLevel");
            return (Criteria) this;
        }

        public Criteria andStaffEductionLevelIn(List<String> values) {
            addCriterion("staff_eduction_level in", values, "staffEductionLevel");
            return (Criteria) this;
        }

        public Criteria andStaffEductionLevelNotIn(List<String> values) {
            addCriterion("staff_eduction_level not in", values, "staffEductionLevel");
            return (Criteria) this;
        }

        public Criteria andStaffEductionLevelBetween(String value1, String value2) {
            addCriterion("staff_eduction_level between", value1, value2, "staffEductionLevel");
            return (Criteria) this;
        }

        public Criteria andStaffEductionLevelNotBetween(String value1, String value2) {
            addCriterion("staff_eduction_level not between", value1, value2, "staffEductionLevel");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkIsNull() {
            addCriterion("staff_remark is null");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkIsNotNull() {
            addCriterion("staff_remark is not null");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkEqualTo(String value) {
            addCriterion("staff_remark =", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkNotEqualTo(String value) {
            addCriterion("staff_remark <>", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkGreaterThan(String value) {
            addCriterion("staff_remark >", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("staff_remark >=", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkLessThan(String value) {
            addCriterion("staff_remark <", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkLessThanOrEqualTo(String value) {
            addCriterion("staff_remark <=", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkLike(String value) {
            addCriterion("staff_remark like", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkNotLike(String value) {
            addCriterion("staff_remark not like", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkIn(List<String> values) {
            addCriterion("staff_remark in", values, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkNotIn(List<String> values) {
            addCriterion("staff_remark not in", values, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkBetween(String value1, String value2) {
            addCriterion("staff_remark between", value1, value2, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkNotBetween(String value1, String value2) {
            addCriterion("staff_remark not between", value1, value2, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffStateIsNull() {
            addCriterion("staff_state is null");
            return (Criteria) this;
        }

        public Criteria andStaffStateIsNotNull() {
            addCriterion("staff_state is not null");
            return (Criteria) this;
        }

        public Criteria andStaffStateEqualTo(String value) {
            addCriterion("staff_state =", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotEqualTo(String value) {
            addCriterion("staff_state <>", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateGreaterThan(String value) {
            addCriterion("staff_state >", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateGreaterThanOrEqualTo(String value) {
            addCriterion("staff_state >=", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateLessThan(String value) {
            addCriterion("staff_state <", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateLessThanOrEqualTo(String value) {
            addCriterion("staff_state <=", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateLike(String value) {
            addCriterion("staff_state like", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotLike(String value) {
            addCriterion("staff_state not like", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateIn(List<String> values) {
            addCriterion("staff_state in", values, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotIn(List<String> values) {
            addCriterion("staff_state not in", values, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateBetween(String value1, String value2) {
            addCriterion("staff_state between", value1, value2, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotBetween(String value1, String value2) {
            addCriterion("staff_state not between", value1, value2, "staffState");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNull() {
            addCriterion("user_number is null");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNotNull() {
            addCriterion("user_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserNumberEqualTo(String value) {
            addCriterion("user_number =", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotEqualTo(String value) {
            addCriterion("user_number <>", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThan(String value) {
            addCriterion("user_number >", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_number >=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThan(String value) {
            addCriterion("user_number <", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThanOrEqualTo(String value) {
            addCriterion("user_number <=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLike(String value) {
            addCriterion("user_number like", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotLike(String value) {
            addCriterion("user_number not like", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberIn(List<String> values) {
            addCriterion("user_number in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotIn(List<String> values) {
            addCriterion("user_number not in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberBetween(String value1, String value2) {
            addCriterion("user_number between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotBetween(String value1, String value2) {
            addCriterion("user_number not between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserPassowrdIsNull() {
            addCriterion("user_passowrd is null");
            return (Criteria) this;
        }

        public Criteria andUserPassowrdIsNotNull() {
            addCriterion("user_passowrd is not null");
            return (Criteria) this;
        }

        public Criteria andUserPassowrdEqualTo(String value) {
            addCriterion("user_passowrd =", value, "userPassowrd");
            return (Criteria) this;
        }

        public Criteria andUserPassowrdNotEqualTo(String value) {
            addCriterion("user_passowrd <>", value, "userPassowrd");
            return (Criteria) this;
        }

        public Criteria andUserPassowrdGreaterThan(String value) {
            addCriterion("user_passowrd >", value, "userPassowrd");
            return (Criteria) this;
        }

        public Criteria andUserPassowrdGreaterThanOrEqualTo(String value) {
            addCriterion("user_passowrd >=", value, "userPassowrd");
            return (Criteria) this;
        }

        public Criteria andUserPassowrdLessThan(String value) {
            addCriterion("user_passowrd <", value, "userPassowrd");
            return (Criteria) this;
        }

        public Criteria andUserPassowrdLessThanOrEqualTo(String value) {
            addCriterion("user_passowrd <=", value, "userPassowrd");
            return (Criteria) this;
        }

        public Criteria andUserPassowrdLike(String value) {
            addCriterion("user_passowrd like", value, "userPassowrd");
            return (Criteria) this;
        }

        public Criteria andUserPassowrdNotLike(String value) {
            addCriterion("user_passowrd not like", value, "userPassowrd");
            return (Criteria) this;
        }

        public Criteria andUserPassowrdIn(List<String> values) {
            addCriterion("user_passowrd in", values, "userPassowrd");
            return (Criteria) this;
        }

        public Criteria andUserPassowrdNotIn(List<String> values) {
            addCriterion("user_passowrd not in", values, "userPassowrd");
            return (Criteria) this;
        }

        public Criteria andUserPassowrdBetween(String value1, String value2) {
            addCriterion("user_passowrd between", value1, value2, "userPassowrd");
            return (Criteria) this;
        }

        public Criteria andUserPassowrdNotBetween(String value1, String value2) {
            addCriterion("user_passowrd not between", value1, value2, "userPassowrd");
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