package com.zq.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.zq.R;
import com.zq.activity.LoginActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PersonalFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_personal,container,false);
        ButterKnife.bind(this,view);
        return view;
    }
    @OnClick(R.id.bt_login)
    void login(){
        Intent intent = new Intent(getActivity(), LoginActivity.class);
          startActivity(intent);
    }
}
