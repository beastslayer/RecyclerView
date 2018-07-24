package com.example.bhavi.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    private ArrayList<String> mImageNames= new ArrayList<>();
    private ArrayList<String> mImage=new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> mImageNames, ArrayList<String> mImage, Context context) {
        this.mImageNames = mImageNames;
        this.mImage = mImage;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        CircleImageView image;
        TextView textforimage;
        RelativeLayout Parentlayout;

        public viewHolder(View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.imagev);
            textforimage=itemView.findViewById(R.id.txtwithimage);
            Parentlayout=itemView.findViewById(R.id.parent_Layout);
        }
    }
}
