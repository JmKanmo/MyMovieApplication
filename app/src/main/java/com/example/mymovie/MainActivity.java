package com.example.mymovie;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mymovie.listview.ReviewAdapter;
import com.example.mymovie.listview.ReviewItem;
import com.example.mymovie.toast.CustomToastController;

public class MainActivity extends AppCompatActivity {
    private ScrollView mainScrollView;
    private Button thumbUpBtn;
    private Button thumbDownBtn;
    private TextView thumbUpCnt;
    private TextView thumbDownCnt;
    private LinearLayout reviewWriteBtn;
    private Button seeAllBtn;
    private ImageView loginFacebookBtn;
    private ImageView loginKakaoBtn;
    private Button purchaseBtn;
    private ListView reviewList;
    private ReviewAdapter reviewAdapter;
    private CustomToastController customToastController;

    public void initView() {
        this.mainScrollView = findViewById(R.id.main_scroll_view);
        this.thumbUpBtn = findViewById(R.id.thumb_up_btn);
        this.thumbDownBtn = findViewById(R.id.thumb_down_btn);
        this.thumbUpCnt = findViewById(R.id.thumb_up_cnt);
        this.thumbDownCnt = findViewById(R.id.thumb_down_cnt);
        this.reviewWriteBtn = findViewById(R.id.review_write_btn);
        this.seeAllBtn = findViewById(R.id.see_all_btn);
        this.loginFacebookBtn = findViewById(R.id.login_facebook_btn);
        this.loginKakaoBtn = findViewById(R.id.login_kakao_btn);
        this.purchaseBtn = findViewById(R.id.purchase_btn);
        this.reviewList = findViewById(R.id.review_list);
        this.reviewAdapter = new ReviewAdapter(getApplicationContext());
        this.customToastController = new CustomToastController(getApplicationContext(), this);
        this.initReviewList();
    }

    public void initReviewList() {
        this.reviewAdapter.addItem(new ReviewItem.Builder().review("이거 정말 아름답습니다.").ratingGrade(3)
                .recommendCnt(3).userId("nebi25")
                .writeTime("30분전").userPicSrc(R.drawable.basic_user_pic).build());


        this.reviewAdapter.addItem(new ReviewItem.Builder().review("정말 구리네요..").ratingGrade(1)
                .recommendCnt(1).userId("sohee3453")
                .writeTime("1시간전").userPicSrc(R.drawable.moviepic).build());


        this.reviewAdapter.addItem(new ReviewItem.Builder().review("한강의 야경은 너무 이뻐요").ratingGrade(4)
                .recommendCnt(4).userId("apdh1709")
                .writeTime("3분전").userPicSrc(R.drawable.basic_user_pic).build());


        this.reviewAdapter.addItem(new ReviewItem.Builder().review("이러기도 쉽지않은데").ratingGrade(3)
                .recommendCnt(3).userId("sayhos2")
                .writeTime("52분전").userPicSrc(R.drawable.basic_user_pic).build());


        this.reviewAdapter.addItem(new ReviewItem.Builder().review("평범치않은 사랑").ratingGrade(5)
                .recommendCnt(5).userId("nebi2544")
                .writeTime("14분전").userPicSrc(R.drawable.basic_user_pic).build());

        this.reviewList.setAdapter(this.reviewAdapter);
    }

    public void initEventListener() {
        this.thumbUpBtn.setOnClickListener(view -> {
            if (thumbUpBtn.isSelected()) {
                thumbUpBtn.setSelected(false);
                thumbUpCnt.setText(String.valueOf(Integer.parseInt(thumbUpCnt.getText().toString()) - 1));
            } else {
                thumbUpBtn.setSelected(true);
                thumbUpCnt.setText(String.valueOf(Integer.parseInt(thumbUpCnt.getText().toString()) + 1));

                if (thumbDownBtn.isSelected()) {
                    thumbDownBtn.setSelected(false);
                    thumbDownCnt.setText(String.valueOf(Integer.parseInt(thumbDownCnt.getText().toString()) - 1));
                }
            }
        });

        this.thumbDownBtn.setOnClickListener(view -> {
            if (thumbDownBtn.isSelected()) {
                thumbDownBtn.setSelected(false);
                thumbDownCnt.setText(String.valueOf(Integer.parseInt(thumbDownCnt.getText().toString()) - 1));
            } else {
                thumbDownBtn.setSelected(true);
                thumbDownCnt.setText(String.valueOf(Integer.parseInt(thumbDownCnt.getText().toString()) + 1));

                if (thumbUpBtn.isSelected()) {
                    thumbUpBtn.setSelected(false);
                    thumbUpCnt.setText(String.valueOf(Integer.parseInt(thumbUpCnt.getText().toString()) - 1));
                }
            }
        });

        this.loginFacebookBtn.setOnClickListener(view -> {
            customToastController.sendToast("loginfacebookbtn click");
        });

        this.loginKakaoBtn.setOnClickListener(view -> {
            customToastController.sendToast("loginKakaobtn click");
        });

        this.reviewWriteBtn.setOnClickListener(view -> {
            customToastController.sendToast("reviewWriteBtn click");
        });

        this.purchaseBtn.setOnClickListener(view -> {
            customToastController.sendToast("purchaseBtn click");

        });

        this.seeAllBtn.setOnClickListener(view -> {
            customToastController.sendToast("seeAllBtn click");
        });

        this.reviewList.setOnTouchListener((view, event) -> {
                    mainScrollView.requestDisallowInterceptTouchEvent(true);
                    return false;
                }
        );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initView();
        this.initEventListener();
    }
}
