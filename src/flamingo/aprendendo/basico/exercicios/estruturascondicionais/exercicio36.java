package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio36 {
    static void main() {
        boolean usuarioLogado = true;
        String Resultado;
        if (usuarioLogado = true) {
            Resultado = "usuario logado";
        } else {
            Resultado = "usuario deslogado";
        }


        String statusTernario = (usuarioLogado = true) ? "usuario logado" : "usuario deslogado";
        System.out.println(Resultado);
    }
}
