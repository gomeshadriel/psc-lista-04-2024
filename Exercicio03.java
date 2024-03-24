import java.util.Scanner;


public class Exercicio03 {
public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    //Solicita o nome e faz a verificação de quantidade de caracteres.

    System.out.println("Digite um nome maior que 3 caracteres: ");
    String nome = scanner.nextLine();
    int nomeQnt = nome.length();

    while(true){

        if (nomeQnt <= 3) {

            System.out.println("O nome precisar ter mais do que 3 caracteres!");
            System.out.println("Digite um nome maior que 3 caracteres: ");
            nome = scanner.nextLine();
            nomeQnt = nome.length();

        } else {

            break;

        }
    }

    //Solicita a idade e faz a verificação se o número esta entre 0 e 150.
    
    System.out.println("Digite a sua idade: ");
    int idade = scanner.nextInt();

    while(true){

        if (idade < 0 || idade > 150) {

            System.out.println("Digite um número entre 0 e 150.");
            System.out.println("Digite a sua idade: ");
            idade = scanner.nextInt();

        } else {

            break;

        }
    }

    //Solicita o salário e faz a verificação se o número informado é maior ou igual a 0.

    System.out.println("Digite o seu salário (somente os números 000,00): ");
    double salario = scanner.nextDouble();

    while(true){

        if (salario <= 0) {

            System.out.println("Digite um número maior ou igual a 0.");
            System.out.println("Digite o seu salário: ");
            salario = scanner.nextDouble();

        } else {

            break;

        }
    }

    //Solicita o gênero do usuário e faz a verificação tanto em caracteres maiúsculos quanto minúsculos.

    System.out.println("Qual é o seu gênero?");
    String genero = scanner.nextLine();

    while(true){

        if (genero.equals("m") || genero.equals("f") || genero.equals("M") || genero.equals("F")) {
            
            break;            

        } else {

            System.out.println("Digite 'm' para masculino e 'f' para feminino: ");
            System.out.println("Digite o seu gênero: ");
            genero = scanner.nextLine();

        }
    }

        //Solicita o estado civil do usuário e faz a verificação tanto em caracteres maiúsculos quanto minúsculos.


    System.out.println("Digite o seu estado civil de acordo com as opções abaixo:");
    System.out.println("'s' - Solteiro(a);\n'c' - Casado(a)\n'v' - Viúvo(a)\n'd' - divorciado(a): ");
    String estadoCivil = scanner.nextLine();

    while(true){

        if (estadoCivil.equals("s") || estadoCivil.equals("S") || estadoCivil.equals("c") || estadoCivil.equals("C") || estadoCivil.equals("v") || estadoCivil.equals("V") || estadoCivil.equals("d") || estadoCivil.equals("D")) {

            break;

        } else {

            System.out.println("Digite o seu estado civil de acordo com as opções abaixo:");
            System.out.println("'s' - Solteiro(a);\n'c' - Casado9a)\n'v' - Viúvo(a)\n'd' - divorciado: ");
            estadoCivil = scanner.nextLine();

        }
    }

    //Retorna ao usuário as informações caso os dados tenham passados nos testes anteriores.

    System.out.println("Seu nome é: " + nome + ".");
    System.out.println("Você tem " + idade + " anos de idade.");
    System.out.println("O seu salário é de:  " + salario + " Reais.");

    if (genero.equals("f") || genero.equals("F")) {

    System.out.println("Você é do gênero feminino.");

        
    } else {
        System.out.println("Você é do gênero masculino.");
    }
    if (estadoCivil.equals("s") || estadoCivil.equals("S")) {
        System.out.println("Seu estado civil é: Solteiro(a).");
        
    } else if (estadoCivil.equals("c") || estadoCivil.equals("C")){
        System.out.println("Seu estado civil é: Casado(a).");
    }else if (estadoCivil.equals("v") || estadoCivil.equals("V")) {
        System.out.println("Seu estado civil é: Viúvo(a).");
    }else {
        System.out.println("Seu estado civil é: Divorciado(a).");
    }

    scanner.close();
}
    
}
