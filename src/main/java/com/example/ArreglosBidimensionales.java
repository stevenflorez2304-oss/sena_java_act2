package com.example;

public class ArreglosBidimensionales {
    public static void declararCrearMatrices() {
        int[][] matriz = new int[3][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;
        System.out.println("Centro de la matriz: " + matriz[1][1]);
    }

    public static void declararCrearMatrices2() {
        int[][] tablero = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Esquina superior izquierda: " + tablero[0][0]);
        System.out.println("Esquina inferior derecha:   " + tablero[2][2]);
    }

    public static void recorrerMatriz() {
        int[][] tablero = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Recorrido completo de la matriz:");
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int col = 0; col < tablero[fila].length; col++) {
                System.out.print(tablero[fila][col] + " ");
            }
            System.out.println();
        }

        int suma = 0;
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int col = 0; col < tablero[fila].length; col++) {
                suma += tablero[fila][col];
            }
        }
        System.out.println("Suma total de la matriz: " + suma);

    }

    public static void ejemploUsosTipicos() {

        
        int[][] cuadricula = {
                { 1, 2 }, // fila 0
                { 3, 4 } // fila 1
        };

        System.out.println("=== Cuadrícula 2x2 ===");
        for (int fila = 0; fila < cuadricula.length; fila++) {
            for (int col = 0; col < cuadricula[fila].length; col++) {
                System.out.print(cuadricula[fila][col] + " ");
            }
            System.out.println();
        }

       
        int[][] matriz3x3 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int suma = 0;
        for (int fila = 0; fila < matriz3x3.length; fila++) {
            for (int col = 0; col < matriz3x3[fila].length; col++) {
                suma += matriz3x3[fila][col];
            }
        }
        System.out.println("=== Suma total de matriz 3x3: " + suma + " ===");
    }
}