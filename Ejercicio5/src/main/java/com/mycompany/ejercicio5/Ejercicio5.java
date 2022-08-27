package com.mycompany.ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
        double radio;
        double area;
        final double PI = 3.141592;
        
        System.out.println("Digite el radio del circulo:");
        Scanner leer = new Scanner(System.in);
        radio = leer.nextDouble();
        area = (PI * radio * radio);
        
        System.out.println("El resultado del area es: " + area);
        
    }
}
