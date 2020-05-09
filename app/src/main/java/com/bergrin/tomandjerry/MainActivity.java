package com.bergrin.tomandjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView tomImageView;
    ImageView jerryImageView;
    boolean isTomVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tomImageView = findViewById(R.id.tomImageView);
        jerryImageView = findViewById(R.id.jerryImageView);
    }

    public void changePerson(View view) {
        if (isTomVisible) {
            eraseTom();
        } else {
            eraseJerry();
        }
    }

    public void eraseTom() {
        tomImageView.animate().alpha(0).scaleX(0).scaleY(0).rotation(tomImageView.getRotation() + 3600).setDuration(3000);
        jerryImageView.animate().alpha(1).scaleX(1.0f).scaleY(1.0f).rotation(jerryImageView.getRotation() + 3600).setDuration(3000);
        isTomVisible = false;
    }

    public void eraseJerry() {
        jerryImageView.animate().alpha(0).scaleX(0).scaleY(0).rotation((jerryImageView.getRotation() + 3600)).setDuration(3000);
        tomImageView.animate().alpha(1).scaleX(1.0f).scaleY(1.0f).rotation(tomImageView.getRotation() + 3600).setDuration(3000);
        isTomVisible = true;
    }
}
