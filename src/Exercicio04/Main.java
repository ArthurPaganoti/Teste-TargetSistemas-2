package Exercicio04;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FaturamentoEstado> faturamentos = Arrays.asList(
            new FaturamentoEstado("SP", 67836.43),
            new FaturamentoEstado("RJ", 36678.66),
            new FaturamentoEstado("MG", 29229.88),
            new FaturamentoEstado("ES", 27165.48),
            new FaturamentoEstado("Outros", 19849.53)
        );

        Distribuidora distribuidora = new Distribuidora(faturamentos);
        distribuidora.calcularPercentualRepresentacao();
    }
}