package com.company.exercicio_sequencial;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do Circulo: ");
        double raioDoCirculo = scanner.nextDouble();
        double pi = 3.14 ;
        double raioDoCirculoaoquadrado = raioDoCirculo * raioDoCirculo;
        double area = pi * raioDoCirculoaoquadrado;
        System.out.print("A area do raio: " + area + "cm");
        scanner.close();
    }
}