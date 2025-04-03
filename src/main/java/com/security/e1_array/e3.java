package com.security.e1_array;
//Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media.

public class e3 {

    public static void main(String[] args) {

        int array[] = new int[100];

        rellenarArreglo(array);

        mostrarValoresArreglo(array);

        sumarValoresArreglo(array);
    }

    public static void rellenarArreglo(int array[]) {

        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

    }

    public static void sumarValoresArreglo(int array[]) {

        int suma = 0;

        for (int i = 0; i < array.length; i++) {

            suma = suma + array[i];

        }

        System.out.println("La suma es de = " + suma);

    }

    public static void mostrarValoresArreglo(int array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.println("Valor #" + (i + 1) + " = " + array[i]);

        }
    }

}
