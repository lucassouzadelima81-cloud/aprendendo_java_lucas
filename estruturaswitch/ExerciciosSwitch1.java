package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class ExerciciosSwitch1 {
    public static void main(String[] args) {
        byte tipoDeCombustivel;
        double litros, preco;
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                qual o tipo do combustivo 
                1)gasolina 
                2)etanol
                3)diesel
                """);

        tipoDeCombustivel = sc.nextByte();

        switch (tipoDeCombustivel){
            case 1:
                System.out.println("quantos litros de gasolina vc deseja");
                litros = sc.nextDouble();
                preco = litros * 5.89;

                System.out.printf("preço total do combustivel è r$%f ", preco);
                break;
            case 2:
                System.out.println("quantos litros de gasolina vc deseja");
                litros = sc.nextDouble();
                preco = litros * 3.99;

                System.out.printf("preço total do combustivel è r$%f ", preco);
                break;
            case 3:
                System.out.println("quantos litros de gasolina vc deseja");
                litros = sc.nextDouble();
                preco = litros * 6.19;

                System.out.printf("preço total do combustivel è r$%f ", preco);
                break;
            default:
                System.out.println("não existe essa opção");
                break;
        }
        sc.close();
    }
}
