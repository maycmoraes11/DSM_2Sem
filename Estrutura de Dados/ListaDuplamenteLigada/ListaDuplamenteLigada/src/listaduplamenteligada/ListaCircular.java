/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaduplamenteligada;

public class ListaCircular {
    NoDuplo primeiroNo;
    NoDuplo ultimoNo;
    int qtdNo;

    // Adiciona no final da lista
    public void adicionar(Object info) {
        NoDuplo novoNo = new NoDuplo(info);

        if (qtdNo == 0) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
            novoNo.proximo = novoNo;
            novoNo.anterior = novoNo;
        } else {
            ultimoNo.proximo = novoNo;
            novoNo.anterior = ultimoNo;
            novoNo.proximo = primeiroNo;
            primeiroNo.anterior = novoNo;
            ultimoNo = novoNo;
        }
        qtdNo++;
    }

    // Adicionar por índice (início, meio ou fim)
    public void adicionar(Object item, int indice) {
        if (indice < 0 || indice > qtdNo) return;

        if (indice == qtdNo) {
            adicionar(item);
            return;
        }

        NoDuplo novoNo = new NoDuplo(item);

        if (indice == 0) { // Início
            novoNo.proximo = primeiroNo;
            novoNo.anterior = ultimoNo;
            primeiroNo.anterior = novoNo;
            ultimoNo.proximo = novoNo;
            primeiroNo = novoNo;
        } else { // Meio
            NoDuplo atual = primeiroNo;
            for (int i = 0; i < indice; i++) {
                atual = atual.proximo;
            }
            novoNo.proximo = atual;
            novoNo.anterior = atual.anterior;
            atual.anterior.proximo = novoNo;
            atual.anterior = novoNo;
        }
        qtdNo++;
    }

    // 2) Remover por índice
    public void remover(int indice) {
        if (indice < 0 || indice >= qtdNo) return;

        if (qtdNo == 1) {
            primeiroNo = null;
            ultimoNo = null;
        } else if (indice == 0) { // Remover do início
            primeiroNo = primeiroNo.proximo;
            primeiroNo.anterior = ultimoNo;
            ultimoNo.proximo = primeiroNo;
        } else if (indice == qtdNo - 1) { // Remover do fim
            ultimoNo = ultimoNo.anterior;
            ultimoNo.proximo = primeiroNo;
            primeiroNo.anterior = ultimoNo;
        } else { // Remover do meio
            NoDuplo atual = primeiroNo;
            for (int i = 0; i < indice; i++) {
                atual = atual.proximo;
            }
            atual.anterior.proximo = atual.proximo;
            atual.proximo.anterior = atual.anterior;
        }
        qtdNo--;
    }

    // 3) Impressão Recursiva
    public String imprimirLista(String resposta, NoDuplo auxiliar, int contador) {
        if (contador == qtdNo || auxiliar == null) {
            return resposta + "]";
        }
        resposta += auxiliar.info + (contador < qtdNo - 1 ? ", " : "");
        return imprimirLista(resposta, auxiliar.proximo, contador + 1);
    }

    // Método auxiliar para chamar a impressão
    public void imprimir() {
        if (qtdNo == 0) {
            System.out.println("[ ]");
        } else {
            System.out.println(imprimirLista("[ ", primeiroNo, 0));
        }
    }
}