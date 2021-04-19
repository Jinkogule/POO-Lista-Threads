package lista7.questao2;

public class ThreadContador extends java.lang.Thread {
    private String nome;
    private int valor;

    public ThreadContador(String nome, int valor){
        this.nome = nome;
        this.valor = valor;
    }

    public void run(){
        for (int i=0; i<20; i++){

            if (valor == 1){
                Counter.increment();
            }
            if (valor == -1){
                Counter.decrement();
            }

            try {
                Thread.sleep((int) ((Math.random() * (500 - 0)) + 0));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome+" --> "+Counter.count);
        }
    }
}