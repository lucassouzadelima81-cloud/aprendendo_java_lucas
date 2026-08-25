package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio25 {
    static void main() {
        int Xp = 1000;
        if (Xp < 1000){
            System.out.println("iniciante");
        }else if(Xp >= 1000 && Xp <= 4999){
            System.out.println("intermediario");
        } else if (Xp >= 5000 && Xp <= 9999) {
            System.out.println("Avançado");
        }else if(Xp >= 1000){
            System.out.println("Lendario");
        }
    }
}
