

import java.util.Scanner;

//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        float valorDigitado = scanner.nextFloat();

        boolean numeroPositivo = valorDigitado > 0;
        boolean numeroNegativo = valorDigitado < 0;

        if (numeroPositivo){
            System.out.println("O valor é positivo!");
        } else if (numeroNegativo) {
            System.out.println("O valor é negativo!");
        } else {
            System.out.println("O valor é Neutro!");
        }

    }
}
