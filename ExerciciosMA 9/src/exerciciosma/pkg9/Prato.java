/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg9;


public class Prato {
       private String nome;
    private double preco;


    public Prato(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Prato{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}

