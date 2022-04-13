package com.company.exercicio_sequencial;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma quantidade em Metros: ");
        double quantidadeEmMetros = scanner.nextInt();
        double fatorDeConversao = 0.01;
        double quantidadeEmCentimetros = quantidadeEmMetros / fatorDeConversao;
        System.out.print("Metros em centimentros: " + quantidadeEmCentimetros);
        scanner.close();
    }
}
