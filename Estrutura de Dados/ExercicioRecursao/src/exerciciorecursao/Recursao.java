/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciorecursao;

/**
 *
 * @author mayco
 */

public class Recursao {

    // EXERCÍCIO 1: Soma dos Algarismos
    public static int somarAlgarismos(int n) {
        // CONDIÇÃO DE PARAGEM:
        // Se o número for menor que 10, ele tem apenas 1 dígito.
        if (n < 10) {
            return n;
        }

        // REDUÇÃO DO PROBLEMA:
        // Exemplo com 1234:
        // (n % 10) pega o último dígito (4)
        // (n / 10) retira o último dígito, sobrando o resto (123)
        // Chamamos a função de novo com o número menor.
        return (n % 10) + somarAlgarismos(n / 10);
    }

    // EXERCÍCIO 2: Cálculo de Potência
    public static int calcularPotencia(int base, int expoente) {
        // CONDIÇÃO DE PARAGEM:
        // Qualquer número elevado a 0 dá 1. 
        if (expoente == 0) {
            return 1;
        }

        // REDUÇÃO DO PROBLEMA:
        // Exemplo: 2^5 = 2 * (2^4)
        // Multiplicamos pela base e reduzimos o expoente em 1 a cada chamada.
        return base * calcularPotencia(base, expoente - 1);
    }

    // EXERCÍCIO 3: Conversão de Decimal para Binário
    public static String converterParaBinario(int n) {
        // CONDIÇÃO DE PARAGEM:
        // Se o número for 0 ou 1, já é o binário. Para aqui.
        if (n <= 1) {
            return String.valueOf(n);
        }

        // REDUÇÃO DO PROBLEMA:
        // Dividimos o número por 2 (n / 2) para andar na árvore de divisões
        // e juntamos com o resto da divisão atual (n % 2) no final da String.
        return converterParaBinario(n / 2) + (n % 2);
    }

    // EXERCÍCIO 4: Soma dos Elementos da Lista Ligada
    public static int somarLista(No no) {
        // CONDIÇÃO DE PARAGEM:
        // Se o nó for nulo (chegamos ao fim da lista / vazia),
        // paramos e retorna 0.
        if (no == null) {
            return 0;
        }

        // REDUÇÃO DO PROBLEMA:
        // Somamos o valor da caixinha atual com o resultado da chamada recursiva
        // passando a setinha para a próxima caixinha (no.proximo).
        return no.valor + somarLista(no.proximo);
    }
}