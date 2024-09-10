/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg4;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {
    private String nome;
    private List<Reserva> reservas;

    // Construtor
    public Passageiro(String nome) {
        this.nome = nome;
        this.reservas = new ArrayList<>();
    }

    // Métodos Acessores
    public String getNome() {
        return nome;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    // Métodos Modificadores
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Adicionar uma reserva
    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    // Listar reservas
    public void listarReservas() {
        System.out.println("Reservas de " + nome + ":");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

