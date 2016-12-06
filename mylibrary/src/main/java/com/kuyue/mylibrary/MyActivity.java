package com.kuyue.mylibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by sen young on 2016/12/5 16:31.
 * 邮箱:595327086@qq.com.
 */

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(MResource.getIdByName(this, "layout", "activity_my"));
        ImageView imageView = (ImageView) this.findViewById(MResource.getIdByName(this, "id", "iv_change"));
        if (imageView != null) {
            imageView.setImageResource(MResource.getIdByName(this, "drawable", "flower"));
        }
    }
}
