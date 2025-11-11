package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ruleta {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        final String COLOR[]= {"rojo","negro"};
        Integer num[] = new Integer[37];
        final String PAR[] = {"par","impar"};
        for (int i = 0; i<=36;i++) {
            num[i] =i;
        }
        System.out.println("Introduce un numero: ");
        Integer resp = entrada.nextInt();
        if(Arrays.asList(num).contains(resp)){
            System.out.println("Si esta");
        }else {
            System.out.println("Error");
            return;
        }
        if (resp==0) {
            return;
        }
        System.out.println("Dime un color: ");
        String col = entrada.next();
        if (!Arrays.asList(COLOR).contains(col.toLowerCase())){
            System.out.println("Erro");
            return;
        }


        System.out.println("Dime par o impar: ");
        String impar = entrada.next();
        if (!Arrays.asList(PAR).contains(impar)){
            System.out.println("Error");
            return;
        }
        int crupier = num[aleatorio.nextInt(37)];
        String crupier_color = COLOR[aleatorio.nextInt(2)];
        String par_impar = crupier % 2 == 0 ? "par" : "impar";
        System.out.println("Ha salido " + crupier + " " + crupier_color + " " + par_impar);
        if (crupier == resp || crupier_color.equals(col) || par_impar.equals(impar)){
            System.out.println("Has ganado. ");
        } else if (crupier == resp) {
            System.out.println("Has acertado el numero");
        } else if (par_impar.equals(impar)) {
            System.out.println("Has acertado " + impar);
        } else if (crupier_color.equals(col)) {
            System.out.println("Has acertado " + col);
        }
    }
}
