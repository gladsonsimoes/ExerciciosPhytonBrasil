package com.company.exercicio_sequencial;

//Faça um Programa para uma loja de tintas.*
//O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.*
//Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros,
//que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//comprar apenas latas de 18 litros;
//comprar apenas galões de 3,6 litros;
//misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga
// e sempre arredonde os valores para cima,
// isto é, considere latas cheias.

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInforme o tamanho em metros quadrados: ");
        double area = scanner.nextDouble();
        System.out.println("\nTamanho: " + area + "m²");
        double litros = area / 6; //cobertura de 1 litro para 6 metros quadrados!
        System.out.print("\nQuantidade necessaria de litros: " + Math.ceil(litros) + " Litros!\n");
        //-----------------------------------------------------------------------------------------
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("\nEm Lata: ");
        double lata = litros / 18 ; //quantidade vendida da lata (18 litros)
        System.out.print("\nQuantidade de Latas: " + Math.ceil(lata) + "\n\n o total de litros(De acordo com a lata): " + Math.ceil(lata) * 18 + " Litros" );
        double valorlata = 80 * lata; //R$: 80,00 o valor da lata!
        System.out.println("\n\nPreco total com a lata R$: " + Math.ceil(valorlata));
        //------------------------------------------------------------------------------------------
        System.out.println("\n----------------------------------------------------------------");
        System.out.println("\nEm galão:");
        double galao = litros / 3.6; //quantidade vendida do galao (3,6 litros)
        System.out.println("\nQuantidade de Galoes: " + Math.ceil(galao) + "\n\no total de litros(De acordo com o galão): " + Math.ceil(galao) * 3.6 + " Litros" );
        double valorgalao = 25 * galao; //R$: 25,00 o valor do galão!
        System.out.println("\n Preço total com o galao R$: " + Math.ceil(valorgalao));
        System.out.println("\n----------------------------------------------------------------");
        //--------------------------------------------------------------------------------------
        //misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga
        double economizartinta1 = galao + lata;
        System.out.println("Economizando Tinta: " + economizartinta1 );

        //System.out.println();

         // Math.ceil(lata) / Math.ceil(galao) ,  Math.ceil(litros) / Math.ceil(lata) + Math.ceil(galao)

        //scanner.close();


    }
}

