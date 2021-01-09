/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author roodi
 */
public class Productos {
    
    private int id;
    private int cantidad;
    private float precio;
    private float peso;
    private int tipoProducto;
    
    public Productos(int id, int cantidad, float precio, float peso, int tipoProducto) {
        this.id = id;
        this.cantidad = cantidad;
        this.precio = precio;
        this.peso = peso;
        this.tipoProducto = tipoProducto;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }

    public int getTipoProducto() {
        return tipoProducto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setTipoProducto(int tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    
}
