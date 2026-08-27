package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio35 {
    static void main() {
        int valorCompra = 20;
        String Resultado;
        if (valorCompra>=100) {
            Resultado = "Tem desconto";
        } else {
            Resultado = "nao tem desconto";
        }


        String statusTernario = (valorCompra >=100) ? "tem desconto" : "nao tem desconto";
        System.out.println(Resultado);
    }
}
