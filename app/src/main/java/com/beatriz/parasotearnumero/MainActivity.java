package com.beatriz.parasotearnumero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostraNumero(View view) {
        TextView texto = findViewById(R.id.textoExibicaoResultado);
        int x = new Random().nextInt(11);
        texto.setText("Número: " + x);
    }

}