package flamingo.aprendendo.basico.repeticao;

import java.util.Scanner;

public class Exercicios9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros = 3;

        System.out.println(" quantidade de tentivas ");
        int tentativas = sc.nextInt();

        do {
            System.out.println("tentando fazer login");
        }
        while ( tentativas < numeros);

    }
}
