package com.example;

public class ArreglosUnidimensionales {
    public static void declararCrearInicializar() {
        int[] notas = new int[5];
        notas[0] = 85;
        notas[1] = 90;
        notas[2] = 78;
        notas[3] = 95;
        notas[4] = 88;
        System.out.println("Primera nota: " + notas[0]);
        System.out.println("Última nota:  " + notas[4]);

        String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes" };
        System.out.println("Primer día:   " + dias[0]);
        System.out.println("Último día:   " + dias[4]);

        double[] precios;
        precios = new double[3];
        precios[0] = 9.99;
        precios[1] = 14.50;
        precios[2] = 3.75;
        System.out.println("Precio del producto 1: " + precios[0]);
    }

    public static void mostrarLongitud() {
        int[] notas = { 85, 90, 78, 95, 88 };
        System.out.println("El arreglo tiene: " + notas.length + " elementos");
        System.out.println("Primer elemento: " + notas[0]);
        System.out.println("Último elemento: " + notas[notas.length - 1]);
    }

    public static void recorrerConForClasico() {
        int[] notas = { 85, 90, 78, 95, 88 };
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Casillero [" + i + "] → nota: " + notas[i]);
        }
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        double promedio = (double) suma / notas.length;
        System.out.println("Promedio: " + promedio);

        
        int[] numeros = { 34, 7, 23, 5, 67, 12, 89, 3, 45, 19 };
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El número menor es: " + menor);
    }

    public static void recorrerConForEach() {
        // Reto 1: usar for-each para listar 5 películas favoritas
        String[] peliculas = { "Inception", "Interstellar", "El Padrino", "Matrix", "Avengers" };
        for (String pelicula : peliculas) {
            System.out.println("Película: " + pelicula);
        }
        int[] notas = { 85, 90, 78, 95, 88 };
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        System.out.println("Suma total: " + suma);
    }

    // Reto 3: recibe un array y devuelve versión invertida
    public static int[] arrayComoParametroYRetorno(int[] array) {
        System.out.println("Arreglo original:");
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();

        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }
        System.out.println("Arreglo invertido:");
        for (int numero : invertido) {
            System.out.print(numero + " ");
        }
        System.out.println();

        return invertido;
    }
}