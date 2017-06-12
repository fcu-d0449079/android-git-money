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
    int now, last = 0;
    String abc;
    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btplus, btsub, btdiv, btmul, btAC,btequ;
    TextView total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_money);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       find();
    }

    private Button.OnClickListener click = new Button.OnClickListener()

    {
        @Override
        public void onClick (View v){
        {
            if (v.getId() == R.id.bt0) {
                now =  now*10;
            } else if (v.getId() == R.id.bt1) {
                now = now*10 + 1;
            } else if (v.getId() == R.id.bt2) {
                now = now*10 + 2;
            } else if (v.getId() == R.id.bt3) {
                now = now*10 + 3;
            } else if (v.getId() == R.id.bt4) {
                now = now*10 + 4;
            } else if (v.getId() == R.id.bt5) {
                now = now*10 + 5;
            } else if (v.getId() == R.id.bt6) {
                now = now*10 + 6;
            } else if (v.getId() == R.id.bt7) {
                now = now*10 + 7;
            } else if (v.getId() == R.id.bt8) {
                now = now*10 + 8;
            } else if (v.getId() == R.id.bt9) {
                now = now*10 + 9;
            } else if (v.getId() == R.id.btAC) {
                now = 0;
            }
            total.setText(String.valueOf(now));
        }
        if (v.getId() == R.id.btplus) {
            last = now;
            now = 0;
            abc = btplus.getText().toString();
            total.setText(String.valueOf(abc));
        } else if (v.getId() == R.id.btsub) {
            last = now;
            now = 0;
            abc = btsub.getText().toString();
            total.setText(String.valueOf(abc));
        } else if (v.getId() == R.id.btmul) {
            last = now;
            now = 0;
            abc = btmul.getText().toString();
            total.setText(String.valueOf(abc));
        } else if (v.getId() == R.id.btdiv) {
            last = now;
            now = 0;
            abc = btdiv.getText().toString();
            total.setText(String.valueOf(abc));
        }

        if (v.getId() == R.id.btequ) {
            if (abc.equals("+")) {
                now = last + now;
                total.setText(String.valueOf(now));
                last = 0;
            } else if (abc.equals("-")) {
                now = last - now;
                total.setText(String.valueOf(now));
                last = 0;
            } else if (abc.equals("*")) {
                now = last * now;
                total.setText(String.valueOf(now));
                last = 0;
            } else if (abc.equals("/")) {
                now = last / now;
                total.setText(String.valueOf(now));
                last = 0;
            }
            else if (abc.equals("="))
                now = last;
                total.setText(String.valueOf(now));
                last = 0;
        }
    }
    };
    private void find(){
        bt0 = (Button) findViewById(R.id.bt0);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        btplus = (Button) findViewById(R.id.btplus);
        btsub = (Button) findViewById(R.id.btsub);
        btmul = (Button) findViewById(R.id.btmul);
        btdiv = (Button) findViewById(R.id.btdiv);
        btAC = (Button) findViewById(R.id.btAC);
        btequ = (Button) findViewById(R.id.btequ);
        total = (TextView) findViewById(R.id.total);

        bt0.setOnClickListener(click);
        bt1.setOnClickListener(click);
        bt2.setOnClickListener(click);
        bt3.setOnClickListener(click);
        bt4.setOnClickListener(click);
        bt5.setOnClickListener(click);
        bt6.setOnClickListener(click);
        bt7.setOnClickListener(click);
        bt8.setOnClickListener(click);
        bt9.setOnClickListener(click);
        btAC.setOnClickListener(click);
        btplus.setOnClickListener(click);
        btdiv.setOnClickListener(click);
        btsub.setOnClickListener(click);
        btmul.setOnClickListener(click);
        btequ.setOnClickListener(click);
    }

}
