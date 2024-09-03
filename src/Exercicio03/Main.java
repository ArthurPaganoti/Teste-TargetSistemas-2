package Exercicio03;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Faturamento faturamento = new Faturamento("caminho/para/seu/arquivo.json");

            System.out.println("Menor valor de faturamento: " + faturamento.menorValor());
            System.out.println("Maior valor de faturamento: " + faturamento.maiorValor());
            System.out.println("Número de dias com faturamento acima da média: " + faturamento.diasAcimaDaMedia());
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de faturamento: " + e.getMessage());
        }
    }
}