package com.sunilkumar.ca1;

import android.animation.LayoutTransition;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter {
    private ArrayList<ShoppingItem> myList ;
    private Context context;
     MyAdapter(ArrayList<ShoppingItem> myList,Context context) {
       this.myList = myList;
       this.context = context;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlayout, parent, false);
        return new MyViewholder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ShoppingItem item = myList.get(position);
        ( (MyViewholder)holder).listName.setText(item.getItemName());
        ((MyViewholder) holder).listBuyDate.setText(item.getItemPrice().toString());
    }
    @Override
    public int getItemCount() {
        return myList.size();
    }

    public  class MyViewholder extends RecyclerView.ViewHolder {
         TextView listName;
         TextView listBuyDate;
         TextView itemCounter;

        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            listName = itemView.findViewById(R.id.productListName);
            listBuyDate = itemView.findViewById(R.id.dateOfBuy);
            itemCounter = itemView.findViewById(R.id.itemCounter);

        }
    }
}
