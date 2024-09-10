
package exerciciosma.pkg1;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Fornecedor fornecedor;
    private List<Produto> produtos;

    // Construtor
    public Pedido(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
        this.produtos = new ArrayList<>();
    }

    // Adicionar produto ao pedido
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Finalizar pedido (atualiza o estoque dos produtos)
    public void finalizarPedido() {
        for (Produto produto : produtos) {
            fornecedor.getProdutos().stream()
                .filter(p -> p.getNome().equals(produto.getNome()))
                .findFirst()
                .ifPresent(p -> p.reduzirEstoque(produto.getQuantidade()));
        }
        produtos.clear();
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "fornecedor=" + fornecedor +
                ", produtos=" + produtos +
                '}';
    }
}
