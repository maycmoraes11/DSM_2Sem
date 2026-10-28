/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.bonificacao;

/**
 *
 * @author Alunos
 */
public class Funcionario {
    protected String nome;
    protected float salarioBase;
    
    public Funcionario (String n, float sal) {
        this.nome = n;
        this.salarioBase = sal;
}
    public float calcularBonus(float salarioBase) {
        float bonusTotal;
        bonusTotal = salarioBase *1.1f;
        return bonusTotal;
    }
}
