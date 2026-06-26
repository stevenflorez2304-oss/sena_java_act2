package com.example;

public class ManipulacionCadenas {
    public static void demostrarConcatenacion() {

        String nombre = "Steveen";
        String saludo = "Hola, " + nombre + "!";
        System.out.println(saludo);

        int edad = 22;
        String presentacion = "Tengo " + edad + " años";
        System.out.println(presentacion);

        String mensaje = "Java ";
        mensaje += "es ";
        mensaje += "genial";
        System.out.println(mensaje);
    }

    public static void demostrarMetodosUtiles() {
        String texto = "  Hola Mundo en Java  ";

       
        String limpio = texto.trim();
        System.out.println("Con trim: '" + limpio + "'");

        
        System.out.println("Mayúsculas: " + limpio.toUpperCase());
        System.out.println("Minúsculas: " + limpio.toLowerCase());

        
        String reemplazado = limpio.replace("Java", "Colombia");
        System.out.println("Reemplazado: " + reemplazado);

        
        System.out.println("Longitud: " + limpio.length());

        
        System.out.println("¿Contiene 'Mundo'?: " + limpio.contains("Mundo"));

        
        String frase = "Mango,Banano,Fresa,Piña";
        String[] frutas = frase.split(",");
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }
    }

    public static void demostrarInmutabilidad() {


    
    String original = "Java";
    System.out.println("Antes: " + original);

  
    String modificado = original.toUpperCase();
    System.out.println("Original sigue igual: " + original);   
    System.out.println("Nuevo objeto creado:  " + modificado); 

   
    String texto = "Hola";
    texto = texto + " Mundo"; 
    System.out.println("Después de concatenar: " + texto); 
    
    String a = "Java";
    String b = "Java";
    String c = new String("Java"); 

    
    System.out.println("a == b: " + (a == b));         
    System.out.println("a == c: " + (a == c));         

   
    System.out.println("a.equals(c): " + a.equals(c)); 
    }

    public static void usarStringBuilder() {
        

    
    StringBuilder sb = new StringBuilder();

    
    sb.append("Hola");
    sb.append(", ");
    sb.append("mundo");
    sb.append("!");
    System.out.println("Resultado: " + sb.toString()); 

    
    sb.insert(5, " hermoso");
    System.out.println("Con insert: " + sb.toString()); 

    sb.delete(5, 14); 
    System.out.println("Con delete: " + sb.toString()); 

    // reverse() invierte todo el texto
    sb.reverse();
    System.out.println("Invertido: " + sb.toString()); 

    
    StringBuilder parrafo = new StringBuilder();
    String[] palabras = {"Java", "es", "un", "lenguaje", "poderoso"};
    for (String palabra : palabras) {
        parrafo.append(palabra);
        parrafo.append(" ");
    }
    System.out.println("Párrafo: " + parrafo.toString().trim());

    }
}