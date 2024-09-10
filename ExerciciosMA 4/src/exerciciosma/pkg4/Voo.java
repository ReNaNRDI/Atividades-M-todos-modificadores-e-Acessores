/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg4;
import java.util.ArrayList;
import java.util.List;

public class Voo {
      private String numeroVoo;
    private int capacidade;
    private List<Reserva> reservas;


    public Voo(String numeroVoo, int capacidade) {
        this.numeroVoo = numeroVoo;
        this.capacidade = capacidade;
        this.reservas = new ArrayList<>();
    }

  
    public String getNumeroVoo() {
        return numeroVoo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

  
    public boolean verificarDisponibilidade() {
        return reservas.size() < capacidade;
    }

  
    public boolean adicionarReserva(Reserva reserva) {
        if (verificarDisponibilidade()) {
            reservas.add(reserva);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Voo{" +
                "numeroVoo='" + numeroVoo + '\'' +
                ", capacidade=" + capacidade +
                ", reservas=" + reservas +
                '}';
    }
}