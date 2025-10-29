package org.example;

import java.util.Scanner;

public class Bateria_pre_examen {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        /*
        //Ejercicio 1
        int num=0;
        String mayores="";
        String menores="";
        String iguales="";
        System.out.println("Cuantos numeros vas a introducir: (Ej- 1,2,10)");
        int cant = entrada.nextInt();
        for (int i = 1; i<=cant;i++){
            System.out.println(i +"Introduce el numero: ");
            num = entrada.nextInt();
            if (num < 0){
                menores += Integer.toString(num) + ",";
            } else if (num > 0) {
                mayores += Integer.toString(num) +",";
            }else {
                iguales += Integer.toString(num) + ",";
            }
        }
        System.out.println("Mayores que 0 son: " + mayores);
        System.out.println("Menores que 0 son: " + menores);
        System.out.println("Iguales que 0 son: " + iguales);
*/
        /*
        //Ejercicio 2
        int num1 =0;
        System.out.println("Dame el numero base del exponente");
        int base = entrada.nextInt();
        System.out.println("Dame el numero exponente(Tiene que ser positivo");
        int exp = entrada.nextInt();
        num1 = base;
        if (exp>0){
            for (int i = 1;i<exp;i++){
                num1 = num1 * base;
            }
            System.out.println(num1);
        }else if (exp==0){
            System.out.println("El resultado es 1");
        } else{
            System.out.println("No puede se menor de 0");
        }
        */
/*
        //Ejercicio 3
        int total = 0;
        System.out.println("Cuantos mese financias");
        int meses = entrada.nextInt();
        System.out.println("Precio inicial");
        int precio = entrada.nextInt();
        total=  precio;
        for (int i = 1; i<=meses;i++){
            System.out.println("Mes " + i +": " + precio);
            precio += precio;
        }
        precio = precio-total;
        System.out.print("Total a pagar " + precio);
*/
        /*
        //Ejercicio 4
        System.out.println("Dame nota: ");
        int nota = entrada.nextInt();

        switch (nota){
            case 0,1,2,3,4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("No valido");
                break;

        }
        */
        /*
        //Ejercicio 5
        int sueldo=0;
        int sueldo_mayor=0;
        String mas = "";
        for (int i = 1; i<=5; i++){
            System.out.println(i + " Introduce un sueldo");
            sueldo = entrada.nextInt();
           if (sueldo > sueldo_mayor){
               sueldo_mayor = sueldo;
           }
           if (sueldo > 1000) {
               mas += Integer.toString(sueldo) + ",";
           }
        }
        System.out.println("El sueldo mayor es " + sueldo_mayor);
        System.out.println("Los sueldo mayores de 1000€ son " + mas);
*/

    }
}
