//4) Verificação de Estação do Ano:
//Escreva um programa que solicite ao usuário um número de 1
//a 4 e exiba a estação do ano correspondente (1 para Primavera, 2 para Verão, etc.).
package lista06;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe um numero correspondente a estação do ano: ");
        int estacao = sc.nextInt();

        switch (estacao) {
            case 1:
                System.out.printf("Primavera");
                break;
            case 2:
                System.out.printf("Verão");
                break;
            case 3:
                System.out.printf("Outono");
                break;
            case 4:
                System.out.printf("Inverno");
                break;
        }
        sc.close();
    }
}
