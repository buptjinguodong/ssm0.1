package cn.heima.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityAbstractInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityAbstractInfoExample() {
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

        public Criteria andActiNameIsNull() {
            addCriterion("ACTI_NAME is null");
            return (Criteria) this;
        }

        public Criteria andActiNameIsNotNull() {
            addCriterion("ACTI_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andActiNameEqualTo(String value) {
            addCriterion("ACTI_NAME =", value, "actiName");
            return (Criteria) this;
        }

        public Criteria andActiNameNotEqualTo(String value) {
            addCriterion("ACTI_NAME <>", value, "actiName");
            return (Criteria) this;
        }

        public Criteria andActiNameGreaterThan(String value) {
            addCriterion("ACTI_NAME >", value, "actiName");
            return (Criteria) this;
        }

        public Criteria andActiNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_NAME >=", value, "actiName");
            return (Criteria) this;
        }

        public Criteria andActiNameLessThan(String value) {
            addCriterion("ACTI_NAME <", value, "actiName");
            return (Criteria) this;
        }

        public Criteria andActiNameLessThanOrEqualTo(String value) {
            addCriterion("ACTI_NAME <=", value, "actiName");
            return (Criteria) this;
        }

        public Criteria andActiNameLike(String value) {
            addCriterion("ACTI_NAME like", value, "actiName");
            return (Criteria) this;
        }

        public Criteria andActiNameNotLike(String value) {
            addCriterion("ACTI_NAME not like", value, "actiName");
            return (Criteria) this;
        }

        public Criteria andActiNameIn(List<String> values) {
            addCriterion("ACTI_NAME in", values, "actiName");
            return (Criteria) this;
        }

        public Criteria andActiNameNotIn(List<String> values) {
            addCriterion("ACTI_NAME not in", values, "actiName");
            return (Criteria) this;
        }

        public Criteria andActiNameBetween(String value1, String value2) {
            addCriterion("ACTI_NAME between", value1, value2, "actiName");
            return (Criteria) this;
        }

        public Criteria andActiNameNotBetween(String value1, String value2) {
            addCriterion("ACTI_NAME not between", value1, value2, "actiName");
            return (Criteria) this;
        }

        public Criteria andActiAddrIsNull() {
            addCriterion("ACTI_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andActiAddrIsNotNull() {
            addCriterion("ACTI_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andActiAddrEqualTo(String value) {
            addCriterion("ACTI_ADDR =", value, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrNotEqualTo(String value) {
            addCriterion("ACTI_ADDR <>", value, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrGreaterThan(String value) {
            addCriterion("ACTI_ADDR >", value, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_ADDR >=", value, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrLessThan(String value) {
            addCriterion("ACTI_ADDR <", value, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrLessThanOrEqualTo(String value) {
            addCriterion("ACTI_ADDR <=", value, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrLike(String value) {
            addCriterion("ACTI_ADDR like", value, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrNotLike(String value) {
            addCriterion("ACTI_ADDR not like", value, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrIn(List<String> values) {
            addCriterion("ACTI_ADDR in", values, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrNotIn(List<String> values) {
            addCriterion("ACTI_ADDR not in", values, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrBetween(String value1, String value2) {
            addCriterion("ACTI_ADDR between", value1, value2, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrNotBetween(String value1, String value2) {
            addCriterion("ACTI_ADDR not between", value1, value2, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAgeIsNull() {
            addCriterion("ACTI_AGE is null");
            return (Criteria) this;
        }

        public Criteria andActiAgeIsNotNull() {
            addCriterion("ACTI_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andActiAgeEqualTo(String value) {
            addCriterion("ACTI_AGE =", value, "actiAge");
            return (Criteria) this;
        }

        public Criteria andActiAgeNotEqualTo(String value) {
            addCriterion("ACTI_AGE <>", value, "actiAge");
            return (Criteria) this;
        }

        public Criteria andActiAgeGreaterThan(String value) {
            addCriterion("ACTI_AGE >", value, "actiAge");
            return (Criteria) this;
        }

        public Criteria andActiAgeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_AGE >=", value, "actiAge");
            return (Criteria) this;
        }

        public Criteria andActiAgeLessThan(String value) {
            addCriterion("ACTI_AGE <", value, "actiAge");
            return (Criteria) this;
        }

        public Criteria andActiAgeLessThanOrEqualTo(String value) {
            addCriterion("ACTI_AGE <=", value, "actiAge");
            return (Criteria) this;
        }

        public Criteria andActiAgeLike(String value) {
            addCriterion("ACTI_AGE like", value, "actiAge");
            return (Criteria) this;
        }

        public Criteria andActiAgeNotLike(String value) {
            addCriterion("ACTI_AGE not like", value, "actiAge");
            return (Criteria) this;
        }

        public Criteria andActiAgeIn(List<String> values) {
            addCriterion("ACTI_AGE in", values, "actiAge");
            return (Criteria) this;
        }

        public Criteria andActiAgeNotIn(List<String> values) {
            addCriterion("ACTI_AGE not in", values, "actiAge");
            return (Criteria) this;
        }

        public Criteria andActiAgeBetween(String value1, String value2) {
            addCriterion("ACTI_AGE between", value1, value2, "actiAge");
            return (Criteria) this;
        }

        public Criteria andActiAgeNotBetween(String value1, String value2) {
            addCriterion("ACTI_AGE not between", value1, value2, "actiAge");
            return (Criteria) this;
        }

        public Criteria andActiStarttimeIsNull() {
            addCriterion("ACTI_STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andActiStarttimeIsNotNull() {
            addCriterion("ACTI_STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andActiStarttimeEqualTo(Date value) {
            addCriterion("ACTI_STARTTIME =", value, "actiStarttime");
            return (Criteria) this;
        }

        public Criteria andActiStarttimeNotEqualTo(Date value) {
            addCriterion("ACTI_STARTTIME <>", value, "actiStarttime");
            return (Criteria) this;
        }

        public Criteria andActiStarttimeGreaterThan(Date value) {
            addCriterion("ACTI_STARTTIME >", value, "actiStarttime");
            return (Criteria) this;
        }

        public Criteria andActiStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTI_STARTTIME >=", value, "actiStarttime");
            return (Criteria) this;
        }

        public Criteria andActiStarttimeLessThan(Date value) {
            addCriterion("ACTI_STARTTIME <", value, "actiStarttime");
            return (Criteria) this;
        }

        public Criteria andActiStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("ACTI_STARTTIME <=", value, "actiStarttime");
            return (Criteria) this;
        }

        public Criteria andActiStarttimeIn(List<Date> values) {
            addCriterion("ACTI_STARTTIME in", values, "actiStarttime");
            return (Criteria) this;
        }

        public Criteria andActiStarttimeNotIn(List<Date> values) {
            addCriterion("ACTI_STARTTIME not in", values, "actiStarttime");
            return (Criteria) this;
        }

        public Criteria andActiStarttimeBetween(Date value1, Date value2) {
            addCriterion("ACTI_STARTTIME between", value1, value2, "actiStarttime");
            return (Criteria) this;
        }

        public Criteria andActiStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("ACTI_STARTTIME not between", value1, value2, "actiStarttime");
            return (Criteria) this;
        }

        public Criteria andActiEndtimeIsNull() {
            addCriterion("ACTI_ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andActiEndtimeIsNotNull() {
            addCriterion("ACTI_ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andActiEndtimeEqualTo(Date value) {
            addCriterion("ACTI_ENDTIME =", value, "actiEndtime");
            return (Criteria) this;
        }

        public Criteria andActiEndtimeNotEqualTo(Date value) {
            addCriterion("ACTI_ENDTIME <>", value, "actiEndtime");
            return (Criteria) this;
        }

        public Criteria andActiEndtimeGreaterThan(Date value) {
            addCriterion("ACTI_ENDTIME >", value, "actiEndtime");
            return (Criteria) this;
        }

        public Criteria andActiEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTI_ENDTIME >=", value, "actiEndtime");
            return (Criteria) this;
        }

        public Criteria andActiEndtimeLessThan(Date value) {
            addCriterion("ACTI_ENDTIME <", value, "actiEndtime");
            return (Criteria) this;
        }

        public Criteria andActiEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("ACTI_ENDTIME <=", value, "actiEndtime");
            return (Criteria) this;
        }

        public Criteria andActiEndtimeIn(List<Date> values) {
            addCriterion("ACTI_ENDTIME in", values, "actiEndtime");
            return (Criteria) this;
        }

        public Criteria andActiEndtimeNotIn(List<Date> values) {
            addCriterion("ACTI_ENDTIME not in", values, "actiEndtime");
            return (Criteria) this;
        }

        public Criteria andActiEndtimeBetween(Date value1, Date value2) {
            addCriterion("ACTI_ENDTIME between", value1, value2, "actiEndtime");
            return (Criteria) this;
        }

        public Criteria andActiEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("ACTI_ENDTIME not between", value1, value2, "actiEndtime");
            return (Criteria) this;
        }

        public Criteria andActiShipdateIsNull() {
            addCriterion("ACTI_SHIPDATE is null");
            return (Criteria) this;
        }

        public Criteria andActiShipdateIsNotNull() {
            addCriterion("ACTI_SHIPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andActiShipdateEqualTo(Date value) {
            addCriterion("ACTI_SHIPDATE =", value, "actiShipdate");
            return (Criteria) this;
        }

        public Criteria andActiShipdateNotEqualTo(Date value) {
            addCriterion("ACTI_SHIPDATE <>", value, "actiShipdate");
            return (Criteria) this;
        }

        public Criteria andActiShipdateGreaterThan(Date value) {
            addCriterion("ACTI_SHIPDATE >", value, "actiShipdate");
            return (Criteria) this;
        }

        public Criteria andActiShipdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTI_SHIPDATE >=", value, "actiShipdate");
            return (Criteria) this;
        }

        public Criteria andActiShipdateLessThan(Date value) {
            addCriterion("ACTI_SHIPDATE <", value, "actiShipdate");
            return (Criteria) this;
        }

        public Criteria andActiShipdateLessThanOrEqualTo(Date value) {
            addCriterion("ACTI_SHIPDATE <=", value, "actiShipdate");
            return (Criteria) this;
        }

        public Criteria andActiShipdateIn(List<Date> values) {
            addCriterion("ACTI_SHIPDATE in", values, "actiShipdate");
            return (Criteria) this;
        }

        public Criteria andActiShipdateNotIn(List<Date> values) {
            addCriterion("ACTI_SHIPDATE not in", values, "actiShipdate");
            return (Criteria) this;
        }

        public Criteria andActiShipdateBetween(Date value1, Date value2) {
            addCriterion("ACTI_SHIPDATE between", value1, value2, "actiShipdate");
            return (Criteria) this;
        }

        public Criteria andActiShipdateNotBetween(Date value1, Date value2) {
            addCriterion("ACTI_SHIPDATE not between", value1, value2, "actiShipdate");
            return (Criteria) this;
        }

        public Criteria andActiParentchildIndIsNull() {
            addCriterion("ACTI_PARENTCHILD_IND is null");
            return (Criteria) this;
        }

        public Criteria andActiParentchildIndIsNotNull() {
            addCriterion("ACTI_PARENTCHILD_IND is not null");
            return (Criteria) this;
        }

        public Criteria andActiParentchildIndEqualTo(String value) {
            addCriterion("ACTI_PARENTCHILD_IND =", value, "actiParentchildInd");
            return (Criteria) this;
        }

        public Criteria andActiParentchildIndNotEqualTo(String value) {
            addCriterion("ACTI_PARENTCHILD_IND <>", value, "actiParentchildInd");
            return (Criteria) this;
        }

        public Criteria andActiParentchildIndGreaterThan(String value) {
            addCriterion("ACTI_PARENTCHILD_IND >", value, "actiParentchildInd");
            return (Criteria) this;
        }

        public Criteria andActiParentchildIndGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_PARENTCHILD_IND >=", value, "actiParentchildInd");
            return (Criteria) this;
        }

        public Criteria andActiParentchildIndLessThan(String value) {
            addCriterion("ACTI_PARENTCHILD_IND <", value, "actiParentchildInd");
            return (Criteria) this;
        }

        public Criteria andActiParentchildIndLessThanOrEqualTo(String value) {
            addCriterion("ACTI_PARENTCHILD_IND <=", value, "actiParentchildInd");
            return (Criteria) this;
        }

        public Criteria andActiParentchildIndLike(String value) {
            addCriterion("ACTI_PARENTCHILD_IND like", value, "actiParentchildInd");
            return (Criteria) this;
        }

        public Criteria andActiParentchildIndNotLike(String value) {
            addCriterion("ACTI_PARENTCHILD_IND not like", value, "actiParentchildInd");
            return (Criteria) this;
        }

        public Criteria andActiParentchildIndIn(List<String> values) {
            addCriterion("ACTI_PARENTCHILD_IND in", values, "actiParentchildInd");
            return (Criteria) this;
        }

        public Criteria andActiParentchildIndNotIn(List<String> values) {
            addCriterion("ACTI_PARENTCHILD_IND not in", values, "actiParentchildInd");
            return (Criteria) this;
        }

        public Criteria andActiParentchildIndBetween(String value1, String value2) {
            addCriterion("ACTI_PARENTCHILD_IND between", value1, value2, "actiParentchildInd");
            return (Criteria) this;
        }

        public Criteria andActiParentchildIndNotBetween(String value1, String value2) {
            addCriterion("ACTI_PARENTCHILD_IND not between", value1, value2, "actiParentchildInd");
            return (Criteria) this;
        }

        public Criteria andActiFeatureDescIsNull() {
            addCriterion("ACTI_FEATURE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andActiFeatureDescIsNotNull() {
            addCriterion("ACTI_FEATURE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andActiFeatureDescEqualTo(String value) {
            addCriterion("ACTI_FEATURE_DESC =", value, "actiFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andActiFeatureDescNotEqualTo(String value) {
            addCriterion("ACTI_FEATURE_DESC <>", value, "actiFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andActiFeatureDescGreaterThan(String value) {
            addCriterion("ACTI_FEATURE_DESC >", value, "actiFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andActiFeatureDescGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_FEATURE_DESC >=", value, "actiFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andActiFeatureDescLessThan(String value) {
            addCriterion("ACTI_FEATURE_DESC <", value, "actiFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andActiFeatureDescLessThanOrEqualTo(String value) {
            addCriterion("ACTI_FEATURE_DESC <=", value, "actiFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andActiFeatureDescLike(String value) {
            addCriterion("ACTI_FEATURE_DESC like", value, "actiFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andActiFeatureDescNotLike(String value) {
            addCriterion("ACTI_FEATURE_DESC not like", value, "actiFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andActiFeatureDescIn(List<String> values) {
            addCriterion("ACTI_FEATURE_DESC in", values, "actiFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andActiFeatureDescNotIn(List<String> values) {
            addCriterion("ACTI_FEATURE_DESC not in", values, "actiFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andActiFeatureDescBetween(String value1, String value2) {
            addCriterion("ACTI_FEATURE_DESC between", value1, value2, "actiFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andActiFeatureDescNotBetween(String value1, String value2) {
            addCriterion("ACTI_FEATURE_DESC not between", value1, value2, "actiFeatureDesc");
            return (Criteria) this;
        }

        public Criteria andActiPriceIsNull() {
            addCriterion("ACTI_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andActiPriceIsNotNull() {
            addCriterion("ACTI_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andActiPriceEqualTo(Double value) {
            addCriterion("ACTI_PRICE =", value, "actiPrice");
            return (Criteria) this;
        }

        public Criteria andActiPriceNotEqualTo(Double value) {
            addCriterion("ACTI_PRICE <>", value, "actiPrice");
            return (Criteria) this;
        }

        public Criteria andActiPriceGreaterThan(Double value) {
            addCriterion("ACTI_PRICE >", value, "actiPrice");
            return (Criteria) this;
        }

        public Criteria andActiPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ACTI_PRICE >=", value, "actiPrice");
            return (Criteria) this;
        }

        public Criteria andActiPriceLessThan(Double value) {
            addCriterion("ACTI_PRICE <", value, "actiPrice");
            return (Criteria) this;
        }

        public Criteria andActiPriceLessThanOrEqualTo(Double value) {
            addCriterion("ACTI_PRICE <=", value, "actiPrice");
            return (Criteria) this;
        }

        public Criteria andActiPriceIn(List<Double> values) {
            addCriterion("ACTI_PRICE in", values, "actiPrice");
            return (Criteria) this;
        }

        public Criteria andActiPriceNotIn(List<Double> values) {
            addCriterion("ACTI_PRICE not in", values, "actiPrice");
            return (Criteria) this;
        }

        public Criteria andActiPriceBetween(Double value1, Double value2) {
            addCriterion("ACTI_PRICE between", value1, value2, "actiPrice");
            return (Criteria) this;
        }

        public Criteria andActiPriceNotBetween(Double value1, Double value2) {
            addCriterion("ACTI_PRICE not between", value1, value2, "actiPrice");
            return (Criteria) this;
        }

        public Criteria andActiAbsPicIsNull() {
            addCriterion("ACTI_ABS_PIC is null");
            return (Criteria) this;
        }

        public Criteria andActiAbsPicIsNotNull() {
            addCriterion("ACTI_ABS_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andActiAbsPicEqualTo(String value) {
            addCriterion("ACTI_ABS_PIC =", value, "actiAbsPic");
            return (Criteria) this;
        }

        public Criteria andActiAbsPicNotEqualTo(String value) {
            addCriterion("ACTI_ABS_PIC <>", value, "actiAbsPic");
            return (Criteria) this;
        }

        public Criteria andActiAbsPicGreaterThan(String value) {
            addCriterion("ACTI_ABS_PIC >", value, "actiAbsPic");
            return (Criteria) this;
        }

        public Criteria andActiAbsPicGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_ABS_PIC >=", value, "actiAbsPic");
            return (Criteria) this;
        }

        public Criteria andActiAbsPicLessThan(String value) {
            addCriterion("ACTI_ABS_PIC <", value, "actiAbsPic");
            return (Criteria) this;
        }

        public Criteria andActiAbsPicLessThanOrEqualTo(String value) {
            addCriterion("ACTI_ABS_PIC <=", value, "actiAbsPic");
            return (Criteria) this;
        }

        public Criteria andActiAbsPicLike(String value) {
            addCriterion("ACTI_ABS_PIC like", value, "actiAbsPic");
            return (Criteria) this;
        }

        public Criteria andActiAbsPicNotLike(String value) {
            addCriterion("ACTI_ABS_PIC not like", value, "actiAbsPic");
            return (Criteria) this;
        }

        public Criteria andActiAbsPicIn(List<String> values) {
            addCriterion("ACTI_ABS_PIC in", values, "actiAbsPic");
            return (Criteria) this;
        }

        public Criteria andActiAbsPicNotIn(List<String> values) {
            addCriterion("ACTI_ABS_PIC not in", values, "actiAbsPic");
            return (Criteria) this;
        }

        public Criteria andActiAbsPicBetween(String value1, String value2) {
            addCriterion("ACTI_ABS_PIC between", value1, value2, "actiAbsPic");
            return (Criteria) this;
        }

        public Criteria andActiAbsPicNotBetween(String value1, String value2) {
            addCriterion("ACTI_ABS_PIC not between", value1, value2, "actiAbsPic");
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