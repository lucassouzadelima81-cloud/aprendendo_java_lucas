package flamingo.aprendendo.basico.repeticao;

import java.util.Scanner;

public class Exercicios10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diferente = 3;

        System.out.println("1 - Cadastrar usuário 2 - Listar usuários 3 - Sair");
        int opcao = sc.nextInt();

        do {
            System.out.println("sistema encerrado");
        }while (opcao < diferente);
    }
}
