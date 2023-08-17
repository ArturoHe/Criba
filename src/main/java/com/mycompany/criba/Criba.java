//Author: Arturo Herrera

package com.mycompany.criba;

import java.util.ArrayList;

public class Criba {

    public static void main(String[] args) {

        int a = 1; //Numero inicio NO CAMBIAR
        
        int b = 100; //Numero final (Cambiar este para el ultimo numero que queremos evaluar)
        
        ArrayList<Integer> primos = new ArrayList<>(); //ArrayList donde se guardan los numeros primos que se encuentran

        //
        //Aqui se evalua cada numero desde el 1 hasta el ultimo, en este caso b=100
        for (int i = a; i <= b; i++) {

            if (primos.isEmpty()) {

                primos.add(i);//Anade el 1 para comenzar a evaluar los numeros

            } else {

                //Variable que nos sirve para mirar si hay 1 solo divisor del numero evaluado
                int cantidadDivisores = 0;

                //Aqui se recorre la lista de primos buscando si son divisores del numero que esta siendo evaluado
                for (int j = 0; j < primos.size(); j++) {

                    if (i % primos.get(j) == 0) {

                        
                        cantidadDivisores++;

                    }

                    //Si hay mas de 1 divisor se rompe el ciclo y evalua el numero siguiente (para optimizar tiempo y no gastar recursos)
                    if (cantidadDivisores > 1) {

                        break;
                    }
                }
                
                //Si solo hay 1 divisor del numero, se agrega a los primos
                if (cantidadDivisores == 1) {

                    primos.add(i);

                    //Se imprime cada vez que encuentra un numero primo
                    System.out.println("Numero primo encontrado:" + i);

                }

            }

        }

        //Eliminamos el 1 de la lista de primos
        primos.remove(0);

        //Se imprime la cantidad total de numeros primos que hay de 1 a b
        System.out.println("Cantidad total de numeros primos entre " + a + " y " + b + " = " + primos.size());

    }

}
