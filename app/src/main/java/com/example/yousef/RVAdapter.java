package com.example.yousef;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {
    ArrayList<String> arrayListno=new ArrayList<>();
    ArrayList<String> arrayListnames=new ArrayList<>();
    public RVAdapter(ArrayList<String> arrayListno,ArrayList<String> arrayListnames){
        this.arrayListno=arrayListno;
        this.arrayListnames=arrayListnames;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item= LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemoncards,parent,false);
        return new ViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.num.setText(arrayListno.get(position));
    holder.name.setText(arrayListnames.get(position));
    }

    @Override
    public int getItemCount() {
       return arrayListnames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,num;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            num=itemView.findViewById(R.id.num);
        }
    }
}
