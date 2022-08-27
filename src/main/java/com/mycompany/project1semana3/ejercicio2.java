
package com.mycompany.project1semana3;

import java.util.Scanner;


public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println(System.in);
        Scanner leer = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        double promedio;
        System.out.println("Digite el primer numero: ");
        n1 = leer.nextInt();
        System.out.println("Digite el segundo numero: ");
        n2 = leer.nextInt();
        System.out.println("Digite el tercer numero: ");
        n3 = leer.nextInt();
        promedio = (n1+n2+n3)/3;
        System.out.println("Digite el resultado es: "+ promedio);
    }
}
