
package exerciciosma.pkg1;
import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    private String nome;
    private List<Produto> produtos;

    
    public Fornecedor(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<>();
    }

   
    public String getNome() {
        return nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

  
    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "nome='" + nome + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}