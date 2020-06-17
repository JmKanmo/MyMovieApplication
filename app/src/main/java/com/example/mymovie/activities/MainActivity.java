package com.example.mymovie.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mymovie.R;
import com.example.mymovie.utils.Listeners.MainListenerController;

public class MainActivity extends AppCompatActivity {
    private MainListenerController viewEventListenerController;

    private void initListener() {
        this.viewEventListenerController = MainListenerController.builder().thumbDownBtn((Button) findViewById(R.id.thumb_down_btn))
                .thumbUpBtn((Button) findViewById(R.id.thumb_up_btn))
                .thumbDownCnt((TextView) findViewById(R.id.thumb_down_cnt))
                .thumbUpCnt((TextView) findViewById(R.id.thumb_up_cnt)).reviewWriteBtn((LinearLayout) findViewById(R.id.review_write_btn))
                .seeAllBtn((Button) findViewById(R.id.see_all_btn)).loginFacebookBtn((ImageView) findViewById(R.id.login_facebook_btn))
                .loginKakaoBtn((ImageView) findViewById(R.id.login_kakao_btn)).purchaseBtn((Button) findViewById(R.id.purchase_btn)).build();

        this.viewEventListenerController.setOnClickListener();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initListener();
    }
}
