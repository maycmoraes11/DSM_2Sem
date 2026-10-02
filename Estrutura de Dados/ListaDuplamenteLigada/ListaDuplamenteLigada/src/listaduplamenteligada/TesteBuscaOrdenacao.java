/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 /*
/**
 *
 * @author Alunos
 */


package listaduplamenteligada;

public class TesteBuscaOrdenacao {

    public static void main(String[] args) {
        int[] vetor = new int[1000];

        System.out.println("--- Gerando 1000 valores aleatórios ---");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 1000);
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n\n--- Vetor Ordenado por Troca (Crescente) ---");
        int[] vetorOrdenado = Ordenacao.ordenacaoTrocaCrescente(vetor);

        for (int i = 0; i < vetorOrdenado.length; i++) {
            System.out.print(vetorOrdenado[i] + " ");
        }

        // Teste simples das buscas
        System.out.println("\n\n--- Teste de Buscas ---");
        int valorParaBuscar = vetorOrdenado[500]; // Pega um valor garantido
        System.out.println("Buscando o número: " + valorParaBuscar);
        System.out.println("Posição na Busca Linear: " + Ordenacao.buscaLinear(vetor, valorParaBuscar));
        System.out.println("Posição na Busca Binária: " + Ordenacao.buscaBinaria(vetorOrdenado, valorParaBuscar));
    }
}