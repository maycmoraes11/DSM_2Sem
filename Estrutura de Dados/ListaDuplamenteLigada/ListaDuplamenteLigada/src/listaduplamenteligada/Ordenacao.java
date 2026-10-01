/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaduplamenteligada;

/**
 *
 * @author Alunos
 */
public class ListaOrdenada {
    NoDuplo primeiroNo;
    NoDuplo ultimoNo;
    int qtdNo;
    
public void adicionar(Object info) {
        NoDuplo novoNo = new NoDuplo(info);
        if (qtdNo == 0) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            ultimoNo.proximo = novoNo;
            novoNo.anterior = ultimoNo;
            ultimoNo = novoNo;
        }
        qtdNo++;
    }

    private NoDuplo percorrerLista(int indice) {
        if (indice < 0 || indice >= qtdNo) return null;
        NoDuplo atual = primeiroNo;
        for (int i = 0; i < indice; i++) {
            atual = atual.proximo;
        }
        return atual;
    }

    public Object getInfo(int indice) {
        NoDuplo no = percorrerLista(indice);
        return (no != null) ? no.info : null;
    }

    public void setInfo(int indice, Object info) {
        NoDuplo no = percorrerLista(indice);
        if (no != null) {
            no.info = info;
        }
    }
    
// BUBBLE SORT
public void bubbleSort() {
    for (int i = 0; i < qtdNo - 1; i++) {
        NoDuplo atual = primeiroNo;
        for (int j = 0; j < qtdNo - 1 - i; j++) {
            if ((int) atual.info > (int) atual.proximo.info) {
                Object aux = atual.info;
                atual.info = atual.proximo.info;
                atual.proximo.info = aux;
            }
            atual = atual.proximo;
        }
    }
}

// SELECTION SORT
public void selectionSort() {
    for (NoDuplo i = primeiroNo; i != null; i = i.proximo) {
        NoDuplo menor = i;
        for (NoDuplo j = i.proximo; j != null; j = j.proximo) {
            if ((int) j.info < (int) menor.info) menor = j;
        }
        Object aux = i.info;
        i.info = menor.info;
        menor.info = aux;
    }
}

// INSERTION SORT
public void insertionSort() {
    for (int i = 1; i < qtdNo; i++) {
        Object chave = getInfo(i);
        int j = i - 1;
        while (j >= 0 && (int) getInfo(j) > (int) chave) {
            setInfo(j + 1, getInfo(j));
            j--;
        }
        setInfo(j + 1, chave);
    }
}

// BUSCA LINEAR (retorna o índice ou -1)
public int buscaLinear(Object valor) {
    NoDuplo atual = primeiroNo;
    for (int i = 0; i < qtdNo; i++) {
        if (atual.info.equals(valor)) return i;
        atual = atual.proximo;
    }
    return -1;
}

// BUSCA BINÁRIA (requer lista ordenada)
public int buscaBinaria(int valor) {
    int inicio = 0, fim = qtdNo - 1;
    while (inicio <= fim) {
        int meio = (inicio + fim) / 2;
        int valorMeio = (int) getInfo(meio);
        if (valorMeio == valor) return meio;
        if (valorMeio < valor) inicio = meio + 1;
        else fim = meio - 1;
    }
    return -1;
}}
