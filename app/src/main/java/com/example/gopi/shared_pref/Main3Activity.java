package com.example.gopi.shared_pref;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    SharedPreferences s;
    SharedPreferences.Editor e;
    TextView t, t1;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        s = getSharedPreferences("share_pref", MODE_PRIVATE);
        e = s.edit();
        t = findViewById(R.id.textView);
        t1=findViewById(R.id.textView2);
    }

    public void gets(View view) {
        String a = s.getString("k1", "def val");
        String a1 = s.getString("k2", "veara onnum illa");
        t.setText(a);
        t1.setText(a1);

    }
}
