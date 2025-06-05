package com.example.app6pdm2025a;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class CostoProducto extends AppCompatActivity {

    TextView nombrePro;
    TextView costoPro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_costo_producto);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nombrePro = findViewById(R.id.txt_nombreP);
        //costoPro = findViewById(R.id.txt_costo);

        //Recepcion d edatos
        //Producto producto1 = (Producto) getIntent().getSerializableExtra("productoLlave");

        String cadenaRespuesta = "";
        //lista de producto recuperados
        ArrayList<Producto> listaProductos = (ArrayList<Producto>)getIntent().getSerializableExtra("listaProductoLlave");

        if(!listaProductos.isEmpty()){  //verificamos si la lista esta vacia
            for(int i=0;i<listaProductos.size();i++){
                cadenaRespuesta+= "\nNombre Producto: "+listaProductos.get(i).getNombre();
                cadenaRespuesta+= "\nPrecio: "+listaProductos.get(i).getPrecio();
                cadenaRespuesta+= "\nCantidad: "+listaProductos.get(i).getCantidad();
                cadenaRespuesta+= "\nDescuento: "+listaProductos.get(i).getDescuento();
                cadenaRespuesta+="\nCosto Parcial: "+(listaProductos.get(i).calcularCosto());
                cadenaRespuesta+="\n --------------------";

            }
        }else{
            Toast.makeText(this, "No existen datos en su lista", Toast.LENGTH_SHORT).show();
        }


        /*String categoria = getIntent().getStringExtra("categoriaLlave");
        String nombre = getIntent().getStringExtra("productoLlave");
        int precio = getIntent().getIntExtra("precioLlave",0);
        int cantidad = getIntent().getIntExtra("cantidadLlave",0);
        int costo =  precio * cantidad;*/



        //actualizar los componentes
        //nombrePro.setText(producto1.nombre);
        nombrePro.setText(cadenaRespuesta);
        //costoPro.setText("Costo:"+(producto1.getPrecio()*producto1.getCantidad()));
    }
}