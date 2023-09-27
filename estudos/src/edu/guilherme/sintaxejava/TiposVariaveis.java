public class TiposVariaveis {
    
    public static void main(String [] args) {
        // TIPOS PRIMITIVOS
        byte byteMaximo = 127;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // "short numeroCurto2 = numeroNormal" não é possível, pois excederia o valor máximo de um short

        int idade = 20;
        long CPF = 98765432109L;
        final float PI = 3.14F;
        double salarioMinimo = 1320;
        char ultimaLetra = 'z';
        boolean verdadeiro = false;

        System.out.println("Maior valor de um byte: " + byteMaximo + "\nNúmero curto: " + numeroCurto + "\nNúmero inteiro normal: " + numeroNormal + "\nIdade: " + idade + "\nCPF fictício: " + CPF + "\nValor de Pi: " + PI + "\nSalario Mínimo atual: " + salarioMinimo + "\nÚltima letra do alfabeto: " + ultimaLetra);
        System.out.println("\nTodas essas afirmativas testam os todos os 8 tipos pritivos? " + verdadeiro);
        
        verdadeiro = true;
        System.out.println("\nAgora temos todos os 8 tipos primitivos testados? " + verdadeiro);

        // STRING
        String primeiroNome = "Guilherme";
        String segundoNome = "Henrique";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        
        System.out.println("\nNome: " + nomeCompleto);
    }

    // MÉTODO PARA CONCATENAR O PRIMEIRO COM O SEGUNDO NOME
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
