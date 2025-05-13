package com.example.app3pdm2025a;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView cont;
    private int numCont;
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

        //relacion de componentes de xml
        cont = findViewById(R.id.txt_contador);
        numCont=0;
    }

    public void incrementar(View v){
        numCont++;
        cont.setText(""+numCont);
        Toast.makeText(this, "Contador actualizado:"+numCont, Toast.LENGTH_LONG).show();
    }

    public void decrementar(View v){
        numCont--;
        cont.setText(""+numCont);
    }
}