package Exercicio04;

import java.util.List;

public class Distribuidora {
    private List<FaturamentoEstado> faturamentos;

    public Distribuidora(List<FaturamentoEstado> faturamentos) {
        this.faturamentos = faturamentos;
    }

    public double calcularTotalFaturamento() {
        return faturamentos.stream().mapToDouble(FaturamentoEstado::getValor).sum();
    }

    public void calcularPercentualRepresentacao() {
        double total = calcularTotalFaturamento();
        for (FaturamentoEstado faturamento : faturamentos) {
            double percentual = (faturamento.getValor() / total) * 100;
            System.out.printf("Estado: %s - Percentual: %.2f%%\n", faturamento.getEstado(), percentual);
        }
    }
}