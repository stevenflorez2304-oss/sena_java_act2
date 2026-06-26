package com.example;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void leerVariosTipos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una línea de texto: ");
        String texto = sc.nextLine();
        System.out.println("Texto ingresado: " + texto);

        System.out.print("Ingresa un número decimal: ");
        double decimal = sc.nextDouble();
        System.out.println("Número decimal ingresado: " + decimal);

        sc.close();
    }

    public static void manejarSaltoDeLineaPendiente() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = sc.nextInt(); 
        sc.nextLine(); 

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine(); 

        System.out.println("Número: " + numero);
        System.out.println("Nombre: " + nombre);

        sc.close();
    }
}