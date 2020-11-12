package com.example.tourakure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.myViewHolder> {

    private Context mContext;
    private List<TourList> mData;
    private int mColorList;

    public RecyclerViewAdapter(Context mContext, List<TourList> mData, int colorList) {
        this.mContext = mContext;
        this.mData = mData;
        this.mColorList= colorList;
    }
    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater=  LayoutInflater.from(mContext);
        view= inflater.inflate(R.layout.row_list, parent,false);
        View textContainer=view.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(this.mContext, mColorList);
        textContainer.setBackgroundColor(color);

        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        TourList currentTour=mData.get(position);
        holder.item_name.setText(currentTour.getName());
        holder.item_descriptn.setText(currentTour.getDescription());
        if (mData.get(position).hasImage()){
            holder.item_img.setImageResource(mData.get(position).getImage());
            holder.item_img.setVisibility(View.VISIBLE);
        }
        else {
            holder.item_img.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder{

        TextView item_name;
        TextView item_descriptn;
        ImageView item_img;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            item_name= itemView.findViewById(R.id.name);
            item_descriptn= itemView.findViewById(R.id.description);
            item_img= itemView.findViewById(R.id.image);

        }
    }

}

