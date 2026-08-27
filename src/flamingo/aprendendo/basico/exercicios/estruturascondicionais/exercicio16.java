package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio16 {
    static void main() {
        double valorCompra = 200.00;
        double valorFinal;
        boolean temDesconto = true;

        if (temDesconto) {
            valorFinal = valorCompra * 0.90;
        } else {
            valorFinal = valorCompra;
        }

        System.out.println("Valor final: " + valorFinal);
    }
}
