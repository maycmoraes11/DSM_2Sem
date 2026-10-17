/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvorebinaria;

/**
 *
 * @author Alunos
 */
public class NoBinario {
    //Atributos
    private int valor;
    private NoBinario esquerda, direita;
    
    public NoBinario(int valor) {
        this.valor=valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoBinario getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoBinario esquerda) {
        this.esquerda = esquerda;
    }

    public NoBinario getDireita() {
        return direita;
    }

    public void setDireita(NoBinario direita) {
        this.direita = direita;
    }
    
}
