/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.sobrecarga.Login;

/**
 *
 * @author Alunos
 */
public class Login{
    protected String email;
    protected String senha;
    protected String telefone;
    protected int pin;
    protected String tokenBiomentrico;
    
    public Login (String email, String senha) {
        this.email=email;
        this.senha=senha;
    }
    
    public void Login (String email, String senha) {
        System.out.println("Passou com a senha e o email");
    }
    public void Login (String email, String senha) {
        System.out.println("Passou com a senha e o email");
    }
}
