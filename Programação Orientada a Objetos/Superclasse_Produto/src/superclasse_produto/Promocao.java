/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package superclasse_produto;

/**
 *
 * @author Alunos
 */
public interface Promocao {
    void aplicarDesconto(double percentual);

    boolean validarCupom(String cod_cupom);
}

