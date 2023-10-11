package edu.guilherme.estruturaexcepcional;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2375604");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("CEP inserido não corresponde às regras de negócio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        // Simulação de formatação de CEP
        return "23.756-045";
    }
}
