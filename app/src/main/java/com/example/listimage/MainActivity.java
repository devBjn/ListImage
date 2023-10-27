package com.example.listimage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button next, previous;
    int i = 0;
    private int[] imageList = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        previous = findViewById(R.id.previous);
        next = findViewById(R.id.next);

        updateImage();

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                updateImage();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                updateImage();
            }
        });
    }

    private void updateImage() {
        if(i == imageList.length) {
            i = 0;
        } else if (i == -1) {
            i = imageList.length -1;
        }

        imageView.setImageResource(imageList[i]);
    }
}
