package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class exercicio26 {
    static void main() {
        int statusPedido = 1;
        if (statusPedido == 1){
            System.out.println("Pedido recebido");
        } else if (statusPedido == 2) {
            System.out.println("pedido em preparaçao");
        }else if(statusPedido == 3){
            System.out.println("pedido enviado");
        } else if (statusPedido == 4) {
            System.out.println("pedido entregue");
        }else{
            System.out.println("status invalido");
        }
    }
}
