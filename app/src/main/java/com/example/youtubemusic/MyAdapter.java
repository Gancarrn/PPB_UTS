package com.example.youtubemusic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String data1[], data2[], data3[];
    int gambar[];
    Context context;

    public MyAdapter(Context ct, String s1[], String s2[], String s3[], int gbr[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        gambar = gbr;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.text1.setText(data1[position]);
        holder.text2.setText(data2[position]);
        holder.text3.setText(data3[position]);
        holder.image.setImageResource(gambar[position]);
    }

    @Override
    public int getItemCount() {
        return gambar.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView text1, text2, text3;
        ImageView image;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            text1 = itemView.findViewById(R.id.judul);
            text2 = itemView.findViewById(R.id.durasi);
            text3 = itemView.findViewById(R.id.like);
            image = itemView.findViewById(R.id.gambar);
        }
    }
}
