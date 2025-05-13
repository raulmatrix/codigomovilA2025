package com.example.app4pdm2025a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText etNumFav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        b1 = findViewById(R.id.btn_activity2); //relacion generada
        etNumFav = findViewById(R.id.et_numfavorito);
    }

    public void activity2(View v){
        Intent it = new Intent(getApplicationContext(),Activity2.class); //comunicacion con activity 2
        int valor = Integer.parseInt(etNumFav.getText().toString());  //obtener el valor en formato int
        //paso de datos
        it.putExtra("favorito",valor);

        startActivity(it);
    }
}