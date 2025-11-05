package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bateria_vectores {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        /*
        //Ejercicio 1
        int resultado =0;
        int vector[] = new int[8];
        for (int i = 0; i<8;i++){
            vector[i] = aleatorio.nextInt(500+1);
            resultado += vector[i];
            System.out.println(vector[i]);
        }
        System.out.println("La suma de los elementos es: " + resultado);
        */
        /*
        //Ejercicio 2
        int vector[] = {1,2,3,4,5};
        int aux = 0;
        System.out.println("Array original: " + Arrays.toString(vector));
        for (int i =0;i<vector.length/2;i++){
            aux = vector[i];
            vector[i] = vector[vector.length-1-i];
            vector[vector.length-1-i] = aux;
        }
        System.out.println("Array invertido: " + Arrays.toString(vector));
       */
        /*
        //Ejercicio 3
        int vectores[] = new int[25];
        int contar = 0;
        System.out.println("Ingresa un numero para buscar [0,100]: ");
        int buscar = entrada.nextInt();
        for (int i = 0; i< vectores.length-1;i++){
            vectores[i]= aleatorio.nextInt(101);
        }
        for (int j = 0;j<vectores.length;j++){
            if (vectores[j]==buscar){
                contar++;
            }
        }
        System.out.println("El numero " +buscar+" aparece " +contar+ " veces en el array.");
        */
        /*
        //Ejercicio 4
        int cont = 0;
        int vec[] = new int[10];
        for (int i= 0;i<vec.length-1;i++){
            vec[i]=aleatorio.nextInt(11);
        }
        System.out.println("Array original: " + Arrays.toString(vec));
        System.out.println("Ingresa el indice a eliminar: ");
        int indice = entrada.nextInt();

        int vec2[] = new int[vec.length-1];
        for (int j=0;j<vec2.length;j++){
            if (indice!=j && cont==0){
                vec2[j]=vec[j];
            } else if (indice!=j && cont ==1) {
                vec2[j]=vec[j+1];
            } else{
                vec2[j]=vec[j+1];
                cont++;
            }
        }
        System.out.println("Array resultante: " + Arrays.toString(vec2));
        */
        /*
        //Ejercicio 5
        int vec[] = new int[5];
        for (int i = 0; i<vec.length;i++){
            vec[i] = aleatorio.nextInt(11);
        }
        int vec_rotado[] = new int [vec.length];
        for (int j = 0; j< vec.length-1;j++){

            vec_rotado[j]=vec[j+1];

        }
        vec_rotado[vec_rotado.length-1] = vec[0];
        System.out.println("Array original: " +Arrays.toString(vec));
        System.out.println("Array rotado: " + Arrays.toString(vec_rotado));
        */
        //Ejercicio 6
        int respuesta = 0;
        int vec[]= new int[aleatorio.nextInt(11)];
        System.out.println("El tamaño es: "+ vec.length);
        /*for (int i=0;i<vec.length-1;i++){
            System.out.println(i +" Ingresa un numero");
            respuesta = entrada.nextInt();
            vec[i]=respuesta;
        }*/
        int cont=0;
        for (int j=0;j< vec.length/2;j++){
            if (vec[j]==vec[vec.length-j]){
                 cont++;
            }
        }
        if (cont== vec.length/2){
            System.out.println("Es simetrico: SI");
        }else {
            System.out.println("Es simetrico: No");
        }
    }
}
