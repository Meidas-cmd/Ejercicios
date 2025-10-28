package org.example;

import java.util.Random;

public class Aleatorio {

    static void main() {

        Random aleatorio= new Random();
        int num_ale = aleatorio.nextInt(10) + 1;
        int num2 = (int)(aleatorio.nextDouble() * 100);
        int num3 = (int)(Math.random()*100);
        float ale=aleatorio.nextFloat();
        System.out.println(num3);
    }
}
