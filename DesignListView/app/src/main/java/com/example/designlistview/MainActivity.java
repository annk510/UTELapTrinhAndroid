package com.example.designlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewSubjects;
    ArrayList<Subject> subjectArrayList;
    SubjectAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoadListView();
        adapter = new SubjectAdapter(this,R.layout.listviewitemlayout,subjectArrayList);
        listViewSubjects.setAdapter(adapter);
    }
    private void LoadListView(){
        listViewSubjects = (ListView) findViewById(R.id.listview1);
        subjectArrayList = new ArrayList<>();
        subjectArrayList.add(new Subject("Java","Japanese Adult Video Amazing",R.drawable.pic));
        subjectArrayList.add(new Subject("PHP","Personal Home Page",R.drawable.pic));
        subjectArrayList.add(new Subject("PHP","Personal Home Page",R.drawable.pic));
        subjectArrayList.add(new Subject("PHP","Personal Home Page",R.drawable.pic));
        subjectArrayList.add(new Subject("PHP","Personal Home Page",R.drawable.pic));
        subjectArrayList.add(new Subject("PHP","Personal Home Page",R.drawable.pic));
        subjectArrayList.add(new Subject("PHP","Personal Home Page",R.drawable.pic));
        subjectArrayList.add(new Subject("PHP","Personal Home Page",R.drawable.pic));


    }
}