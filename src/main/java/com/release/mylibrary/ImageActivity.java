package com.release.mylibrary;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import static android.R.attr.width;
import static com.release.mylibrary.R.attr.height;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        ImageView image = (ImageView) findViewById(R.id.imageView);

        Picasso.with(ImageActivity.this)
                .load("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRx7cNCJH659lHPp-BykSkHbbY4I5pIzV5DGFaFocWsEdQB-zvG")
                .into(image);

    }
}
