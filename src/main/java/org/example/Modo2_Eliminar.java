package org.example;
import java.util.Arrays;

public class Modo2_Eliminar {
    static void main() {
        int tamanyo=0;
        int j=0;
        int orginal[]={1,2,2,3,4,4,5,6};
        for (int i = 0; i < orginal.length; i++) {
            if (orginal[i]!=orginal[i+1]){
                orginal[i]=-1000;
            }
        }
        System.out.println(Arrays.toString(orginal));
        int limpio[]=new int[tamanyo];
        for (int i = 0; i < orginal.length; i++) {
            if (orginal[i]!=-1000){
                limpio[j]=orginal[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(limpio));
    }
}
