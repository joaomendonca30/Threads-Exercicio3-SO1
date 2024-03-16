package Controller;

public class ThreadVetor extends Thread {
    private int valor;
    private int[] vetor;
    private static final double NANOSEGUNDOS_PARA_SEGUNDOS = 1e9;

    public ThreadVetor(int valor, int[] vetor) {
        this.valor = valor;
        this.vetor = vetor;
    }

    @Override
    public void run() {
        long tempoInicial = System.nanoTime();

        if (valor % 2 == 0) {
            for (int i = 0; i < vetor.length; i++) {
                int t = vetor[i] * 2;
            }
        } else {
            for (int num : vetor) {
                int t = num * 2;
            }
        }

        long tempoFinal = System.nanoTime();
        double segundos = (tempoFinal - tempoInicial) / NANOSEGUNDOS_PARA_SEGUNDOS;
        System.out.println("Tempo decorrido: " + segundos + " s.");
    }
}
