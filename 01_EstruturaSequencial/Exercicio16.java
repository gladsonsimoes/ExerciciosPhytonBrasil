package com.company.exercicio_sequencial;

// Faça um programa para uma loja de tintas.
// O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
// Considere que a cobertura da tinta é de
//
// 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros,

// que custam R$ 80,00.
// Informe ao usuário a "quantidades de latas de tinta" a serem compradas e o preço total.


// Math.ceil( -3.8 ); //resultado -3.0 !!não sei usar!!

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho da area(Metros quadrados): ");
        double area = sc.nextDouble();

        System.out.println("\nA area de metros quadrados e de: " + area + "m2");

        double tinta = area / 3;

        System.out.print("\nA quantidade necessaria de litros: " + tinta + " Litros!\n");

        double litro = tinta / 18 ;

        System.out.print("\nQuantidade de Latas: " + litro + "\n");

        double valor = 80 * litro;

        System.out.println("\n Preco total: " + valor);
    }
}
