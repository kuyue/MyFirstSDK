package com.kuyue.myfirstsdk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.kuyue.mylibrary.MyActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoSDK(View view) {
        //调用jar包的activity
        startActivity(new Intent(this, MyActivity.class));
    }

}
