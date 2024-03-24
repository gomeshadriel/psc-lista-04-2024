import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite uma nota de 0 à 10: ");
        int nota = scanner.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Valor inválido, digite outra nota: ");
            nota = scanner.nextInt();
            
        }

        System.out.println("Você digitou uma nota válida. O valor digitado foi: " + nota);
        scanner.close();
    }
}