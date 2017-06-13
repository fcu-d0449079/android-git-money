package com.example.user.myapplication;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SettingsActivity extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_settings);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        ListView list = getListView();
        String[] menuItem = {"製作團隊","聯絡我們","贊助我們"};
        ArrayAdapter<String> adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,menuItem);
        list.setAdapter(adapter);


}

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        switch (position){
            case 0:
                AlertDialog.Builder ad = new AlertDialog.Builder(this);
                ad.setTitle("關於本程式");
                ad.setMessage("作者：戴毓辰");

                DialogInterface.OnClickListener listener =
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface di,int i){

                            }
                        };
                ad.setPositiveButton("確定",listener);
                ad.show();
                break;

        }


    }



}