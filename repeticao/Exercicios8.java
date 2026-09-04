package flamingo.aprendendo.basico.repeticao;

import java.util.Scanner;

public class Exercicios8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorProduto = 20;
        System.out.println("digite a quantidade de produto :");
        int quantidadeProdutos = sc.nextInt();

        for (int contador = 0; contador <=50; contador++){
            System.out.println(quantidadeProdutos+ "Quantidade de produtos:"+ valorProduto+"Valor de cada produto:"+ quantidadeProdutos*valorProduto);
        }
    }
}
