/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.projetodragonball;

/**
 *
 * @author Alunos
 */
public class ProjetoDragonBall {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        //String no, String pl, int id, int vit, int der, int emp, float al, float pe)
        l[0] = new Lutador("Caos", "Kaioh", 30, 1, 60, 0, 1.30f, 51f);
        l[1] = new Lutador("Pan", "Terra", 12, 25, 10, 3, 1.70f, 81f);
        l[2] = new Lutador("Tranks", "Vegeta", 20, 110, 3, 5, 1.80f, 121f);
        l[3] = new Lutador("Goten", "Namekusei", 18, 80, 10, 10, 1.75f, 104f);
        l[4] = new Lutador("Picollo", "Kaioshins", 36, 200, 20, 11, 2.00f, 145f);
        l[5] = new Lutador("Videl", "Terra", 8, 4, 2, 2, 1.60f, 65f);
        
        Luta ProjDBZ = new Luta();
        
        ProjDBZ.marcarLuta(l[1], l[2]);
        ProjDBZ.lutar();
        
        ProjDBZ.marcarLuta(l[4], l[3]);
        ProjDBZ.lutar();
        
        ProjDBZ.marcarLuta(l[5], l[0]);
        ProjDBZ.lutar();
        
      
    }
}
