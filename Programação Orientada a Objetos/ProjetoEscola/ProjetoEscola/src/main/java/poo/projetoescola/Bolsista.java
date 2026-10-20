/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.projetoescola;

/**
 *
 * @author Alunos
 */
    public class Bolsista extends Aluno {
       private int desconto;
        
       
       public Bolsista (String nome, int idade, String sexo, int matricula, String curso, int mensalidade, int desconto) {
        super(nome, idade, sexo, matricula, curso, mensalidade);
        this.desconto= desconto;
    }
       public void calcularMensalidadeTotal() {
           int totalDesconto;
           totalDesconto = (mensalidade / 100) * desconto;
           this.mensalidade = mensalidade - totalDesconto;
       }

        @Override
       public void pagarMensalidade() {
           System.out.println(" Aluno é bolsista, não tem mensalidade!");
    }

    @Override
    public String toString() {
        return "Bolsista{" + "desconto=" + desconto + '}';
    }
       
       
}
