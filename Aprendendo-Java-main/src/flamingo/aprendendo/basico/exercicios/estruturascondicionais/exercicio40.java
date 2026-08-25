package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio40 {
    static void main() {
       short salario = 4000;
        String Resultado;
        if (salario < 3000) {
            Resultado = "bonus de 500";
        } else {
            Resultado = "bonus de 200";
        }


        String statusTernario = (salario<3000) ? "bonus de 500" : "bonus de 200";
        System.out.println(Resultado);
    }
}
