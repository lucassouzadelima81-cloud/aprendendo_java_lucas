package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio32 {
    static void main() {
        int nota = 10;
        String Resultado;
        if (nota >= 18) {
            Resultado = "Aprovado";
        } else {
            Resultado = "reprovado";
        }


        String statusTernario = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println(Resultado);
    }
}
