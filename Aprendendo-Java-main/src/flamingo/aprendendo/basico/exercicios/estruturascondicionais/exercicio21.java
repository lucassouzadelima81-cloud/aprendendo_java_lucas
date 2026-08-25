package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio21 {
    static void main() {
        byte idade = 18;


        String categoria;
        if (idade < 12){
            categoria= "Criança";
        }else if(idade > 12 && idade <=17 ){
            categoria = "Adolescente";
        }else if(idade >18 && idade <= 59) {
            categoria = " Adulto";
        } else{
            categoria = "Idoso";
        }
        System.out.println(categoria);
    }
}
