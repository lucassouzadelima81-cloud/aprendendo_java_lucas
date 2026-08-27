package faccat.Jailson;

import java.util.Scanner;

public class exercicios05 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("programa sucessor");
        System.out.println("digite um valor para saber o sucessor: ");
        int numero = sc.nextInt();
        int sucessor =numero +1;

        System.out.println("o numero sucessor "+ sucessor);
        sc.close();
    }
}
