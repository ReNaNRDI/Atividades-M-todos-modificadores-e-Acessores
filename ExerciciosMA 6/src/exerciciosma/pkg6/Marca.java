
package exerciciosma.pkg6;

import java.util.ArrayList;
import java.util.List;

public class Marca {
     private String nome;
    private List<Carro> carros;

   
    public Marca(String nome) {
        this.nome = nome;
        this.carros = new ArrayList<>();
    }

  
    public String getNome() {
        return nome;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public void adicionarCarro(Carro carro) {
        if (carro.getMarca().equals(this)) {
            carros.add(carro);
        }
    }

    
    public double calcularMediaPreco() {
        if (carros.isEmpty()) {
            return 0;
        }
        double somaPrecos = 0;
        for (Carro carro : carros) {
            somaPrecos += carro.getPreco();
        }
        return somaPrecos / carros.size();
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nome='" + nome + '\'' +
                '}';
    }

}
