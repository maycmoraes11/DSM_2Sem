/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arvorebinaria;

/**
 *
 * @author Alunos
 */

    //EXERCÍCIO 1: Crie uma classe Árvore Binária que armazene valores inteiros em 
    //seus nós de forma ordenada a esquerda valores menores e a direita valores maiores que o Nó Pai.
public class ArvoreBinaria {

   //atributo
    private NoBinario raiz;
    
    public void addNo(int valor) {
        //chama  a função recursiva passandoraiz como ref.
        addNo(valor, this.raiz);}
        
    
    private void addNo(int valor, NoBinario raizAtual) {
        //função recursiva
        //regras: se valor < raiz.valor, adiciona a esq
        //se não, add à dir.
        
        //Primeiro condicional: raiz vazia, adiciona na próproia raiz
        //Segunda condicional: raiz não está vazia - verifica se valor é menor ou maior que raiz.valor
        //chama de a recursão passando esq, ou dir como parâmetro
        if (raizAtual == null) //é o condicional de parada
        raizAtual = new NoBinario(valor);
     else 
        { //recursão
            if (valor < raiz.getValor()) //preenche à esquerda
                addNo(valor, raiz.getEsquerda());
             else { // preenche à direita
                addNo(valor, raiz.getDireita());
        }}}
    
    
    //EXERCICIO 2: Crie um método que busca um determinado nó na árvore retornando 
    //a profundidade do nó ou -1 se o nó procurado não existir.
    public int buscarProfundidade(int valorProcurado) {
        return buscarProfundidadeRecursiva(this.raiz, valorProcurado, 0);
    }

    private int buscarProfundidadeRecursiva(NoBinario atual, int valor, int nivel) {
        // Condição de paragem 1: se chegou ao fim e não achou, retorna -1
        if (atual == null) {
            return -1;
        }

        // Condição de paragem 2: achou o valor! Retorna a profundidade atual
        if (atual.getValor() == valor) {
            return nivel;
        }

        // Redução do problema: se o valor for menor, vai para a esquerda aumentando o nível em 1
        if (valor < atual.getValor()) {
            return buscarProfundidadeRecursiva(atual.getEsquerda(), valor, nivel + 1);
        } 
        
        // Se for maior, vai para a direita aumentando o nível em 1
        return buscarProfundidadeRecursiva(atual.getDireita(), valor, nivel + 1);
    }
    
    //EXERCICIO 3: Crie um método que percorra toda a árvore imprimindo o valor e profundidade dos nós.
    public void imprimirArvoreComProfundidade() {
        imprimirRecursivo(this.raiz, 0);
    }

    private void imprimirRecursivo(NoBinario atual, int nivel) {
        // Condição de paragem: se o nó for nulo, para a execução desta ramificação
        if (atual == null) {
            return;
        }

        // Percorre a sub-árvore esquerda
        imprimirRecursivo(atual.getEsquerda(), nivel + 1);

        // Imprime o valor do nó atual e a sua profundidade (nível)
        System.out.println("Valor: " + atual.getValor() + " | Profundidade: " + nivel);

        // Percorre a sub-árvore direita
        imprimirRecursivo(atual.getDireita(), nivel + 1);
    }
    
    //EXERCÍCIO 4: Crie uma classe Árvore capaz de armazenar qualquer quantidade de nós filho.
    import java.util.ArrayList;
    import java.util.List;

public class NoMultiplo {
    int valor;
    List<NoMultiplo> filhos;

    public NoMultiplo(int valor) {
        this.valor = valor;
        this.filhos = new ArrayList<>();
    }

    // Método para adicionar um filho a este nó
    public void adicionarFilho(NoMultiplo filho) {
        this.filhos.add(filho);
    }
}
}



