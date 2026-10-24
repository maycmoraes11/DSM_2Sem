/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafos;

/**
 *
 * @author Alunos
 */

public class MainGMA {
    public static void main(String[] args) {
        // Cria um grafo com 4 vértices e do tipo BIDIRECIONAL (false)
        GMA grafo = new GMA(4, false);

        // Adicionando vértices (índices 0 a 3)
        grafo.adicionarVertice(0);
        grafo.adicionarVertice(1);
        grafo.adicionarVertice(2);
        grafo.adicionarVertice(3);

        // Adicionando arestas com e sem peso
        grafo.adicionarArestaSemPeso(0, 1);       // Aresta entre 0 e 1 (sem peso -> valor 1)
        grafo.adicionarArestaComPeso(1, 2, 5);    // Aresta com peso 5 entre 1 e 2
        grafo.adicionarArestaComPeso(2, 3, 10);   // Aresta com peso 10 entre 2 e 3

        // Imprime a matriz gerada
        grafo.imprimirMatrizAdjacencias();
    }
}