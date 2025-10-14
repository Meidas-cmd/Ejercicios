package org.example;

public class Bateria_T2 {
    static void main() {
        /* Explicacion de String y sus diferentes modos*/
        String frase= "Al palo juanfran del Atletico de Madrid palo";

        int tamanyo = frase.length();
        /*Te dice el tamaño del string*/
        System.out.println(tamanyo);
        /*Te pone el caracter que hay en la posicion que elijas en este caso 8*/
        System.out.println(frase.charAt(8));

        /* Coge de la posicion 8 a la 16*/
        String trozo = frase.substring(8,16);
        System.out.println(trozo);

        /* Coge todo el string a partir de la posicion 17*/
        String trozo_final = frase.substring(17);
        System.out.println(trozo_final);

        /*Busca la palabra palo en el string*/
        int posicion = frase.indexOf("palo");
        System.out.println(posicion);

        /*desde la posicion 10 busca la palabra palo*/
        int posicion2 = frase.indexOf("palo",10);
        System.out.println(posicion2);

        /*Pasamos la frase a mayusculas*/
        String frase_mayusculas = frase.toUpperCase();
        System.out.println(frase_mayusculas);

        /*Pasamos la frase a minusculas*/
        String frase_minusculas = frase.toLowerCase();
        System.out.println(frase_minusculas);

        /* Quitamos los espacios de la izq. derch.*/
        String base_datos = "Raul            ";
        System.out.println(base_datos.trim() + " - " + base_datos + "-");

        /* Compara los string y te dice si es igual o no con true y false y habra que usar trim para quitar espacios y asi comparar bien*/
        boolean igual = base_datos.trim().equals("Manolo");
        System.out.println(igual);

        /*Para ver si son iguales ignorando las mayusculas*/
        boolean igual_sin_mayusculas = "Raul".equalsIgnoreCase("Raul");
        System.out.println(igual_sin_mayusculas);

        /*Cambias las palabras que quieres por la que pongas*/
        String frase_remplazo = frase.replace("palo","Florentino");
        System.out.println(frase_remplazo);
    }
}
