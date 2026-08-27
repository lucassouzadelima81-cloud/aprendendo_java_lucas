package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio37 {
    static void main() {
        boolean temPermissao = true;
        String Resultado;
        if (temPermissao = true) {
            Resultado = "Acesso liberado";
        } else {
            Resultado = "Acesso negado";
        }


        String statusTernario = (temPermissao = true) ? "Acesso liberado" : "Acesso negado";
        System.out.println(Resultado);
    }
}
