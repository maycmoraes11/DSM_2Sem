/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvorebinaria;

/**
 *
 * @author Alunos
 */
public class ArvoreMultipla {
    private NoMultiplo raiz;

    public void setRaiz(NoMultiplo raiz) {
        this.raiz = raiz;
    }

    public int somarValoresFilhos(NoMultiplo pai) {
        if (pai == null || pai.filhos.isEmpty()) {
            return 0; // Condição de paragem: se não tem filhos, soma é 0
        }

        return somarRecursivo(pai);
    }

    private int somarRecursivo(NoMultiplo no) {
        int soma = 0;

        // Percorre todos os filhos diretos e indiretos deste nó
        for (NoMultiplo filho : no.filhos) {
            soma += filho.valor;                  // Adiciona o valor do filho
            soma += somarRecursivo(filho);        // Adiciona a soma dos netos/descendentes recursivamente
        }

        return soma;
    }
}
