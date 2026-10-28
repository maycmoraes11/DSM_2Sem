/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.bonificacao;

/**
 *
 * @author Alunos
 */
public class Bonificacao {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Carlos", 2000);
        Gerente g = new Gerente("Igor", 2500);
        Desenvolvedor d = new Desenvolvedor("Gustavo", 2250);
        System.out.println("O calculo é: "+f.calcularBonus(2000));
        System.out.println("O calculo é: "+g.calcularBonus(2500));
        System.out.println("O calculo é: "+d.calcularBonus(1500));
    } 
}
