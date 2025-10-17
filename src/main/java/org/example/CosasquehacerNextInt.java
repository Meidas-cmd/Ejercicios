package org.example;

import java.util.Scanner;

public class CosasquehacerNextInt {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        if (entrada.hasNextInt()){
            int numero = entrada.nextInt();

        }else {
            System.out.println("Formato incorrecto no es un numero: ");
        }

    }

}
