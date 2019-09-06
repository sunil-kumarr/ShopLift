package com.sunilkumar.ca1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button addListTab;
    private RecyclerView myListOfItem;
    private Toolbar mytoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytoolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(mytoolbar);
        ArrayList<ShoppingItem> myList = new ArrayList<>();
        myList.add(new ShoppingItem("Bakery", 240));
        myList.add(new ShoppingItem("Bakery", 240));
        myList.add(new ShoppingItem("Bakery", 240));
        myList.add(new ShoppingItem("Bakery", 240));
        myList.add(new ShoppingItem("Bakery", 240));

        myListOfItem = findViewById(R.id.recyclerView);
        myListOfItem.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        MyAdapter myAdapter = new MyAdapter(myList,this);
        myListOfItem.setAdapter(myAdapter);
    }
}
