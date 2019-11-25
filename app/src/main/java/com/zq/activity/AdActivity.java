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

import com.bumptech.glide.Glide;
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


        Glide.with(this)
                .load("https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%B9%BF%E5%91%8A%E5%9B%BE&step_word=&hs=0&pn=10&spn=0&di=71720&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=2099594385%2C3539650166&os=268909317%2C249655114&simid=4033404564%2C563427310&adpicid=0&lpn=0&ln=1173&fr=&fmq=1574694688614_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fpic16.nipic.com%2F20110926%2F3383794_164130048343_2.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bgtrtv_z%26e3Bv54AzdH3Ffi5oAzdH3FnAzdH3FbbAzdH3Fc89llmahlm19v8b9_z%26e3Bip4s&gsm=&rpstart=0&rpnum=0&islist=&querylist=&force=undefined")
                .into(imageView);
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
