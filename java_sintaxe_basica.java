// Monstrando a sintaxe básica do Java


public class SintaxeBasicaJava {
    
    // Método principal - ponto de entrada do programa
    public static void main(String[] args) {
        
        // DECLARAÇÃO DE VARIÁVEIS
        
        // Tipos primitivos
        int idade = 25;                    // Número inteiro
        double salario = 3500.50;          // Número decimal
        char inicial = 'J';                // Caractere único
        boolean ativo = true;              // Verdadeiro ou falso
        float altura = 1.75f;              // Número decimal (de menor precisão)
        long populacao = 213000000L;       // Número inteiro grande
        
        // Strings (objetos)
        String nome = "Mauro de Lima";
        String cargo = "Desenvolvedor";
        
        System.out.println(" VARIÁVEIS ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Salário: " + salario);
        System.out.println("Funcionário ativo: " + ativo);
        
        // OPERADORES ARITMÉTICOS
        
        int a = 10, b = 3;
        System.out.println("\n OPERADORES ARITMÉTICOS");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Soma (a + b): " + (a + b));
        System.out.println("Subtração (a - b): " + (a - b));
        System.out.println("Multiplicação (a * b): " + (a * b));
        System.out.println("Divisão (a / b): " + (a / b));
        System.out.println("Resto da divisão (a % b): " + (a % b));
        
        // OPERADORES DE COMPARAÇÃO 
        
        System.out.println("\n OPERADORES DE COMPARAÇÃO ");
        System.out.println("a == b: " + (a == b));    // Igual
        System.out.println("a != b: " + (a != b));    // Diferente
        System.out.println("a > b: " + (a > b));      // Maior que
        System.out.println("a < b: " + (a < b));      // Menor que
        System.out.println("a >= b: " + (a >= b));    // Maior ou igual
        System.out.println("a <= b: " + (a <= b));    // Menor ou igual
        
        // ESTRUTURAS CONDICIONAIS 
        
        System.out.println("\n ESTRUTURAS CONDICIONAIS ");
        
        // If-else simples

        if (idade >= 18) {
            System.out.println("Pessoa maior de idade");
        } else {
            System.out.println("Pessoa menor de idade");
        }
        
        // If-else if-else múltiplo

        int nota = 85;
        if (nota >= 90) {
            System.out.println("Conceito: Excelente");
        } else if (nota >= 80) {
            System.out.println("Conceito: Bom");
        } else if (nota >= 70) {
            System.out.println("Conceito: Regular");
        } else {
            System.out.println("Conceito: Insuficiente");
        }
        
        // Switch-case

        int diaSemana = 3;
        String nomeDia;
        switch (diaSemana) {
            case 1:
                nomeDia = "Segunda-feira";
                break;
            case 2:
                nomeDia = "Terça-feira";
                break;
            case 3:
                nomeDia = "Quarta-feira";
                break;
            case 4:
                nomeDia = "Quinta-feira";
                break;
            case 5:
                nomeDia = "Sexta-feira";
                break;
            case 6:
                nomeDia = "Sábado";
                break;
            case 7:
                nomeDia = "Domingo";
                break;
            default:
                nomeDia = "Dia inválido";
        }
        System.out.println("Dia da semana: " + nomeDia);
        
        // ESTRUTURAS DE REPETIÇÃO 
        
        System.out.println("\n ESTRUTURAS DE REPETIÇÃO");
        
        // Loop for tradicional

        System.out.println("Contagem com for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }
        
        // Loop while
        System.out.println("Contagem regressiva com while:");
        int contador = 5;
        while (contador > 0) {
            System.out.println("Restam: " + contador);
            contador--;
        }
        
        // Loop do-while

        System.out.println("Execução com do-while:");
        int num = 1;
        do {
            System.out.println("Executando iteração: " + num);
            num++;
        } while (num <= 3);
        
        //  ARRAYS (VETORES)
        
        System.out.println("\n ARRAYS ");
        
        // Array de inteiros

        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Elementos do array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
        
        // Array de strings com for-each

        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva"};
        System.out.println("Frutas disponíveis:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }
        
        //  MÉTODOS 
        
        System.out.println("\n CHAMADA DE MÉTODOS ");
        
        // Chamando métodos criados na classe

        int resultado = somar(15, 25);
        System.out.println("Resultado da soma: " + resultado);
        
        exibirMensagem("Olá, mundo Java!");
        
        double areaCirculo = calcularAreaCirculo(5.0);
        System.out.println("Área do círculo: " + areaCirculo);
        
        // TRATAMENTO DE EXCEÇÕES
        
        System.out.println("\n TRATAMENTO DE EXCEÇÕES ");
        
        try {
            int divisao = 10 / 0; // Isso causará uma exceção
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida!");
        } finally {
            System.out.println("Bloco finally sempre executa");
        }
        
        // ENTRADA DE DADOS
        
        System.out.println("\n EXEMPLO DE ENTRADA DE DADOS ");
        System.out.println("// Para ler dados do usuário, use:");
        System.out.println("// Scanner scanner = new Scanner(System.in);");
        System.out.println("// String entrada = scanner.nextLine();");
        System.out.println("// int numero = scanner.nextInt();");
    }
    
    // MÉTODOS AUXILIARES 
    
    // Método que retorna um valor (int)

    public static int somar(int x, int y) {
        return x + y;
    }
    
    // Método que não retorna valor (void)
    public static void exibirMensagem(String mensagem) {
        System.out.println("Mensagem: " + mensagem);
    }
    
    // Método que calcula área do círculo

    public static double calcularAreaCirculo(double raio) {
        final double PI = 3.14159; // Constante
        return PI * raio * raio;
    }
    
    // Método que verifica se número é par

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
}