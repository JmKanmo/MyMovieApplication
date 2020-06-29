package com.example.mymovie.toast;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mymovie.R;

public class CustomToastController {
    private LayoutInflater inflater;
    private View view;
    private Activity activity;
    private Context context;

    public CustomToastController(Context context, Activity activity) {
        this.context = context;
        this.activity = activity;
    }

    public void sendToast(String message) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.toast_border, (ViewGroup) activity.findViewById(R.id.toast_layout_root));
        TextView toastText = view.findViewById(R.id.toast_text);
        toastText.setText(message);
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(view);
        toast.show();
    }
}
