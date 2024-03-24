import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Entrada de dados do usuário.

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

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) { //verifica se o primeiro número é maior que todos os outros. Se verdadeiro retorna o valor dele para o usuário.

            System.out.println("O maior número é: " + num1);
            
        } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {//verifica se o segundo número é maior que todos os outros. Se verdadeiro retorna o valor dele para o usuário.

            System.out.println("O maior número é: " + num2);
            
        } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {//verifica se o terceiro número é maior que todos os outros. Se verdadeiro retorna o valor dele para o usuário.

            System.out.println("O maior número é: " + num3);
            
        } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {//verifica se o quarto número é maior que todos os outros. Se verdadeiro retorna o valor dele para o usuário.

            System.out.println("O maior número é: " + num4);
            
        } else { //Se todas as verificações anteriores forem falsas deduz-se que o maior número é o quinto, e é o valor dele que é retornado ao usuário.

            System.out.println("O maior número é: " + num5);
            
        }

        scanner.close();
    }
        
}
