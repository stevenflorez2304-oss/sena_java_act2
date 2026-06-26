package com.example;

public class EstructurasCondicionales {
    public static void ejemploIf() {
        int edad = 18;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad, puedes manejar");
        }
    }

    public static void ejemploIfElse() {
        int edad = 15;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad, puedes manejar");
        } else {
            System.out.println("Eres menor de edad, no puedes manejar");

        }
    }

    public static void ejemploIfElseIfElse() {
        int nota = 75;

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Bueno");
        } else if (nota >= 50) {
            System.out.println("Regular");
        } else {
            System.out.println("Insuficiente");
        }
    }

    public static void ejemploSwitch() {
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido, ingresa un número del 1 al 7");
        }
    }

    public static void ejemploSwitchExpression() {
        String estacion = "VERANO";

        String descripcion = switch (estacion) {
            case "PRIMAVERA" -> "Flores y clima templado";
            case "VERANO" -> "Calor y días largos";
            case "OTOÑO" -> "Hojas caídas y viento frío";
            case "INVIERNO" -> "Frío y días cortos";
            default -> "Estación no reconocida";
        };

        System.out.println("Estación: " + estacion);
        System.out.println("Descripción: " + descripcion);
    }
}