
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
       int a = input.nextInt();
        System.out.println("Digite outro número inteiro: ");
       int b = input.nextInt();
        System.out.println("Digite um núemro real: ");
       Double c = input.nextDouble();
       Double Total = a + b + c;
       System.out.println("Valor total: " + Total);
       input.close();

    }
}
