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
                this.ultimoNo.proximo = NovoNo;
                NovoNo.anterior = this.ultimoNo;
                this.ultimoNo = NovoNo;
            this.qtdNo++;    
            } 
    }      

        
    
    public void adicionar(Object info, int indice){
        //adiciona um novo nó na posição definida por índice
    }
    public void remover (int indice){
        //remove o nó correspondente ao índice
    }
    private NoDuplo getNo (int indice){
        //retorna o nó correspondente ao índice
        return new NoDuplo ("a");
    }
    public Object getInfo(int indice){
        //retorna a informação do nó correspondente ao índice
        return null;
    }
    public void setInfo(int indice, Object info){
        //altera o valor de info do nó correspondente
    }
    private NoDuplo percorrerLista (int indice){
        //percorrer a lista do inicio para o fim, até atingir a posição definida por indice
        //retornando o nó correspondente
        if (indice < 0 || indice >= qtdNo) {
          return null;
        }
        NoDuplo NoAtual = this.primeiroNo;
        for (int i = 0; i < indice; i++) {
            NoAtual = NoAtual.proximo;
        }
        return NoAtual;
        
    }
    
}
