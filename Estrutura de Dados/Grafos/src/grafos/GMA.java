/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

/**
 *
 * @author Alunos
 */
public class GMA {
    // Atributos principais
    private int numVertices;
    private int[][] matrizAdj;
    private boolean direcional;
    private int verticesAtuais;

    // Construtor: recebe a quantidade de vértices e o tipo de aresta (true para direcional, false para bidirecional)
    public GMA(int numVertices, boolean direcional) {
        this.numVertices = numVertices;
        this.direcional = direcional;
        this.matrizAdj = new int[numVertices][numVertices];
        this.verticesAtuais = 0;
        
        // Inicializa a matriz com 0 (indicando que não há arestas inicialmente)
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                matrizAdj[i][j] = 0;
            }
        }
    }

    public void adicionarVertice(int vertice) {
        if (verticesAtuais < numVertices) {
            verticesAtuais++;
            System.out.println("Vértice " + vertice + " adicionado com sucesso.");
        } else {
            System.out.println("Erro: O grafo atingiu o limite máximo de vértices.");
        }
    }

    // – RemoverVertice(Vertice)
    public void removerVertice(int vertice) {
        if (vertice >= 0 && vertice < numVertices) {
            // Zera a linha e a coluna correspondentes ao vértice na matriz
            for (int i = 0; i < numVertices; i++) {
                matrizAdj[vertice][i] = 0;
                matrizAdj[i][vertice] = 0;
            }
            System.out.println("Vértice " + vertice + " removido/limpo do grafo.");
        } else {
            System.out.println("Erro: Vértice inválido.");
        }
    }

    // – Adicionar Arestas com Peso (VerticeOrigem, VerticeDestino, Peso)
    public void adicionarArestaComPeso(int origem, int destino, int peso) {
        if (origem >= 0 && origem < numVertices && destino >= 0 && destino < numVertices) {
            // Verifica se o grafo é direcional ou não antes de setar a matriz
            if (this.direcional) {
                // Aresta direcional: vai apenas de origem -> destino
                matrizAdj[origem][destino] = peso;
            } else {
                // Aresta bidirecional: vai de origem <-> destino
                matrizAdj[origem][destino] = peso;
                matrizAdj[destino][origem] = peso;
            }
            System.out.println("Aresta com peso " + peso + " adicionada entre " + origem + " e " + destino + ".");
        } else {
            System.out.println("Erro: Vértices de origem ou destino inválidos.");
        }
    }

    // – Adicionar Arestas sem Peso (VerticeOrigem, VerticeDestino)
    public void adicionarArestaSemPeso(int origem, int destino) {
        // Se for sem peso, consideramos o peso padrão como 1 para indicar que a aresta existe
        adicionarArestaComPeso(origem, destino, 1);
    }

    // – Imprime Matriz de Adjacencias()
    public void imprimirMatrizAdjacencias() {
        System.out.println("\n--- Matriz de Adjacências ---");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrizAdj[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------\n");
    }
}
