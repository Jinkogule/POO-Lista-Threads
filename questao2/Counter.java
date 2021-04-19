package lista7.questao2;

public class Counter {
    public static int count = 0;

    public static synchronized void increment(){
        if (count<3){
            count++;
        }
    }

    public static synchronized void decrement(){
        if (count != 0) {
            count--;
        }
    }
}
