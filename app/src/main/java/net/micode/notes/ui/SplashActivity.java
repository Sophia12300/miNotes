package net.micode.notes.ui;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
//import android.support.v7.app.AppCompatActivity;

import net.micode.notes.R;

import java.util.logging.LogRecord;

public class SplashActivity extends Activity {

    Handler mHandler = new Handler();


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState); //加载启动界面

        setContentView(R.layout.activity_splash); //加载启动图片



// 当计时结束时，跳转至NotesListActivity

        mHandler.postDelayed(new Runnable() {

            @Override

            public void run() {

                Intent intent=new Intent();

                intent.setClass(SplashActivity.this, NotesListActivity.class);

                startActivity(intent);

                finish(); //销毁欢迎页面

            }

        }, 2000); // 2 秒后跳转

    }

}