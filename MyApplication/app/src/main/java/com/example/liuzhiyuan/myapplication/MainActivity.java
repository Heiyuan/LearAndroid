package com.example.liuzhiyuan.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.imageView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               chishi();
            }
        });
    }
    private void chishi() {
        if (++i != 5){

        new AlertDialog.Builder(MainActivity.this)
                .setTitle("大黄")
                .setMessage("食屎啦你")
                .setPositiveButton("吃掉", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        chishi();
                    }
                })
                .show();
        } else {
            i = 0;
        }
    }
}
