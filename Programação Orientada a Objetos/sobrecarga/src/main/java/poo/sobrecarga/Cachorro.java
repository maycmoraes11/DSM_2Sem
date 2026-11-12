/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.sobrecarga;

/**
 *
 * @author Alunos
 */
public class Cachorro extends Lobo {

    public Cachorro() {
    // Construtor vazio
}
    public void reagir(String frase) {
        System.out.println("Sai fora!");
    }
    public void reagir(int hora, int min){
        System.out.println("Hora que acordou: 10h");
    }
    public void reagir (boolean dono) {
        System.out.println("feliz com seu dono!");
    }
    public void reagir (int idade, float peso) {
        System.out.println("Pesadaum");
    }

    public void Login (String telefone, int pin) {
        System.out.println("telefone e pin");
    }
    public void Login (String tokenBiometrico) {
        System.out.println("telefone e pin");
    }
    public void Login (int pin, String senha) {
        System.out.println("Passou com a senha e o email");
    }

}
