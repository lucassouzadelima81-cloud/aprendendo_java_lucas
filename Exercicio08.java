package faccat.Jailson;

import java.util.Scanner;

public class Exercicio08 {
    //8) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
    //brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
    //de eleitores
    public static void main(String[] args) {
        int totalEleitores, votosBrancos, votosNulos, votosValidos;
        double percentualNulos, percentualBrancos, percentualValidos;

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o total de eleitores: ");
        totalEleitores = sc.nextInt();

        System.out.println("digite o total de votos brancos: ");
        votosBrancos = sc.nextInt();

        System.out.println("digite o total de votos nulos: ");
        votosNulos = sc.nextInt();

        System.out.println("digite o total de votos válidos");
        votosValidos = sc.nextInt();

         percentualBrancos = (votosBrancos / totalEleitores) * 100 ;
         percentualNulos = (votosNulos / totalEleitores) * 100 ;
         percentualValidos = (votosValidos / totalEleitores) * 100 ;

        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

        sc.close();
    }
}
