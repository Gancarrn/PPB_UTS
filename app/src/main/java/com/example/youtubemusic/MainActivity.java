package com.example.youtubemusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[], s3[];
    int gambar[] = {R.drawable.gambar1, R.drawable.gambar2, R.drawable.gambar3, R.drawable.gambar4,
            R.drawable.gambar5, R.drawable.gambar6, R.drawable.gambar7, R.drawable.gambar8,
            R.drawable.gambar9, R.drawable.gambar10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.list_music);
        s2 = getResources().getStringArray(R.array.durasi);
        s3 = getResources().getStringArray(R.array.like);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, s3, gambar);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}