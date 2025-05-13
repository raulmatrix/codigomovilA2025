package com.example.app4pdm2025a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity2 extends AppCompatActivity {

    TextView valorTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        valorTexto = findViewById(R.id.txt_valor);
        //obtener el valor
        Intent it = getIntent();
        int valorObtenido = it.getIntExtra("favorito",0);
        valorTexto.setText(""+valorObtenido);
    }

    public void activity1(View v){
        Intent it = new Intent(getApplicationContext(),MainActivity.class); //comunicacion con activity 2
        startActivity(it);
    }
}