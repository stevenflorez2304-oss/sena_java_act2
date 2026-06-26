package com.example;

public class VariablesYConstantes {

    public static void demostrarDeclaracionAsignacion() {
        int edad = 22;
        double estatura = 1.90;

        System.out.println("La edad es: " + edad);
        System.out.println("La estatura es: " + estatura); 
    }

    public static void demostrarConvencionesNombres() {
        int puntuacionMaxima = 1000;        
        String nombreJugador = "Steveen";   
        int recordJugador = 942;

        System.out.println(String.format(
            "La puntuacion maxima es %d del jugador %s y su record fue de %d",
            puntuacionMaxima, nombreJugador, recordJugador
        ));
    }

    public static void demostrarConstantes() {
        final double PI = 3.1416;
        final int VELOCIDAD_MAX_AUTOPISTA = 120; 

        System.out.println("El valor de PI es: " + PI);
        System.out.println(String.format("Este es el numero PI: %f", PI));
        System.out.println("Velocidad maxima en autopista: " + VELOCIDAD_MAX_AUTOPISTA + " km/h");
    }
        
}