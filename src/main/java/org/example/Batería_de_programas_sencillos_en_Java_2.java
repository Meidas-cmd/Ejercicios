package org.example;

import java.util.Scanner;

public class Batería_de_programas_sencillos_en_Java_2 {
    static void main(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime cuantas horas has hecho semanales?");
        double horas = entrada.nextDouble();
        System.out.println("Cuanto cobras la hora");
        double  cobro = entrada.nextDouble();
        if ( 40 < horas ){
            double horas_extras = horas - 40;
            double pago_extra = cobro * 1.5;
            double resultado_extra = horas_extras * pago_extra;
            double horas_40 = horas - horas_extras;
            double sueldo = horas_40 * cobro;
            double resultado = resultado_extra + sueldo;
            System.out.println("El total del salario bruto es " + resultado);

        }
        else {
            double sueldo = horas * cobro;
            System.out.println("El total del salario bruto es " + sueldo);

        }
    }
}
