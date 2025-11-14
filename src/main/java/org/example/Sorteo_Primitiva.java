package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sorteo_Primitiva {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        Integer boleto[] = new Integer[6];
        Integer complementario[] = {aleatorio.nextInt(49)+1};
        Integer reintegro[] = {aleatorio.nextInt(10)};
        Integer boleto_final[] = new Integer[8];
        String boleto_usu[] = new String[7];
        Integer boleto_usu_final[]= new Integer[7];
        boolean confirmado = false;
        String boleto_usuario="";
        int sub_boleto=0;
        boolean comprobar = true;
        int aciertos = 0;
        int reintegro_acierto= 0;
        while (confirmado==false) {
            System.out.println("Introduce tu boleto:(N-N-N-N-N-N/R):");
            boleto_usuario = entrada.next();
            confirmado = boleto_usuario.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}");
        }
        boleto_usu = boleto_usuario.split("[-/]");
        for (int i = 0; i < boleto.length; i++) {
                boleto[i] = aleatorio.nextInt(1, 50);
        }
        Arrays.sort(boleto);
        while (comprobar){
            comprobar = false;
            for (int i=0;i<boleto.length;i++){
                if (i  != boleto.length-1 && boleto[i]==boleto[i+1]){
                    boleto[i] = aleatorio.nextInt(11);
                    comprobar = true;
                }
            }
        }
        comprobar = false;
        while (comprobar){
            comprobar = false;
            for (int i = 0;i<boleto.length;i++){
                if (boleto[i] == complementario[0]){
                    complementario[0]=aleatorio.nextInt(49)+1;
                    comprobar = true;
                    i=0;
                }
            }
        }
        for (int i = 0;i<boleto_usu.length;i++){
            boleto_usu_final[i] = Integer.parseInt(boleto_usu[i]);
        }
        for (int i = 0 ; i<boleto_final.length;i++){
            if (i<6){
                boleto_final[i]= boleto[i];
            }else if (i==6){
                boleto_final[i] = complementario[0];
            } else {
                boleto_final[i] = reintegro[0];
            }
        }
        Arrays.sort(boleto_usu);
        for (int i = 0;i<boleto_usu.length-1;i++){
            for (int j = 0 ; j<boleto_final.length-1;j++){
                if (boleto_usu_final[i]==boleto_final[j]){
                    aciertos++;
                }
            }
        }

        System.out.println(Arrays.toString(boleto_usu));
        System.out.println(Arrays.toString(boleto));
        System.out.println("Complementario: " + Arrays.toString(complementario));
        System.out.println("Reintegro: " + Arrays.toString(reintegro));
        System.out.println("Boleto final: " + Arrays.toString(boleto_final));
        System.out.println(" ");
        System.out.println("Resultado: ");
        System.out.println(aciertos + " aciertos");
        if (reintegro.equals(boleto_final[7])){
            System.out.println("Reintegro.");
        }else {
            System.out.println("No Reintegro.");
        }
    }
}
