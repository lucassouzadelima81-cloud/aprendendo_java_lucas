package faccat.Jailson;

import java.util.Scanner;

public class ExerciciosAlgoritimo7 {
    //7) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
    //dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
    public static void main(String[] args) {
        byte dias, meses, idade;
        int diasDeVida;

        Scanner sc = new Scanner(System.in);

        System.out.println("digite a sua idade para descobrir quantos dias vc ja viveu: ");
        idade = sc.nextByte();

        System.out.println("quantos meses adicionais? ");
        meses = sc.nextByte();

        System.out.println("quantos dias adiciomais? ");
        dias = sc.nextByte();

        diasDeVida = (idade * 365) + (meses * 30) + dias;
        System.out.printf("você tem %d anos = %d dias de vida.", idade, diasDeVida);
        // 27 * 365
        // 3 * 30
        // 3
        sc.close();
    }
}
