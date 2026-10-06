/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.projetoescola;

/**
 *
 * @author Alunos
 */
public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public void fazerAniv(){
        this.idade++;
        System.out.println(this.nome+ " fez aniversário! Agora tem " + this.idade);
    }
    
    public String getNome(){
        return nome;
    }
    
    public String setNome(String nome) {
        this.nome = nome;
        return null;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
}
