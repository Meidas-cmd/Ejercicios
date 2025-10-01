package org.example;

import java.util.Scanner;

public class Batería_de_programas_sencillos_en_Java_7 {
    static void main () {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hay tomates?(Si/No)");
        String tomate = entrada.nextLine();
        System.out.println("Tenemos aceite(Si/No)");
        String aceite = entrada.nextLine();
        System.out.println("Hay jamoncito (Si/No)");
        String jamon = entrada.nextLine();
        if ( tomate.toLowerCase().equals("no") || aceite.toLowerCase().equals("no") || jamon.toLowerCase().equals("no")) {
            System.out.println("¡Tenemos que ir a comprar!");
        } else {
            System.out.println("¡No tenemos que ir a comprar!");
        }
    }
}
