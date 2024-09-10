/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg1;


public class ExerciciosMA1 {

    public static void main(String[] args) {
    
        Produto p1 = new Produto("Produto A", 100, 10.0);
        Produto p2 = new Produto("Produto B", 200, 20.0);

    
        Fornecedor fornecedor = new Fornecedor("Fornecedor R");
        fornecedor.adicionarProduto(p1);
        fornecedor.adicionarProduto(p2);

    
        Pedido pedido = new Pedido(fornecedor);
        pedido.adicionarProduto(new Produto("Produto A ", 10, 10.0));
        pedido.adicionarProduto(new Produto("Produto B ", 5, 20.0));


        System.out.println("Antes do pedido: ");
        System.out.println(fornecedor);

        pedido.finalizarPedido();

        System.out.println("Após o pedido: ");
        System.out.println(fornecedor);
    }
}