package com.chinabeacon.demo.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class TestgenerateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestgenerateExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTestanameIsNull() {
            addCriterion("testaName is null");
            return (Criteria) this;
        }

        public Criteria andTestanameIsNotNull() {
            addCriterion("testaName is not null");
            return (Criteria) this;
        }

        public Criteria andTestanameEqualTo(String value) {
            addCriterion("testaName =", value, "testaname");
            return (Criteria) this;
        }

        public Criteria andTestanameNotEqualTo(String value) {
            addCriterion("testaName <>", value, "testaname");
            return (Criteria) this;
        }

        public Criteria andTestanameGreaterThan(String value) {
            addCriterion("testaName >", value, "testaname");
            return (Criteria) this;
        }

        public Criteria andTestanameGreaterThanOrEqualTo(String value) {
            addCriterion("testaName >=", value, "testaname");
            return (Criteria) this;
        }

        public Criteria andTestanameLessThan(String value) {
            addCriterion("testaName <", value, "testaname");
            return (Criteria) this;
        }

        public Criteria andTestanameLessThanOrEqualTo(String value) {
            addCriterion("testaName <=", value, "testaname");
            return (Criteria) this;
        }

        public Criteria andTestanameLike(String value) {
            addCriterion("testaName like", value, "testaname");
            return (Criteria) this;
        }

        public Criteria andTestanameNotLike(String value) {
            addCriterion("testaName not like", value, "testaname");
            return (Criteria) this;
        }

        public Criteria andTestanameIn(List<String> values) {
            addCriterion("testaName in", values, "testaname");
            return (Criteria) this;
        }

        public Criteria andTestanameNotIn(List<String> values) {
            addCriterion("testaName not in", values, "testaname");
            return (Criteria) this;
        }

        public Criteria andTestanameBetween(String value1, String value2) {
            addCriterion("testaName between", value1, value2, "testaname");
            return (Criteria) this;
        }

        public Criteria andTestanameNotBetween(String value1, String value2) {
            addCriterion("testaName not between", value1, value2, "testaname");
            return (Criteria) this;
        }

        public Criteria andTestPhoneIsNull() {
            addCriterion("Test_Phone is null");
            return (Criteria) this;
        }

        public Criteria andTestPhoneIsNotNull() {
            addCriterion("Test_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andTestPhoneEqualTo(String value) {
            addCriterion("Test_Phone =", value, "testPhone");
            return (Criteria) this;
        }

        public Criteria andTestPhoneNotEqualTo(String value) {
            addCriterion("Test_Phone <>", value, "testPhone");
            return (Criteria) this;
        }

        public Criteria andTestPhoneGreaterThan(String value) {
            addCriterion("Test_Phone >", value, "testPhone");
            return (Criteria) this;
        }

        public Criteria andTestPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Test_Phone >=", value, "testPhone");
            return (Criteria) this;
        }

        public Criteria andTestPhoneLessThan(String value) {
            addCriterion("Test_Phone <", value, "testPhone");
            return (Criteria) this;
        }

        public Criteria andTestPhoneLessThanOrEqualTo(String value) {
            addCriterion("Test_Phone <=", value, "testPhone");
            return (Criteria) this;
        }

        public Criteria andTestPhoneLike(String value) {
            addCriterion("Test_Phone like", value, "testPhone");
            return (Criteria) this;
        }

        public Criteria andTestPhoneNotLike(String value) {
            addCriterion("Test_Phone not like", value, "testPhone");
            return (Criteria) this;
        }

        public Criteria andTestPhoneIn(List<String> values) {
            addCriterion("Test_Phone in", values, "testPhone");
            return (Criteria) this;
        }

        public Criteria andTestPhoneNotIn(List<String> values) {
            addCriterion("Test_Phone not in", values, "testPhone");
            return (Criteria) this;
        }

        public Criteria andTestPhoneBetween(String value1, String value2) {
            addCriterion("Test_Phone between", value1, value2, "testPhone");
            return (Criteria) this;
        }

        public Criteria andTestPhoneNotBetween(String value1, String value2) {
            addCriterion("Test_Phone not between", value1, value2, "testPhone");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNull() {
            addCriterion("StudentName is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("StudentName is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("StudentName =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("StudentName <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("StudentName >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("StudentName >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("StudentName <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("StudentName <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("StudentName like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("StudentName not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("StudentName in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("StudentName not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("StudentName between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("StudentName not between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andScoreNameIsNull() {
            addCriterion("score_name is null");
            return (Criteria) this;
        }

        public Criteria andScoreNameIsNotNull() {
            addCriterion("score_name is not null");
            return (Criteria) this;
        }

        public Criteria andScoreNameEqualTo(String value) {
            addCriterion("score_name =", value, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameNotEqualTo(String value) {
            addCriterion("score_name <>", value, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameGreaterThan(String value) {
            addCriterion("score_name >", value, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("score_name >=", value, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameLessThan(String value) {
            addCriterion("score_name <", value, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameLessThanOrEqualTo(String value) {
            addCriterion("score_name <=", value, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameLike(String value) {
            addCriterion("score_name like", value, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameNotLike(String value) {
            addCriterion("score_name not like", value, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameIn(List<String> values) {
            addCriterion("score_name in", values, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameNotIn(List<String> values) {
            addCriterion("score_name not in", values, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameBetween(String value1, String value2) {
            addCriterion("score_name between", value1, value2, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameNotBetween(String value1, String value2) {
            addCriterion("score_name not between", value1, value2, "scoreName");
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