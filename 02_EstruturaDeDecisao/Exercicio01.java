package com.company.exercicio_estruturadedecisao;

import java.util.Scanner;

//Faça um Programa que peça dois números e imprima o maior deles.

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite outro numero: ");
        double numero2 = scanner.nextDouble();
        boolean maior = (numero1 > numero2);
        if (maior) {
            System.out.println("O valor do numero 1 é maior! " + numero1);
        } else {
            System.out.println("O valor do numero 2 é maior! " + numero2);
        }
        scanner.close();
    }
}
