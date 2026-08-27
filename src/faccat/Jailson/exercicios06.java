package faccat.Jailson;

import java.util.Scanner;

public class exercicios06 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("programa antecessor");
        System.out.println("digite um valor para saber o antecessor: ");
        int numero = sc.nextInt();
        int antecessor =numero -1;

        System.out.println("o numero antecessor "+ antecessor);
        sc.close();
    }
}
