/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mayco
 */
package listaduplamenteligada;

public class TesteListaCircular {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();

        // 1) Testando Adicionar
        lista.adicionar("A");
        lista.adicionar("C");
        lista.adicionar("B", 1);

        // 2) Testando Remover
        lista.remover(0);

        // 3) Testando a Impressão Recursiva
        String resultado = lista.imprimirLista("Elementos: ", lista.primeiroNo, 0);
        System.out.println(resultado);
    }
}