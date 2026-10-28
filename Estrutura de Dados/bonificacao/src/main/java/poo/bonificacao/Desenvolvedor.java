/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.bonificacao;

/**
 *
 * @author Alunos
 */
    public class Desenvolvedor extends Funcionario {
        public Desenvolvedor (String n, float sal) {
            super(n, sal);
}

    @Override
    public float calcularBonus(float salarioBase) {
        float bonusFinal;
        bonusFinal = salarioBase * 1.15f;
        return bonusFinal;
        
    }
}
