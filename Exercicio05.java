//5) Verificação de Categoria de Idade:
//Escreva um programa que solicite ao usuário sua idade e
//exiba a categoria correspondente (Criança, Adolescente, Adulto, Idoso).
package lista06;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe a sua idade: ");
        int idade = sc.nextInt();

        int categoria = 0;

        if (idade >= 0) {
            if (idade <= 12) {
                categoria = 1;
            } else if (idade <= 17) {
                categoria = 2;
            } else if (idade >= 49 && idade <= 69) {
                categoria = 3;
            } else {
                categoria = 4;
            }
        }

        switch (categoria) {
            case 1:
                System.out.println("Categoria: Criança");
                break;
            case 2:
                System.out.println("Categoria: Adolescente");
                break;
            case 3:
                System.out.println("Categoria: Adulto");
                break;
            case 4:
                System.out.println("Categoria: Idoso");
                break;
            default:
                System.out.println("Matusalém fazendo hora extra");
        }

        sc.close();
    }
}