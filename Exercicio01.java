//1) Verificação de Dia da Semana:
//Escreva um programa que solicite ao usuário um número de 1 a
//7 e exiba o dia da semana correspondente (1 para Domingo, 2 para Segunda, etc.).
package lista06;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe um numero correspondente ao dia da semana: ");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.printf("Domingo");
                break;
            case 2:
                System.out.printf("Segunda-feira");
                break;
            case 3:
                System.out.printf("Terça-feira");
                break;
            case 4:
                System.out.printf("Quarta-feira");
                break;
            case 5:
                System.out.printf("Quinta-feira");
                break;
            case 6:
                System.out.printf("Sexta-feira");
                break;
            case 7:
                System.out.printf("Sábado");
                break;
            default:
                System.out.println("Dia inválido!");
        }
        sc.close();
    }
}
