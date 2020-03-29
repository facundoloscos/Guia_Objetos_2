package com.company.Ej3;

public class Cuenta {
    public static int sub = 0;
    //Atributos
    private int id;
    private float balance;
    private ClienteEj3 alguien;
    private String registro[] = new String [10];

    //Metodos
    public Cuenta(int id, float balance, ClienteEj3 alguien){
        this.id = id;
        this.balance = balance;
        this.alguien = alguien;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", balance=" + balance +
                ", alguien=" + alguien +
                '}';
    }

    public void depositar(float deposito){
        balance += deposito;
        if(sub < 10){  //cargo el arreglo cada vez que hay un deposito
            registro[sub] = "El "+alguien.getNombre()+", deposito "+deposito;
            sub++;
        }
    }

    public void extraccion(float extraer){
        if ((balance - extraer) < -2000){
            System.out.println("No puede retirar tanto dinero");
        }else{
            if ((balance - extraer) < 0){
                balance -= extraer;
                System.out.println("Retiro el dinero deseado, pero le quedo un saldo deudor con el banco de: $"+balance);
            }else{
                balance -=extraer;
            }
            if (sub < 10){  //cargo el arreglo cada vez que hay una extraccion
                registro[sub] = "El "+alguien.getNombre()+", retiro "+extraer;
                sub++;
            }
        }
    }

    public void mostrarArreglo(){  //auxiliar para ver si se cargaba bien el arreglo
        for (int i=0; i<sub; i++){
            System.out.println(registro[i]);
        }
    }
}
