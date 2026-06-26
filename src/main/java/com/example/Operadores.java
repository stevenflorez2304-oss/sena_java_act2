package com.example;

public class Operadores {
    public static void demostrarAritmeticos() {
        double nota1 = 9.0;
        double nota2 = 8.0;
        double nota3 = 7.0;

        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("Nota 1:" + nota1);
        System.out.println("Nota 2:" + nota2);
        System.out.println("Nota 3:" + nota3);
        System.out.println("Promedio:" + promedio);

    }

    public static void demostrarIncrementoDecremento() {
        int a = 5;
        int b = 5;

        System.out.println("PRE-incremento  (++a): " + (++a));
        System.out.println("POST-incremento (b++): " + (b++));
        System.out.println("Después del POST, b vale: " + b);

    }

    public static void demostrarRelacionales() {

        int a = 10;
        int b = 20;

        System.out.println("a > b:  " + (a > b));

        System.out.println("a < b:  " + (a < b));

        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
    }

    public static void demostrarLogicos() {
        int numero = 35;
        boolean estaEnRango = (numero > 10) && (numero < 50);
        System.out.println(numero + " es mayor que 10 Y menor que 50: " + estaEnRango);

        int otro = 75;
        boolean fueraDeRango = (otro > 10) && (otro < 50);
        System.out.println(otro + " está en rango: " + fueraDeRango);
    }

    public static void demostrarAsignacionCompuesta() {
        int x = 10;
        System.out.println("Valor inicial: " + x);

        x += 5;
        System.out.println("Después de x += 5: " + x);

        x -= 3;
        System.out.println("Después de x -= 3: " + x);

        x *= 2;
        System.out.println("Después de x *= 2: " + x);

        x /= 4;
        System.out.println("Después de x /= 4: " + x);

        x %= 4;
        System.out.println("Después de x %= 4: " + x);
    }

    public static void demostrarOperadorTernario() {
    int numero = -8;

    String resultado = (numero >= 0) ? "Positivo" : "Negativo";

    System.out.println("El número " + numero + " es: " + resultado);
    }
}

    
