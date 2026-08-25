package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio33 {
    static void main() {
  double saldo = 40;
      int valorProduto = 20;
        String Resultado;
        if (saldo >=  valorProduto ) {
            Resultado = "Compra Aprovada";
        } else {
            Resultado = "Saldo insuficiente";
        }


        String statusTernario = (saldo >=  valorProduto) ? "Compra aprovada" : "Saldo insuficiente";
        System.out.println(Resultado);
    }
}