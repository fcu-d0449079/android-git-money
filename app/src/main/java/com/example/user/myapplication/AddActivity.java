package com.example.user.myapplication;

import android.app.DatePickerDialog;
import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class AddActivity extends AppCompatActivity {
    int now, last = 0;
    String abc;
    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btplus, btsub, btdiv, btmul, btAC,btequ;
    private EditText edDate;
    private EditText edInfo;
    private EditText edAmount;
    private MyDBHelper helper;
    private Calendar m_Calendar = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        findViews();
        helper = new MyDBHelper(this, "expense.db", null, 1);
        find();
    }

    private void findViews() {
        edDate = (EditText) findViewById(R.id.ed_date);
        edInfo = (EditText) findViewById(R.id.ed_info);
        edAmount = (EditText) findViewById(R.id.ed_amount);
        edDate.setOnClickListener(edDateListener);
        edDate.setOnClickListener(edDateListener);
        edDate.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v,MotionEvent event) {
                edDate.setInputType(InputType.TYPE_NULL);
                return false;
            }
        });
    }

    View.OnClickListener edDateListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DatePickerDialog dialog = new DatePickerDialog(AddActivity.this,
                    datepicker,
                    m_Calendar.get(Calendar.YEAR),
                    m_Calendar.get(Calendar.MONTH),
                    m_Calendar.get(Calendar.DAY_OF_MONTH));
            dialog.show();
        }
    };

    DatePickerDialog.OnDateSetListener datepicker = new DatePickerDialog.OnDateSetListener()
    {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth)
        {
            m_Calendar.set(Calendar.YEAR, year);
            m_Calendar.set(Calendar.MONTH, monthOfYear);
            m_Calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            String myFormat = "yyyy/MM/dd";
            SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.TAIWAN);
            edDate.setText(sdf.format(m_Calendar.getTime()));
        }
    };

    public void add(View v){

        String cdate = edDate.getText().toString();
        String info = edInfo.getText().toString();
        int amount = Integer.parseInt(edAmount.getText().toString());
        ContentValues values = new ContentValues();
        values.put("cdate", cdate);
        values.put("info", info);
        values.put("amount", amount);
        long id = helper.getWritableDatabase().insert("exp",null,values);
        Log.d("ADD", id+"");

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
                edAmount.setText(String.valueOf(now));
            }
            if (v.getId() == R.id.btplus) {
                last = now;
                now = 0;
                abc = btplus.getText().toString();
                edAmount.setText(String.valueOf(abc));
            } else if (v.getId() == R.id.btsub) {
                last = now;
                now = 0;
                abc = btsub.getText().toString();
                edAmount.setText(String.valueOf(abc));
            } else if (v.getId() == R.id.btmul) {
                last = now;
                now = 0;
                abc = btmul.getText().toString();
                edAmount.setText(String.valueOf(abc));
            } else if (v.getId() == R.id.btdiv) {
                last = now;
                now = 0;
                abc = btdiv.getText().toString();
                edAmount.setText(String.valueOf(abc));
            }

            if (v.getId() == R.id.btequ) {
                if (abc.equals("+")) {
                    now = last + now;
                    edAmount.setText(String.valueOf(now));
                    last = 0;
                } else if (abc.equals("-")) {
                    now = last - now;
                    edAmount.setText(String.valueOf(now));
                    last = 0;
                } else if (abc.equals("*")) {
                    now = last * now;
                    edAmount.setText(String.valueOf(now));
                    last = 0;
                } else if (abc.equals("/")) {
                    now = last / now;
                    edAmount.setText(String.valueOf(now));
                    last = 0;
                }
                else if (abc.equals("="))
                    now = last;
                edAmount.setText(String.valueOf(now));
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
        edAmount = (EditText) findViewById(R.id.ed_amount);

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
