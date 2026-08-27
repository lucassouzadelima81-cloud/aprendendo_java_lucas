package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio39 {
    static void main() {
        double valorCompra = 160;
        String Resultado;
        if (valorCompra >= 150) {
            Resultado = "0";
        } else {
            Resultado = "20";
        }


        String statusTernario = (valorCompra >=150) ? "usuario logado" : "usuario deslogado";
        System.out.println(Resultado);
    }
}
