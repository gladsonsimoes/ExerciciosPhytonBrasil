package com.company.exercicio_sequencial;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Informe a Temperatura(F°): ");
        double  Farenheit = scanner.nextInt();

        double Celsius = 5 * ((Farenheit - 32) / 9);


        // C = 5 * ((F-32) / 9).


        System.out.println("A temperatura em Celsius é: "+ Celsius);
    }
}
