package com.yooiistudios.fullscreenad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yooiistudios.yooiifullscreenadproj.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNewsKitAdButtonClick(View view) {
        startActivity(new Intent(this, NewsKitAdActivity.class));
    }

    public void onMorningKitAdButtonClick(View view) {
        startActivity(new Intent(this, MorningKitAdActivity.class));
    }
}
