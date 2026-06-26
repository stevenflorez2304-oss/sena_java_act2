package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoBasicoExcepciones {

    public static void ejemploTryCatchDivision() {
        try {
            int numerador = 10;
            int denominador = 0;
            int resultado = numerador / denominador;
            System.out.println("Resultado:" + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        }
    }

    public static void ejemploTryCatchInput() {
        try {
            String entradaSimulada = "abc";
            int numero = Integer.parseInt(entradaSimulada);
            int resultado = 10 / numero;
            System.out.println("Resultado:" + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Error de tipo de dato: la entrada no es un número válido.");
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: no se puede dividir por cero.");
        }

    }

    public static void ejemploBloqueFinally() {
        try {
            int resultado = 10 / 2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        } finally {

            System.out.println("Bloque finally: este mensaje siempre se ejecuta.");
        }
    }

    public static void evitarCierrePrograma() {
        System.out.println("Inicio del programa.");
        try {
            String texto = "no es un número";
            int numero = Integer.parseInt(texto); // Error intencional
        } catch (NumberFormatException e) {
            System.out.println("Error capturado: el texto no es un número válido.");
        }
        System.out.println("El programa continuó sin cerrarse.");
    }
}