package com.company.exercicio_estruturadedecisao;

//Faça um Programa que leia três números e mostre o maior deles

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Digite o terceiro numero: ");
        double numero3 = scanner.nextDouble();

        if (numero1>numero2 && numero1>numero3) { //o && para E 
            System.out.println("o primeiro numero e o maior");//numero1>numero2
        } else if (numero2>numero1 && numero2>numero3) {
            System.out.println("o segundo numero e o maior");//numero2>numero1
        } else if (numero3>numero1 && numero3>numero2){
            System.out.println("o terceiro numero e o maior");//numero3>numero1
        }

    }
}
