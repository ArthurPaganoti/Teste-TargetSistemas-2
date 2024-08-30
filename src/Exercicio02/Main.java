package Exercicio02;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se está na sequência de Fibonacci: ");
        int numeroParaVerificar = scanner.nextInt();

        Fibonacci fibonacci = new Fibonacci();
        List<Integer> sequenciaFibonacci = fibonacci.gerarSequenciaFibonacci(numeroParaVerificar * 2); // Gera uma sequência maior para garantir a verificação
        boolean estaNaSequencia = fibonacci.numeroEstaNaSequenciaFibonacci(numeroParaVerificar, sequenciaFibonacci);

        if (estaNaSequencia) {
            System.out.println("O número " + numeroParaVerificar + " está na sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroParaVerificar + " não está na sequência de Fibonacci.");
        }
    }
}