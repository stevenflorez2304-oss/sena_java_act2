package com.example;

public class MetodosEstaticosSimples {
    public static void ejemploDeclaracionLlamada() {
        System.out.println("====================");
        System.out.println("   Bienvenido a Java  ");
        System.out.println("====================");
    }

    public static void ejemploPasoParametros(String nombre) {
        System.out.println("Estimado/a " + nombre + ", bienvenido/a al sistema.");
    }

    public static int ejemploRetornoValores() {
        int resultado = 10 + 20;
        return resultado;
    }

    public static void ejemploSobrecarga() {
        int lado = 5;
        int area = lado * lado;
        System.out.println("Área del cuadrado con lado " + lado + ": " + area);
    }

    public static void ejemploSobrecarga(int n) {
        int ancho = n;
        int alto = 10;
        int area = ancho * alto;
        System.out.println("Área del rectángulo con ancho " + ancho + " y alto " + alto + ": " + area);
    }
}