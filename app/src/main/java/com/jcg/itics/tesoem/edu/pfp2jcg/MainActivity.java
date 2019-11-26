package com.jcg.itics.tesoem.edu.pfp2jcg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> ListaColores;
    String[] strcolores;
    Spinner bjSpiner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
