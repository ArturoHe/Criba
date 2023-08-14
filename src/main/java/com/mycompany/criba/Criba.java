package com.mycompany.criba;

import java.util.ArrayList;

public class Criba {

    public static void main(String[] args) {

        int a = 1;
        int b = 10000000;
        ArrayList<Integer> primos = new ArrayList<>();

        for (int i = a; i <= b; i++) {

            if (primos.isEmpty()) {

                primos.add(i);

            } else {

                int cantidadDivisores = 0;

                for (int j = 0; j < primos.size(); j++) {

                    if (i % primos.get(j) == 0) {

                        cantidadDivisores++;

                    }

                    if (cantidadDivisores > 1) {

                        break;
                    }
                }
                if (cantidadDivisores == 1) {

                    primos.add(i);

                    System.out.println("Numero primo encontrado:" + i);

                }

            }

        }

        primos.remove(0);

        System.out.println("Cantidad total de numeros primos entre " + a + " y " + b + " = " + primos.size());

    }

}
