package com.company.exercicio_sequencial;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.print("Qual o tamanho do arquivo em MB que deseja baixar? ");
                double tamanhoArquivo = scanner.nextDouble();
                System.out.print("E a velocidade, em MBps, da conexão que está utilizando? ");
                double velocidadeInternet = scanner.nextDouble();
                double tempoDeDownload = tamanhoArquivo / (velocidadeInternet / 8) / 60;
                System.out.printf("O tempo necessário para download do arquivo é: %.2f minutos.", tempoDeDownload);
                scanner.close();
    }
}
