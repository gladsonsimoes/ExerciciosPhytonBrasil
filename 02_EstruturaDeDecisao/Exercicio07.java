package com.company;
// Faça um Programa que leia três números
// e mostre o maior e o menor deles.

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numero1, numero2, numero3;
        System.out.print("Digite o 1° numero: ");
        numero1 = scanner.nextFloat();
        System.out.print("Digite o 2° numero: ");
        numero2 = scanner.nextFloat();
        System.out.print("Digite o 3° numero: ");
        numero3 = scanner.nextFloat();
        //variaveis do tipo boolean para o maior numero:
        boolean primeiroNumeroMaior = numero1 > numero2 & numero1 > numero3;
        boolean segundoNumeroMaior = numero2 > numero1 & numero2 > numero3;
        boolean terceiroNumeroMaior = numero3 > numero1 & numero3 > numero2;
        //estrutura de decisao para escolher a variavel do numero maior:
        if (primeiroNumeroMaior) {
            System.out.println("\nO Maior numero é o primeiro , numero: " + numero1);
        } else if (segundoNumeroMaior) {
            System.out.println("\nO Maior numero é o segundo , numero: " + numero2);
        } else if (terceiroNumeroMaior){
            System.out.println("\nO Maior numero é o terceiro , numero: " + numero3);
        }
        //variaveis do tipo boolean para o menor numero:
        boolean primeiroNumeroMenor = numero1 < numero2 & numero1 < numero3;
        boolean segundoNumeroMenor = numero2 < numero1 & numero2 < numero3;
        boolean terceiroNumeroMenor = numero3 < numero1 & numero3 < numero1;
        //estrutura de decisao para escolher a variavel do menor numero:
        if (primeiroNumeroMenor){
            System.out.println("\nO Menor numero é o primeiro , numero: " + numero1);
        } else if (segundoNumeroMenor){
            System.out.println("\nO Menor numero é o segundo , numero: " + numero2);
        } else if (terceiroNumeroMenor){
            System.out.println("\nO Menor numero é o terceiro , numero: " + numero3);
        }
        else {
            System.out.println("\nOs numeros informados são iguais");
        }
        scanner.close();
    }
}
