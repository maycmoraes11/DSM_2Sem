/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superclasse_produto;

/**
 *
 * @author Alunos
 */
public abstract class Produto implements Promocao {
    private String nome;
    private float preco;
    private String departamento;
    private String data_fab;
    protected int desconto;
    protected String cupom;
    protected int cod_prod;


public Produto (String nome, float preco, String depto, String data_fab, int desc, String cupom, int cod_p) {
    this.nome= nome;
    this.preco= preco;
    this.departamento= depto;
    this.data_fab= data_fab;
    this.desconto= desc;
    this.cupom= cupom;
    this.cod_prod= cod_p;
}

public abstract float calcularPrecoFinal();

    @Override
    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            this.preco -= this.preco * (float)(percentual / 100.0);
        }
    }

    @Override
    public boolean validarCupom(String cod_cupom) {
        return this.cupom != null && this.cupom.equals(cod_cupom);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
    }
    }

    public float getPreco() {
        return preco;
    }


    public void setPreco(float preco) {
        if (preco >= 0) {
        this.preco = preco;
    }
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String depto) {
        if (depto != null) {
        this.departamento = depto;
    }
    }

    public String getData_fab() {
        return data_fab;
    }

    public void setData_fab(String data_fab) {
        if (nome != null)
        this.data_fab = data_fab;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        if (desconto >= 0) {
        this.desconto = desconto;
    }
    }

    public String getCupom() {
        return cupom;
    }

    public void setCupom(String cupom) {
        if (cupom != null){
        this.cupom = cupom;
    }
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }
}
    

