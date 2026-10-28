/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.bonificacao;

/**
 *
 * @author Alunos
 */
    public class Gerente extends Funcionario {
        public Gerente (String n, float sal) {
            super(n, sal);
}

    @Override
    public float calcularBonus(float salarioBase) {
        float valorBonus;
        float bonusFinal;
        valorBonus = salarioBase * 1.2f;
        bonusFinal = valorBonus + 1000;
        return bonusFinal;
    }
}