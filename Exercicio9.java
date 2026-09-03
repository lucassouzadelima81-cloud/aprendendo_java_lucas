package faccat.Jailson;

import java.util.Scanner;
//Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
//Calcular e escrever o valor do novo salário
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("programa novo salario");
        System.out.println("digite o salario mensal atual ");
        double salario = sc.nextDouble();

        System.out.println("digite o percentual de reajuste ");
        double percentualReajuste = sc.nextDouble();

        salario = salario * (percentualReajuste/100);
        System.out.println("o salario com reajuste é "+salario);
    }
}
