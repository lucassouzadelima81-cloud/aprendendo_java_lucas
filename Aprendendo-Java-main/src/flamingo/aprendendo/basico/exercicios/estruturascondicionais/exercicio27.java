package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio27 {
    static void main() {
        int codigoProduto = 1;
        if(codigoProduto == 1){
            System.out.println("eletronico");
        }else if(codigoProduto == 2){
            System.out.println("alimento");
        }else if(codigoProduto == 3){
            System.out.println("roupa");
        }else if(codigoProduto == 4){
            System.out.println("livro");
        }else{
            System.out.println("Categoria invalida ");
        }
    }
}
