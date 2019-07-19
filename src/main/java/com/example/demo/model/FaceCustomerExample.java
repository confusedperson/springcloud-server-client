package com.example.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FaceCustomerExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8884495828662003829L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FaceCustomerExample() {
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

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Boolean value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Boolean value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Boolean value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Boolean value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Boolean value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Boolean> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Boolean> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Boolean value1, Boolean value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSmileValueIsNull() {
            addCriterion("smile_value is null");
            return (Criteria) this;
        }

        public Criteria andSmileValueIsNotNull() {
            addCriterion("smile_value is not null");
            return (Criteria) this;
        }

        public Criteria andSmileValueEqualTo(Float value) {
            addCriterion("smile_value =", value, "smileValue");
            return (Criteria) this;
        }

        public Criteria andSmileValueNotEqualTo(Float value) {
            addCriterion("smile_value <>", value, "smileValue");
            return (Criteria) this;
        }

        public Criteria andSmileValueGreaterThan(Float value) {
            addCriterion("smile_value >", value, "smileValue");
            return (Criteria) this;
        }

        public Criteria andSmileValueGreaterThanOrEqualTo(Float value) {
            addCriterion("smile_value >=", value, "smileValue");
            return (Criteria) this;
        }

        public Criteria andSmileValueLessThan(Float value) {
            addCriterion("smile_value <", value, "smileValue");
            return (Criteria) this;
        }

        public Criteria andSmileValueLessThanOrEqualTo(Float value) {
            addCriterion("smile_value <=", value, "smileValue");
            return (Criteria) this;
        }

        public Criteria andSmileValueIn(List<Float> values) {
            addCriterion("smile_value in", values, "smileValue");
            return (Criteria) this;
        }

        public Criteria andSmileValueNotIn(List<Float> values) {
            addCriterion("smile_value not in", values, "smileValue");
            return (Criteria) this;
        }

        public Criteria andSmileValueBetween(Float value1, Float value2) {
            addCriterion("smile_value between", value1, value2, "smileValue");
            return (Criteria) this;
        }

        public Criteria andSmileValueNotBetween(Float value1, Float value2) {
            addCriterion("smile_value not between", value1, value2, "smileValue");
            return (Criteria) this;
        }

        public Criteria andGlassIsNull() {
            addCriterion("glass is null");
            return (Criteria) this;
        }

        public Criteria andGlassIsNotNull() {
            addCriterion("glass is not null");
            return (Criteria) this;
        }

        public Criteria andGlassEqualTo(String value) {
            addCriterion("glass =", value, "glass");
            return (Criteria) this;
        }

        public Criteria andGlassNotEqualTo(String value) {
            addCriterion("glass <>", value, "glass");
            return (Criteria) this;
        }

        public Criteria andGlassGreaterThan(String value) {
            addCriterion("glass >", value, "glass");
            return (Criteria) this;
        }

        public Criteria andGlassGreaterThanOrEqualTo(String value) {
            addCriterion("glass >=", value, "glass");
            return (Criteria) this;
        }

        public Criteria andGlassLessThan(String value) {
            addCriterion("glass <", value, "glass");
            return (Criteria) this;
        }

        public Criteria andGlassLessThanOrEqualTo(String value) {
            addCriterion("glass <=", value, "glass");
            return (Criteria) this;
        }

        public Criteria andGlassLike(String value) {
            addCriterion("glass like", value, "glass");
            return (Criteria) this;
        }

        public Criteria andGlassNotLike(String value) {
            addCriterion("glass not like", value, "glass");
            return (Criteria) this;
        }

        public Criteria andGlassIn(List<String> values) {
            addCriterion("glass in", values, "glass");
            return (Criteria) this;
        }

        public Criteria andGlassNotIn(List<String> values) {
            addCriterion("glass not in", values, "glass");
            return (Criteria) this;
        }

        public Criteria andGlassBetween(String value1, String value2) {
            addCriterion("glass between", value1, value2, "glass");
            return (Criteria) this;
        }

        public Criteria andGlassNotBetween(String value1, String value2) {
            addCriterion("glass not between", value1, value2, "glass");
            return (Criteria) this;
        }

        public Criteria andEmotionIsNull() {
            addCriterion("emotion is null");
            return (Criteria) this;
        }

        public Criteria andEmotionIsNotNull() {
            addCriterion("emotion is not null");
            return (Criteria) this;
        }

        public Criteria andEmotionEqualTo(String value) {
            addCriterion("emotion =", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionNotEqualTo(String value) {
            addCriterion("emotion <>", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionGreaterThan(String value) {
            addCriterion("emotion >", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionGreaterThanOrEqualTo(String value) {
            addCriterion("emotion >=", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionLessThan(String value) {
            addCriterion("emotion <", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionLessThanOrEqualTo(String value) {
            addCriterion("emotion <=", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionLike(String value) {
            addCriterion("emotion like", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionNotLike(String value) {
            addCriterion("emotion not like", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionIn(List<String> values) {
            addCriterion("emotion in", values, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionNotIn(List<String> values) {
            addCriterion("emotion not in", values, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionBetween(String value1, String value2) {
            addCriterion("emotion between", value1, value2, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionNotBetween(String value1, String value2) {
            addCriterion("emotion not between", value1, value2, "emotion");
            return (Criteria) this;
        }

        public Criteria andEthnicityIsNull() {
            addCriterion("ethnicity is null");
            return (Criteria) this;
        }

        public Criteria andEthnicityIsNotNull() {
            addCriterion("ethnicity is not null");
            return (Criteria) this;
        }

        public Criteria andEthnicityEqualTo(String value) {
            addCriterion("ethnicity =", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityNotEqualTo(String value) {
            addCriterion("ethnicity <>", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityGreaterThan(String value) {
            addCriterion("ethnicity >", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityGreaterThanOrEqualTo(String value) {
            addCriterion("ethnicity >=", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityLessThan(String value) {
            addCriterion("ethnicity <", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityLessThanOrEqualTo(String value) {
            addCriterion("ethnicity <=", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityLike(String value) {
            addCriterion("ethnicity like", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityNotLike(String value) {
            addCriterion("ethnicity not like", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityIn(List<String> values) {
            addCriterion("ethnicity in", values, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityNotIn(List<String> values) {
            addCriterion("ethnicity not in", values, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityBetween(String value1, String value2) {
            addCriterion("ethnicity between", value1, value2, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityNotBetween(String value1, String value2) {
            addCriterion("ethnicity not between", value1, value2, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andBeautyIsNull() {
            addCriterion("beauty is null");
            return (Criteria) this;
        }

        public Criteria andBeautyIsNotNull() {
            addCriterion("beauty is not null");
            return (Criteria) this;
        }

        public Criteria andBeautyEqualTo(Float value) {
            addCriterion("beauty =", value, "beauty");
            return (Criteria) this;
        }

        public Criteria andBeautyNotEqualTo(Float value) {
            addCriterion("beauty <>", value, "beauty");
            return (Criteria) this;
        }

        public Criteria andBeautyGreaterThan(Float value) {
            addCriterion("beauty >", value, "beauty");
            return (Criteria) this;
        }

        public Criteria andBeautyGreaterThanOrEqualTo(Float value) {
            addCriterion("beauty >=", value, "beauty");
            return (Criteria) this;
        }

        public Criteria andBeautyLessThan(Float value) {
            addCriterion("beauty <", value, "beauty");
            return (Criteria) this;
        }

        public Criteria andBeautyLessThanOrEqualTo(Float value) {
            addCriterion("beauty <=", value, "beauty");
            return (Criteria) this;
        }

        public Criteria andBeautyIn(List<Float> values) {
            addCriterion("beauty in", values, "beauty");
            return (Criteria) this;
        }

        public Criteria andBeautyNotIn(List<Float> values) {
            addCriterion("beauty not in", values, "beauty");
            return (Criteria) this;
        }

        public Criteria andBeautyBetween(Float value1, Float value2) {
            addCriterion("beauty between", value1, value2, "beauty");
            return (Criteria) this;
        }

        public Criteria andBeautyNotBetween(Float value1, Float value2) {
            addCriterion("beauty not between", value1, value2, "beauty");
            return (Criteria) this;
        }

        public Criteria andFaceTokenIsNull() {
            addCriterion("face_token is null");
            return (Criteria) this;
        }

        public Criteria andFaceTokenIsNotNull() {
            addCriterion("face_token is not null");
            return (Criteria) this;
        }

        public Criteria andFaceTokenEqualTo(String value) {
            addCriterion("face_token =", value, "faceToken");
            return (Criteria) this;
        }

        public Criteria andFaceTokenNotEqualTo(String value) {
            addCriterion("face_token <>", value, "faceToken");
            return (Criteria) this;
        }

        public Criteria andFaceTokenGreaterThan(String value) {
            addCriterion("face_token >", value, "faceToken");
            return (Criteria) this;
        }

        public Criteria andFaceTokenGreaterThanOrEqualTo(String value) {
            addCriterion("face_token >=", value, "faceToken");
            return (Criteria) this;
        }

        public Criteria andFaceTokenLessThan(String value) {
            addCriterion("face_token <", value, "faceToken");
            return (Criteria) this;
        }

        public Criteria andFaceTokenLessThanOrEqualTo(String value) {
            addCriterion("face_token <=", value, "faceToken");
            return (Criteria) this;
        }

        public Criteria andFaceTokenLike(String value) {
            addCriterion("face_token like", value, "faceToken");
            return (Criteria) this;
        }

        public Criteria andFaceTokenNotLike(String value) {
            addCriterion("face_token not like", value, "faceToken");
            return (Criteria) this;
        }

        public Criteria andFaceTokenIn(List<String> values) {
            addCriterion("face_token in", values, "faceToken");
            return (Criteria) this;
        }

        public Criteria andFaceTokenNotIn(List<String> values) {
            addCriterion("face_token not in", values, "faceToken");
            return (Criteria) this;
        }

        public Criteria andFaceTokenBetween(String value1, String value2) {
            addCriterion("face_token between", value1, value2, "faceToken");
            return (Criteria) this;
        }

        public Criteria andFaceTokenNotBetween(String value1, String value2) {
            addCriterion("face_token not between", value1, value2, "faceToken");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNull() {
            addCriterion("dep_id is null");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNotNull() {
            addCriterion("dep_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepIdEqualTo(Integer value) {
            addCriterion("dep_id =", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotEqualTo(Integer value) {
            addCriterion("dep_id <>", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThan(Integer value) {
            addCriterion("dep_id >", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dep_id >=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThan(Integer value) {
            addCriterion("dep_id <", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThanOrEqualTo(Integer value) {
            addCriterion("dep_id <=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdIn(List<Integer> values) {
            addCriterion("dep_id in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotIn(List<Integer> values) {
            addCriterion("dep_id not in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdBetween(Integer value1, Integer value2) {
            addCriterion("dep_id between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dep_id not between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("enterprise_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("enterprise_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(Integer value) {
            addCriterion("enterprise_id =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(Integer value) {
            addCriterion("enterprise_id <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(Integer value) {
            addCriterion("enterprise_id >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(Integer value) {
            addCriterion("enterprise_id <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<Integer> values) {
            addCriterion("enterprise_id in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<Integer> values) {
            addCriterion("enterprise_id not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id not between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andDeviceMacIsNull() {
            addCriterion("device_mac is null");
            return (Criteria) this;
        }

        public Criteria andDeviceMacIsNotNull() {
            addCriterion("device_mac is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceMacEqualTo(String value) {
            addCriterion("device_mac =", value, "deviceMac");
            return (Criteria) this;
        }

        public Criteria andDeviceMacNotEqualTo(String value) {
            addCriterion("device_mac <>", value, "deviceMac");
            return (Criteria) this;
        }

        public Criteria andDeviceMacGreaterThan(String value) {
            addCriterion("device_mac >", value, "deviceMac");
            return (Criteria) this;
        }

        public Criteria andDeviceMacGreaterThanOrEqualTo(String value) {
            addCriterion("device_mac >=", value, "deviceMac");
            return (Criteria) this;
        }

        public Criteria andDeviceMacLessThan(String value) {
            addCriterion("device_mac <", value, "deviceMac");
            return (Criteria) this;
        }

        public Criteria andDeviceMacLessThanOrEqualTo(String value) {
            addCriterion("device_mac <=", value, "deviceMac");
            return (Criteria) this;
        }

        public Criteria andDeviceMacLike(String value) {
            addCriterion("device_mac like", value, "deviceMac");
            return (Criteria) this;
        }

        public Criteria andDeviceMacNotLike(String value) {
            addCriterion("device_mac not like", value, "deviceMac");
            return (Criteria) this;
        }

        public Criteria andDeviceMacIn(List<String> values) {
            addCriterion("device_mac in", values, "deviceMac");
            return (Criteria) this;
        }

        public Criteria andDeviceMacNotIn(List<String> values) {
            addCriterion("device_mac not in", values, "deviceMac");
            return (Criteria) this;
        }

        public Criteria andDeviceMacBetween(String value1, String value2) {
            addCriterion("device_mac between", value1, value2, "deviceMac");
            return (Criteria) this;
        }

        public Criteria andDeviceMacNotBetween(String value1, String value2) {
            addCriterion("device_mac not between", value1, value2, "deviceMac");
            return (Criteria) this;
        }

        public Criteria andFaceUrlIsNull() {
            addCriterion("face_url is null");
            return (Criteria) this;
        }

        public Criteria andFaceUrlIsNotNull() {
            addCriterion("face_url is not null");
            return (Criteria) this;
        }

        public Criteria andFaceUrlEqualTo(String value) {
            addCriterion("face_url =", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlNotEqualTo(String value) {
            addCriterion("face_url <>", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlGreaterThan(String value) {
            addCriterion("face_url >", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("face_url >=", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlLessThan(String value) {
            addCriterion("face_url <", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlLessThanOrEqualTo(String value) {
            addCriterion("face_url <=", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlLike(String value) {
            addCriterion("face_url like", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlNotLike(String value) {
            addCriterion("face_url not like", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlIn(List<String> values) {
            addCriterion("face_url in", values, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlNotIn(List<String> values) {
            addCriterion("face_url not in", values, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlBetween(String value1, String value2) {
            addCriterion("face_url between", value1, value2, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlNotBetween(String value1, String value2) {
            addCriterion("face_url not between", value1, value2, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andIsOssUrlIsNull() {
            addCriterion("is_oss_url is null");
            return (Criteria) this;
        }

        public Criteria andIsOssUrlIsNotNull() {
            addCriterion("is_oss_url is not null");
            return (Criteria) this;
        }

        public Criteria andIsOssUrlEqualTo(Boolean value) {
            addCriterion("is_oss_url =", value, "isOssUrl");
            return (Criteria) this;
        }

        public Criteria andIsOssUrlNotEqualTo(Boolean value) {
            addCriterion("is_oss_url <>", value, "isOssUrl");
            return (Criteria) this;
        }

        public Criteria andIsOssUrlGreaterThan(Boolean value) {
            addCriterion("is_oss_url >", value, "isOssUrl");
            return (Criteria) this;
        }

        public Criteria andIsOssUrlGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_oss_url >=", value, "isOssUrl");
            return (Criteria) this;
        }

        public Criteria andIsOssUrlLessThan(Boolean value) {
            addCriterion("is_oss_url <", value, "isOssUrl");
            return (Criteria) this;
        }

        public Criteria andIsOssUrlLessThanOrEqualTo(Boolean value) {
            addCriterion("is_oss_url <=", value, "isOssUrl");
            return (Criteria) this;
        }

        public Criteria andIsOssUrlIn(List<Boolean> values) {
            addCriterion("is_oss_url in", values, "isOssUrl");
            return (Criteria) this;
        }

        public Criteria andIsOssUrlNotIn(List<Boolean> values) {
            addCriterion("is_oss_url not in", values, "isOssUrl");
            return (Criteria) this;
        }

        public Criteria andIsOssUrlBetween(Boolean value1, Boolean value2) {
            addCriterion("is_oss_url between", value1, value2, "isOssUrl");
            return (Criteria) this;
        }

        public Criteria andIsOssUrlNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_oss_url not between", value1, value2, "isOssUrl");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeIsNull() {
            addCriterion("reception_time is null");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeIsNotNull() {
            addCriterion("reception_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeEqualTo(Date value) {
            addCriterion("reception_time =", value, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeNotEqualTo(Date value) {
            addCriterion("reception_time <>", value, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeGreaterThan(Date value) {
            addCriterion("reception_time >", value, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reception_time >=", value, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeLessThan(Date value) {
            addCriterion("reception_time <", value, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeLessThanOrEqualTo(Date value) {
            addCriterion("reception_time <=", value, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeIn(List<Date> values) {
            addCriterion("reception_time in", values, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeNotIn(List<Date> values) {
            addCriterion("reception_time not in", values, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeBetween(Date value1, Date value2) {
            addCriterion("reception_time between", value1, value2, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeNotBetween(Date value1, Date value2) {
            addCriterion("reception_time not between", value1, value2, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("is_valid is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(Integer value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Integer value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Integer value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Integer value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Integer value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Integer> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Integer> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Integer value1, Integer value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Integer value1, Integer value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andFaceQualityIsNull() {
            addCriterion("face_quality is null");
            return (Criteria) this;
        }

        public Criteria andFaceQualityIsNotNull() {
            addCriterion("face_quality is not null");
            return (Criteria) this;
        }

        public Criteria andFaceQualityEqualTo(Float value) {
            addCriterion("face_quality =", value, "faceQuality");
            return (Criteria) this;
        }

        public Criteria andFaceQualityNotEqualTo(Float value) {
            addCriterion("face_quality <>", value, "faceQuality");
            return (Criteria) this;
        }

        public Criteria andFaceQualityGreaterThan(Float value) {
            addCriterion("face_quality >", value, "faceQuality");
            return (Criteria) this;
        }

        public Criteria andFaceQualityGreaterThanOrEqualTo(Float value) {
            addCriterion("face_quality >=", value, "faceQuality");
            return (Criteria) this;
        }

        public Criteria andFaceQualityLessThan(Float value) {
            addCriterion("face_quality <", value, "faceQuality");
            return (Criteria) this;
        }

        public Criteria andFaceQualityLessThanOrEqualTo(Float value) {
            addCriterion("face_quality <=", value, "faceQuality");
            return (Criteria) this;
        }

        public Criteria andFaceQualityIn(List<Float> values) {
            addCriterion("face_quality in", values, "faceQuality");
            return (Criteria) this;
        }

        public Criteria andFaceQualityNotIn(List<Float> values) {
            addCriterion("face_quality not in", values, "faceQuality");
            return (Criteria) this;
        }

        public Criteria andFaceQualityBetween(Float value1, Float value2) {
            addCriterion("face_quality between", value1, value2, "faceQuality");
            return (Criteria) this;
        }

        public Criteria andFaceQualityNotBetween(Float value1, Float value2) {
            addCriterion("face_quality not between", value1, value2, "faceQuality");
            return (Criteria) this;
        }

        public Criteria andSkinstatusIsNull() {
            addCriterion("skinstatus is null");
            return (Criteria) this;
        }

        public Criteria andSkinstatusIsNotNull() {
            addCriterion("skinstatus is not null");
            return (Criteria) this;
        }

        public Criteria andSkinstatusEqualTo(String value) {
            addCriterion("skinstatus =", value, "skinstatus");
            return (Criteria) this;
        }

        public Criteria andSkinstatusNotEqualTo(String value) {
            addCriterion("skinstatus <>", value, "skinstatus");
            return (Criteria) this;
        }

        public Criteria andSkinstatusGreaterThan(String value) {
            addCriterion("skinstatus >", value, "skinstatus");
            return (Criteria) this;
        }

        public Criteria andSkinstatusGreaterThanOrEqualTo(String value) {
            addCriterion("skinstatus >=", value, "skinstatus");
            return (Criteria) this;
        }

        public Criteria andSkinstatusLessThan(String value) {
            addCriterion("skinstatus <", value, "skinstatus");
            return (Criteria) this;
        }

        public Criteria andSkinstatusLessThanOrEqualTo(String value) {
            addCriterion("skinstatus <=", value, "skinstatus");
            return (Criteria) this;
        }

        public Criteria andSkinstatusLike(String value) {
            addCriterion("skinstatus like", value, "skinstatus");
            return (Criteria) this;
        }

        public Criteria andSkinstatusNotLike(String value) {
            addCriterion("skinstatus not like", value, "skinstatus");
            return (Criteria) this;
        }

        public Criteria andSkinstatusIn(List<String> values) {
            addCriterion("skinstatus in", values, "skinstatus");
            return (Criteria) this;
        }

        public Criteria andSkinstatusNotIn(List<String> values) {
            addCriterion("skinstatus not in", values, "skinstatus");
            return (Criteria) this;
        }

        public Criteria andSkinstatusBetween(String value1, String value2) {
            addCriterion("skinstatus between", value1, value2, "skinstatus");
            return (Criteria) this;
        }

        public Criteria andSkinstatusNotBetween(String value1, String value2) {
            addCriterion("skinstatus not between", value1, value2, "skinstatus");
            return (Criteria) this;
        }

        public Criteria andFaceQualityThresholdIsNull() {
            addCriterion("face_quality_threshold is null");
            return (Criteria) this;
        }

        public Criteria andFaceQualityThresholdIsNotNull() {
            addCriterion("face_quality_threshold is not null");
            return (Criteria) this;
        }

        public Criteria andFaceQualityThresholdEqualTo(Float value) {
            addCriterion("face_quality_threshold =", value, "faceQualityThreshold");
            return (Criteria) this;
        }

        public Criteria andFaceQualityThresholdNotEqualTo(Float value) {
            addCriterion("face_quality_threshold <>", value, "faceQualityThreshold");
            return (Criteria) this;
        }

        public Criteria andFaceQualityThresholdGreaterThan(Float value) {
            addCriterion("face_quality_threshold >", value, "faceQualityThreshold");
            return (Criteria) this;
        }

        public Criteria andFaceQualityThresholdGreaterThanOrEqualTo(Float value) {
            addCriterion("face_quality_threshold >=", value, "faceQualityThreshold");
            return (Criteria) this;
        }

        public Criteria andFaceQualityThresholdLessThan(Float value) {
            addCriterion("face_quality_threshold <", value, "faceQualityThreshold");
            return (Criteria) this;
        }

        public Criteria andFaceQualityThresholdLessThanOrEqualTo(Float value) {
            addCriterion("face_quality_threshold <=", value, "faceQualityThreshold");
            return (Criteria) this;
        }

        public Criteria andFaceQualityThresholdIn(List<Float> values) {
            addCriterion("face_quality_threshold in", values, "faceQualityThreshold");
            return (Criteria) this;
        }

        public Criteria andFaceQualityThresholdNotIn(List<Float> values) {
            addCriterion("face_quality_threshold not in", values, "faceQualityThreshold");
            return (Criteria) this;
        }

        public Criteria andFaceQualityThresholdBetween(Float value1, Float value2) {
            addCriterion("face_quality_threshold between", value1, value2, "faceQualityThreshold");
            return (Criteria) this;
        }

        public Criteria andFaceQualityThresholdNotBetween(Float value1, Float value2) {
            addCriterion("face_quality_threshold not between", value1, value2, "faceQualityThreshold");
            return (Criteria) this;
        }

        public Criteria andHeadposeIsNull() {
            addCriterion("headpose is null");
            return (Criteria) this;
        }

        public Criteria andHeadposeIsNotNull() {
            addCriterion("headpose is not null");
            return (Criteria) this;
        }

        public Criteria andHeadposeEqualTo(String value) {
            addCriterion("headpose =", value, "headpose");
            return (Criteria) this;
        }

        public Criteria andHeadposeNotEqualTo(String value) {
            addCriterion("headpose <>", value, "headpose");
            return (Criteria) this;
        }

        public Criteria andHeadposeGreaterThan(String value) {
            addCriterion("headpose >", value, "headpose");
            return (Criteria) this;
        }

        public Criteria andHeadposeGreaterThanOrEqualTo(String value) {
            addCriterion("headpose >=", value, "headpose");
            return (Criteria) this;
        }

        public Criteria andHeadposeLessThan(String value) {
            addCriterion("headpose <", value, "headpose");
            return (Criteria) this;
        }

        public Criteria andHeadposeLessThanOrEqualTo(String value) {
            addCriterion("headpose <=", value, "headpose");
            return (Criteria) this;
        }

        public Criteria andHeadposeLike(String value) {
            addCriterion("headpose like", value, "headpose");
            return (Criteria) this;
        }

        public Criteria andHeadposeNotLike(String value) {
            addCriterion("headpose not like", value, "headpose");
            return (Criteria) this;
        }

        public Criteria andHeadposeIn(List<String> values) {
            addCriterion("headpose in", values, "headpose");
            return (Criteria) this;
        }

        public Criteria andHeadposeNotIn(List<String> values) {
            addCriterion("headpose not in", values, "headpose");
            return (Criteria) this;
        }

        public Criteria andHeadposeBetween(String value1, String value2) {
            addCriterion("headpose between", value1, value2, "headpose");
            return (Criteria) this;
        }

        public Criteria andHeadposeNotBetween(String value1, String value2) {
            addCriterion("headpose not between", value1, value2, "headpose");
            return (Criteria) this;
        }

        public Criteria andIsErrorIsNull() {
            addCriterion("is_error is null");
            return (Criteria) this;
        }

        public Criteria andIsErrorIsNotNull() {
            addCriterion("is_error is not null");
            return (Criteria) this;
        }

        public Criteria andIsErrorEqualTo(Boolean value) {
            addCriterion("is_error =", value, "isError");
            return (Criteria) this;
        }

        public Criteria andIsErrorNotEqualTo(Boolean value) {
            addCriterion("is_error <>", value, "isError");
            return (Criteria) this;
        }

        public Criteria andIsErrorGreaterThan(Boolean value) {
            addCriterion("is_error >", value, "isError");
            return (Criteria) this;
        }

        public Criteria andIsErrorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_error >=", value, "isError");
            return (Criteria) this;
        }

        public Criteria andIsErrorLessThan(Boolean value) {
            addCriterion("is_error <", value, "isError");
            return (Criteria) this;
        }

        public Criteria andIsErrorLessThanOrEqualTo(Boolean value) {
            addCriterion("is_error <=", value, "isError");
            return (Criteria) this;
        }

        public Criteria andIsErrorIn(List<Boolean> values) {
            addCriterion("is_error in", values, "isError");
            return (Criteria) this;
        }

        public Criteria andIsErrorNotIn(List<Boolean> values) {
            addCriterion("is_error not in", values, "isError");
            return (Criteria) this;
        }

        public Criteria andIsErrorBetween(Boolean value1, Boolean value2) {
            addCriterion("is_error between", value1, value2, "isError");
            return (Criteria) this;
        }

        public Criteria andIsErrorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_error not between", value1, value2, "isError");
            return (Criteria) this;
        }

        public Criteria andVipIdIsNull() {
            addCriterion("vip_id is null");
            return (Criteria) this;
        }

        public Criteria andVipIdIsNotNull() {
            addCriterion("vip_id is not null");
            return (Criteria) this;
        }

        public Criteria andVipIdEqualTo(Integer value) {
            addCriterion("vip_id =", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotEqualTo(Integer value) {
            addCriterion("vip_id <>", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdGreaterThan(Integer value) {
            addCriterion("vip_id >", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_id >=", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdLessThan(Integer value) {
            addCriterion("vip_id <", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdLessThanOrEqualTo(Integer value) {
            addCriterion("vip_id <=", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdIn(List<Integer> values) {
            addCriterion("vip_id in", values, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotIn(List<Integer> values) {
            addCriterion("vip_id not in", values, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdBetween(Integer value1, Integer value2) {
            addCriterion("vip_id between", value1, value2, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_id not between", value1, value2, "vipId");
            return (Criteria) this;
        }

        public Criteria andRegTypeIsNull() {
            addCriterion("reg_type is null");
            return (Criteria) this;
        }

        public Criteria andRegTypeIsNotNull() {
            addCriterion("reg_type is not null");
            return (Criteria) this;
        }

        public Criteria andRegTypeEqualTo(Integer value) {
            addCriterion("reg_type =", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotEqualTo(Integer value) {
            addCriterion("reg_type <>", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeGreaterThan(Integer value) {
            addCriterion("reg_type >", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_type >=", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeLessThan(Integer value) {
            addCriterion("reg_type <", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeLessThanOrEqualTo(Integer value) {
            addCriterion("reg_type <=", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeIn(List<Integer> values) {
            addCriterion("reg_type in", values, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotIn(List<Integer> values) {
            addCriterion("reg_type not in", values, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeBetween(Integer value1, Integer value2) {
            addCriterion("reg_type between", value1, value2, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_type not between", value1, value2, "regType");
            return (Criteria) this;
        }

        public Criteria andErrorReasonIsNull() {
            addCriterion("error_reason is null");
            return (Criteria) this;
        }

        public Criteria andErrorReasonIsNotNull() {
            addCriterion("error_reason is not null");
            return (Criteria) this;
        }

        public Criteria andErrorReasonEqualTo(String value) {
            addCriterion("error_reason =", value, "errorReason");
            return (Criteria) this;
        }

        public Criteria andErrorReasonNotEqualTo(String value) {
            addCriterion("error_reason <>", value, "errorReason");
            return (Criteria) this;
        }

        public Criteria andErrorReasonGreaterThan(String value) {
            addCriterion("error_reason >", value, "errorReason");
            return (Criteria) this;
        }

        public Criteria andErrorReasonGreaterThanOrEqualTo(String value) {
            addCriterion("error_reason >=", value, "errorReason");
            return (Criteria) this;
        }

        public Criteria andErrorReasonLessThan(String value) {
            addCriterion("error_reason <", value, "errorReason");
            return (Criteria) this;
        }

        public Criteria andErrorReasonLessThanOrEqualTo(String value) {
            addCriterion("error_reason <=", value, "errorReason");
            return (Criteria) this;
        }

        public Criteria andErrorReasonLike(String value) {
            addCriterion("error_reason like", value, "errorReason");
            return (Criteria) this;
        }

        public Criteria andErrorReasonNotLike(String value) {
            addCriterion("error_reason not like", value, "errorReason");
            return (Criteria) this;
        }

        public Criteria andErrorReasonIn(List<String> values) {
            addCriterion("error_reason in", values, "errorReason");
            return (Criteria) this;
        }

        public Criteria andErrorReasonNotIn(List<String> values) {
            addCriterion("error_reason not in", values, "errorReason");
            return (Criteria) this;
        }

        public Criteria andErrorReasonBetween(String value1, String value2) {
            addCriterion("error_reason between", value1, value2, "errorReason");
            return (Criteria) this;
        }

        public Criteria andErrorReasonNotBetween(String value1, String value2) {
            addCriterion("error_reason not between", value1, value2, "errorReason");
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