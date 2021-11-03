package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] item={"Juice","Vegetable","Fruits","Chocolate","Pizza","Burger","Mobile"};
    String[] itemName ={"Orange Juice","Carrot","Mango","Kitkat","Chicken Pizza","Veg Burger","OnePlus"};
    int[] itemImage={R.drawable.orange,R.drawable.carrot,R.drawable.mango,R.drawable.kitkat,R.drawable.pizza,R.drawable.burger,R.drawable.oneplus};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.lvItem);
        ProgramAdapter adapter=new ProgramAdapter(this,item,itemImage,itemName);
       listView.setAdapter(adapter);

    }
}