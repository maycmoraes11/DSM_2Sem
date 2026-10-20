/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.projetoescola;

/**
 *
 * @author Alunos
 */
public class Heranca {

    public static void main(String[] args) {
        
        //Pessoa pes = new Pessoa('Rodrigo', 28, 'Masculino') Não cria pois é abstrato.
        
        Professor prof1 = new Professor("Rodrigo", 28 ,"Masculino","Java e Python", 9000);
        Professor prof2 = new Professor("Carlos", 19 ,"Masculino","Python", 5000);
        
        Aluno aluno1 = new Aluno ("Gustavo", 18, "Masculino", 12345, "DSM", 1500);
        Aluno aluno2 = new Aluno ("Igor", 19, "Masculino", 54321, "DSM", 1500);
        
        Bolsista bolsista1 = new Bolsista ("Igor", 19, "Masculino", 54321, "DSM", 1500, 50);
        Bolsista bolsista2 = new Bolsista ("Gustavo", 19, "Masculino", 54321, "DSM", 1500, 100);
            
            prof1.toString();
            prof2.toString();
            
    }
}
