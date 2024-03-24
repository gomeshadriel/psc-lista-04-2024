import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Entrada de dados do usuário
        System.out.println("Digite o seu nome de usuário: ");
        String userName = scanner.nextLine();

        System.out.println("Digite a sua senha: ");
        String senha = scanner.nextLine();

        //Loop infinito até que o nome de usuário e a senha sejam diferentes
        while (true) {
            //Verifica se o nome de usuário é igual à senha, se for igual apresenta mensagem de erro e solicita que o usuário digite as informações novamente.
            if (userName.equals(senha)) {
                
                System.out.println("Nome de usuário e senha devem ser diferentes! \nDigite novamente seu nome de usuário: ");
                userName = scanner.nextLine();

                System.out.println("Digite novamente a sua senha: ");
                senha = scanner.nextLine();
            } else {
                //Se usuário e senha foram diferentes o loop é interrompido.
                break;
                
            }
        } System.out.println("Cadastro efetuado com sucesso!");
        
    scanner.close();
        
    }
}