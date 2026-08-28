package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

//Crie uma variável int opcaoLanche e uma variável int quantidade.
//
//Considere:
//
//1 → Hambúrguer — R$ 25,00 2 → Pizza — R$ 40,00 3 → Batata frita — R$ 18,00 4 → Refrigerante — R$ 8,00 5 → Suco — R$ 10,00
//
//O programa deve calcular o valor total do pedido com base na opção escolhida e na quantidade.
//
//Exemplo:
//
//int opcaoLanche = 1; int quantidade = 2;
//
//Se o usuário escolher hambúrguer, o cálculo será:
//
//2 * 25.00
//
//Resultado esperado:
//
//Item escolhido: Hambúrguer Quantidade: 2 Total do pedido: R$ 50.0
//
//Caso a opção seja inválida, exiba:
//
//Opção inválida
public class CardápioDeLanchonete2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcaoLanche,quantidade;
        double preco;
        System.out.println("""
                opção de lanche
                1)hambúrguer
                2)pizza
                3)batata frita
                4)refrigerante
                5)suco
                """);
        opcaoLanche = sc.nextInt();

        switch (opcaoLanche){
            case 1:
                System.out.println("qual lanche vc deseja");
                quantidade = sc.nextInt();
                quantidade = opcaoLanche ;
                preco = 25.00;
                System.out.printf("preço total do seu pedido é R$%f ", preco);
                break;
            case 2:
                System.out.println("qual lanche vc deseja");
                quantidade = sc.nextInt();
                quantidade = opcaoLanche ;
                preco = 40.00;
                System.out.printf("preço total do seu pedido é R$%f ", preco);
                break;
            case 3:
                System.out.println("qual lanche vc deseja");
                quantidade = sc.nextInt();
                quantidade = opcaoLanche ;
                preco = 18.00;
                System.out.printf("preço total do seu pedido é R$%f ", preco);
                break;
            case 4:
                System.out.println("qual bebida vc deseja");
                quantidade = sc.nextInt();
                quantidade = opcaoLanche ;
                preco = 8.00;
                System.out.printf("preço total do seu pedido é R$%f ", preco);
                break;
            case 5:
                System.out.println("qual bebida vc deseja");
                quantidade = sc.nextInt();
                quantidade = opcaoLanche ;
                preco = 10.00;
                System.out.printf("preço total do seu pedido é R$%f ", preco);
                break;

        }
    }
}
