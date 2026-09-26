/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaduplamenteligada;

/**
 *
 * @author Alunos
 */
public class ListaDuplamenteLigada {
    // Atributos
    NoDuplo primeiroNo;
    NoDuplo ultimoNo;
    int qtdNo;
    
    public void adicionar(Object info){
        //adiciona um novo nó no final da lista
     NoDuplo NovoNo = new NoDuplo(info);
            if (qtdNo == 0) {
                this.primeiroNo = NovoNo;
                this.ultimoNo = NovoNo; 
            } else {
                this.ultimoNo.proximo = NovoNo; // adiciona um novo nó após o ultimo nó
                NovoNo.anterior = this.ultimoNo; // salva o nó anterior ao que foi criado para não se perder como ultimo nó
                this.ultimoNo = NovoNo; // atualiza o ultimo nó como sendo o atual adicionado.
            }
            this.qtdNo++;    
             
    }      

        
    
    public void adicionar(Object info, int indice){
        if (indice < 0 || indice > qtdNo) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }
        
        // Se for para adicionar no final, reaproveita o método adicionar básico
        if (indice == qtdNo) {
            adicionar(info);
            return;
        }

        NoDuplo novoNo = new NoDuplo(info);

        // Se for para adicionar no início
        if (indice == 0) {
            novoNo.proximo = primeiroNo;
            primeiroNo.anterior = novoNo;
            primeiroNo = novoNo;
        } else {
            // Adicionar no meio da lista
            NoDuplo noAtual = getNo(indice);
            NoDuplo noAnterior = noAtual.anterior;

            novoNo.proximo = noAtual;
            novoNo.anterior = noAnterior;
            noAnterior.proximo = novoNo;
            noAtual.anterior = novoNo;
        }

        this.qtdNo++;
    }
                
    

        //remove o nó correspondente ao índice
    public void remover(int indice) {
        if (indice < 0 || indice >= qtdNo) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }

        NoDuplo noRemover = getNo(indice);

        // Se for o único nó da lista
        if (qtdNo == 1) {
            primeiroNo = null;
            ultimoNo = null;
        } 
        // Se for o primeiro nó
        else if (indice == 0) {
            primeiroNo = primeiroNo.proximo;
            primeiroNo.anterior = null;
        } 
        // Se for o último nó
        else if (indice == qtdNo - 1) {
            ultimoNo = ultimoNo.anterior;
            ultimoNo.proximo = null;
        } 
        // Se estiver no meio da lista
        else {
            noRemover.anterior.proximo = noRemover.proximo;
            noRemover.proximo.anterior = noRemover.anterior;
        }

        this.qtdNo--;
    }
    
    private NoDuplo getNo(int indice) {
        return percorrerLista(indice);
    }

    // Retorna a informação guardada no nó da posição
    public Object getInfo(int indice) {
        NoDuplo no = getNo(indice);
        return (no != null) ? no.info : null;
    }

    // Altera o valor armazenado no nó da posição
    public void setInfo(int indice, Object info) {
        NoDuplo no = getNo(indice);
        if (no != null) {
            no.info = info;
        }
    
    }
    private NoDuplo percorrerLista (int indice){
        //percorrer a lista do inicio para o fim, até atingir a posição definida por indice
        //retornando o nó correspondente
        if (indice < 0 || indice >= qtdNo) {
          return null;
        }
        NoDuplo noAtual = this.primeiroNo;
        for (int i = 0; i < indice; i++) {
            noAtual = noAtual.proximo;
        }
        return noAtual;
    }
}
    
    

    

