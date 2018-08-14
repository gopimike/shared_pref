package com.example.gopi.shared_pref;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void nex1(View view) {
        Intent in1=new Intent(this,Main3Activity.class);
        startActivity(in1);
    }

    public void pre(View view) {
        Intent in2=new Intent(this,MainActivity.class);
        startActivity(in2);
    }
}
