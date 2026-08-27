package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio17 {
    static void main(String[] args) {
        short idade = 18;
        boolean temCNH = true;
        if (idade >= 18 && temCNH == true){
            System.out.println("pode dirigir");
        }else{
            System.out.println("nao pode dirigir");
        }
    }
}
