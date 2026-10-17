/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvorebinaria;

/**
 *
 * @author Alunos
 */
public class TesteArvoreBinaria {
    public static void main(String[] args) {
        ArvoreBinaria minhaArvore = new ArvoreBinaria(); {
        minhaArvore.addNo(100);
        minhaArvore.addNo(40);
        minhaArvore.addNo(50);
    }
        System.out.println("IMPRIMINDO A ÁRVORE");
        minhaArvore.imprimirArvoreComProfundidade();

        System.out.println("\n=== TESTANDO BUSCA DE PROFUNDIDADE ===");
        int prof100 = minhaArvore.buscarProfundidade(100);
        int prof50 = minhaArvore.buscarProfundidade(50);
        int profInexistente = minhaArvore.buscarProfundidade(999);

        System.out.println("Profundidade do número 100: " + prof100); // Deve retornar 0
        System.out.println("Profundidade do número 50: " + prof50);   // Deve retornar 2
        System.out.println("Profundidade do número 999: " + profInexistente); // Deve retornar -1 (não existe)
    }
}
}
