package com.king.myrecyclertest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements CustomAdapter.OnItemClickListener {
    ArrayList<Item> data;
    RecyclerView recyclerView;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = new ArrayList();
        recyclerView = findViewById(R.id.recylcerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Item p1 = new Item("King","0795856767",R.mipmap.ic_launcher);
        Item p2 = new Item("King","0795856767",R.mipmap.ic_launcher);
        Item p3 = new Item("King","0795856767",R.mipmap.ic_launcher);
        Item p4 = new Item("King","0795856767",R.mipmap.ic_launcher);
        Item p5 = new Item("King","0795856767",R.mipmap.ic_launcher);
        Item p6 = new Item("King","0795856767",R.mipmap.ic_launcher);
        Item p7 = new Item("King","0795856767",R.mipmap.ic_launcher);

        data.add(p1);
        data.add(p2);
        data.add(p3);
        data.add(p4);
        data.add(p5);
        data.add(p6);
        data.add(p7);

        adapter = new CustomAdapter(this,data);

        recyclerView.setAdapter(adapter);
    }

    public void onItemClick(int position) {
        //Intent intent = new Intent(getApplicationContext(),DetailsActivity.class);
        //intent.putExtra("code", productList.get(position).getMpesaReceiptNumber());
       // intent.putExtra("amount", productList.get(position).getAmount());
        //startActivity(intent);
    }


    public void onVerifyClick(int position) {
        Toast.makeText(this, "Verify transaction: "+position, Toast.LENGTH_SHORT).show();
    }

    public void onDeleteClick(int position) {
        Toast.makeText(this, "Deleted "+position, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        Toast.makeText(this, "Destroyed", Toast.LENGTH_SHORT).show();
    }
}