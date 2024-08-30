package Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public List<Integer> gerarSequenciaFibonacci(int limite) {
        List<Integer> sequencia = new ArrayList<>();
        int a = 0, b = 1;
        sequencia.add(a);
        sequencia.add(b);

        while (b <= limite) {
            int proximo = a + b;
            a = b;
            b = proximo;
            sequencia.add(b);
        }

        return sequencia;
    }

    public boolean numeroEstaNaSequenciaFibonacci(int numero, List<Integer> sequencia) {
        return sequencia.contains(numero);
    }
}