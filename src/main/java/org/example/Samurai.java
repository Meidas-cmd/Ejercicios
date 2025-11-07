package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Samurai {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean estado =false;
        int total =31;
        int equipo[] = new int[7];
        int equipo1[] = new int[7];
        int equipo2[] = new int[7];
        final int limite = 30;
        int num_equip = 1;
        int resultado1=0;
        int resultado2=0;
        do {
            total =0;
            System.out.println("Equipo " + num_equip + ": ");
            System.out.println("Introduce potencia de los samurais: (Separar con ,)");
            String samurai = entrada.next();
            String sub_samurai[] = samurai.split(",");
            for (int j = 0; j < equipo1.length;j++) {
                if (Integer.parseInt(sub_samurai[j])<=24){
                equipo[j] = Integer.parseInt(sub_samurai[j]);
                total += equipo[j];}
            }
            if (total <= limite) {
                if (num_equip==1){
                    equipo1 = equipo.clone();
                    num_equip=2;
                } else if (num_equip==2) {
                    equipo2 = equipo.clone();
                    num_equip=5;
                }
            } else {
                System.out.println("ERROR. La potencia total no suma 30");
            }
        }while (num_equip<=3);

        System.out.println("¿Empieza la batalla!");
        int iniciar = aleatorio.nextInt(1,8);
        System.out.println("La batalla empieza con el Samurai " + iniciar);
        for (int i = iniciar; i<8;i++){

            System.out.println("Samurai "+ i + " Gana Equipo: " + num_equip +" " + equipo1[i] +" vs " + equipo2[i]);
        }


    }
}
