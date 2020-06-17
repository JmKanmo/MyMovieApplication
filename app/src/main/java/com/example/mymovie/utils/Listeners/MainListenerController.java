package com.example.mymovie.utils.Listeners;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MainListenerController extends Activity {
    private Button thumbUpBtn;
    private Button thumbDownBtn;
    private TextView thumbUpCnt;
    private TextView thumbDownCnt;
    private LinearLayout reviewWriteBtn;
    private Button seeAllBtn;
    private ImageView loginFacebookBtn;
    private ImageView loginKakaoBtn;
    private Button purchaseBtn;

    public void setOnClickListener() {
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
}
