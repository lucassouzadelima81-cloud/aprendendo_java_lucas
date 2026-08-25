package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio29 {
    static void main() {
        double imc = 20.2;
        if(imc > 18.5){
            System.out.println("abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        }else{
            System.out.println("obesidade");
        }
    }
}
