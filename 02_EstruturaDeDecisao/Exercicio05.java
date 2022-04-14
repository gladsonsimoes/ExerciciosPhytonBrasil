package com.company.exercicio_estruturadedecisao;

import java.util.Scanner;

//Faça um programa para a leitura de duas notas parciais de um aluno.
// O programa deve calcular a média alcançada por aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//A mensagem "Reprovado", se a média for menor do que sete;
//A mensagem "Aprovado com Distinção", se a média for igual a dez

public class Exercicio05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota: ");
        float nota1 = scanner.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();
        double media = nota1 + nota2;
        System.out.println("A Media é de: " + media);
        boolean aprovado =  (media>=7 || media>=10);
        if  (aprovado){
            System.out.println("O aluno foi aprovado!" );
        } else {
            System.out.println("O aluno foi reprovado!");
        }


    }

}
