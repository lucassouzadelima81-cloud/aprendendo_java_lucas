package flamingo.aprendendo.basico.repeticao;

import java.util.Scanner;

public class Exercicios7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorVenda = 50;

        System.out.println("digite a quantidade de vendas");
        int quantidadevendas = sc.nextInt();

        for (int contador = 0; contador <=10; contador++){
            System.out.println(quantidadevendas * valorVenda);
        }

    }
}
