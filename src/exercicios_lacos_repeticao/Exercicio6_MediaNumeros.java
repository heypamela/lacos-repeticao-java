package exercicios_lacos_repeticao;

import java.util.Scanner;

public class Exercicio6_MediaNumeros {
    public static void main(String[] args) {
        Scanner lerScanner = new Scanner(System.in);

        double media = 0;
        int soma = 0, contador = 0, numero;

        do {
            System.out.println("Digite um número: ");
            numero = lerScanner.nextInt();

            if (numero % 3 == 0 && numero != 0) {
                soma += numero;
                contador++;
            }
        } while (numero != 0);

        if (contador > 0) {
            media = (double) soma / contador;
        }

        System.out.println("A média de todos os números múltiplos de 3 é: " + media);

        lerScanner.close();
    }
}

