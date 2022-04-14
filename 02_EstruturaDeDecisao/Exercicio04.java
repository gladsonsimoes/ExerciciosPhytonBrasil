package com.company.exercicio_estruturadedecisao;

import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é vogal ou consoante

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char vogal = scanner.next().charAt(0);

        if (vogal == 'A' || vogal == 'a' || vogal == 'E' ||vogal == 'e' || vogal == 'I' || vogal == 'i' || vogal == 'O'|| vogal == 'o' || vogal == 'U' || vogal == 'u'){
            System.out.println("A letra informada é uma Vogal!");
        } else {
            System.out.println("A letra é uma consoante!");
        }


    }
}
