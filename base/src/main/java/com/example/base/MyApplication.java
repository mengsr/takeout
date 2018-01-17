package com.example.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by mengshirui on 2017/12/19
 */

public class MyApplication extends Application {

    private static Context context;

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
