package com.ejercicios;

public class ejercicio_2 {

    public static void main(String[] args) {

        double precio = 45.12;

        double precio_mas_IVA = precioIva(precio);
        System.out.println(precio_mas_IVA);
    }

    static double precioIva (double p) {
        return p + (p * 0.19);
    }

}
