package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Samurai {
    static void main() {
        //Creo esto para poder hacer aleatorios y coger las respuestas de los usuarios.
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        //Aqui estoy creando las variables que voy a usar en este "programa"
        int total =0;
        int equipo[] = new int[7];
        int equipo1[] = new int[7];
        int equipo2[] = new int[7];
        final int limite = 30;
        int num_equip = 1;
        int bajas1 = 0;
        int bajas2 = 0;
        int sam= 0;
        //He creado un do while porque no sabre cuantas veces se equivocara el usuario en introducir a los samurais
        do {
            //Vuelvo a poner total para que la variable se reinici cada vez que cojamos a un grupo de samurais
            total =0;
            //Preguntamos los samurais que van a estar
            System.out.println("Equipo " + num_equip + ": ");
            System.out.println("Introduce potencia de los samurais: (Separar con ,)");
            String samurai = entrada.next();
            //Para coger cada samurai separados por ,
            String sub_samurai[] = samurai.split(",");
            //Un bucle para que coja cada samurai y lo guarde en un vector de su posicion
            for (int j = 0; j < equipo1.length;j++) {
                if (Integer.parseInt(sub_samurai[j])<=24){
                equipo[j] = Integer.parseInt(sub_samurai[j]);
                total += equipo[j];}
            }
            //Para saber si no supera los 30
            if (total <= limite) {
                //Para guardar al primer equipo
                if (num_equip==1){
                    equipo1 = equipo.clone();
                    num_equip=2;
                } else if (num_equip==2) {
                    //para guardar al segundo equipo
                    equipo2 = equipo.clone();
                    num_equip=5;
                }
            } else {
                //Mensaje de error por si supera los 30
                System.out.println("ERROR. La potencia total no suma 30");
            }
        }while (num_equip<=3);
        //Ahora empezaremos la parte del enfrentamiento
        System.out.println("¡Empieza la batalla!");
        //Creamos un numero aleatorio del 0 al 6 debido que esas son las posiciones de los samurais
        int iniciar = aleatorio.nextInt(7);
        System.out.println("La batalla empieza con el Samurai " + iniciar);
        //Bucle para que empiece del numero aleatorio al 7
        for (int i = iniciar; i<7;i++){
            //Numero de los samurais
            sam=0;
            //Para ver que equipo gana
            if (equipo1[i]>equipo2[i]) {
                sam = 1+i;
                System.out.println("Samurai " + sam + " Gana Equipo 1. " + equipo1[i] + " vs " + equipo2[i]);
               //Sumamos 1 a las bajas del equipo perdedor
                bajas2++;
            } else if (equipo1[i] < equipo2[i]){
                //Lo mismo pero para el otro equipo
                sam = 1+i;
                System.out.println("Samurai " + sam + " Gana Equipo 2. " + equipo1[i] + " vs " + equipo2[i]);
                bajas1++;
            }

        }
        //Bucle de 0 a iniciar-1, lo mismo que el anterior pero desde 0 a iniciar-1
        for (int i = 0; i<iniciar;i++){
            sam=0;
            if (equipo1[i]>equipo2[i]) {
                sam = 1+i;
                System.out.println("Samurai " + sam + " Gana Equipo 1. " + equipo1[i] + " vs " + equipo2[i]);
                bajas2++;
            } else if (equipo1[i] < equipo2[i]){
                sam = 1+i;
                System.out.println("Samurai " + sam + " Gana Equipo 2. " + equipo1[i] + " vs " + equipo2[i]);
                bajas1++;
            }

        }
        //Ver quiene es el ganador
        if (bajas1<bajas2){
            System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + bajas2 + " bajas");
        } else if (bajas1>bajas2) {
            System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + bajas1 + " bajas");
        } else {
            System.out.println("¡EMPATE!");
        }

    }
}
