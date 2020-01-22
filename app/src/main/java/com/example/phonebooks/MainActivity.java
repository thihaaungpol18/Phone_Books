package com.example.phonebooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter adapter;
    ArrayList<DataClass> itemLists;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemLists = new ArrayList<>();
        itemLists.add(new DataClass(R.drawable.person_male, "Thiha Aung", "Software Developer", "09775926965", "Myanmar", R.drawable.myanmar_flag));
        itemLists.add(new DataClass(R.drawable.user_male, "Thura Thet", "Marketing", "09775926965", "England", R.drawable.england_flag));
        itemLists.add(new DataClass(R.drawable.user_male1, "Bala Thiha", "Security Cypher", "09775926965", "Japan", R.drawable.japan_flag));
        itemLists.add(new DataClass(R.drawable.person_female, "Cherry May", "Software Architech", "09775926965", "Myanmar", R.drawable.myanmar_flag));
        itemLists.add(new DataClass(R.drawable.person_female, "Htet Htet Aung", "Client", "09775926965", "Russia", R.drawable.russia_flag));
        itemLists.add(new DataClass(R.drawable.person_male, "Stone Giant", "UX Developer", "09775926965", "England", R.drawable.england_flag));
        itemLists.add(new DataClass(R.drawable.user_male1, "Earth Shaker", "Designer", "09775926965", "Japan", R.drawable.japan_flag));
        itemLists.add(new DataClass(R.drawable.person_female, "April May", "Boss", "09775926965", "Japan", R.drawable.japan_flag));
        itemLists.add(new DataClass(R.drawable.person_female, "Crystal Maiden", "Intern", "09775926965", "Myanmar", R.drawable.myanmar_flag));
        itemLists.add(new DataClass(R.drawable.user_male, "Thura Thet", "Marketing", "09775926965", "England", R.drawable.england_flag));
        itemLists.add(new DataClass(R.drawable.user_male1, "Bala Thiha", "Security Cypher", "09775926965", "Japan", R.drawable.japan_flag));
        itemLists.add(new DataClass(R.drawable.person_female, "Cherry May", "Software Architech", "09775926965", "Myanmar", R.drawable.myanmar_flag));
        itemLists.add(new DataClass(R.drawable.person_female, "Htet Htet Aung", "Client", "09775926965", "Russia", R.drawable.russia_flag));
        itemLists.add(new DataClass(R.drawable.person_male, "Stone Giant", "UX Developer", "09775926965", "England", R.drawable.england_flag));
        itemLists.add(new DataClass(R.drawable.user_male1, "Earth Shaker", "Designer", "09775926965", "Japan", R.drawable.japan_flag));
        itemLists.add(new DataClass(R.drawable.person_female, "April May", "Boss", "09775926965", "Japan", R.drawable.japan_flag));
        itemLists.add(new DataClass(R.drawable.person_female, "Crystal Maiden", "Intern", "09775926965", "Myanmar", R.drawable.myanmar_flag));

        recyclerView = findViewById(R.id.mainRecyclerView);
        adapter = new CustomAdapter(itemLists);
        layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);


        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        /**
         * Last thing To Do :
         * Making work the Alert Dialog
         *  Phone Intent
         *
         */

    }
}
