/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg6;

/**
 *
 * @author aluno.saolucas
 */
public class Carro {
      private String modelo;
    private double preco;
    private Marca marca;
    private Vendedor vendedor;

    // Construtor
    public Carro(String modelo, double preco, Marca marca, Vendedor vendedor) {
        this.modelo = modelo;
        this.preco = preco;
        this.marca = marca;
        this.vendedor = vendedor;
        marca.adicionarCarro(this);
        vendedor.adicionarCarro(this);
    }

    // Métodos Acessores
    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public Marca getMarca() {
        return marca;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    // Métodos Modificadores
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", marca=" + marca +
                ", vendedor=" + vendedor +
                '}';
    }

}
