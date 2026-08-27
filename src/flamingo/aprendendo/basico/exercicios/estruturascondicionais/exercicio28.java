package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio28 {
    static void main() {
        int plano = 1;
        if(plano== 1){
            System.out.println("Plano basico - R$29.90");
        }else if(plano == 2){
            System.out.println("Plano intermediario - R$59.90");
        }else if(plano == 3){
            System.out.println("Plano premium - R$99.90");
        }else{
            System.out.println("plano invalido");
        }
    }
}
