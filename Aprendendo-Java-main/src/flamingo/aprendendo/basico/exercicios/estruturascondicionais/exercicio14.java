package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio14 {
    static void main(String[] args) {
        boolean emailCorreto = true;
        boolean SenhaCorreta = true;
        if( emailCorreto == true && SenhaCorreta == true ){
            System.out.println("login realizado com sucesso");
        }else {
            System.out.println("Email ou senha invalidos");
        }
    }
}
