package com.company.exercicio_sequencial;

//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
// Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
// deve pagar uma multa de R$ 4,00 por quilo excedente.
// João precisa que você faça um programa que leia a variável peso (peso de peixes)
// e calcule o excesso.
// Gravar na variável excesso a quantidade de quilos além do limite
// e na variável multa o valor da multa que João deverá pagar.
// Imprima os dados do programa com as mensagens adequadas.

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso de peixes(Kg): ");
        double peso = scanner.nextDouble();

        boolean excesso = (peso > 50);


         if (excesso) {
             System.out.println("\n---------------------------------------");
             System.out.print("O peso do peixe ultrapassou o limite!");

            double multa = 4 * peso;

            System.out.println("\nA multa é de R$: " + multa);
             System.out.println("-----------------------------------------");
        } else {
             System.out.println("\n---------------------------------------");
            System.out.println("O peso do peixe não ultrapassou o limite!");
             System.out.println("-----------------------------------------");
             scanner.close();
        }
    }
}
