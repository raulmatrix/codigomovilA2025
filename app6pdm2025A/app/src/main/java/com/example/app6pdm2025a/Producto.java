package com.example.app6pdm2025a;

import java.io.Serializable;

public class Producto implements Serializable {

    protected String categoria;
    protected String nombre;
    protected double precio;
    protected int cantidad;
    protected int descuento;

    public Producto(String categoria, String nombre, double precio, int cantidad, int descuento) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularCosto(){
        return (precio*cantidad)-(((precio*cantidad)/100)*descuento);
    }
}
