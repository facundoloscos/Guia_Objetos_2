package com.company;

import com.company.Ej1.Autor;
import com.company.Ej1.Libro;
import com.company.Ej2.Cliente;
import com.company.Ej2.Factura;
import com.company.Ej2.ItemVenta;
import com.company.Ej3.ClienteEj3;
import com.company.Ej3.Cuenta;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Autor> prueba = new ArrayList<Autor>();  //arreglo auxiliar

	    //Ejercicio 1
        System.out.println("Ejercicio 1");
        //Inciso a
        Autor josh = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        //Inciso b
        System.out.println(josh.toString());
        //Inciso c
        Libro effect = new Libro("Effective Java", 450, 150, josh);
        //Inciso d
        System.out.println(effect.toString());
        //Inciso e
        effect.setPrecio(500);
        effect.setStock(effect.getStock()+50);
        //Inciso f
        System.out.println(effect.getAlguien().toString());
        //Inciso g
        System.out.println(effect.mostrar());
        //Inciso h
        Autor facu = new Autor("Facu", "Loscos", "facu@mail", 'M');  //carga auxiliar
        Autor guille = new Autor("Guille", "Mainini", "guille@mail", 'M');  //carga auxiliar
        prueba.add(josh);  //los agrego al arreglo
        prueba.add(facu);  //los agrego al arreglo
        prueba.add(guille);  //los agrego al arreglo
        effect.setListaAutores(prueba);
        effect.mostrarMagia();


        //Ejercicio 2
        System.out.println("\nEjercicio 2");
        //Inciso b
        Cliente loco = new Cliente("Pepe", "pepe@mail", 10);
        System.out.println(loco.toString());
        //Inciso c
        Factura factu1 = new Factura(20000, loco);
        System.out.println(factu1.getMonto());
        factu1.totalAfterDescuento();
        System.out.println(factu1.getMonto());
        //Inciso d
        System.out.println(factu1.toString());
        //Inciso e
        ItemVenta primerItem = new ItemVenta("Silla", "unaSilla", 200);  //Item auxiliar
        ItemVenta segundoItem = new ItemVenta("Mesa", "unaMesa", 500);  //Item auxiliar
        factu1.agregarItem(primerItem);  //los agrego al arreglo
        factu1.agregarItem(segundoItem);  //los agrego al arreglo
        System.out.println(factu1.getItemcin());  //los muestro para ver que funciona
        factu1.montoConySinDescuento();  //muestro los montos con y sin el descuento


        //Ejercicio 3
        System.out.println("\nEjercicio 3");
        //Inciso a
        ClienteEj3 primerCliente = new ClienteEj3(1, "Macho", 'M');
        System.out.println(primerCliente.toString());
        //Inciso b
        Cuenta primerCuenta = new Cuenta(1, 10000, primerCliente);
        //Inciso c
        primerCuenta.depositar(2000);
        primerCuenta.extraccion(5000);
        //Inciso d
        primerCuenta.extraccion(8000);
        primerCuenta.extraccion(60000);
        //Inciso e
        primerCuenta.mostrarArreglo();  //muestro el arreglo de String
    }
}
