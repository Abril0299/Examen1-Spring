package com.example.SpringExamen.models;

import javax.persistence.*;

@Entity
@Table(name="Contruccion")
public class Construccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )
    
    private String nombre;
    private String apellido;
    private float compra;
    private float deuda;
    private String productos;


    //Nombre    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre= nombre;
    }

    //Apellido  
    public String getApellido() {
        return apellido;
    }
    public void setApelllido(String apellido) {
        this.apellido= apellido;
    }


    public Float getCompra() {
        return compra;
    }
    public void setCompra(float compra) {
        this.compra= compra;
    }

    public Float getDeuda() {
        return deuda;
    }
    public void setDeuda(float deuda) {
        this.deuda= deuda;
    }

      
    public String getProductos() {
        return productos;
    }
    public void setProductos(String productos) {
        this.productos= productos;
    }
    
}
