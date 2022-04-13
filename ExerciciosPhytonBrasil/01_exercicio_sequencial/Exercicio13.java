package com.company.exercicio_sequencial;


//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1*h) - 44.7

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Digite a sua altura: ");
        double h = scanner.nextDouble();

        double pesoIdealHomem = (72.7*h) - 58;
        double pesoIdealMulher = (62.1*h) - 44.7;

        System.out.println("\nPeso Ideal para Homens: " + pesoIdealHomem + "\n\nPeso Ideal para Mulheres: " + pesoIdealMulher);
    }
}
