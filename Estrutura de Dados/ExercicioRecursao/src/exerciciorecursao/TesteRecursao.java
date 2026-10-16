/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorecursao;

/**
 *
 * @author mayco
 */
// Arquivo: Main.java
public class TesteRecursao {
    public static void main(String[] args) {

        System.out.println("=== TESTES: 1. Soma dos Algarismos ===");
        // Teste 1: Paragem imediata (número menor que 10)
        System.out.println("Entrada 0 -> Resultado: " + Recursao.somarAlgarismos(0)); 
        // Teste 2
        System.out.println("Entrada 507 -> Resultado: " + Recursao.somarAlgarismos(507)); 
        // Teste 3
        System.out.println("Entrada 1234 -> Resultado: " + Recursao.somarAlgarismos(1234)); 
        System.out.println();

        System.out.println("=== TESTES: 2. Cálculo de Potência ===");
        // Teste 1: Paragem imediata (expoente 0)
        System.out.println("Base 7, Expoente 0 -> Resultado: " + Recursao.calcularPotencia(7, 0)); 
        // Teste 2
        System.out.println("Base 3, Expoente 3 -> Resultado: " + Recursao.calcularPotencia(3, 3)); 
        // Teste 3
        System.out.println("Base 2, Expoente 5 -> Resultado: " + Recursao.calcularPotencia(2, 5)); 
        System.out.println();

        System.out.println("=== TESTES: 3. Decimal para Binário ===");
        // Teste 1: Paragem imediata (entrada 0)
        System.out.println("Entrada 0 -> Resultado: \"" + Recursao.converterParaBinario(0) + "\""); 
        // Teste 2
        System.out.println("Entrada 10 -> Resultado: \"" + Recursao.converterParaBinario(10) + "\""); 
        // Teste 3
        System.out.println("Entrada 13 -> Resultado: \"" + Recursao.converterParaBinario(13) + "\""); 
        System.out.println();

        System.out.println("=== TESTES: 4. Soma dos Elementos da Lista ===");
        
        // Teste 1: Paragem imediata (Lista Vazia / null)
        No listaVazia = null;
        System.out.println("Vetor/Lista Vazio -> Resultado: " + Recursao.somarLista(listaVazia)); 

        // Teste 2: Lista {5, -2, 3}
        No l2_n3 = new No(3, null);
        No l2_n2 = new No(-2, l2_n3);
        No l2_n1 = new No(5, l2_n2);
        System.out.println("Lista {5, -2, 3} -> Resultado: " + Recursao.somarLista(l2_n1)); 

        // Teste 3: Lista {2, 4, 6, 8}
        No l3_n4 = new No(8, null);
        No l3_n3 = new No(6, l3_n4);
        No l3_n2 = new No(4, l3_n3);
        No l3_n1 = new No(2, l3_n2);
        System.out.println("Lista {2, 4, 6, 8} -> Resultado: " + Recursao.somarLista(l3_n1)); 
    }
}
