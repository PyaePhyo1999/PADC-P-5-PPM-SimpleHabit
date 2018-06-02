package com.example.acer.simplehabit;

import android.app.Application;

import com.example.acer.simplehabit.data.models.SimpleHabitModel;

/**
 * Created by Acer on 5/26/2018.
 */

public class SimpleHabitApp extends Application {
    public static final String LOG_TAG = "Simple Habit";

    @Override
    public void onCreate() {
        super.onCreate();
        SimpleHabitModel.getsObjectInstance().loadData();
    }
}
