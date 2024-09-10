/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg6;
import java.util.ArrayList;
import java.util.List;


public class Vendedor {
      private String nome;
    private List<Carro> carrosVendidos;

    public Vendedor(String nome) {
        this.nome = nome;
        this.carrosVendidos = new ArrayList<>();
    }

   
    public String getNome() {
        return nome;
    }

    public List<Carro> getCarrosVendidos() {
        return carrosVendidos;
    }

  
    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public void adicionarCarro(Carro carro) {
        carrosVendidos.add(carro);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

