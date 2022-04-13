package com.company.exercicio_estruturadedecisao;

import java.util.Scanner;

//Faça um programa que pergunte o preço de três produtos
// e informe qual produto voce deve comprar, sabendo que a decisão é sempre pelo mais barato.

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco1 , preco2 , preco3;
        System.out.print("Digite o preço do primeiro produto: ");
        preco1 = scanner.nextDouble();
        System.out.print("Digite o preço do segundo produto: ");
        preco2 = scanner.nextDouble();
        System.out.print("Digite o preço do terceiro produto: ");
        preco3 = scanner.nextDouble();

        if (preco1<preco2 & preco1<preco3){
            System.out.println("\no preço " + preco1 + " é o mais barato!");
        } else if (preco2<preco1 & preco2<preco3) {
            System.out.println("\no preço " + preco2 + " é o mais barato!");
        } else if (preco3<preco1 & preco3<preco2){
            System.out.println("\no preco " + preco3 + " é o mais barato!");
        }
    }
}
