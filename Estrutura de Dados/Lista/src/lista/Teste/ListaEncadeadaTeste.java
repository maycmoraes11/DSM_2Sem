/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.Teste;

/**
 *
 * @author mayco
 */
public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(elemento:1);
        System.out.println("Tamanho = " + lista.getTamanho());
        System.out.println(lista);
        
        lista.adiciona(elemento:2);
        System.out.println(lista);
        
        lista.adiciona(elemento:3);
        System.out.println(lista);
        
    } 
}
