/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.projetoescola;

/**
 *
 * @author Alunos
 */
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public Professor (String nome, int idade, String sexo, String esp, float sal) {
        this.nome = nome;
        this.idade= idade;
        this.sexo= sexo;
        this.especialidade=esp;
        this.salario=sal;
    }
    
    public void receberAumento(float aum) {
        this.salario+= aum;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" + "especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    private static final System.Logger LOG = System.getLogger(Professor.class.getName());
    
}
