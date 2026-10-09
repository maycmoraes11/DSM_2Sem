/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author mayco
 */
public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;
    
    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        if (this.tamanho == 0) {
           this.inicio = celula; 
        }
        else { this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }
    
    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" + "inicio=" + inicio + '}';
    }
    
    if (this.tamanho == 0) {
    return "[]"
}
    
    StringBuilder builder = new StringBuilder();
    
    No<T> atual = this.inicio;
    for (int i = 0; i < this.tamanho - 1; i++) {
        builder.append(atual.getElemento()).append(str:",");
        atual = atual.getProximo();
    }
    builder.append(atual.getElemento());
}
