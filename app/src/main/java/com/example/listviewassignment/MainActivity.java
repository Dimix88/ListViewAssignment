package com.example.listviewassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    Context context;
    ArrayList progList;
    public static String [] fruitNames = {"Apple","Banana","Cherry","Grapes","Lemon","Orange","Pear","Pineapple","Strawberry","Watermelon"};
    public static Integer[] fruitImages = {R.drawable.apple, R.drawable.banana,R.drawable.cherry,R.drawable.grapes,R.drawable.lemon
            ,R.drawable.orange,R.drawable.pear,R.drawable.pineaple,R.drawable.strawberry,R.drawable.watermelon};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DimitriAdapter adapter = new DimitriAdapter(this,fruitImages,fruitNames);
        list = (ListView) findViewById(R.id.listview);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"You clicked: "+fruitNames[position],Toast.LENGTH_SHORT).show();

            }
        });

    }
}