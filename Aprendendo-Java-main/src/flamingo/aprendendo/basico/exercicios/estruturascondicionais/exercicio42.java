package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio42 {
    public class SistemaCompra {
        public static void main(String[] args) {

            double saldo = 150.00;
            double valorProduto = 200.00;
            boolean clienteVip = true;


            if (saldo >= valorProduto) {
                System.out.println("Compra aprovada");
            } else if (clienteVip) {
                System.out.println("Compra aprovada pelo crédito VIP");
            } else {
                System.out.println("Compra recusada");
            }
        }
    }}

