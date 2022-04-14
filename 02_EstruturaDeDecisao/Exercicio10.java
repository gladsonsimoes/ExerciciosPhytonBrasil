package com.company.exercicio_estruturadedecisao;

import java.util.Scanner;

//Faça um Programa que pergunte em que turno você estuda.
// Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
// Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!",
// conforme o caso.

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("M-matutino , V-vespertino , N-noturno ");
        System.out.print("Qual turno você estuda: ");
        char turnoDoALuno = scanner.next().charAt(0);

        char matutino = ('M' | 'm') ;
        char vespertino = ('V' | 'v');
        char noturno = ('N' |'n');

        if (turnoDoALuno == matutino ){
            System.out.println("\nBom dia!");
        } else if (turnoDoALuno == vespertino){
            System.out.println("\nBoa tarde!");
        } else if (turnoDoALuno == noturno) {
            System.out.println("\nBoa noite!");
        } else {
            System.out.println("\nvalor invalido!");
        }
    }
}
