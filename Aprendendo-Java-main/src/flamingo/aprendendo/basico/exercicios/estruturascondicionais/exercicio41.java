package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio41 {
    static void main() {
        byte nota = 7;
        byte presenca = 60;
        if(nota>= 7 && presenca >= 75){
            System.out.println("Aprovado");
        } else if (nota>= 5 && nota<7) {
            System.out.println("Recuperação");
        }else{
        System.out.println("reprovado");
        }
    }
}
