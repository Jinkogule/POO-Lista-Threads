package lista7.questao1;

public class Q1_Main {
    public static void main(String[] args) {
        Thread.valorDeN();

        Thread thread1 = new Thread("Thread 1");
        Thread thread2 = new Thread("Thread 2");

        thread1.start();
        thread2.start();
    }
}
