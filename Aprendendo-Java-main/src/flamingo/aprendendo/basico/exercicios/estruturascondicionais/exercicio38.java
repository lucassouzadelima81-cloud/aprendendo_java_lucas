package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio38 {
    static void main() {
        short temperatura = 40;
        String Resultado;
        if (temperatura > 25) {
            Resultado = "calor";
        } else {
            Resultado = "frio";
        }


        String statusTernario = (temperatura>25) ? "calor" : "frio";
        System.out.println(Resultado);
    }
}
