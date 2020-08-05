package com.example.homework_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import listView.MyListView;
import recyclerView.MyRecyclerView;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Main";
    Button button_ListView, button_RecyclerView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_ListView = findViewById(R.id.button_ListView);
        button_RecyclerView = findViewById(R.id.button_RecyclerView);

        showListView();
        showRecyclerView();


    }
    public void showListView(){
        button_ListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MyListView.class));
            }
        });
    }

    public void showRecyclerView(){
        button_RecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MyRecyclerView.class));
                Log.d(TAG, "onClick: RecyclerView Button clicked");
            }
        });
    }


}

//public class MainActivity extends AppCompatActivity {
//
//    public static final String TAG = "MainActivity";
//    private RatingBar ratingBar;
//    private ListView listView;
//
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        listView = findViewById(R.id.lv);
//        ratingBar = findViewById(R.id.ratingbar);
//
//        @SuppressLint({"NewApi", "LocalSuppress"}) TeacherAdapter teacherAdapter = new TeacherAdapter(this,R.layout.single_row, TeacherCollection.getTeachers());
//        listView.setAdapter(teacherAdapter);
//        Log.d(TAG, "onCreate: list is set");
//
//
//    }
//
//
//}