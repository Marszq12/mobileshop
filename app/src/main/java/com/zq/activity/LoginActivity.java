package com.zq.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.zq.R;
import com.zq.bean.LoginResponse;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

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
    void login() {

        final String username = et_username.getText().toString();
        final  String pwd =et_pwd.getText().toString();
        new Thread(){
            @Override
            public void run() {
                super.run();
                String url="http://192.168.192.1:8080/MobileShop/member/login2";
                OkHttpClient httpClient = new OkHttpClient.Builder().readTimeout(1, TimeUnit.SECONDS).build();
                FormBody body = new FormBody.Builder()
                        .add("input", username)
                        .add("password", pwd).build();
                Request request=new Request.Builder()
                        .url(url)
                        .post(body)
                        .build();
      /* httpClient.newCall(request).enqueue(new Callback() {
           @Override
           public void onFailure(Call call, IOException e) {

           }

           @Override
           public void onResponse(Call call, Response response) throws IOException {

           }
       });*/
                try {
                    Response response = httpClient.newCall(request).execute();
                    String string=response.body().string();
                    Gson gson=new Gson();
                   final   LoginResponse loginResponse= gson.fromJson(string, LoginResponse.class);

                    if (loginResponse.getStatus()==0){
                        runOnUiThread(new Runnable() {
                            @Override
                                public void run(){
                                    Toast.makeText(LoginActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
                                }

                        });finish();
                    }else{
                        runOnUiThread(new Runnable() {
                            @Override
                                public void run(){
                                    Toast.makeText(LoginActivity.this,loginResponse.getMsg(),Toast.LENGTH_SHORT).show();
                                }

                        });
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }
}
