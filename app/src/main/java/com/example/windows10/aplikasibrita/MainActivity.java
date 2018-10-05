package com.example.windows10.aplikasibrita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void berita1(View view) {
        Intent intent = new Intent(this, DisplayBerita1.class);
        startActivity(intent);
    }

    public void berita2(View view) {
        Intent intent1 = new Intent(this, DisplayBerita2.class);
        startActivity(intent1);
    }
    public void berita3(View view) {
        Intent intent2 = new Intent(this, DisplayBerita3.class);
        startActivity(intent2);
    }
    public void berita4(View view) {
        Intent intent3 = new Intent(this, DisplayBerita4.class);
        startActivity(intent3);
    }
}
