package com.company.Ej2;

import java.util.UUID;

public class ItemVenta {
    //Atributos
    private UUID id;
    private String nombre;
    private String descripcion;
    private float precioUnitario;

    //Metodos
    public ItemVenta(String nombre, String descripcion, float precioUnitario) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "ItemVenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioUnitario=" + precioUnitario +
                '}';
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }
}
