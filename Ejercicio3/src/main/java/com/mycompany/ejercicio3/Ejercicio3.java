package com.mycompany.ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        
        double gradosC;
        double gradosF;
        
        System.out.println("Digite la temperatura en °C: ");
        Scanner leer =new Scanner(System.in);
        gradosC = leer.nextInt();
        
        gradosF = ((gradosC*1.8)+32);
        System.out.println("El resultado del promedio es: " + gradosF);

    }
}
