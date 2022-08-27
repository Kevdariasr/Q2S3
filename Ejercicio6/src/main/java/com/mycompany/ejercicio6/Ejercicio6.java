package com.mycompany.ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int lado,perimetro;
       
        System.out.println("ingrese el lado del cuadrado:");
        lado=teclado.nextInt();
        perimetro=lado *4;
        
        System.out.print("El perimetro del cuadrado es:");
        System.out.print(perimetro);
        
    }
}
