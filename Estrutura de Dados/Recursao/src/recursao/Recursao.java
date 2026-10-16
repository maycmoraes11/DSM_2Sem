/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursao;

/**
 *
 * @author Alunos
 */
public class Recursao {
    public static void main(String[] args) {
        System.out.println(Fatorial());
    }
    
    
    public static int Fatorial(int n) {
        if (n == 0)
          return 1;
        else {
            int resultadoFatorial = Fatorial (n-1);
            return n * resultadoFatorial;
        }
    }
}
