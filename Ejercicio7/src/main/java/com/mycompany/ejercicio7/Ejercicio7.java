package com.mycompany.ejercicio7;
import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int cantidad;
        float precio;
        float importe;
        
        System.out.println("Ingrese la cantidad de articulos a llevar: ");
        cantidad=teclado.nextInt();
        
        System.out.println("Ingrese el valor unitario del producto: ");
        precio=teclado.nextFloat();
        
        importe=precio * cantidad;
        
        System.out.println("El importe total a pagar es: " + importe);
    }
}
