package com.zq.fragment;

import android.content.Context;
import android.content.SharedPreferences;

import com.zq.MyApp;

public class SpTool {
 private final static String SPNAME="my_sp" ;
    public static void putString(String key, String value){
        SharedPreferences sp = MyApp.app.getSharedPreferences(SPNAME, Context.MODE_PRIVATE);
        sp.edit().putString(key, value).commit();
    }

    public static String getString(String key, String deValue){
        SharedPreferences sp =MyApp.app.getSharedPreferences();
       return sp.getString(key,deValue);
    }

    public static void putLong(String key,long value){

        SharedPreferences sp= MyApp.app.getSharedPreferences(SPNAME,Context.MODE_PRIVATE);
        sp.edit().putLong(key, value).commit();

    }
    public static Long setLong(String key,long deValue){
        SharedPreferences sharedPreferences =MyApp.app.getSharedPreferences();
        return sharedPreferences.getLong(key,deValue);
    }
    public static void setBoolean(String key,boolean value){
        SharedPreferences sp= MyApp.app.getSharedPreferences(SPNAME,Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, value).commit();
    }
    public static Boolean getBoolean(String key,boolean deValue){
        SharedPreferences sp = MyApp.app.getSharedPreferences(SPNAME,Context.MODE_PRIVATE);
        return sp.getBoolean(key,deValue);
    }
    public static void putFloat(String key,float value){
        SharedPreferences.Editor edit=getEdit();
        edit.putFloat(key,value);
        edit.apply();
    }
    public static Float getFloat(String key,float deValue){
        SharedPreferences sharedPreferences = MyApp.app.getSharedPreferences();
        return sharedPreferences.getFloat(key,deValue);
    }
    public static void setInt(String key,int value){
        SharedPreferences sp = MyApp.app.getSharedPreferences(SPNAME,Context.MODE_PRIVATE);
        sp.edit().putInt(key, value).commit();
    }
    public static Integer getInt(String key,int deValue){
        SharedPreferences sp = MyApp.app.getSharedPreferences(SPNAME,Context.MODE_PRIVATE);
        return sp.getInt(key, deValue);
    }

    public static SharedPreferences getSharedPreferences(){
        SharedPreferences my_sp =MyApp.getContext().getSharedPreferences(SPNAME,Context.MODE_PRIVATE);
        return my_sp;
    }



    public static SharedPreferences.Editor getEdit(){
        SharedPreferences my_sp =getSharedPreferences();
        SharedPreferences.Editor edit=my_sp.edit();
        return edit;
    }
}
