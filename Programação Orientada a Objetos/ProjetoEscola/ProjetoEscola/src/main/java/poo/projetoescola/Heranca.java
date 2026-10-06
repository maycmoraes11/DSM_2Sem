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
        
        Professor prof = new Professor();
            prof.setNome("Rodrigo");
            prof.setIdade(27);
            prof.setSexo("Masc");
            
            Pessoa pe = new Pessoa();
            
            System.out.println(prof.toString());
            
            
        
    }
}
