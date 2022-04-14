package com.company.exercicio_estruturadedecisao;

import java.util.Scanner;
//Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e

// 3% para o Sindicato
// e que o FGTS corresponde a 11% do Salário Bruto,
// mas não é descontado (é a empresa que deposita).

// O Salário Líquido corresponde ao Salário Bruto menos os descontos.
// O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
//Desconto do IR:


//Salário Bruto até 900 (inclusive) - isento
//Salário Bruto até 1500 (inclusive) - desconto de 5%
//Salário Bruto até 2500 (inclusive) - desconto de 10%
//Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo.

//No exemplo o valor da hora é 5 e a quantidade de hora é 220.
//        Salário Bruto: (5 * 220)        : R$ 1100,00
//        (-) IR (5%)                     : R$   55,00
//        (-) INSS ( 10%)                 : R$  110,00
//        FGTS (11%)                      : R$  121,00
//        Total de descontos              : R$  165,00
//        Salário Liquido                 : R$  935,00


public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ganho por hora : ");
        double ganhoHoras = scanner.nextDouble();
        System.out.print("Quantidade de horas trabalhadas: ");
        double horasTrabalhados = scanner.nextDouble();

        double salario = ganhoHoras * horasTrabalhados;
        double impostoDeRenda = salario * 5 / 100;
        double iNSS = salario * 10 / 100;
        double fGTS = salario * 11 / 100;
        double descontoTotal = impostoDeRenda + iNSS + fGTS;
        double salarioLiquido = salario - descontoTotal;

        if (salario<=900) {
            System.out.println("Isento");
            System.out.println("Salario Bruto: " + salario);
        } else if (salario>=901 & salario<=1500) {
            System.out.println("Desconto de 5%");
            System.out.println("Salario Bruto R$: " + salario);
            System.out.println("(-) IR (5%): " + impostoDeRenda);
            System.out.println("(-) iNSS (10%): " + iNSS );
            System.out.println("FGTS (11%): " + fGTS );
            System.out.println("Total de Descontos: " + Math.ceil(descontoTotal));
            System.out.println("Salario Liquido: " + salarioLiquido);
        } else if (salario>=1501 & salario<=2500){
            System.out.println("Desconto de 10%");
            System.out.println("Salario Bruto R$: " + salario);
            System.out.println("(-) IR (5%): " + impostoDeRenda);
            System.out.println("(-) iNSS (10%): " + iNSS );
            System.out.println("FGTS (11%): " + fGTS );
            System.out.println("Total de Descontos: " + Math.ceil(descontoTotal));
            System.out.println("Salario Liquido: " + salarioLiquido);
        } else if (salario>2500){
            System.out.println("Desconto de 20%");
            System.out.println("Salario Bruto R$: " + salario);
            System.out.println("(-) IR (5%): " + impostoDeRenda);
            System.out.println("(-) iNSS (10%): " + iNSS );
            System.out.println("FGTS (11%): " + fGTS );
            System.out.println("Total de Descontos: " + Math.ceil(descontoTotal));
            System.out.println("Salario Liquido: " + salarioLiquido);
        }


    }
}
