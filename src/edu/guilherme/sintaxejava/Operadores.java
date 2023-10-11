package edu.guilherme.sintaxejava;

public class Operadores {
    public static void main(String [] args) {
        // OPERADORES ARITMÉTICOS
        System.out.println("[ARITMÉTICOS]");
        double num1 = 1234;
        double num2 = 5678;
        double num3 = 9012;
        double num4 = 3456;

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        double modulo = num1 % num2;
        double resultadoAritmetico = (num1 * num2) + (num4 / num3);

        System.out.printf("%.2f + %.2f = %.2f",num1, num2, soma);
        System.out.printf("\n%.2f - %.2f = %.2f",num1, num2, subtracao);
        System.out.printf("\n%.2f * %.2f = %.2f",num1, num2, multiplicacao);
        System.out.printf("\n%.2f / %.2f = %.2f",num1, num2, divisao);
        System.out.printf("\n%.2f %% %.2f = %.2f",num1, num2, modulo);
        System.out.printf("\n(%.2f * %.2f) + (%.2f / %.2f) = %.2f",num1, num2, num4, num3, resultadoAritmetico);

        System.out.println("\n===============");


        // CONCATENAÇÃO COM O OPERADOR +
        System.out.println("[CONCATENAÇÃO +]");

        String concatenacao = 1+1+1+"1"; // Primeiro somam 1+1+1 e então se concatena String "1" ao int 3
        System.out.println("1+1+1+\"1\": " + concatenacao);

        concatenacao = "1"+1+1+1; // No momento em que se concatena com o primeiro String, o resto se torna concatenação
        System.out.println("\"1\"+1+1+1: " + concatenacao);

        concatenacao = 1+1+"1"+1;
        System.out.println("1+1+\"1\"+1: " + concatenacao);

        concatenacao = "1"+(1+1+1); // Por conta do parenteses, primeiro há a soma para então concatenar
        System.out.println("\"1\"+(1+1+1): " + concatenacao);

        System.out.println("===============");


        // OPERADORES UNÁRIOS
        System.out.println("[UNÁRIOS]");

        int numero = 5;
        System.out.println(-numero); // Negamos a variável na impressão..
        System.out.println(numero); // ..mas a variável em si permanece inalterada

        numero = - numero; // Agora negamos a variável..
        System.out.println(numero); // ..alterando-a definitivamente

        // "numero = + numero" não funcionaria para reverter para positivo, pois o + está como operador aritmético de soma
        numero = numero * -1; // Multiplicamos por -1 para tornar um negativo em positivo
        System.out.println(numero);

        numero++; // "numero = numero + 1"
        System.out.println(numero);
        System.out.println(++numero); // Primeiro há o incremento do número e logo depois é imprimido
        System.out.println(numero++); // O número é logo imprimido e depois há o incremento do seu valor
        System.out.println(numero); // É impresso o número, após ser anteriormente incrementado

        System.out.println(--numero); // O mesmo pode ser feito com o decremento

        boolean verdadeiro = true;
        System.out.println(!verdadeiro); // Imprime a negação da variável booleana
        System.out.println(verdadeiro);

        verdadeiro = !verdadeiro; // Torna o valor da variável a negação da sua expressão booleana
        System.out.println(verdadeiro);

        System.out.println("===============");


        // OPERADOR TERNÁRIO
        System.out.println("[TERNÁRIO]");

        int a = 5;
        int b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso"; // IF para checar se A é igual a B, ? se true : se false
        System.out.println(resultado);
        
        a++;
        resultado = a==b ? "Verdadeiro" : "Falso"; // Repete a condicional para ela checar com o novo valor de A
        System.out.println(resultado);

        System.out.println("===============");


        // OPERADORES RELACIONAIS
        System.out.println("[RELACIONAIS]");

        int numero1 = 3;
        int numero2 = 2;

        boolean simNao = numero1 == numero2; // Checa se número1 é igual ao número2
        System.out.println(numero1 + " é igual a " + numero2 + "? " + simNao);

        simNao = numero1 != numero2; // Checa se número1 é diferente de número2
        System.out.println(numero1 + " é diferente de " + numero2 + "? " + simNao);

        simNao = numero1 > numero2; // Checa se número1 é maior que número2
        System.out.println(numero1 + " é maior que " + numero2 + "? " + simNao);

        simNao = numero1 < numero2; // Checa se número1 é menor que número2
        System.out.println(numero1 + " é menor que " + numero2 + "? " + simNao);

        numero2++; // Número2 incrementa 1 e agora é igual a 3
        simNao = numero1 >= numero2; // Checa se número1 é maior ou igual a número2
        System.out.println(numero1 + " é maior ou igual a " + numero2 + "? " + simNao);

        String nomeUm = "GUILHERME";
        String nomeDois = "GUILHERME";
        String nomeTres = new String("GUILHERME");
        
        System.out.println("NomeUm é igual ao NomeDois? " + (nomeUm == nomeDois));
        System.out.println("NomeUm é igual ao NomeTres? " + (nomeUm == nomeTres));
        // equals() compara o CONTEÚDO de dois OBJETOS
        System.out.println("O conteúdo de NomeUm é igual ao do NomeTres? " + nomeUm.equals(nomeTres));

        System.out.println("===============");
        

        // OPERADORES LÓGICOS
        System.out.println("[LÓGICOS]");

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) { // Operador lógico E
            System.out.println("As duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) { // Operador lógico OU
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.print("===============\nFim.");
    }
}
