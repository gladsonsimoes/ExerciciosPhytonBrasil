package com.company;

//Faça um Programa que leia um número e exiba o dia correspondente da semana.
// (1-Domingo, 2- Segunda, etc.),
// se digitar outro valor deve aparecer valor inválido.

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Digite um numero correspondente ao dia da semana\n(1-Domingo até 7-Sabado): ");
        int numerodoDiaDaSemana = scanner.nextInt();
        if (num1==1){
            System.out.println("\nDomingo");
        } else if (numerodoDiaDaSemana==2){
            System.out.println("\nSegunda-Feira");
        } else if (numerodoDiaDaSemana==3) {
            System.out.println("\nTerça-Feira");
        } else if (numerodoDiaDaSemana==4){
            System.out.println("\nQuarta-Feira");
        } else if (numerodoDiaDaSemana==5) {
            System.out.println("\nQuinta-Feira");
        } else if (numerodoDiaDaSemana==6) {
            System.out.println("\nSexta-Feira");
        } else if (numerodoDiaDaSemana==7){
            System.out.println("\nSábado");
        } else {
            System.out.println("\nNumero Invalido");
        }
    }
}
