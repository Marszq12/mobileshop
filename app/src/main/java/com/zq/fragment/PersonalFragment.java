package com.zq.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.Button;

import com.zq.R;
import com.zq.activity.LoginActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class PersonalFragment extends Fragment {
    String TAG="PersonalFragment";
    @BindView(R.id.bt_login)
    Button button;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_personal,container,false);
        ButterKnife.bind(this,view);
        return view;
    }


    @Override
        public void onResume() {
            super.onResume();
            boolean isLongin= SpTool.getBoolean("isLongin",false);
            Log.d(TAG,"onResume");
            if (isLongin){
            Log.d(TAG,"isLongin");
                button.setText("退出登录");

            }else{
                button.setText("登录");
            }
        }
    @OnClick(R.id.bt_login)
    void login(){

        boolean isLongin= SpTool.getBoolean("isLongin",false);
        Log.d(TAG,"click");
        if (isLongin){
            Log.d(TAG,",,");
            SpTool.setBoolean("isLongin",false);
        }else{
            Intent intent = new Intent(getActivity(), LoginActivity.class);
            startActivity(intent);

        }

    }
}
