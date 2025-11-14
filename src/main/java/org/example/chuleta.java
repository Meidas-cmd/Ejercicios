package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class chuleta {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Integer vec[] = {10,2,4,80,1};
        int numeros[] = {90,23,11,11,23,90};
        //Para ver si el vector tiene algo Arrays.Aslist().contains()
        System.out.println(Arrays.asList(vec).contains(10));
        //Para ordenar Arrays.sort()
        Arrays.sort(vec);
        System.out.println(Arrays.toString(vec));
        // Busqueda binaria binarySearch() deberian de ser del mismo formato
        int pos = Arrays.binarySearch(vec, 4);
        System.out.println(pos);
        //Para quitar numeros repetidos en vectores Arrays.stream().distinc().ToArray();
        int limpio[] = Arrays.stream(numeros).distinct().toArray();
        System.out.println(Arrays.toString(limpio));

    }
}
