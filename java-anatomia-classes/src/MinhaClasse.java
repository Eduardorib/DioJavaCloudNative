public class MinhaClasse {
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
    }

}
