package Exercicio05;

public class Main {
    public static void main(String[] args) {
        StringInverter inverter = new StringInverter();
        String original = "Exemplo de string";
        String invertida = inverter.inverterString(original);
        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
    }
}