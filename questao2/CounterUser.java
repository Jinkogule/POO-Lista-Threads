package lista7.questao2;

public class CounterUser {
    public static void main(String[] args) {
        ThreadContador thread1 = new ThreadContador("Thread 1",1);
        ThreadContador thread2 = new ThreadContador("Thread 2",-1);

        thread1.start();
        thread2.start();
    }
}
