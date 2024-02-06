package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button blackBtn,yellowBtn,redBtn,purpleBtn,greenBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blackBtn=findViewById(R.id.blackBtn);
        yellowBtn=findViewById(R.id.yellowBtn);
        redBtn=findViewById(R.id.redBtn);
        purpleBtn=findViewById(R.id.purpleBtn);
        greenBtn=findViewById(R.id.greenBtn);

        redBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.red);
                mediaPlayer.start();
            }
        });
        blackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.black);
                mediaPlayer.start();
            }
        });
        yellowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.yellow);
                mediaPlayer.start();
            }
        });
        purpleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.purple);
                mediaPlayer.start();
            }
        });
        greenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.green);
                mediaPlayer.start();
            }
        });
    }
}