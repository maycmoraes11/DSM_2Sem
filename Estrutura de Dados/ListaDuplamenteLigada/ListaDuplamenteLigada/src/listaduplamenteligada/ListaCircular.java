/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaduplamenteligada;

/**
 *
 * @author Alunos
 */
 
    public class ListaCircular {
    NoDuplo primeiroNo;
    NoDuplo ultimoNo;
    int qtdNo;
    
    // Adiciona um nó no final da lista
    public void adicionar(Object info) {
        NoDuplo novoNo = new NoDuplo(info);

        if (qtdNo == 0) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
            // No caso de 1 elemento circular, aponta para ele mesmo nas duas direções
            novoNo.proximo = novoNo;
            novoNo.anterior = novoNo;
        } else {
            // Conecta o antigo último ao novo nó
            ultimoNo.proximo = novoNo;
            novoNo.anterior = ultimoNo;

            // Fecha o ciclo: o novo nó aponta para o primeiro, e o primeiro aponta de volta para o novo
            novoNo.proximo = primeiroNo;
            primeiroNo.anterior = novoNo;

            // Atualiza a referência de quem é o último
            ultimoNo = novoNo;
        }
        qtdNo++;
    }
}
