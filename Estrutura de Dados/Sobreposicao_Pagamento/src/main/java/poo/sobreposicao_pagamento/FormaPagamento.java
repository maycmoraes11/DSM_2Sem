/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.sobreposicao_pagamento;

/**
 *
 * @author Alunos
 */
public abstract class FormaPagamento {
    protected int valor;
    
    public FormaPagamento (int valor) {
        this.valor = valor;
    }
    
    public double calcularTaxa(double valor) {
        return 0.0;
    }
}
