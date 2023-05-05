
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
       int Inteiro1 = input.nextInt();
        System.out.println("Digite outro número inteiro: ");
       int Inteiro2 = input.nextInt();
        System.out.println("Digite um núemro real: ");
       Double Inteiro3 = input.nextDouble();
       Double a = (2 * Inteiro1) * (Inteiro2 / 2.0);
       Double b = (3 * Inteiro1) * Inteiro3;
       Double c = Math.pow(Inteiro3, 3);
       System.out.println("Resultado de a = " + a);
       System.out.println("Resultado de b = " + b);
       System.out.println("Resultado de c = " + c);
       input.close();

    }
}
