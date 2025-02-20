//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Tipos primitivos
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // Se o cep começar por zero, não irá armazenar corretamente. Seria melhor String
        long cpf = 1234567890L; // Mesmo problema. Terminar com um "l" para longs
        float pi = 3.14f; // Terminar com um "f" para floats
        double salario = 10000.33;

        final double PI = 3.14; // Constante, por convenção, escreve em caixa alta

        // Classe String
        String nome = "Eduardo";
    }
}