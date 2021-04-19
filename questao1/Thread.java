package lista7.questao1;

import java.util.ArrayList;
import java.util.Scanner;

public class Thread extends java.lang.Thread {
    private String nome;
    private static int N;

    public Thread(String nome){
        this.nome = nome;
    }

    public void run(){
        ArrayList primos = new ArrayList();

        for (int i=1; i<=N; i++) {
            if (primo_verif(i)) {
                primos.add(i);
            }
        }
        System.out.println(nome+" --> "+primos.stream().count()+" primos.\n"+primos+"\n");
    }

    private static boolean primo_verif(int n) {
        for (int i=2; i<n; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void valorDeN(){
        System.out.print("Valor de N: ");
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
    }

}
