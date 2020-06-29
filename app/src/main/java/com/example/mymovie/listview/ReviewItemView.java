package com.example.mymovie.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.mymovie.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ReviewItemView extends LinearLayout {
    private CircleImageView userPic;
    private TextView userId;
    private RatingBar ratingBar;
    private TextView review;
    private TextView writeTime;
    private TextView recommendCnt;
    private TextView declare;

    public ReviewItemView(Context context) {
        super(context);
        init(context);
    }

    public ReviewItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public void init(final Context context) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.review_item_view, this, true);
        this.userPic = findViewById(R.id.user_pic);
        this.userId = findViewById(R.id.user_id);
        this.ratingBar = findViewById(R.id.rating_bar);
        this.review = findViewById(R.id.review);
        this.recommendCnt = findViewById(R.id.recommend_cnt);
        this.declare = findViewById(R.id.declare);
        this.writeTime = findViewById(R.id.write_time);

        this.declare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "신고를 하시겠습니까?", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setUserPic(int resId) {
        this.userPic.setImageResource(resId);
    }

    public void setUserId(String userId) {
        this.userId.setText(userId);
    }

    public void setRatingBar(float rate) {
        this.ratingBar.setRating(rate);
    }

    public void setReview(String review) {
        this.review.setText(review);
    }

    public void setWriteTime(String time) {
        this.writeTime.setText(time);
    }

    public void setRecommendCnt(int recommendCnt) {
        this.recommendCnt.setText(String.valueOf(recommendCnt));
    }
}
