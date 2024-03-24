public class Exercicio04 {
    public static void  main(String args[]) {
        
        double popA = 80000;
        double tacA = 0.03;

        double popB = 200000;
        double tacB = 0.015;
        
        int anos = 0;

       do {
        anos++;
        popA = popA + (popA * tacA);
        popB = popB + (popB * tacB);

       } while (popA < popB);

       System.out.println("Em " + anos + " anos a população do país A alcançará a população do país B.");
    }
    
}
