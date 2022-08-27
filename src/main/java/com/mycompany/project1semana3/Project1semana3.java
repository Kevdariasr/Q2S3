/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project1semana3;
import java.util.Scanner;
public class Project1semana3 {

    public static void main(String[] args) {
        System.out.println(System.in);
        Scanner leer = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int res = 0;
        System.out.println("Digite el primer numero: ");
        n1 = leer.nextInt();
        System.out.println("Digite el segundo numero: ");
        n2 = leer.nextInt();
        res = n1 + n2;
        System.out.println("Digite el resultado es: "+res);
    }
}
