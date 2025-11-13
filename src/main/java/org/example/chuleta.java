package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class chuleta {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Integer vec[] = {10,2,4,80,1};
        //Para ver si el vector tiene algo Arrays.Aslist().contains()
        System.out.println(Arrays.asList(vec).contains(10));
        //Para ordenar Arrays.sort()
        Arrays.sort(vec);
        System.out.println(Arrays.toString(vec));
        // Busqueda binaria binarySearch() deberian de ser del mismo formato
        int pos = Arrays.binarySearch(vec, 4);
        System.out.println(pos);

    }
}
