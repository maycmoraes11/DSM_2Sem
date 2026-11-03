/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.sobrecarga;

/**
 *
 * @author Alunos
 */
public class Sobrecarga {

    public static void main(String[] args) {
        Lobo lob = new Lobo();
        lob.Login("lobin@lobe.com", "senhamagica");
        
        Cachorro c = new Cachorro();
        c.reagir(1,1f);
        
        
    }
}
