/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.projetodragonball;

/**
 *
 * @author Alunos
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private String arena = "Arena de Artes Marciais";
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())&&(l1 != l2)) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    
    public void lutar(){
        if (this.aprovada) {
            System.out.println("DESAFIADO"); this.desafiado.getNome();
            System.out.println("DESAFIANTE"); this.desafiante.getNome();
            System.out.println("LOCAL:" + this.arena);
        
        
        int vencedor = (int) (Math.random()*3);
        switch(vencedor) {
            case 0: System.out.println("Empate!");
                    this.desafiado.empatarLuta(); this.desafiante.empatarLuta(); break;
            case 1: System.out.println(this.desafiado.getNome() + "venceu!");
                    this.desafiado.ganharLuta(); this.desafiante.perderLuta(); break;
            case 2: System.out.println(this.desafiante.getNome() + "venceu!");
                    this.desafiante.ganharLuta(); this.desafiado.perderLuta(); break;
            default: System.out.println("Resultado inválido no sorteio."); break;
        }
        }
        } 
    }

