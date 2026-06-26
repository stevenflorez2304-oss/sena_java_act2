package com.example;

public class TiposDeDatosPrimitivos {

    public static void demostrarEnteros() {
        byte mesesAnio = 12;
        short dias = 365;
        int precioPc = 2000000;
        long valorCasa = 400000000L; 

        System.out.println("Meses del año: " + mesesAnio);
        System.out.println("Dias del año: " + dias);
        System.out.println("Precio PC: " + precioPc);
        System.out.println("Valor casa: " + valorCasa);

        
        System.out.println("--- Limites ---");
        System.out.println("byte:  min=" + Byte.MIN_VALUE    + " max=" + Byte.MAX_VALUE);
        System.out.println("short: min=" + Short.MIN_VALUE   + " max=" + Short.MAX_VALUE);
        System.out.println("int:   min=" + Integer.MIN_VALUE + " max=" + Integer.MAX_VALUE);
        System.out.println("long:  min=" + Long.MIN_VALUE    + " max=" + Long.MAX_VALUE);
    }

    public static void demostrarFlotantes() {
        float cafeMolino = 34.500f;
        double cafeExpreso = 60.000;

        System.out.println("El precio del cafe Molino es: " + cafeMolino);
        System.out.println("El precio del cafe expreso es: " + cafeExpreso);
    }

    public static void demostrarCaracteres() {
        char inicial = 'S';
        System.out.println("La inicial de mi nombre es: " + inicial);
    }

    public static void demostrarBooleanos() {
        boolean estadoLuz = false;  
        System.out.println("La luz esta encendida: " + estadoLuz); 

        estadoLuz = true;
        System.out.println("La luz esta encendida: " + estadoLuz); 
    }

    public static void demostrarValoresPorDefecto() {
      
        int numero = 0;
        float decimal = 0.0f;
        char caracter = '\0'; 
        boolean logico = false;

        System.out.println("Valor por defecto int:     " + numero);
        System.out.println("Valor por defecto float:   " + decimal);
        System.out.println("Valor por defecto char:    " + caracter);
        System.out.println("Valor por defecto boolean: " + logico);
    }
}