import java.util.Scanner;

public class Exercicio05 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        char repetir = 's';

        while (repetir == 's' || repetir == 'S' ) {
                
            // Entrando com as informações do primeiro país

            System.out.println("Digite o nome do primeiro país: ");
            String paisA = scanner.nextLine();

            System.out.println("Digite a população do(a) " + paisA + ": ");
            double popA = scanner.nextDouble();

            // Consumir a nova linha pendente
            scanner.nextLine();

            System.out.println("Digite a porcentagem da taxa de crescimento anual do(a) " + paisA + ": ");
            double tacA = scanner.nextDouble();
            tacA = tacA / 100;

            // Entrando com as informações do segundo país

            System.out.println("Digite o nome do segundo país: ");
            scanner.nextLine(); // Consumir a nova linha pendente

            String paisB = scanner.nextLine();

            System.out.println("Digite a população do(a) " + paisB + ": ");
            double popB = scanner.nextDouble();

            // Consumir a nova linha pendente
            scanner.nextLine();

            System.out.println("Digite a porcentagem da taxa de crescimento anual do(a) " + paisB + ": ");
            double tacB = scanner.nextDouble();
            tacB = tacB / 100;

            int anos = 0;

            if (popA < popB) {
                        
                do {
                    anos++;
                    popA = popA + (popA * tacA);
                    popB = popB + (popB * tacB);

                } while (popA < popB);

                //Retorna o valor dos calculos ao usuário

                System.out.println("Em " + anos + " anos a população do(a) " + paisA + " alcançará a população do(a) " + paisB + ".");

                //Pergunta se o usuário gostaria de repetir a operação, se positivo reinicia o programa, se negativo encerra o programa.

                System.out.println("Deseja repetir a operação?\ns - sim;\nn - não;\n");
                repetir = scanner.next().charAt(0);

                // Verifica se a entrada é válida
                while (repetir != 's' && repetir !='S' && repetir != 'n' && repetir != 'N') {
                    System.out.println("Digite uma opção válida!");
                    System.out.println("Deseja repetir a operação?\ns - sim;\nn - não;\n");
                    repetir = scanner.next().charAt(0);
                } 
            } else {
                
                do {
                    anos++;
                    popA = popA + (popA * tacA);
                    popB = popB + (popB * tacB);

                } while (popA > popB);

                //Retorna o valor dos calculos ao usuário

                System.out.println("Em " + anos + " anos a população do(a) " + paisB + " alcançará a população do(a) " + paisA + ".");

                //Pergunta se o usuário gostaria de repetir a operação, se positivo reinicia o programa, se negativo encerra o programa.

                System.out.println("Deseja repetir a operação?\ns - sim;\nn - não;\n");
                repetir = scanner.next().charAt(0);

                // Verifica se a entrada é válida
                while (repetir != 's' && repetir !='S' && repetir != 'n' && repetir != 'N') {
                    System.out.println("Digite uma opção válida!");
                    System.out.println("Deseja repetir a operação?\ns - sim;\nn - não;\n");
                    repetir = scanner.next().charAt(0);
                } 
            }          
        }
        System.out.println("Fim do programa.");
        scanner.close();
    }
}
