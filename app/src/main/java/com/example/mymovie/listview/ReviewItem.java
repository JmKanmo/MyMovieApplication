package com.example.mymovie.listview;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReviewItem {
    private int userPicSrc;
    private String userId;
    private String writeTime;
    private int ratingGrade;
    private String review;
    private int recommendCnt;
}
