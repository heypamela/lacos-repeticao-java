package exercicios_lacos_repeticao;

import java.util.Scanner;

public class Exercicio2_ParesImpares {
    public static void main(String[] args) {
        Scanner lerScanner = new Scanner(System.in);

        int pares = 0, impares = 0, numero;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numero = lerScanner.nextInt();

            if(numero % 2 == 0){
                pares++;
            } else{
                impares++;
            }
        }

        System.out.println("Total de números pares: " + pares);
        System.out.println("Total de números impares: " + impares);

        lerScanner.close();
    }
}
