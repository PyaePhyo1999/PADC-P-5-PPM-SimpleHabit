package com.example.acer.simplehabit.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.acer.simplehabit.R;
import com.example.acer.simplehabit.adapters.MeditateCategoryAdapter;
import com.example.acer.simplehabit.fragments.OnTheGoFragment;
import com.example.acer.simplehabit.fragments.SeriesFragment;
import com.example.acer.simplehabit.fragments.TeachersFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.vp_meditate)
    ViewPager vpMeditate;

    @BindView(R.id.tl_meditate)
    TabLayout mTabLayout;

    private MeditateCategoryAdapter mMeditateCategoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this,this);
        setSupportActionBar(toolbar);
        mMeditateCategoryAdapter = new MeditateCategoryAdapter(getSupportFragmentManager());
        mMeditateCategoryAdapter.addTap(new OnTheGoFragment(),"ON THE GO");
        mMeditateCategoryAdapter.addTap(new SeriesFragment(),"SERIES");
        mMeditateCategoryAdapter.addTap(new TeachersFragment(),"TEACHERS");
        vpMeditate.setAdapter(mMeditateCategoryAdapter);
        mTabLayout.setupWithViewPager(vpMeditate);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
