package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class pruebas_primitiva {

    static void main() {
        //Creo esto para poder leer el boleto del usuario y generar números aleatorios
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        //Aquí defino los vectores que voy a usar
        Integer boleto[] = new Integer[6];          // vector para los 6 números principales del sorteo
        Integer complementario[] = new Integer[1]; // vector para el número complementario
        Integer reintegro[] = new Integer[1];      // vector para el reintegro
        Integer boleto_final[] = new Integer[8];   // vector final con 6+complementario+reintegro

        String boleto_usuario;                      // variable para leer el boleto del usuario
        boolean confirmado = false;                 // variable para controlar que el formato sea correcto
        Integer boleto_usu_final[] = new Integer[7]; // vector para guardar los números que el usuario introdujo

        //He creado un while para seguir preguntando hasta que el formato sea correcto y los números estén en rango
        while (!confirmado) {
            //Pido al usuario que introduzca el boleto
            System.out.println("Introduce tu boleto (N-N-N-N-N-N/R):");
            boleto_usuario = entrada.next();

            //Compruebo que el formato sea correcto usando matches
            boolean formatoCorrecto = boleto_usuario.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}");

            if (formatoCorrecto) {
                //Si el formato es correcto, lo convierto a enteros
                String[] partes = boleto_usuario.split("[-/]");
                boolean rangoValido = true; // variable para validar que todos los números estén en rango

                for (int i = 0; i < 6; i++) {
                    int num = Integer.parseInt(partes[i]);
                    //Capamos los números a 1-49
                    if (num < 1 || num > 49) {
                        rangoValido = false;
                        break;
                    }
                    boleto_usu_final[i] = num;
                }

                //Capamos el reintegro a 0-9
                int reintegroUsuario = Integer.parseInt(partes[6]);
                if (reintegroUsuario < 0 || reintegroUsuario > 9) {
                    rangoValido = false;
                }
                boleto_usu_final[6] = reintegroUsuario;

                //Si todo es correcto, confirmamos
                if (rangoValido) {
                    confirmado = true;
                } else {
                    System.out.println("Uno o varios números están fuera de rango. Intenta de nuevo.");
                }

            } else {
                System.out.println("Formato incorrecto. Intenta de nuevo.");
            }
        }

        //Ahora genero los 6 números del sorteo sin que se repitan
        for (int i = 0; i < 6; i++) {
            int num;
            boolean repetido;
            do {
                num = aleatorio.nextInt(49) + 1; // números entre 1 y 49
                repetido = false;
                //Compruebo que el número no esté repetido en el vector
                for (int j = 0; j < i; j++) {
                    if (boleto[j].equals(num)) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
            boleto[i] = num;
        }

        Arrays.sort(boleto);

        //Genero el número complementario, asegurándome de que no esté entre los 6 números
        int comp;
        boolean repetido;
        do {
            comp = aleatorio.nextInt(49) + 1; // números entre 1 y 49
            repetido = false;
            for (int i = 0; i < boleto.length; i++) {
                if (boleto[i].equals(comp)) {
                    repetido = true;
                    break;
                }
            }
        } while (repetido);
        complementario[0] = comp;

        //Genero el reintegro, que va del 0 al 9
        reintegro[0] = aleatorio.nextInt(10);

        //Creo el boleto final combinando los 6 números, el complementario y el reintegro
        for (int i = 0; i < 6; i++) {
            boleto_final[i] = boleto[i];
        }
        boleto_final[6] = complementario[0];
        boleto_final[7] = reintegro[0];

        //Ahora cuento cuántos aciertos tiene el usuario en los 6 números principales
        int aciertos = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (boleto_usu_final[i].equals(boleto[j])) {
                    aciertos++;
                }
            }
        }

        //Compruebo si ha acertado el complementario
        boolean acierto_complementario = false;
        for (int i = 0; i < 6; i++) {
            if (boleto_usu_final[i].equals(complementario[0])) {
                acierto_complementario = true;
                break;
            }
        }

        //Compruebo si ha acertado el reintegro
        boolean acierto_reintegro = boleto_usu_final[6].equals(reintegro[0]);

        //Muestro todos los resultados del sorteo
        System.out.println("=== RESULTADOS DEL SORTEO ===");
        System.out.println("Tu boleto:        " + Arrays.toString(boleto_usu_final));
        System.out.println("Números premiados:" + Arrays.toString(boleto));
        System.out.println("Complementario:   " + complementario[0]);
        System.out.println("Reintegro:        " + reintegro[0]);
        System.out.println("Boleto final:     " + Arrays.toString(boleto_final));

        //Determino la categoría de premio según los aciertos
        System.out.println("=== RESULTADO ===");
        if (aciertos == 6 && acierto_reintegro) {
            System.out.println("¡Categoría Especial! Has acertado 6 números + reintegro.");
        } else if (aciertos == 6) {
            System.out.println("1ª Categoría: Has acertado los 6 números.");
        } else if (aciertos == 5 && acierto_complementario) {
            System.out.println("2ª Categoría: Has acertado 5 números + complementario.");
        } else if (aciertos == 5) {
            System.out.println("3ª Categoría: Has acertado 5 números.");
        } else if (aciertos == 4) {
            System.out.println("4ª Categoría: Has acertado 4 números.");
        } else if (aciertos == 3) {
            System.out.println("5ª Categoría: Has acertado 3 números.");
        } else if (acierto_reintegro) {
            System.out.println("Has acertado el reintegro.");
        } else {
            System.out.println("No premiado.");
        }
    }
}
