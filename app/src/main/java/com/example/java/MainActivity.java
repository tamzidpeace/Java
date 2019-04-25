package com.example.java;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = findViewById(R.id.imageView);

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this)
			.build();
        ImageLoader.getInstance().init(config);




























        ImageLoader imageLoader = ImageLoader.getInstance();
        String imageUri = "http://www.ssaurel.com/tmp/logo_ssaurel.png";
        imageLoader.loadImage(imageUri, new SimpleImageLoadingListener() {
            @Override
            public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                // use the loaded image …
                //imageView.setImageURI(Uri.parse(imageUri));
                imageView.setImageBitmap(loadedImage);
            }
        });


    }
}
