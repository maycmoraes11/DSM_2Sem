/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.projetodragonball;

/**
 *
 * @author Alunos
 */
public class Lutador {
    private String nome, planeta, categoria;
    private int idade, vitorias, derrotas, empate;
    private float altura, peso;
    
    public Lutador(String no, String pl, int id, int vit, int der, int emp, float al, float pe)
    {
        this.nome = no;
        this.planeta = pl;
        this.altura = al;
        this.derrotas = der;
        this.empate = emp;
        this.idade = id;
        this.vitorias = vit;
        this.setPeso(pe);
    }
    
    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }
    
    private void setCategoria() {
        if (this.peso <50) {this.categoria = "Morre Fácil: Não pode lutar! ";}
        else if (this.peso <=80) {this.categoria = "Raquítico: Mesmo nível do Mr.Satan";}
        else if (this.peso <=100) {this.categoria = "Fraco: igual Tienchenhan e Yamcha";}
        else if (this.peso <=120) {this.categoria = "Forte: Consegue lutar contra";}
        else if (this.peso <=140) {this.categoria = "Sayajin: Consegue lutar contra Goku e Vegeta!";}
        else if (this.peso <=200) {this.categoria = "Obeso: Lutar contra Majin Boo!";}
        else {this.categoria = "Inválido";}
    }
    
    public void ganharLuta() {this.vitorias++;}
    public void perderLuta() {this.derrotas++;}
    public void empatarLuta() {this.empate++;}
    public String getNome() {return this.nome;}
    public String getCategoria() {return this.categoria;}
    
}

