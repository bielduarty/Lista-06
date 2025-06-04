//7) Verificação de Mês e Estação:
//Escreva um programa que solicite ao usuário um número de 1 a 12 e exiba o mês e a estação do ano correspondente.
package lista06;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número de 1 a 12 para o mês");
        int ano = sc.nextInt();

        switch (ano) {
            case 1:
                System.out.printf("Janeiro — Verão");
                break;
            case 2:
                System.out.printf("Fevereiro — Verão");
                break;
            case 3:
                System.out.printf("Março — Verão ");
                break;
            case 4:
                System.out.printf("Abril — Outono");
                break;
            case 5:
                System.out.printf("Maio — Outono");
                break;
            case 6:
                System.out.printf("Junho — Outono");
                break;
            case 7:
                System.out.printf("Julho — Inverno");
                break;
            case 8:
                System.out.printf("Agosto — Inverno");
                break;
            case 9:
                System.out.printf("Setembro — Inverno");
                break;
            case 10:
                System.out.printf("Outubro — Primavera");
                break;
            case 11:
                System.out.printf("Novembro — Primavera");
                break;
            case 12:
                System.out.printf("Dezembro — Primavera");
                break;


        }


        sc.close();
    }
}
