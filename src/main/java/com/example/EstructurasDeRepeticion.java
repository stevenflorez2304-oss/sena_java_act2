package com.example;

public class EstructurasDeRepeticion {
    public static void ejemploWhile() {
        int contador = 10;
        while (contador >= 1) {
            System.out.println(contador);
            contador--;
        }
    }

    public static void ejemploDoWhile() {
        int numero = 5;
        do {
            System.out.println("Número Ingresado:" + numero);
            numero--;

        } while (numero != 0);
        System.out.println("El usuario Ingreso 0, fin del programa");
    }

    public static void ejemploForClasico() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Vuelta número: " + i);
        }
    }

    public static void ejemploForAnidado() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

    public static void ejemploBreakContinue() {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                System.out.println("Encontré el número 7, detengo el bucle.");
                break;
            }
            System.out.println("Número: " + i);
        }

        System.out.println("---");

        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                System.out.println("Saltando el número 7...");
                continue;
            }
            System.out.println("Número: " + i);
        }
    }

    public static void ejemploEtiquetas() {
        externo: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Encontré i=2, j=2 — salgo de ambos bucles.");
                    break externo;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
