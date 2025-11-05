package org.example;

import java.util.Scanner;
import java.time.LocalDateTime;

public class ej_examen_año_pasado {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();
        int edad = 0;
        System.out.println("Dime tu año de nacimiento: ");
        int año1 = entrada.nextInt();
        for (int i = año1; i <= anyo_actual; i++){
            System.out.println(i +"- edad:"+edad);
            edad++;
        }
    }
}
