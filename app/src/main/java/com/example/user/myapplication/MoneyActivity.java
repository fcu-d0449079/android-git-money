package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MoneyActivity extends AppCompatActivity {
    Button btn_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btn_input = (Button)findViewById(R.id.btn_input);
        btn_input.setOnClickListener(userinputmoney);
    }
    private View.OnClickListener userinputmoney = new View.OnClickListener(){

        public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(MoneyActivity.this,input_money.class);
            startActivity(intent);
            Toast.makeText(MoneyActivity.this,"使用記帳功能",Toast.LENGTH_SHORT).show();

        }
    };

}
