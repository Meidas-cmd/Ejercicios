package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class multiplicaciones_3_cifras {
    static void main (){
        /*
        int numero = 435;
        String numero_string = Integer.toString(numero);
        String nums1 = numero_string.substring(0,1);
        String nums2 = numero_string.substring(1,2);

        String nums3 = numero_string.substring(2,3);
        int numero1 = Integer.parseInt(nums1);
        int numero2 = Integer.parseInt(nums2);
        int numero3 = Integer.parseInt(nums3);
         */

        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        /*Estoy definiendo el minimo de los numeros*/

        final int NUM_MIN = 99;
        /*Estoy definiendo el numero maximo*/
        final int NUM_MAX = 999;

        boolean estado = true;
        do {
            try{
                /*Estoy haciendo un do while donde  mientras la variable num1 no sea <  que 99 y menor  que > 1000 no acabe el bucle y siga preguntando  */
                do{
                    /*Estoy pidiendo el primer numero de 3 cifras y guardandole en la variable num1*/
                    System.out.println("Introduce el primer numero de 3 cifras: ");
                    num1 = entrada.nextInt();
                    estado = false;
                } while ( num1 < NUM_MIN  || num1 > NUM_MAX);
            }catch (InputMismatchException e) {
                entrada.nextLine();
            }
        } while (estado);


        estado = true;
        int num2 = 0;
        /*Estoy haciendo un do while donde  mientras la variable num2 no sea <  que 99 y menor  que > 1000 no acabe el bucle y siga preguntando  */
       do {
           try{
               do {
                   /*Estoy pidiendo el segundo numero de 3 cifras y guardandolo en la variable num2*/
                   System.out.println("Introduce el segundo numero de 3 cifras: ");
                   num2 = entrada.nextInt();
                   estado = false;
               } while (num2 < NUM_MIN  || num2 > NUM_MAX);
           }catch (InputMismatchException e){
           entrada.nextLine();
           }
       } while(estado);
       //En la linea siguiente estoy haciendo que el int pase a string
        String numero_string = Integer.toString(num2);
        //Aqui estoy dividiendo en partes las tres cifras para luego usarlas por separado
        String nums1 = numero_string.substring(0,1);
        String nums2 = numero_string.substring(1,2);
        String nums3 = numero_string.substring(2,3);
        //Aqui los vuelvo int de nuevo y asi poder usarlos ne operacioes
        int numero1 = Integer.parseInt(nums1);
        int numero2 = Integer.parseInt(nums2);
        int numero3 = Integer.parseInt(nums3);
        //son los resultados que da al multiplicar cada numero por num1
        int result1 = num1 * numero1;
        int result2 = num1 * numero2;
        int result3 = num1 * numero3;
        /* Estoy haciendo una variable multiplicando los dos numero que he pedido antes*/
        int resultado = num1*num2;
        //Y aqui estoy mostrando por pantalla todo el proceso de la multiplicacion
        System.out.println("El producto de la multiplicacion es: " + resultado);
        System.out.println("    " + num1 + "    ");
        System.out.println("  X " + num2 + "    ");
        System.out.println("-----------");
        System.out.println("    " + result3 + "    ");
        System.out.println("   " + result2 + "    ");
        System.out.println("  " + result1 + "    ");
        System.out.println("-----------");
        System.out.println(resultado);
    }
}
