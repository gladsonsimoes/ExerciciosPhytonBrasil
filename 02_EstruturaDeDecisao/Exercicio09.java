package com.company.exercicio_estruturadedecisao;

//Faça um Programa que leia três números e mostre-os em ordem decrescente.

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3; //variaveis
        System.out.println("Digite o primeiro numero: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        num3 = scanner.nextInt();
        //Decrescente = do último ate o primeiro!
        if (num1 > num2 & num1 > num3) { //terceira ordem
            System.out.println(+num1);
        } else if (num2 > num1 & num2 > num3) {
            System.out.println(+num2);
        } else if (num3 > num1 & num3 > num2) {
            System.out.println(+num3);
        }
        if (num1 != num2 & num1 != num3) { //segunda ordem
            System.out.println(+num1);
        } else if (num2 != num1 & num2 != num3) {
            System.out.println(+num2);
        } else if (num3 != num1 & num3 != num2) {
            System.out.println(+num3);
        }
        if (num1 < num2 & num1 < num3) { //primeira ordem
            System.out.println(+num1);
        } else if (num2 < num1 & num2 < num3) {
            System.out.println(+num2);
        } else if (num3 < num1 & num3 < num2) {
            System.out.println(+num3);


        }
    }
}
