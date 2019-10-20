package com.zq.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zq.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AdActivity extends AppCompatActivity {
  @BindView(R.id.tv_count)
  TextView tv_count;

  @BindView(R.id.iv_image)
  ImageView imageView;

  @BindView(R.id.rl_root )
  RelativeLayout relativeLayout;

  @OnClick(R.id.tv_count)
  void MainActivity(){
            Intent intent = new Intent(AdActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }

    @OnClick(R.id.iv_image)
    void onImageClick(){

    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_ad);
       //Butterknife绑定AdActivity
        ButterKnife.bind(this);




     /*  new Thread(){
           @Override
           public void run() {
               super.run();
           }
       }.start();*/
     new Thread(new Runnable() {
         @Override
         public void run() {
             for (int i=5;i>=0;i--){
                 SystemClock.sleep(1000);
                 final int count=i;
                 runOnUiThread(new Runnable() {
                     @Override
                     public void run() {
                         tv_count.setText("点击跳转 "+count);
                     }
                 });


             }


             /*runOnUiThread(new Runnable() {
                 @Override
                 public void run() {
                     Intent intent=new Intent(AdActivity.this,MainActivity.class);
                     startActivity(intent);
                     finish();
                 }
             });*/
         }
     }).start();



    }

}
