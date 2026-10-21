/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.projetoescola;

/**
 *
 * @author Alunos
 */
public class Aluno extends Pessoa {
    protected int matricula;
    protected String curso;
    protected int mensalidade;
    
    public Aluno (String nome, int idade, String sexo, int matricula, String curso, int mensalidade) {
        this.nome = nome;
        this.idade= idade;
        this.sexo= sexo;
        this.matricula= matricula;
        this.curso= curso;
        this.mensalidade= mensalidade;
    }
    
    public void cancelarMatricula() {
        System.out.println("Matrícula de " +this.getNome() + "está cancelada!");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void pagarMensalidade() {
        System.out.println("Matricula Paga!");
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", curso=" + curso + ", mensalidade=" + mensalidade + '}';
    }
    
}
