package org.example;

import java.util.Scanner;

public class Batería_de_programas_sencillos_en_Java_1 {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime cuantas horas has hecho?");
        double horas = entrada.nextDouble();
        System.out.println("Cuanto cobras la hora");
        double  cobro = entrada.nextDouble();
        double sueldo = horas * cobro;
        System.out.println("El total del salario bruto es " + sueldo);
    }


}
