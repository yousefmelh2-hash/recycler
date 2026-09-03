package com.example.yousef;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> arrayListno=new ArrayList<>();
    ArrayList<String> arrayListnames=new ArrayList<>();
    RVAdapter adapter; //hi
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        adapter=new RVAdapter(arrayListno,arrayListnames);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);



        for (int i = 0; i <=20 ; i++) {
            arrayListno.add(i+".)");
            arrayListnames.add("This is name "+i);
            adapter.notifyDataSetChanged();
        }
    }

    private void initComponents() {
        recyclerView = findViewById(R.id.recyclerView);
    }
}