package Exercicio03;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Faturamento {
    private List<Double> valores;

    public Faturamento(String caminhoArquivo) throws IOException {
        this.valores = lerDadosFaturamento(caminhoArquivo);
    }

    private List<Double> lerDadosFaturamento(String caminhoArquivo) throws IOException {
        List<Double> valores = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(new File(caminhoArquivo));
        JsonNode faturamentoArray = rootNode.get("faturamento");
        for (JsonNode node : faturamentoArray) {
            double valor = node.get("valor").asDouble();
            if (valor > 0) {
                valores.add(valor);
            }
        }
        return valores;
    }

    public double menorValor() {
        return valores.stream().min(Double::compare).orElse(0.0);
    }

    public double maiorValor() {
        return valores.stream().max(Double::compare).orElse(0.0);
    }

    public double mediaMensal() {
        return valores.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public long diasAcimaDaMedia() {
        double media = mediaMensal();
        return valores.stream().filter(valor -> valor > media).count();
    }
}