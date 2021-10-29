package com.aryanvedh.listviewpractice;

import static java.util.Arrays.asList;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myList = findViewById(R.id.myListView);

        ArrayList<String> myFamily = new ArrayList<String>(asList("Rosie", "Kate", "Rakhi", "Mummy"));

//        myFamily.add("Rosie and Kate");
//        myFamily.add("Aryan");
//        myFamily.add("Aoife");
//        myFamily.add("Rakhi");
//        myFamily.add("Amit");
//        myFamily.add("Mummy");
//        myFamily.add("Papa");
//        myFamily.add("Anna");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, myFamily);
        myList.setAdapter(arrayAdapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                Toast.makeText(getApplicationContext(), myFamily.get(position), Toast.LENGTH_LONG).show();
                Log.i("Here", "Hello " + myFamily.get(position));
            }
        });
    }
}