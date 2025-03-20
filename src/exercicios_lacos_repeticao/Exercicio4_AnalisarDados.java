package exercicios_lacos_repeticao;

import java.util.Scanner;

public class Exercicio4_AnalisarDados {
    public static void main(String[] args) {
        Scanner  lerScanner = new Scanner(System.in);

        String continua;
        double mediaIdade = 0;
        int idade, genero, desenvolvedor, backend = 0, frontendMulheres = 0, 
        mobileHomens40Mais = 0, fullstackNaoBinarios30Menos = 0, totalPessoas = 0, somaIdades = 0;

        while (true) {
                System.out.println("Digite a idade: ");
                idade = lerScanner.nextInt();

                System.out.println("Digite identidade de gênero: ");
                System.out.println("1 - Mulher Cis \n2 - Homem Cis \n3 - Não Binário");
                System.out.println("4 - Mulher Trans \n5 - Homem Trans \n6 - Outros");
                genero = lerScanner.nextInt();

                System.out.println("Digite a especialidade da pessoa desenvolvedora:");
                System.out.println("1 - Backend \n2 - Frontend \n3 - Mobile \n4 - FullStack");
                desenvolvedor = lerScanner.nextInt();
            
                totalPessoas++;
                somaIdades += idade;

                if(desenvolvedor == 1){
                    backend++;
                } 

                if((genero == 1 || genero == 4) && desenvolvedor == 2){
                    frontendMulheres++;
                }

                if((genero == 2 || genero == 5) && desenvolvedor == 3 && idade > 40){
                    mobileHomens40Mais++;
                }

                if(genero == 3 && desenvolvedor == 4 && idade < 30){
                    fullstackNaoBinarios30Menos++;
                }

                System.out.println("\nDeseja continuar? (S/N)");
                continua = lerScanner.next().toUpperCase();

                if(continua.equalsIgnoreCase("n")){
                    break;
                };
        }

        if (totalPessoas > 0) {
            mediaIdade = (double) somaIdades / totalPessoas;
        }

        System.out.println("O número de pessoas desenvolvedoras Backend: " + backend);
        System.out.println("\n");
        System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend: " + frontendMulheres);
        System.out.println("\n");
        System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + mobileHomens40Mais);
        System.out.println("\n");
        System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos: " + fullstackNaoBinarios30Menos);
        System.out.println("\n");
        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);
        System.out.println("\n");
        System.out.println("A média de idade das pessoas que responderam à pesquisa: " + mediaIdade);

        lerScanner.close();
    }
}
