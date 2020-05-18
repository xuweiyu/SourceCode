package com.xwy.sourcecode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xwy.sourcecode.classlayout.HashMapClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HashMapClient.main(null);
    }
}
