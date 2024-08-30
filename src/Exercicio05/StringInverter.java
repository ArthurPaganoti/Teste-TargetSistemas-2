package Exercicio05;

public class StringInverter {
    public String inverterString(String input) {
        String invertida = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            invertida += input.charAt(i);
        }
        return invertida;
    }
}