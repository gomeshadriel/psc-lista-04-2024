public class exercicio09 {
    public static void main(String[] args) {
        //declaro uma variavel com valor zero para iniciar a verificação.
        int numero = 0;
        //inicia a verificação em quanto o número for menor que 50 um teste verificando o resto da divisao do número por 2 se diferente de zero o numero é imprimido se igual nada acontece e o próximo numero é verificado.
        while (numero < 50) {
            if( numero % 2 != 0){
                System.out.println(numero);
            }
            numero++;
            
        }
    }
    
}
