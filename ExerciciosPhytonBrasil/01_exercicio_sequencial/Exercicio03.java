package com.company.exercicio_sequencial;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite outro numero: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma dos dois numeros é: " + soma);

    }
}
