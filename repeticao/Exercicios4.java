package flamingo.aprendendo.basico.repeticao;


import java.util.Scanner;

public class Exercicios4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um número para fazer a contagem");
        int soma = 0;
        int contador;
        for (contador = 0; contador <=100; contador++){
            soma += contador;
            System.out.println("A soma de 1 até 100 é:" + soma);
        }
    }
}
