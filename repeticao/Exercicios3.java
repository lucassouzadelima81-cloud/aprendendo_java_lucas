package flamingo.aprendendo.basico.repeticao;

import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um número para descobrir a taubuada");
        int numero = sc.nextInt();
        for (int contador = 0; contador <=10; contador ++){
            System.out.println(contador * numero);
        }
    }
}
