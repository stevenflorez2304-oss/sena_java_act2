package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicitito() {
        // TODO
        int numero = 50;
        double decimal = numero;
        System.out.println("La conversion de número entero a decimal es: " + decimal);
    }

    public static void demostrarCastingExplicito() {
        // TODO
        double precioTv = 12.000;
        int precio = (int) precioTv;
        System.out.println("El double a enteros es:" + precio);

    }

    public static void demostrarProblemasDePrecision() {
        long numeroGigante = 700000L;
        short numeroCorto = (short) numeroGigante;
        System.out.println("Long original:" + numeroGigante);
        System.out.println("short despues del cast:" + numeroCorto);


        double precio = 99.99;
        int precioSinDecimal = (int) precio;
        System.out.println("double original" + precio);
        System.out.println("int despues del cast:" + precioSinDecimal);
    }
}