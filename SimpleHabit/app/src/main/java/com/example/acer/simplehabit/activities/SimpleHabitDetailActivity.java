package com.example.acer.simplehabit.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.BaseAdapter;

import com.example.acer.simplehabit.R;
import com.example.acer.simplehabit.adapters.BaseRecyclerAdapter;

/**
 * Created by Acer on 5/27/2018.
 */

public class SimpleHabitDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail_activity);
    }
}
