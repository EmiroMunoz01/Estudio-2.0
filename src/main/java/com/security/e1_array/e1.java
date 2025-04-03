package com.security.e1_array;

import java.util.Scanner;

public class e1 {

// Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el indice y el valor al que corresponde.
// Haz dos métodos, uno para rellenar valores y otro para mostrar.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el numero de elementos del array: ");
        //aqui se determina la longitud del array
        int longitudArray = sc.nextInt();

        //aqui se declara el array
        int num[] = new int[longitudArray];

        rellenarArray(num);
        mostrarArray(num);
    }

    public static void rellenarArray(int[] arr) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingrese el valor " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
    }

    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("El valor #" + (i + 1) + " del array es = " + arr[i]);
        }
    }


}
