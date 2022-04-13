package com.company.exercicio_sequencial;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a  base do quadrado: ");
        int base = scanner.nextInt();

        System.out.print("Digite a altura do quadrado: ");
        int altura = scanner.nextInt();

        int areaQuadrado = base * altura;

        System.out.println("Área do quadrado é: " + areaQuadrado + "\n");

        int dobro = areaQuadrado * 2 ;

        System.out.println("O dobro dessa área é: "+ dobro );
    }
}
