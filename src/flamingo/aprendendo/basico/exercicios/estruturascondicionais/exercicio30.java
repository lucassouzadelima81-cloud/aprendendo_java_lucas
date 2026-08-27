package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio30 {
    static void main() {
        int tipoCliente = 1;
        double valorCompra = 50.00;
        if(tipoCliente== 1){
            System.out.println("cliente comum - desconto de 0%"+valorCompra);
        }else if(tipoCliente == 2){
            System.out.println("cliente bronze - desconto de 5%");
        }else if(tipoCliente == 3){
            System.out.println("cliente prata -desconto de 10%");
        }else if(tipoCliente == 4){
            System.out.println("cliente ouro - desconto de 15%");
        }
    }
}
