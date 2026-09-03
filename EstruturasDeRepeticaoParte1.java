package flamingo.aprendendo.basico;

import java.util.Scanner;

public class EstruturasDeRepeticaoParte1 {

    public static void main(String[] args) {
        // for
        // while
        // do while

        // contador = contador + 1
        // contador += 1
        // contador++
        // CONTAGEM DE 0 A 10

       // for (int contador = 0; contador <= 10; contador++) {
       //     System.out.println(contador);//}
        Scanner sc = new Scanner(System.in);
        System.out.println("escolhaum numero pra ter a tabuada");
        int numero = sc.nextInt();
        for (int contador = 0; contador <=10; contador++){
            System.out.println(contador * numero);
        }
    }
}
