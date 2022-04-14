package com.company.exercicio_sequencial;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      System.out.print("Informe a temperatura(C°): ");
      double Celsius = scanner.nextDouble();

        //C = 5 * ((F-32) / 9).

        double Farenheint = ((Celsius * 9/5 )+ 32);

        System.out.print("A temperatura em (F°): " + Farenheint);
    }
}
