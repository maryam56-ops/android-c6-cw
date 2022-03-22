package com.example.cw1d6edit2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Items> itemlist = new ArrayList<>();

        Items donut = new Items("Donut", R.drawable.img ,4.0);
        Items coffee = new Items("Coffee", R.drawable.img_1 ,3.5);
        Items chocolate = new Items("Chocolate", R.drawable.img_2 ,2.0);
        Items cheese = new Items("Cheese", R.drawable.img_3 ,4.5);
        Items honey = new Items("Honey", R.drawable.img_4 ,3.0);
        Items fries = new Items("Fries", R.drawable.img_5 ,2.5);

        itemlist.add(donut);
        itemlist.add(coffee);
        itemlist.add(chocolate);
        itemlist.add(cheese);
        itemlist.add(honey);
        itemlist.add(fries);

        ItemsAdapter itemAdapter = new ItemsAdapter(this , 0 , itemlist);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(itemAdapter);

    }
}