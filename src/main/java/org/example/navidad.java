package org.example;

import java.util.Scanner;

public class navidad {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la palabra");
        String pal = entrada.next();
        String pal_vec[] = pal.split("");
        System.out.println("Cuantas veces quieres que se repita cada letra (,)");
        String veces = entrada.next();
        String veces_vec[] = veces.split(",");

        if (pal_vec.length == veces_vec.length){
            for (int i = 0; i<pal_vec.length;i++){
                for (int j = 0; j<Integer.parseInt(veces_vec[i]);j++){
                    System.out.print(pal_vec[i]);
                }
            }
        }else {
            System.out.println("La cantidad de letras y numeros no coinciden: ");
        }
    }
}
