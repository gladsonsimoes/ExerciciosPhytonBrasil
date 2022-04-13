package com.company.exercicio_sequencial;

//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto que você ganha por hora: ");
        float salarioHora = scanner.nextFloat();
        System.out.print("E quantas Horas trabalhadas por mês: ");
        float horasTrabalhadas = scanner.nextFloat();
        float salarioMensal = salarioHora * horasTrabalhadas;
        System.out.println("Seu salario é: " + salarioMensal);
        scanner.close();
    }
}
