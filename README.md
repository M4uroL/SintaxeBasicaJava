# Sintaxe Básica do Java

Este projeto apresenta exemplos práticos da sintaxe fundamental da linguagem **Java**, abordando variáveis, operadores, estruturas condicionais, loops, arrays, métodos e tratamento de exceções. Ideal para iniciantes que desejam compreender a base da programação em Java.

## 📜 Código

```java
// Monstrando a sintaxe básica do Java
public class SintaxeBasicaJava {
    public static void main(String[] args) {
        int idade = 25;
        double salario = 3500.50;
        String nome = "Mauro de Lima";
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Salário: " + salario);
        // Restante do código demonstra operadores, condicionais, loops, arrays e métodos
    }
    public static int somar(int x, int y) { return x + y; }
    public static void exibirMensagem(String mensagem) { System.out.println("Mensagem: " + mensagem); }
    public static double calcularAreaCirculo(double raio) { final double PI = 3.14159; return PI * raio * raio; }
    public static boolean ehPar(int numero) { return numero % 2 == 0; }
}


