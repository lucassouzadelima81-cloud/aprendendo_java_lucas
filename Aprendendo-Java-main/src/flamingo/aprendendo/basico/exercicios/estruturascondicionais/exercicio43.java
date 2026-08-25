package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio43 {
    public class SistemaCinema {
        public static void main(String[] args) {
            int idade = 15;
            boolean temCarteirinhaEstudante = true;


            if (idade < 12 || temCarteirinhaEstudante) {
                System.out.println("Pagamento: Meia-entrada");
            } else {
                System.out.println("Pagamento: Entrada inteira");
            }
        }
    }
}
