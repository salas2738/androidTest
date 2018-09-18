package com.salas.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("文件启动了","第一个文件启动了");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
