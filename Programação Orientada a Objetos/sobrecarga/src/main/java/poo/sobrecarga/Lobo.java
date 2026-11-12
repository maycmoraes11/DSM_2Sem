/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.sobrecarga;

/**
 *
 * @author Alunos
 */
public class Lobo {
    protected String email;
    protected String senha;
    protected String telefone;
    protected int pin;
    protected String tokenBiomentrico;
    
    public Lobo() {
    // Construtor vazio
}
    public Lobo (String email, String senha) {
        this.email=email;
        this.senha=senha;
    }

        public void Login (String email, String senha) {
        System.out.println("Passou com a senha e o email");
    }
    
    /**
     *
     * @param email
     * @param senha
     */
    
    }

