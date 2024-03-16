package View;

import Controller.ThreadVetor;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[1000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100) + 1;
        }

        ThreadVetor threadPar = new ThreadVetor(2, vetor);
        ThreadVetor threadImpar = new ThreadVetor(1, vetor);

        threadPar.start();
        threadImpar.start();
    }
}