package com.example.mymovie.listview;

public class ReviewItem {
    private int userPicSrc;
    private String userId;
    private String writeTime;
    private int ratingGrade;
    private String review;
    private int recommendCnt;

    public int getUserPicSrc() {
        return userPicSrc;
    }

    public void setUserPicSrc(int userPicSrc) {
        this.userPicSrc = userPicSrc;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(String writeTime) {
        this.writeTime = writeTime;
    }

    public int getRatingGrade() {
        return ratingGrade;
    }

    public void setRatingGrade(int ratingGrade) {
        this.ratingGrade = ratingGrade;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getRecommendCnt() {
        return recommendCnt;
    }

    public void setRecommendCnt(int recommendCnt) {
        this.recommendCnt = recommendCnt;
    }

    public static class Builder {
        private int userPicSrc;
        private String userId;
        private String writeTime;
        private int ratingGrade;
        private String review;
        private int recommendCnt;

        public Builder userPicSrc(int userPicSrc) {
            this.userPicSrc = userPicSrc;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder writeTime(String writeTime) {
            this.writeTime = writeTime;
            return this;
        }

        public Builder ratingGrade(int ratingGrade) {
            this.ratingGrade = ratingGrade;
            return this;
        }

        public Builder review(String review) {
            this.review = review;
            return this;
        }

        public Builder recommendCnt(int recommendCnt) {
            this.recommendCnt = recommendCnt;
            return this;
        }

        public ReviewItem build() {
            return new ReviewItem(this);
        }
    }

    private ReviewItem(Builder builder) {
        this.userPicSrc = builder.userPicSrc;
        this.userId = builder.userId;
        this.writeTime = builder.writeTime;
        this.ratingGrade = builder.ratingGrade;
        this.review = builder.review;
        this.recommendCnt = builder.recommendCnt;
    }
}
