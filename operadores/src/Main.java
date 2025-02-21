//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Aritméticos
        double soma = 10.5 + 15.7;
        int subtracao = 50 - 25;
        int multiplicacao = 50 * 2;
        int divisao = 15 / 3;
        int modulo = 18 % 3;

        String concatenado = "Linguagem" + " Java";

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1"; // Soma 3 e depois concatena

        concatenacao = 1 + "1" + 1 + 1;

        concatenacao = 1 + "1" + 1 + 1;

        concatenacao = "1" + (1+1+1); // Realiza o que está nos parênteses e depois concatena com o resto

        // Ternário

        int a = 5;
        int b = 6;

        String resultado = a == b ? "igual" : "diferente";
    }
}