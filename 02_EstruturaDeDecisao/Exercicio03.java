package com.company.exercicio_estruturadedecisao;

import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é "F" ou "M".
// Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe o sexo [M] para masculino , [F] para Feminino: ");
        char sexoInformado = scanner.next().charAt(0);
        System.out.println(" Sexo Informado: " + sexoInformado);

        char masculino = ('m' | 'M');
        char feminino = ('f' | 'F');
        
        if (masculino == sexoInformado) {
            System.out.println("Masculino");
        } else if (sexoInformado == feminino) {
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
}
