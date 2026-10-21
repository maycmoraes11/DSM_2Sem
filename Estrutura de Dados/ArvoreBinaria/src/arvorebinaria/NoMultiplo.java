/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvorebinaria;

/**
 *
 * @author Alunos
 */
import java.util.ArrayList;
import java.util.List;

// Exercicio 1: Crie uma classe Árvore capaz de armazenar qualquer quantidade de nós filho.
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
