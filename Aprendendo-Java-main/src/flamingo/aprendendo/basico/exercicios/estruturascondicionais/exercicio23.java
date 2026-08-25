package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio23 {
    static void main() {
        float Salario = 2000;
        if(Salario<=1500){
            System.out.println("Salario baixo");
        }else if(Salario > 1501 && Salario <= 3000){
            System.out.println("salario medio");
        }else if (Salario > 3001 && Salario <= 7000){
            System.out.println("salario bom");
        }else{
            System.out.println("Salario alto");
        }
    }
}
