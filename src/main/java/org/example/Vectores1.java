package org.example;

import java.util.Arrays;

public class Vectores1 {
    static void main() {
        int vectores[]={10,5,8,10};
        String vec[] = new String[8];
        String vec2[] = new String[8];
        System.out.println(Arrays.toString(vectores));
        System.out.println(vectores.length);
        System.out.println(vectores[2]);
         vectores[2] = 90;
        System.out.println(vectores[2]);
        vec = vec2.clone();
        System.out.println(vec);
        System.out.println(vec2);
        for (int i = vectores.length-1;i>=0;i--){
            System.out.println(vectores[i]);
        }
    }
}
