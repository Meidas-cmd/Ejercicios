package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculadora_simple {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        //Son constantes y una variable
        double resultado = 0;
         final int CERO = 0;
         String raiz = "r";
         double oper2 = 0;
         double oper1 = 0;
        boolean estado = true;
        //mensaje de bienvenida
        System.out.println("Bienvenido a la calculadora simple de Jorge Cuartero");
        // Estoy pidiendo el primer operador y lo estoy guardando en oper1 y controlando el error con un try catch y un bucle para volver a pedirlo
        do {
            try {
                System.out.println("Dame el primer operador en formato numerico");
                oper1 = entrada.nextDouble();
                estado = false;
            }catch (InputMismatchException e){
                entrada.nextLine();
            }
       }while (estado);
        estado = true;

        //Menu del signo para operar
        System.out.println("------------------");
        System.out.println("Que operacion quieres realizar(pon el signo solo)");
        System.out.println("[+] --> sumar");
        System.out.println("[-] --> restar");
        System.out.println("[x] --> multiplicar");
        System.out.println("[/] --> dividir");
        System.out.println("[R] --> raiz cuadrada");
        System.out.println("------------------");
        System.out.println("Elige un operador");
        String signo = entrada.next();
        //Aqui estoy haciendo un if para pedir el segundo operador en caso de que no sea raiz
        if (signo.toLowerCase() != raiz){
            //control de errores igual que en el primero
            do {
                try {
                    System.out.println("Dame el segundo operador en formato numerico");
                    oper2 = entrada.nextDouble();
                    estado = false;
                }catch (InputMismatchException e){
                    entrada.nextLine();
                }
            }while (estado);
        }
        //Aqui segun el signo le mando al case con su operacion y lo muestra en pantalla
        switch (signo.toLowerCase()){
            case "+":
                //Este es para suma
                resultado = oper1+oper2;
                System.out.println("El resultado de " + oper1 + "+" + oper2 +" es " + resultado);
                break;
            case "-":
                //Este es para resta
                resultado = oper1-oper2;
                System.out.println("El resultado de " + oper1 + "-" + oper2 +" es " + resultado);
                break;
            case "x":
                //Este case es pa multiplicacion
                resultado = oper1*oper2;
                System.out.println("El resultado de " + oper1 + "*" + oper2 +" es " + resultado);

                break;
            case "/":
                //Aqui en division estoy haciendo un if para que ninguno de los dos operadores sea 0
                if (oper2 != CERO && oper1 != CERO) {
                    resultado = oper1 / oper2;
                    System.out.println("El resultado de " + oper1 + "/" + oper2 + " es " + resultado);
                }else {
                    System.out.println("No se puede dividir entre 0 ni dividir 0");
                }
                break;
            case "r":
                //Aqui mas o menos lo mismo pero que no sirva numeros negativos tambien
                if (  oper1 > CERO) {
                    resultado = Math.sqrt(oper1);
                    System.out.println("La raiz cuadrada de " + oper1 + " es " + resultado);
                }else {
                    System.out.println("No se puede hacer la raiz cuadrada de 0 ni de negativos");
                }
                break;
            default:
                //Este es pa cualquier otra respuesta del usuario
                System.out.println("No podemos realizar esa operacion");
                break;
        }


    }
}