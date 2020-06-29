package com.example.mymovie.listview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class ReviewAdapter extends BaseAdapter {
    private ArrayList<ReviewItem> items = new ArrayList<>();
    private Context context;

    public ReviewAdapter(Context context) {
        this.context = context;
    }

    public void addItem(ReviewItem reviewItem) {
        this.items.add(reviewItem);
    }

    @Override
    public int getCount() {
        return this.items.size();
    }

    @Override
    public Object getItem(int position) {
        return this.items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ReviewItemView reviewItemView = null;

        if (convertView == null) {
            reviewItemView = new ReviewItemView(this.context);
        } else {
            reviewItemView = (ReviewItemView) convertView;
        }

        ReviewItem reviewItem = items.get(position);
        reviewItemView.setReview(reviewItem.getReview());
        reviewItemView.setRatingBar(reviewItem.getRatingGrade());
        reviewItemView.setRecommendCnt(reviewItem.getRecommendCnt());
        reviewItemView.setUserId(reviewItem.getUserId());
        reviewItemView.setUserPic(reviewItem.getUserPicSrc());
        reviewItemView.setWriteTime(reviewItem.getWriteTime());
        return reviewItemView;
    }
}
