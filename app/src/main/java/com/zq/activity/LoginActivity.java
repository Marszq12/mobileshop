package com.zq.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.zq.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.bt_username)
    EditText et_username;
    @BindView(R.id.bt_pwd)
    EditText et_pwd;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.bt_log)
    void login(){
    /* OkHttpClient okHttpClient=new OkHttpClient();
    Request request=new Request
             .Builder()
             .url("http://www.baidu.com")
             .get()
             .build();

     try{
     Response response=httpClient.newCall(request).execute();
     }catch (IOException e){
     e.printStackTrace();}
     */
    }
}/*.start();*/
