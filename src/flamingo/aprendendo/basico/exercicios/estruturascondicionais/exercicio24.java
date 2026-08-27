package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio24 {
    static void main() {
        short temperatura = 20;
        if(temperatura < 15){
            System.out.println("Frio");
        }else if(temperatura <= 25){
            System.out.println("Agradavel ");
        }else if(temperatura >= 26){
            System.out.println("quente");
        }else if (temperatura >= 35 ) {
            System.out.println("muito quente");
        }
    }
}
