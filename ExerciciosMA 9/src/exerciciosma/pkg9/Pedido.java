/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg9;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Mesa mesa;
    private List<Prato> pratos;
    private boolean finalizado;

    public Pedido(Mesa mesa) {
        this.mesa = mesa;
        this.pratos = new ArrayList<>();
        this.finalizado = false;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

   
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public void finalizar() {
        this.finalizado = true;
    }


    public double calcularTotal() {
        double total = 0;
        for (Prato prato : pratos) {
            total += prato.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "mesa=" + mesa +
                ", pratos=" + pratos +
                ", finalizado=" + finalizado +
                '}';
    }
}

