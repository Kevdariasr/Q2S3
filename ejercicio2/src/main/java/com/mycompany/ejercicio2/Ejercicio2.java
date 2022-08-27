package com.mycompany.ejercicio2;

import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
       
        //int nota1;
        //int nota2;
        //int nota3;
        //double promedio;
        
        //System.out.println("Digite el primer numero");
        Scanner leer = new Scanner(System.in);
        //nota1 = leer.nextInt();
       
        //System.out.println("Digite el segundo numero");
        //nota2 = leer.nextInt();
        
        //System.out.println("Digite el tercer numero");
        //nota3 = leer.nextInt();
        
        //promedio = (nota1 + nota2 + nota3)/3;
        //System.out.println("El resultado es: " +promedio);
        
        
        
        
        
        
        String nombre;
        int cedula;
        int edad;
        int sxH;
        int horastrabajadas;
        
        float salarioganado;
        
        System.out.println("Digite su nombre: ");
        
        nombre = leer.next();
        
        System.out.println("Digite su numero de identificacion: ");
        cedula= leer.nextInt();
        
        System.out.println("Digite su edad");
        edad = leer.nextInt();
        
        System.out.println("Digite digite su salario por hora: ");
        sxH = leer.nextInt();
        
        System.out.println("Digite las horas trabajadas: ");
        horastrabajadas = leer.nextInt();
        
        
        salarioganado = (sxH * horastrabajadas);
        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Cedula: " + cedula + "\n" + "Salario total: " + salarioganado);
        salarioganado = leer.nextInt();
    }
}
