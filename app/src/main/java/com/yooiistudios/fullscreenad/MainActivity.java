package com.yooiistudios.fullscreenad;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.yooiistudios.yooiifullscreenadproj.R;

public class MainActivity extends AppCompatActivity {
    private static final String LAUNCH_COUNT_PREFS = "launch_count_prefs";
    private static final String KEY_LAUNCH_COUNT = "key_launch_count";

    TextView launchCountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        launchCountTextView = (TextView) findViewById(R.id.launch_count_textview);
        launchCountTextView.setText(String.valueOf(loadLaunchCount()));
    }

    private int loadLaunchCount() {
        SharedPreferences prefs = getSharedPreferences(LAUNCH_COUNT_PREFS, MODE_PRIVATE);
        return prefs.getInt(KEY_LAUNCH_COUNT, 1);
    }

    private void increaseLaunchCount() {
        int newValue = loadLaunchCount() + 1;
        SharedPreferences prefs = getSharedPreferences(LAUNCH_COUNT_PREFS, MODE_PRIVATE);
        prefs.edit().putInt(KEY_LAUNCH_COUNT, newValue).apply();

        launchCountTextView.setText(String.valueOf(newValue));
    }

    private void resetLaunchCount() {
        SharedPreferences prefs = getSharedPreferences(LAUNCH_COUNT_PREFS, MODE_PRIVATE);
        prefs.edit().remove(KEY_LAUNCH_COUNT).apply();

        launchCountTextView.setText(String.valueOf(1));
    }

    public void onNewsKitAdButtonClick(View view) {
        startActivity(new Intent(this, NewsKitAdActivity.class));
    }

    public void onMorningKitAdButtonClick(View view) {
        startActivity(new Intent(this, MorningKitAdActivity.class));
    }

    public void onResetLaunchCount(View view) {
        resetLaunchCount();
    }

    public void onIncreaseLaunchCount(View view) {
        increaseLaunchCount();
    }
}
