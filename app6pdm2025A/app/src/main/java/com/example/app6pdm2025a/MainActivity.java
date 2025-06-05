package com.example.app6pdm2025a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Spinner spCategoria;
    EditText nombreProducto;
    EditText precioProducto;
    EditText cantidadProducto;
    EditText descuentoProducto;

    //array para los productos
    ArrayList<Producto> listaProductos = new ArrayList<Producto>();

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

        spCategoria = findViewById(R.id.sp_categoria);
        nombreProducto = findViewById(R.id.et_nombrePro);
        precioProducto = findViewById(R.id.et_Precio);
        cantidadProducto = findViewById(R.id.et_cantidad);
        descuentoProducto = findViewById(R.id.et_descuento);
    }

    public void insertarArreglo(View v){
        String categoriaValor = spCategoria.getSelectedItem().toString(); //obteniendo el item seleccionado
        String productoValor = nombreProducto.getText().toString();
        int precioValor = Integer.parseInt(precioProducto.getText().toString());
        int cantidadValor = Integer.parseInt(cantidadProducto.getText().toString());
        int descuentoValor = Integer.parseInt(descuentoProducto.getText().toString());

        //objeto producto
        Producto producto = new Producto(categoriaValor,productoValor,precioValor,cantidadValor,descuentoValor);
        //adicion al array
        listaProductos.add(producto);

        nombreProducto.setText("");
        precioProducto.setText("");
        cantidadProducto.setText("");
        descuentoProducto.setText(""+0);
    }

    public void calcularPrecio(View v){
        /*String categoriaValor = spCategoria.getSelectedItem().toString(); //obteniendo el item seleccionado
        String productoValor = nombreProducto.getText().toString();
        int precioValor = Integer.parseInt(precioProducto.getText().toString());
        int cantidadValor = Integer.parseInt(cantidadProducto.getText().toString());*/

        //objeto producto
       /* Producto producto = new Producto(categoriaValor,productoValor,precioValor,cantidadValor);*/
        //Intent para envio
        Intent it = new Intent(getApplicationContext(), CostoProducto.class);
        //valores anexos al intent
        it.putExtra("listaProductoLlave",listaProductos);
        /*it.putExtra("categoriaLlave",categoriaValor);
        it.putExtra("productoLlave",productoValor);
        it.putExtra("precioLlave",precioValor);
        it.putExtra("cantidadLlave",cantidadValor);*/
        startActivity(it);
    }
}