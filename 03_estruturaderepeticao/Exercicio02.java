package com.company.EstruturaDeRepetição;

//Faça um programa que leia um nome de usuário e a sua senha e
// não aceite a senha igual ao nome do usuário,
// mostrando uma mensagem de erro e voltando a pedir as informações.

import java.util.Objects;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome de Usuario: ");
        String nomeDeUsuario = scanner.nextLine();
        System.out.print("Digite sua senha: ");
        String senhaDoUsuario = scanner.nextLine();
        boolean nomeEsenhaIguais = Objects.equals(nomeDeUsuario, senhaDoUsuario);
        if (nomeEsenhaIguais){
            System.err.println("!Sua senha não pode ser igual ao nome de Usuário , Refaça o cadastro!");
            main(args); //usado para repetir o metodo main!
        } else {
            System.out.println("Bem-Vindo...");
        }
    }
}
