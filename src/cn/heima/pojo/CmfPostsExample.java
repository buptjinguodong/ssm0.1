package cn.heima.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmfPostsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmfPostsExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPostAuthorIsNull() {
            addCriterion("post_author is null");
            return (Criteria) this;
        }

        public Criteria andPostAuthorIsNotNull() {
            addCriterion("post_author is not null");
            return (Criteria) this;
        }

        public Criteria andPostAuthorEqualTo(Long value) {
            addCriterion("post_author =", value, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorNotEqualTo(Long value) {
            addCriterion("post_author <>", value, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorGreaterThan(Long value) {
            addCriterion("post_author >", value, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorGreaterThanOrEqualTo(Long value) {
            addCriterion("post_author >=", value, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorLessThan(Long value) {
            addCriterion("post_author <", value, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorLessThanOrEqualTo(Long value) {
            addCriterion("post_author <=", value, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorIn(List<Long> values) {
            addCriterion("post_author in", values, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorNotIn(List<Long> values) {
            addCriterion("post_author not in", values, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorBetween(Long value1, Long value2) {
            addCriterion("post_author between", value1, value2, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorNotBetween(Long value1, Long value2) {
            addCriterion("post_author not between", value1, value2, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostKeywordsIsNull() {
            addCriterion("post_keywords is null");
            return (Criteria) this;
        }

        public Criteria andPostKeywordsIsNotNull() {
            addCriterion("post_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andPostKeywordsEqualTo(String value) {
            addCriterion("post_keywords =", value, "postKeywords");
            return (Criteria) this;
        }

        public Criteria andPostKeywordsNotEqualTo(String value) {
            addCriterion("post_keywords <>", value, "postKeywords");
            return (Criteria) this;
        }

        public Criteria andPostKeywordsGreaterThan(String value) {
            addCriterion("post_keywords >", value, "postKeywords");
            return (Criteria) this;
        }

        public Criteria andPostKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("post_keywords >=", value, "postKeywords");
            return (Criteria) this;
        }

        public Criteria andPostKeywordsLessThan(String value) {
            addCriterion("post_keywords <", value, "postKeywords");
            return (Criteria) this;
        }

        public Criteria andPostKeywordsLessThanOrEqualTo(String value) {
            addCriterion("post_keywords <=", value, "postKeywords");
            return (Criteria) this;
        }

        public Criteria andPostKeywordsLike(String value) {
            addCriterion("post_keywords like", value, "postKeywords");
            return (Criteria) this;
        }

        public Criteria andPostKeywordsNotLike(String value) {
            addCriterion("post_keywords not like", value, "postKeywords");
            return (Criteria) this;
        }

        public Criteria andPostKeywordsIn(List<String> values) {
            addCriterion("post_keywords in", values, "postKeywords");
            return (Criteria) this;
        }

        public Criteria andPostKeywordsNotIn(List<String> values) {
            addCriterion("post_keywords not in", values, "postKeywords");
            return (Criteria) this;
        }

        public Criteria andPostKeywordsBetween(String value1, String value2) {
            addCriterion("post_keywords between", value1, value2, "postKeywords");
            return (Criteria) this;
        }

        public Criteria andPostKeywordsNotBetween(String value1, String value2) {
            addCriterion("post_keywords not between", value1, value2, "postKeywords");
            return (Criteria) this;
        }

        public Criteria andPostSourceIsNull() {
            addCriterion("post_source is null");
            return (Criteria) this;
        }

        public Criteria andPostSourceIsNotNull() {
            addCriterion("post_source is not null");
            return (Criteria) this;
        }

        public Criteria andPostSourceEqualTo(String value) {
            addCriterion("post_source =", value, "postSource");
            return (Criteria) this;
        }

        public Criteria andPostSourceNotEqualTo(String value) {
            addCriterion("post_source <>", value, "postSource");
            return (Criteria) this;
        }

        public Criteria andPostSourceGreaterThan(String value) {
            addCriterion("post_source >", value, "postSource");
            return (Criteria) this;
        }

        public Criteria andPostSourceGreaterThanOrEqualTo(String value) {
            addCriterion("post_source >=", value, "postSource");
            return (Criteria) this;
        }

        public Criteria andPostSourceLessThan(String value) {
            addCriterion("post_source <", value, "postSource");
            return (Criteria) this;
        }

        public Criteria andPostSourceLessThanOrEqualTo(String value) {
            addCriterion("post_source <=", value, "postSource");
            return (Criteria) this;
        }

        public Criteria andPostSourceLike(String value) {
            addCriterion("post_source like", value, "postSource");
            return (Criteria) this;
        }

        public Criteria andPostSourceNotLike(String value) {
            addCriterion("post_source not like", value, "postSource");
            return (Criteria) this;
        }

        public Criteria andPostSourceIn(List<String> values) {
            addCriterion("post_source in", values, "postSource");
            return (Criteria) this;
        }

        public Criteria andPostSourceNotIn(List<String> values) {
            addCriterion("post_source not in", values, "postSource");
            return (Criteria) this;
        }

        public Criteria andPostSourceBetween(String value1, String value2) {
            addCriterion("post_source between", value1, value2, "postSource");
            return (Criteria) this;
        }

        public Criteria andPostSourceNotBetween(String value1, String value2) {
            addCriterion("post_source not between", value1, value2, "postSource");
            return (Criteria) this;
        }

        public Criteria andPostDateIsNull() {
            addCriterion("post_date is null");
            return (Criteria) this;
        }

        public Criteria andPostDateIsNotNull() {
            addCriterion("post_date is not null");
            return (Criteria) this;
        }

        public Criteria andPostDateEqualTo(Date value) {
            addCriterion("post_date =", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateNotEqualTo(Date value) {
            addCriterion("post_date <>", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateGreaterThan(Date value) {
            addCriterion("post_date >", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateGreaterThanOrEqualTo(Date value) {
            addCriterion("post_date >=", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateLessThan(Date value) {
            addCriterion("post_date <", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateLessThanOrEqualTo(Date value) {
            addCriterion("post_date <=", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateIn(List<Date> values) {
            addCriterion("post_date in", values, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateNotIn(List<Date> values) {
            addCriterion("post_date not in", values, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateBetween(Date value1, Date value2) {
            addCriterion("post_date between", value1, value2, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateNotBetween(Date value1, Date value2) {
            addCriterion("post_date not between", value1, value2, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostStatusIsNull() {
            addCriterion("post_status is null");
            return (Criteria) this;
        }

        public Criteria andPostStatusIsNotNull() {
            addCriterion("post_status is not null");
            return (Criteria) this;
        }

        public Criteria andPostStatusEqualTo(Integer value) {
            addCriterion("post_status =", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotEqualTo(Integer value) {
            addCriterion("post_status <>", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusGreaterThan(Integer value) {
            addCriterion("post_status >", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_status >=", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusLessThan(Integer value) {
            addCriterion("post_status <", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusLessThanOrEqualTo(Integer value) {
            addCriterion("post_status <=", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusIn(List<Integer> values) {
            addCriterion("post_status in", values, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotIn(List<Integer> values) {
            addCriterion("post_status not in", values, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusBetween(Integer value1, Integer value2) {
            addCriterion("post_status between", value1, value2, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("post_status not between", value1, value2, "postStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNull() {
            addCriterion("comment_status is null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNotNull() {
            addCriterion("comment_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusEqualTo(Integer value) {
            addCriterion("comment_status =", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotEqualTo(Integer value) {
            addCriterion("comment_status <>", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThan(Integer value) {
            addCriterion("comment_status >", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_status >=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThan(Integer value) {
            addCriterion("comment_status <", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("comment_status <=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIn(List<Integer> values) {
            addCriterion("comment_status in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotIn(List<Integer> values) {
            addCriterion("comment_status not in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusBetween(Integer value1, Integer value2) {
            addCriterion("comment_status between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_status not between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andPostModifiedIsNull() {
            addCriterion("post_modified is null");
            return (Criteria) this;
        }

        public Criteria andPostModifiedIsNotNull() {
            addCriterion("post_modified is not null");
            return (Criteria) this;
        }

        public Criteria andPostModifiedEqualTo(Date value) {
            addCriterion("post_modified =", value, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedNotEqualTo(Date value) {
            addCriterion("post_modified <>", value, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedGreaterThan(Date value) {
            addCriterion("post_modified >", value, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("post_modified >=", value, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedLessThan(Date value) {
            addCriterion("post_modified <", value, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedLessThanOrEqualTo(Date value) {
            addCriterion("post_modified <=", value, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedIn(List<Date> values) {
            addCriterion("post_modified in", values, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedNotIn(List<Date> values) {
            addCriterion("post_modified not in", values, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedBetween(Date value1, Date value2) {
            addCriterion("post_modified between", value1, value2, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedNotBetween(Date value1, Date value2) {
            addCriterion("post_modified not between", value1, value2, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostParentIsNull() {
            addCriterion("post_parent is null");
            return (Criteria) this;
        }

        public Criteria andPostParentIsNotNull() {
            addCriterion("post_parent is not null");
            return (Criteria) this;
        }

        public Criteria andPostParentEqualTo(Long value) {
            addCriterion("post_parent =", value, "postParent");
            return (Criteria) this;
        }

        public Criteria andPostParentNotEqualTo(Long value) {
            addCriterion("post_parent <>", value, "postParent");
            return (Criteria) this;
        }

        public Criteria andPostParentGreaterThan(Long value) {
            addCriterion("post_parent >", value, "postParent");
            return (Criteria) this;
        }

        public Criteria andPostParentGreaterThanOrEqualTo(Long value) {
            addCriterion("post_parent >=", value, "postParent");
            return (Criteria) this;
        }

        public Criteria andPostParentLessThan(Long value) {
            addCriterion("post_parent <", value, "postParent");
            return (Criteria) this;
        }

        public Criteria andPostParentLessThanOrEqualTo(Long value) {
            addCriterion("post_parent <=", value, "postParent");
            return (Criteria) this;
        }

        public Criteria andPostParentIn(List<Long> values) {
            addCriterion("post_parent in", values, "postParent");
            return (Criteria) this;
        }

        public Criteria andPostParentNotIn(List<Long> values) {
            addCriterion("post_parent not in", values, "postParent");
            return (Criteria) this;
        }

        public Criteria andPostParentBetween(Long value1, Long value2) {
            addCriterion("post_parent between", value1, value2, "postParent");
            return (Criteria) this;
        }

        public Criteria andPostParentNotBetween(Long value1, Long value2) {
            addCriterion("post_parent not between", value1, value2, "postParent");
            return (Criteria) this;
        }

        public Criteria andPostTypeIsNull() {
            addCriterion("post_type is null");
            return (Criteria) this;
        }

        public Criteria andPostTypeIsNotNull() {
            addCriterion("post_type is not null");
            return (Criteria) this;
        }

        public Criteria andPostTypeEqualTo(Integer value) {
            addCriterion("post_type =", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeNotEqualTo(Integer value) {
            addCriterion("post_type <>", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeGreaterThan(Integer value) {
            addCriterion("post_type >", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_type >=", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeLessThan(Integer value) {
            addCriterion("post_type <", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeLessThanOrEqualTo(Integer value) {
            addCriterion("post_type <=", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeIn(List<Integer> values) {
            addCriterion("post_type in", values, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeNotIn(List<Integer> values) {
            addCriterion("post_type not in", values, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeBetween(Integer value1, Integer value2) {
            addCriterion("post_type between", value1, value2, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("post_type not between", value1, value2, "postType");
            return (Criteria) this;
        }

        public Criteria andPostMimeTypeIsNull() {
            addCriterion("post_mime_type is null");
            return (Criteria) this;
        }

        public Criteria andPostMimeTypeIsNotNull() {
            addCriterion("post_mime_type is not null");
            return (Criteria) this;
        }

        public Criteria andPostMimeTypeEqualTo(String value) {
            addCriterion("post_mime_type =", value, "postMimeType");
            return (Criteria) this;
        }

        public Criteria andPostMimeTypeNotEqualTo(String value) {
            addCriterion("post_mime_type <>", value, "postMimeType");
            return (Criteria) this;
        }

        public Criteria andPostMimeTypeGreaterThan(String value) {
            addCriterion("post_mime_type >", value, "postMimeType");
            return (Criteria) this;
        }

        public Criteria andPostMimeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("post_mime_type >=", value, "postMimeType");
            return (Criteria) this;
        }

        public Criteria andPostMimeTypeLessThan(String value) {
            addCriterion("post_mime_type <", value, "postMimeType");
            return (Criteria) this;
        }

        public Criteria andPostMimeTypeLessThanOrEqualTo(String value) {
            addCriterion("post_mime_type <=", value, "postMimeType");
            return (Criteria) this;
        }

        public Criteria andPostMimeTypeLike(String value) {
            addCriterion("post_mime_type like", value, "postMimeType");
            return (Criteria) this;
        }

        public Criteria andPostMimeTypeNotLike(String value) {
            addCriterion("post_mime_type not like", value, "postMimeType");
            return (Criteria) this;
        }

        public Criteria andPostMimeTypeIn(List<String> values) {
            addCriterion("post_mime_type in", values, "postMimeType");
            return (Criteria) this;
        }

        public Criteria andPostMimeTypeNotIn(List<String> values) {
            addCriterion("post_mime_type not in", values, "postMimeType");
            return (Criteria) this;
        }

        public Criteria andPostMimeTypeBetween(String value1, String value2) {
            addCriterion("post_mime_type between", value1, value2, "postMimeType");
            return (Criteria) this;
        }

        public Criteria andPostMimeTypeNotBetween(String value1, String value2) {
            addCriterion("post_mime_type not between", value1, value2, "postMimeType");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Long value) {
            addCriterion("comment_count =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Long value) {
            addCriterion("comment_count <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Long value) {
            addCriterion("comment_count >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_count >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Long value) {
            addCriterion("comment_count <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Long value) {
            addCriterion("comment_count <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Long> values) {
            addCriterion("comment_count in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Long> values) {
            addCriterion("comment_count not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Long value1, Long value2) {
            addCriterion("comment_count between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Long value1, Long value2) {
            addCriterion("comment_count not between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andPostHitsIsNull() {
            addCriterion("post_hits is null");
            return (Criteria) this;
        }

        public Criteria andPostHitsIsNotNull() {
            addCriterion("post_hits is not null");
            return (Criteria) this;
        }

        public Criteria andPostHitsEqualTo(Integer value) {
            addCriterion("post_hits =", value, "postHits");
            return (Criteria) this;
        }

        public Criteria andPostHitsNotEqualTo(Integer value) {
            addCriterion("post_hits <>", value, "postHits");
            return (Criteria) this;
        }

        public Criteria andPostHitsGreaterThan(Integer value) {
            addCriterion("post_hits >", value, "postHits");
            return (Criteria) this;
        }

        public Criteria andPostHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_hits >=", value, "postHits");
            return (Criteria) this;
        }

        public Criteria andPostHitsLessThan(Integer value) {
            addCriterion("post_hits <", value, "postHits");
            return (Criteria) this;
        }

        public Criteria andPostHitsLessThanOrEqualTo(Integer value) {
            addCriterion("post_hits <=", value, "postHits");
            return (Criteria) this;
        }

        public Criteria andPostHitsIn(List<Integer> values) {
            addCriterion("post_hits in", values, "postHits");
            return (Criteria) this;
        }

        public Criteria andPostHitsNotIn(List<Integer> values) {
            addCriterion("post_hits not in", values, "postHits");
            return (Criteria) this;
        }

        public Criteria andPostHitsBetween(Integer value1, Integer value2) {
            addCriterion("post_hits between", value1, value2, "postHits");
            return (Criteria) this;
        }

        public Criteria andPostHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("post_hits not between", value1, value2, "postHits");
            return (Criteria) this;
        }

        public Criteria andPostLikeIsNull() {
            addCriterion("post_like is null");
            return (Criteria) this;
        }

        public Criteria andPostLikeIsNotNull() {
            addCriterion("post_like is not null");
            return (Criteria) this;
        }

        public Criteria andPostLikeEqualTo(Integer value) {
            addCriterion("post_like =", value, "postLike");
            return (Criteria) this;
        }

        public Criteria andPostLikeNotEqualTo(Integer value) {
            addCriterion("post_like <>", value, "postLike");
            return (Criteria) this;
        }

        public Criteria andPostLikeGreaterThan(Integer value) {
            addCriterion("post_like >", value, "postLike");
            return (Criteria) this;
        }

        public Criteria andPostLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_like >=", value, "postLike");
            return (Criteria) this;
        }

        public Criteria andPostLikeLessThan(Integer value) {
            addCriterion("post_like <", value, "postLike");
            return (Criteria) this;
        }

        public Criteria andPostLikeLessThanOrEqualTo(Integer value) {
            addCriterion("post_like <=", value, "postLike");
            return (Criteria) this;
        }

        public Criteria andPostLikeIn(List<Integer> values) {
            addCriterion("post_like in", values, "postLike");
            return (Criteria) this;
        }

        public Criteria andPostLikeNotIn(List<Integer> values) {
            addCriterion("post_like not in", values, "postLike");
            return (Criteria) this;
        }

        public Criteria andPostLikeBetween(Integer value1, Integer value2) {
            addCriterion("post_like between", value1, value2, "postLike");
            return (Criteria) this;
        }

        public Criteria andPostLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("post_like not between", value1, value2, "postLike");
            return (Criteria) this;
        }

        public Criteria andIstopIsNull() {
            addCriterion("istop is null");
            return (Criteria) this;
        }

        public Criteria andIstopIsNotNull() {
            addCriterion("istop is not null");
            return (Criteria) this;
        }

        public Criteria andIstopEqualTo(Boolean value) {
            addCriterion("istop =", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotEqualTo(Boolean value) {
            addCriterion("istop <>", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThan(Boolean value) {
            addCriterion("istop >", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThanOrEqualTo(Boolean value) {
            addCriterion("istop >=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThan(Boolean value) {
            addCriterion("istop <", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThanOrEqualTo(Boolean value) {
            addCriterion("istop <=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopIn(List<Boolean> values) {
            addCriterion("istop in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotIn(List<Boolean> values) {
            addCriterion("istop not in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopBetween(Boolean value1, Boolean value2) {
            addCriterion("istop between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotBetween(Boolean value1, Boolean value2) {
            addCriterion("istop not between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andRecommendedIsNull() {
            addCriterion("recommended is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedIsNotNull() {
            addCriterion("recommended is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedEqualTo(Boolean value) {
            addCriterion("recommended =", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotEqualTo(Boolean value) {
            addCriterion("recommended <>", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedGreaterThan(Boolean value) {
            addCriterion("recommended >", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("recommended >=", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedLessThan(Boolean value) {
            addCriterion("recommended <", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedLessThanOrEqualTo(Boolean value) {
            addCriterion("recommended <=", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedIn(List<Boolean> values) {
            addCriterion("recommended in", values, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotIn(List<Boolean> values) {
            addCriterion("recommended not in", values, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedBetween(Boolean value1, Boolean value2) {
            addCriterion("recommended between", value1, value2, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("recommended not between", value1, value2, "recommended");
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