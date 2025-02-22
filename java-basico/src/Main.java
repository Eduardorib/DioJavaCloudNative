import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String retornarNomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

    public static void main(String[] args) {
        // Tudo que é escrito aqui está no escopo deste método

        System.out.println("Hello World!");

        final String BR = "Brasil"; // Final determina que a variável nunca mudará

        String primeiroNome = "Eduardo";
        String segundoNome = "Ribeiro";

        String nomeCompleto = retornarNomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

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

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro nome: ");
        String nome1 = scanner.next();


        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
    }
}