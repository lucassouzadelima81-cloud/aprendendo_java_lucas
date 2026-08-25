package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio22 {
    static void main() {
        byte nota = 10;


        String categoria;
        if (nota>=9){
            categoria= "Excelente";
        }else if(nota>=7 ){
            categoria = "bom";
        }else if(nota>=5) {
            categoria = "recuperacao";
        } else{
            categoria = "Reprovado";
        }
        System.out.println(categoria);
    }
}
