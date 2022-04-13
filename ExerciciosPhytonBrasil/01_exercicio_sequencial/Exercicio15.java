package com.company.exercicio_sequencial;

//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS , e 5% para o sindicato, faça um programa que nos dê:
//salário bruto.
//quanto pagou ao INSS.
//quanto pagou ao sindicato.
//o salário líquido.
//calcule os descontos e o salário líquido, conforme a tabela abaixo:

//+ Salário Bruto : R$
//- IR (11%) : R$
//- INSS (8%) : R$
//- Sindicato ( 5%) : R$
//= Salário Liquido : R$


import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto que você ganha por hora R$: ");
        double ganha = scanner.nextDouble();

        System.out.print("Quantas horas que você trabalha no mês: ");
        double horas = scanner.nextDouble();

        double salariobruto = ganha * horas;
        System.out.println("--------------------------------------");
        System.out.println("salário Bruto: " + salariobruto);
        System.out.println("--------------------------------------");

        double impostoDeREnda = salariobruto * 11 / 100;
        System.out.println("\nImposto de Renda: "  + impostoDeREnda);

        double iNSS = salariobruto * 8 / 100;
        System.out.println("\nINSS: " + iNSS);

        double sindicato = salariobruto * 5 / 100;
        System.out.println("\nValor para o Sindicato: " + sindicato);
        System.out.println("-----------------------------------------");

        double salarioLiquido = salariobruto - impostoDeREnda - iNSS - sindicato ;

        System.out.println("Salario Liquido: " + salarioLiquido);
    }
}
