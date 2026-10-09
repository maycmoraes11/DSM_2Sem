/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaduplamenteligada;

public class Ordenacao {

    // ORDENAÇÃO POR TROCA (BUBBLE SORT) - CRESCENTE
    public static int[] ordenacaoTrocaCrescente(int[] vetor) {
        int[] v = vetor.clone(); // Cria cópia para não estragar o vetor original
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
        return v;
    }

    // ORDENAÇÃO POR TROCA - DECRESCENTE
    public static int[] ordenacaoTrocaDecrescente(int[] vetor) {
        int[] v = vetor.clone();
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] < v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
        return v;
    }

    // BUSCA LINEAR
    public static int buscaLinear(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) return i;
        }
        return -1;
    }

    // BUSCA BINÁRIA
    public static int buscaBinaria(int[] vetor, int valor) {
        int inicio = 0, fim = vetor.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == valor) return meio;
            if (vetor[meio] < valor) inicio = meio + 1;
            else fim = meio - 1;
        }
        return -1;
    }

    // ORDENAÇÃO POR INSERÇÃO (INSERTION SORT)
    public static int[] ordenacaoInsercao(int[] vetor) {
        int[] v = vetor.clone();
        for (int i = 1; i < v.length; i++) {
            int chave = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = chave;
        }
        return v;
    }

    // ORDENAÇÃO POR SELEÇÃO (SELECTION SORT)
    public static int[] ordenacaoSelecao(int[] vetor) {
        int[] v = vetor.clone();
        for (int i = 0; i < v.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[menor]) menor = j;
            }
            int aux = v[i];
            v[i] = v[menor];
            v[menor] = aux;
        }
        return v;
    }
}