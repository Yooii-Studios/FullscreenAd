package com.yooiistudios.fullscreenad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MorningKitAdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning_kit_ad);
    }

    public void onNoThanksButtonClick(View view) {
        finish();
    }

    public void onTryButtonClicked(View view) {
        GooglePlayUtils.openMorningKitAtGooglePlay(this);
        finish();
    }
}
