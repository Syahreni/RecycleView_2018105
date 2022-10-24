package com.example.tgsrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class Stagger extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PlanetAdapter adapter;
    private ArrayList<Planet> planetArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stagger);
        addData();
        recyclerView = findViewById(R.id.recyclerview);
        adapter = new PlanetAdapter(planetArrayList, this, 3);
        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        planetArrayList = new ArrayList<>();
        planetArrayList.add(new Planet("Bumi", "Bumi adalah planet",R.drawable.bumi));
        planetArrayList.add(new Planet("Jupiter", "Jupiter adalah planet",R.drawable.jupiter));
        planetArrayList.add(new Planet("Mars", "Mars adalah planet",R.drawable.mars));
        planetArrayList.add(new Planet("Mercury", "Mercury adalah planet",R.drawable.mercury));
        planetArrayList.add(new Planet("Saturnus", "Saturnus adalah planet",R.drawable.saturnus));
        planetArrayList.add(new Planet("Venus", "Venus adalah planet",R.drawable.venus));
    }
}
