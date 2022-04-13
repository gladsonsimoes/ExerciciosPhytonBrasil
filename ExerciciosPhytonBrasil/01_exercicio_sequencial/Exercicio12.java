package com.company.exercicio_sequencial;


// Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
// usando a seguinte fórmula: (72.7*altura) - 58

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double pesoideal = (72.7*altura) - 58;

        System.out.print("O peso ideal para sua altura é: " + pesoideal);
    }
}
