package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Elige el ejercicio que quieras: ");
        int opcion = sc.nextInt();
        switch (opcion) {

            case 1: Ejercicios.ex1();
                break;
            case 2: Ejercicios.ex2();
                break;
            case 3: Ejercicios.ex3();
                break;
            case 4: Ejercicios.ex4();
                break;
            case 5: Ejercicios.ex5();
                break;
            case 6: Ejercicios.ex6();
                break;
            case 7: Ejercicios.ex7();
                break;
            case 8: Ejercicios.ex8();
                break;
            case 9: Ejercicios.ex9();
                break;
            case 10: Ejercicios.ex10();
                break;
            case 11: Ejercicios.ex11();
                break;
            case 12: Ejercicios.ex12();
                break;
        }
    }
}
