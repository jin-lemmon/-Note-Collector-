package com.example.android.notecollector;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class NowPlayingActivity extends AppCompatActivity {
    @OnClick(R.id.mainMenuButton)
    public void mainMenuClick(View view) {
        Intent mainMenuIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
        startActivity(mainMenuIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        ButterKnife.bind(this);
    }
}
