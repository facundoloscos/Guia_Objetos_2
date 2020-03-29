package com.company.Ej3;

public class ClienteEj3 {
    //Atributos
    private int id;
    private String nombre;
    private char genero;

    //Metodos
    public ClienteEj3(int id, String nombre, char genero){
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "ClienteEj3{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                '}';
    }

    public String getNombre() {
        return nombre;
    }
}
