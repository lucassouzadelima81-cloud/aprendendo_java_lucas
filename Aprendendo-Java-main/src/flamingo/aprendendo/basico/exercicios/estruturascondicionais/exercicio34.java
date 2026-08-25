package flamingo.aprendendo.basico.exercicios.estruturascondicionais;
import java.util.Scanner;
public class exercicio34 {
    static void main() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            String resultado = (Math.abs(numero % 2) == 0) ? "par" : "ímpar";

            System.out.println("O número " + numero + " é " + resultado);
        }
    }

