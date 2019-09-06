package com.sunilkumar.ca1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListItemAdapter extends RecyclerView.Adapter {
    ArrayList<String> myList ;

    public ListItemAdapter(ArrayList<String> myList) {
        this.myList = myList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myview = LayoutInflater.from(parent.getContext()).inflate(R.layout.expand_item_list,parent,false);
        return new ItemViewholder(myview);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ItemViewholder)  holder).item.setText(myList.get(position));
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    class ItemViewholder extends RecyclerView.ViewHolder{
         CheckBox item;
         TextView quantity;
         ItemViewholder(@NonNull View itemView) {
            super(itemView);
            item = itemView.findViewById(R.id.itemname);
            quantity = itemView.findViewById(R.id.itemquantity);
        }
    }

}
