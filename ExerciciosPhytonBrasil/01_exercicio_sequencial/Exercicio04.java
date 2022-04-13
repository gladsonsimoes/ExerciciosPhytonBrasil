package com.company.exercicio_sequencial;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite a primeira nota: ");
        int nota1 = scanner.nextInt();
        //---------------------------------------------
        System.out.print("Digite a segunda nota: ");
        int nota2 = scanner.nextInt();
        //-----------------------------------------------
        System.out.print("Digite a terceira nota: ");
        int nota3 = scanner.nextInt();
        //---------------------------------------------
        System.out.print("Digite a Quarta nota: ");
        int nota4 = scanner.nextInt();
        //--------------------------------------------
        double media = nota1 + nota2 + nota3 + nota4 / 4;
        System.out.println("A media é: " + media);
    }
}
