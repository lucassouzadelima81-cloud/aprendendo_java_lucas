package faccat.Jailson;

import java.util.Scanner;

public class ExercicioRetagunlo6 {
    public static void main(String[] args) {
        double altura, base, area;
        Scanner sc = new Scanner(System.in);


        System.out.println("digite a base do retãgulo: ");
        base = sc.nextDouble();

        System.out.println("digite a altura do retãngulo:");
        altura = sc.nextDouble();

        area = base * altura;

        System.out.printf("a area do retãngulo = %.2f", area);
        sc.close();
    }
}
