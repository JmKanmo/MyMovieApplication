package com.example.mymovie.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mymovie.R;

public class MainActivity extends AppCompatActivity {
    private Button thumbUpBtn;
    private Button thumbDownBtn;
    private TextView thumbUpCnt;
    private TextView thumbDownCnt;
    private LinearLayout reviewWriteBtn;
    private Button seeAllBtn;
    private ImageView loginFacebookBtn;
    private ImageView loginKakaoBtn;
    private Button purchaseBtn;

    private void initView() {
        this.thumbUpBtn = findViewById(R.id.thumb_up_btn);
        this.thumbDownBtn = findViewById(R.id.thumb_down_btn);
        this.thumbUpCnt = findViewById(R.id.thumb_up_cnt);
        this.thumbDownCnt = findViewById(R.id.thumb_down_cnt);
        this.reviewWriteBtn = findViewById(R.id.review_write_btn);
        this.seeAllBtn = findViewById(R.id.see_all_btn);
        this.loginFacebookBtn = findViewById(R.id.login_facebook_btn);
        this.loginKakaoBtn = findViewById(R.id.login_kakao_btn);
        this.purchaseBtn = findViewById(R.id.purchase_btn);
    }

    private void initEventListener() {
        this.thumbUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
            }
        });

        this.thumbDownBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
            }
        });

        this.loginFacebookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Log", "loginfacebookbtn click");
            }
        });

        this.loginKakaoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Log", "loginKakaobtn click");
            }
        });

        this.reviewWriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Log", "reviewWriteBtn click");
            }
        });

        this.purchaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Log", "purchaseBtn click");
            }
        });

        this.seeAllBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Log", "seeAllBtn click");
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initView();
        this.initEventListener();
    }
}
