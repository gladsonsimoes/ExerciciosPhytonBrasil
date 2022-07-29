package com.company.EstruturaDeRepetição;
// Faça um programa que peça uma nota, entre zero e dez.
// Mostre uma mensagem caso o valor seja inválido
// e continue pedindo até que o usuário informe um valor válido

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma nota 0 a 10: ");
        double nota = scanner.nextInt();
        boolean notaInvalida = nota > 10;
        boolean notaInvalida2 = nota < 0;

        if (notaInvalida){
            System.err.println("Nota Inválida!");
        } else if (notaInvalida2) {
            System.err.println("Nota Inválida!");
        } else {
            System.out.println("Obrigado Pela Nota!");
        }
    }
}
