package com.example.user.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class input_money extends AppCompatActivity {
    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bta,btb,btc,btd,btAC;
    TextView total,show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_money);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bt0=(Button)findViewById(R.id.bt0);
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        bt4=(Button)findViewById(R.id.bt4);
        bt5=(Button)findViewById(R.id.bt5);
        bt6=(Button)findViewById(R.id.bt6);
        bt7=(Button)findViewById(R.id.bt7);
        bt8=(Button)findViewById(R.id.bt8);
        bt9=(Button)findViewById(R.id.bt9);
        bta=(Button)findViewById(R.id.bta);
        btb=(Button)findViewById(R.id.btb);
        btc=(Button)findViewById(R.id.btc);
        btd=(Button)findViewById(R.id.btd);
        btAC=(Button)findViewById(R.id.btAC);

        show=(TextView)findViewById(R.id.show);
        total=(TextView)findViewById(R.id.total);

    }


}
