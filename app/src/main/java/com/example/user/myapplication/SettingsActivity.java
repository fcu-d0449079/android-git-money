package com.example.user.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SettingsActivity extends AppCompatActivity {

    boolean logon = false;
    public static final int FUNC_LOGIN=1;
    String func[] = {"製作團隊","聯絡我們","贊助我們"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ListView list = (ListView)findViewById(R.id.list);
        ArrayAdapter adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,func);
        list.setAdapter(adapter);




}
}