package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt_login;
    EditText et_user;
    TextView money_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //money_user = (TextView)findViewById(R.id.money_user);
        bt_login= (Button)findViewById(R.id.bt_login);
        bt_login.setOnClickListener(money);
        et_user=(EditText)findViewById(R.id.et_user);

    }

    private View.OnClickListener money = new View.OnClickListener() {
        public void onClick(View v) {
            String user=et_user.getText().toString();
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, BottomActivity.class);
            startActivity(intent);
            Toast.makeText(MainActivity.this,"歡迎 "+user+"使用本程式",Toast.LENGTH_SHORT).show();
           //money_user.setText("用戶"+user);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
