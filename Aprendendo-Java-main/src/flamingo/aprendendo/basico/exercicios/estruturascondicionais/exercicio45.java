package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio45 {
    public class DescontoProgressivo {
        public static void main(String[] args) {

            double valorCompra = 350.00;


            int percentualDesconto = 0;


            if (valorCompra <= 100) {
                percentualDesconto = 0;
            } else if (valorCompra <= 300) {
                percentualDesconto = 5;
            } else if (valorCompra <= 500) {
                percentualDesconto = 10;
            } else {
                percentualDesconto = 15;
            }


            double valorDesconto = valorCompra * (percentualDesconto / 100.0);
            double valorFinal = valorCompra - valorDesconto;


            System.out.printf("Valor original: R$ %.2f%n", valorCompra);
            System.out.println("Porcentagem de desconto: " + percentualDesconto + "%");
            System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
            System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);
        }
    }
}
