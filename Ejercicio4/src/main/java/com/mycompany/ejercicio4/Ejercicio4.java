package com.mycompany.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        double suma;
        double resta;
        double multiplicacion;
        double division;
        
        System.out.println("Digite el primer numero:");
        Scanner leer = new Scanner(System.in);
        numero1 = leer.nextInt();
        
        System.out.println("Digite el segundo numero:");
        numero2 = leer.nextInt();
        
        suma = (numero1 + numero2);
        resta = (numero1 - numero2);
        multiplicacion = (numero1 * numero2);
        division = (numero1 / numero2);
        
        System.out.println("El resultado de la suma es:" +suma);
        System.out.println("El resultado de la resta es:" +resta);
        System.out.println("El resultado de la multiplicacion es:" +multiplicacion);
        System.out.println("El resultado de la division es:" +division);
        
    }
}
