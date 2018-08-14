package com.example.gopi.shared_pref;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    String s1,s2;
    SharedPreferences.Editor editor;
    EditText e1,e2;
   // Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
//        b1=findViewById(R.id.button);
//        b2=findViewById(R.id.button2);

        sharedPreferences=getSharedPreferences("share_pref",MODE_PRIVATE);
        editor=sharedPreferences.edit();

    }

    public void nex(View view) {
        Intent in=new Intent(this,Main2Activity.class);
        startActivity(in);
    }

    public void set(View view) {
        s1=e1.getText().toString();
        s2=e2.getText().toString();

        editor.putString("k1",s1);
        editor.putString("k2",s2);
        editor.commit();



    }
}

