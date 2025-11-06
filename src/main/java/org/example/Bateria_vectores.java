package org.example;

import java.lang.reflect.Array;
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
        /*
        //Ejercicio 6
        int respuesta = 0;
        int vec[]= {1,2,3,2,1};
        int cont=0;
        for (int j=0;j< (vec.length-1)/2;j++){
            if (vec[j]==vec[vec.length-1-j]){
                 cont++;
            }
        }
        if (cont== vec.length/2){
            System.out.println("Es simetrico: SI");
        }else {
            System.out.println("Es simetrico: No");
        }
        */
        /*
        //Ejercicio 7
        int vec[] = new int[3];
        int vec1[] = new int[3];
        for (int i=0 ;i<vec.length;i++){
            vec[i] = aleatorio.nextInt(11);
        }
        for (int j = 0; j< vec1.length;j++){
            vec1[j] = aleatorio.nextInt(11);
        }
        int vec_total[] = new int[vec.length+vec1.length];
        for (int z=0; z< vec_total.length;z++){
            if (z >=vec.length) {
                vec_total[z] = vec1[z-3];
            } else {
                vec_total[z] = vec[z];
            }
        }
        System.out.println("Array 1: " + Arrays.toString(vec));
        System.out.println("Array 2: " + Arrays.toString(vec1));
        System.out.println("Array combinado: "  + Arrays.toString(vec_total));
        */
        /*
        //Ejercicio 8
        int vec[] = new int[aleatorio.nextInt(11)];
        for (int i=0; i< vec.length;i++){
            vec[i]= aleatorio.nextInt(11);
        }
        System.out.println("Array original: " + Arrays.toString(vec));
        System.out.println("Que numero quieres que insterte: ");
        int num = entrada.nextInt();
        System.out.println("En que posicion: ");
        int pos = entrada.nextInt();
        int vec1[]=new int[vec.length+1];
        for (int j=0;j<vec1.length;j++){
            if (j == pos){
                vec1[j]=num;
            } else if (j>pos) {
                vec1[j]=vec[j-1];
            }else {
                vec1[j]=vec[j];
            }
        }
        System.out.println("Array resultante: " + Arrays.toString(vec1));
        */
        /*
        //Ejercicio 9
        String vec[] = new String[aleatorio.nextInt(2,6)];
        System.out.println(vec.length);
        for (int i = 0;i< vec.length;i++){
            System.out.println("Dame una palabra para el array: ");
            vec[i] = entrada.next();
        }
        int tam = 0;
        int pos =0;
        for (int j =0;j<= vec.length;j++){
            if (j== vec.length){
                continue;
            }else {
            tam = vec[pos].length();
                if (vec[j].length()>tam){
                    pos = j;
                }
            }
        }
        for (int z=0;z< vec.length;z++){
            if (z==pos){
                System.out.println(vec[z]);
            }
        }
        */
        /*
        //Ejercicio 10
        System.out.println("Que tamaño quieres que tenga el array: ");
        int tamanyo = entrada.nextInt();
        String vec[] = new String[tamanyo];
        for (int i = 0;i< vec.length;i++){
            System.out.println("Dame una palabra para el array: ");
            vec[i] = entrada.next();
        }
        System.out.println("Que letra quieres que busque: ");
        char letra = entrada.next().charAt(0);
        String pos ="";
        for (int i =0;i<tamanyo;i++){
            if (vec[i].charAt(0) == letra){
                pos += " " + vec[i];
            }
        }
        System.out.println("Las palabras que empiezan por " + letra + " son las siguientes:" + pos);
        */
    }
}
