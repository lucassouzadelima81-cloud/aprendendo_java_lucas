package flamingo.aprendendo.basico;

import java.util.Scanner;

public class EstruturasDeRepeticaoParte2 {
    public static void main(String[] args) {
        // for
        // while
        // do while
        //int contador = 1;
        //while (contador <= 10){
         //   System.out.println(contador);
          //  contador++;
        Scanner sc = new Scanner(System.in);

        System.out.println("escolha um numero");
        int numero = sc.nextInt();
        int contador = 0;

        while (contador <= 10){
            System.out.println( contador+ "x"+ numero+"="+ contador*numero);

            contador++;
        }
    }
}
