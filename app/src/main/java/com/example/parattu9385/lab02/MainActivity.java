package com.example.parattu9385.lab02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
// list of member variable
    ArrayList items = new ArrayList<String>();
    ArrayAdapter<String> myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init
        items.add("Test");
        myAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, items);
        ListView myList = (ListView)findViewById(R.id.listView);
        myList.setAdapter(myAdapter);
        myList.setTextFilterEnabled(true);
    }

    void AddTask(View v)
    {
        // add the text from textfield to list view controller
        EditText textbox =(EditText)findViewById(R.id.editText);
        String text = textbox.getText().toString();
        items.add(text);
        myAdapter.notifyDataSetChanged();
    }

}
