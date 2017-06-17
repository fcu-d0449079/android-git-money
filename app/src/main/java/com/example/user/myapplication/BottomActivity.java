package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BottomActivity extends AppCompatActivity {

    private TextView mTextMessage;
    TextView username;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {



        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent = new Intent();
                    intent.setClass(BottomActivity.this, AddActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_statistics:
                    intent = new Intent();
                    intent.setClass(BottomActivity.this, FinanceActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_settings:
                    //mTextMessage.setText(R.string.title_settings);
                    intent = new Intent();
                    intent.setClass(BottomActivity.this, SettingsActivity.class);
                    startActivity(intent);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        username = (TextView)findViewById(R.id.username);
        Bundle namea = this.getIntent().getExtras();
        String result = namea.getString("et_user");
        //mTextMessage = (TextView) findViewById(R.id.message);
        username.setText("歡迎" + result + "使用此軟體");
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
