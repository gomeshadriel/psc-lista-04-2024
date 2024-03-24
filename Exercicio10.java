import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicita ao usuário o valor de ambos os númeors

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        //Verifica se o número 1 é menor que o número 2, se verdadeiro uma sequencia crescente é imrpimida, se falso uma sequencia decrescente é imprimida.

        if (num1 < num2) {
            for (int sequencia = num1; sequencia <= num2; sequencia++) {
                System.out.print(sequencia + " ");
            }
        } else {
            for (int sequencia = num1; sequencia >= num2; sequencia--) {
                System.out.print(sequencia + " ");
            }
        }

        scanner.close();
    }
}