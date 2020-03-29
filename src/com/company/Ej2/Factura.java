package com.company.Ej2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Factura {
    //Atributos
    private UUID id;
    private float monto;
    private LocalDate fecha;
    private Cliente alguien;
    private ArrayList<ItemVenta> itemcin= new ArrayList<ItemVenta>();

    //Metodos
    public Factura (float monto, Cliente alguien){
        this.id = UUID.randomUUID();
        this.monto = monto;
        this.fecha = LocalDate.now();
        this.alguien = alguien;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", monto=" + monto +
                ", fecha=" + fecha +
                ", alguien=" + alguien +
                '}';
    }

    public void totalAfterDescuento(){  //monto con descuento (inciso c)
        monto -= monto*alguien.getDescuento()/100;
    }

    public float getMonto(){
        return monto;
    }

    public void agregarItem(ItemVenta algo){  //agrego un ItemVenta
        itemcin.add(algo);
    }

    public ArrayList<ItemVenta> getItemcin() {  //getter del arreglo dinamico
        return itemcin;
    }

    public void montoConySinDescuento(){  //calculo el monto con y sin descuento
        float montin = 0;
        for(int i=0; i<itemcin.size(); i++){
            montin += itemcin.get(i).getPrecioUnitario();
        }
        System.out.println("El precio sin descuento es: $"+montin);
        System.out.println("El precio con descuento es: $"+(montin -=(montin*alguien.getDescuento()/100)));
    }
}
