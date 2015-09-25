package com.yooiistudios.fullscreenad;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class NewsKitAdActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_kit_ad);
    }

    public void onNoThanksButtonClick(View view) {
        finish();
    }

    public void onTryButtonClicked(View view) {
        GooglePlayUtils.openNewsKitAtGooglePlay(this);
        finish();
    }
}
