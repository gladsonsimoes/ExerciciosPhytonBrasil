package com.company.exercicio_estruturadedecisao;

import java.util.Scanner;

//As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
//Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
//
//salários até R$ 280,00 (incluindo) : aumento de 20%
//salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:

//o salário antes do reajuste;
//o percentual de aumento aplicado;
//o valor do aumento;
//o novo salário, após o aumento.


public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario do colaborador: ");
        double salarioColaborador = scanner.nextDouble();

        if (salarioColaborador<=280){
            System.out.println("salario antes do reajuste: " + salarioColaborador);
            System.out.println("aumento de 20%");
            float aumentode20 = (float) (salarioColaborador * 20 / 100);
            System.out.println("valor do aumento: " + aumentode20 );
            System.out.println("salario apos aumento: " + salarioColaborador + aumentode20);
        } else if (salarioColaborador>=280 & salarioColaborador<=700){
            System.out.println("salario antes do reajuste: " + salarioColaborador);
            System.out.println("aumento de 15%");
            float aumentode15 = (float) (salarioColaborador * 15 / 100);
            System.out.println("valor do aumento: " + aumentode15);
            System.out.println("salario apos aumento: " + salarioColaborador + aumentode15);
        } else if (salarioColaborador>700 & salarioColaborador<=1500){
            System.out.println("salario antes do reajuste: " + salarioColaborador);
            System.out.println("aumento de 10% ");
            float aumentode10 = (float) (salarioColaborador * 10 / 100);
            System.out.println("valor do aumento: " + aumentode10);
            System.out.println("salario apos aumento: " + salarioColaborador + aumentode10);
        } else if (salarioColaborador>1500){
            System.out.println("salario antes do reajuste: " + salarioColaborador);
            System.out.println("aumento de 5% ");
            float aumentode5 = (float) (salarioColaborador * 5 / 100);
            System.out.println("valor do aumento: " + aumentode5);
            System.out.println("salario antes do reajuste: " + salarioColaborador + aumentode5);
        }
        scanner.close();


    }
}
