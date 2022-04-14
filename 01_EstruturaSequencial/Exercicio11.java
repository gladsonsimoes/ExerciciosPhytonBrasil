package com.company.exercicio_sequencial;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int inteiro1 = scanner.nextInt();

        System.out.print("Digite outro numero inteiro: ");
        int inteiro2 = scanner.nextInt();

        System.out.print("Digite um valor real: ");
        double real = scanner.nextDouble();

        // produto do dobro do primeiro com metade do segundo

        double a = inteiro1 * 2 / inteiro2;

        System.out.println("produto do dobro do primeiro com metade do segundo: "+ a);

        //a soma do triplo do primeiro com o terceiro

        double b = inteiro1 * 3 + real;

        System.out.println("a soma do triplo do primeiro com o terceiro: "+ b);

        // o terceiro elevado ao cubo

         double c = real * real * real;

        System.out.println("o terceiro elevado ao cubo: "+ c);


    }
}
