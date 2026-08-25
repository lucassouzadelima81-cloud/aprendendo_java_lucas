package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio31 {
    static void main() {
        int idade = 20;
        String Resultado;
        if (idade >= 18) {
            Resultado = "Maior de idade";
        } else {
            Resultado = "Menor de idade";
        }


        String statusTernario = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(Resultado);
    }
}
