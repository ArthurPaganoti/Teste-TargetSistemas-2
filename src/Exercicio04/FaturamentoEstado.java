package Exercicio04;

public class FaturamentoEstado {
    private String estado;
    private double valor;

    public FaturamentoEstado(String estado, double valor) {
        this.estado = estado;
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public double getValor() {
        return valor;
    }
}