import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        System.out.println("Digite o quarto número: ");
        int num4 = scanner.nextInt();

        System.out.println("Digite o quinto número: ");
        int num5 = scanner.nextInt();

        int soma = (num1 + num2 + num3 + num4 + num5);
        double media = (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        scanner.close();
    }
        
} 
