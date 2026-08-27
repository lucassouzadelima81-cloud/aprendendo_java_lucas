package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio44 {
    public class SistemaLogin {
        public static void main(String[] args) {

            String emailCorreto = "usuario@email.com";
            String senhaCorreta = "123456";
            boolean contaAtiva = true;


            String emailDigitado = "usuario@email.com";
            String senhaDigitada = "123456";


            if (!emailDigitado.equals(emailCorreto) || !senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Dados inválidos");
            } else if (!contaAtiva) {
                System.out.println("Conta bloqueada");
            } else {
                System.out.println("Login realizado");
            }
        }
    }
}
