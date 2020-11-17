package com.company;

import java.util.Scanner;

public class Ejercicios {

    public static void ex1() {

        System.out.print("Introduzca un número: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
    }
    public static void ex2() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int num = sc.nextInt();

        while (num > 0) {
            System.out.print("Introduzca un número: ");
            num = sc.nextInt();
        }
    }
    public static void ex3() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        while (num != 0) {

            if (num < 0) {
                System.out.println("El número introducido es negativo");
            } else {
                System.out.println("El número introducido es positivo");
            }
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
        }
    }
    public static void ex4() {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        while (num % 2 != 0){

            System.out.println(num + " no es múltiplo de 2");
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
        }
        System.out.println(num + " es múltiplo de 2");
    }
    public static void ex5() {

        Scanner sc = new Scanner(System.in);
        int num;
        int num2;
        int counter = 0;
        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        while (num > 0){
            counter++;
            System.out.println(num + " es positivo");
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
        }
        System.out.println("Se han introducido " + counter + " números positivos");
    }
    public static void ex6() {

        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 0;
        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        while (num != 0){

            suma += num;
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
        }
        System.out.println("La suma de estos números es " + suma);
    }
    public static void ex7() {

        Scanner sc = new Scanner(System.in);
        int num;
        int mitjana;
        int contador = 0;
        int suma = 0;
        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        while (num != 0){
            contador++;
            suma += num;
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
        }
        mitjana = suma/contador;
        System.out.println("La media de estos números es " + mitjana);
    }
    public static void ex8() {

        int number = 10;
        int mult = 1;

        for (int i = 0; i < number; i++) {
            if (i % 2 != 0) {
                mult *= i;
            }
        }
        System.out.println("La multiplicació dels primers números senars és " + mult);
    }
    public static void ex9() {

        Scanner sc = new Scanner(System.in);

        int numOcult = 12;
        int counter = 0;

        System.out.print("Introduzca un número: ");
        int num = sc.nextInt();

        while (num != numOcult){
            counter++;
            if (num < numOcult){
                System.out.println("El número que ha introducido es menor al oculto");
            }
            else {
                System.out.println("El número que ha introducido es mayor al oculto");
            }
            System.out.println("Introduzca un número: ");
            num = sc.nextInt();
        }
        System.out.println("Lo ha intentado " + counter + " veces");

    }
    public static void ex10() {

        Scanner sc = new Scanner(System.in);

        int num;
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Escribe un número");
            num = sc.nextInt();
            if (num < 0){
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println("Se han introducido " + counter + " números negativos");
        }
        else {
            System.out.println("No se han introducido números negativos");
        }
    }
    public static void ex11() {

        Scanner sc = new Scanner(System.in);
        int num;
        int highNum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe un número: ");
            num = sc.nextInt();
            if (num > highNum){
                highNum = num;
            }

        }
        System.out.println("El número más grande es " + highNum);
    }
    public static void ex12() {

        Scanner sc = new Scanner(System.in);
        int nota;
        int countfail = 0;
        int mitj;
        int suma = 0;
        int countmitj = 0;
        int aprobados = 0;
        int failers = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("Escribe una nota: ");
            nota = sc.nextInt();
            if (nota < 0){
                countfail++;
            }
            if (nota > 10){
                countfail++;
            }
            if (nota > 0 & nota < 10) {
                countmitj++;
                suma += nota;
                if (nota > 5){
                    aprobados++;
                }
                else {
                    failers++;
                }
            }
        }
        mitj = suma/countmitj;

        System.out.println("Hay " + aprobados + " aprobados");
        System.out.println("...........................");
        System.out.println("Hay " + failers + " suspendidos");
        System.out.println("...........................");
        if (countfail > 0){
            System.out.println("Has introducido " + countfail + " notas mal");
            System.out.println("...........................");
        }
        System.out.println("La media de las notas es " + mitj);


    }
}