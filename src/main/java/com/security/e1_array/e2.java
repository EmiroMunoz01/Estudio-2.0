package com.security.e1_array;

//Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posición y la suma de todos los valores. Haz un método para rellenar el array (que tenga como parámetros los números entre los que tenga que generar), para mostrar el contenido y la suma del array y un método privado para generar número aleatorio (lo puedes usar para otros ejercicios).

import java.util.Random;
import java.util.Scanner;

public class e2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el numero de elementos del array: ");
        //aqui se determina la longitud del array
        int longitudArray = sc.nextInt();

        //aqui se declara el array
        int num[] = new int[longitudArray];

        rellenarNumAleatorioArray(num, 10);
        mostrarArray(num);
    }

    public static void rellenarNumAleatorioArray(int lista[], int a) {

        Random r = new Random();
        for (int i = 0; i < lista.length; i++) {
            //Generamos un número entre los parametros pasados
            lista[i] = r.nextInt(a) + 1;
        }
    }

    public static void mostrarArray(int[] arr) {

        int sumaNumeros = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("El valor #" + (i + 1) + " del array es = " + arr[i]);
            sumaNumeros += arr[i];
        }

        System.out.println("La suma de todos los valores es de = " + sumaNumeros);
    }
}
