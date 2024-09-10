/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg9;
import java.time.LocalDateTime;

public class Mesa {
    private int numero;
    private boolean reservada;
    private LocalDateTime reservaDataHora;

 
    public Mesa(int numero) {
        this.numero = numero;
        this.reservada = false;
    }


    public int getNumero() {
        return numero;
    }

    public boolean isReservada() {
        return reservada;
    }

    public LocalDateTime getReservaDataHora() {
        return reservaDataHora;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void reservar(LocalDateTime dataHora) {
        this.reservada = true;
        this.reservaDataHora = dataHora;
    }

    public void liberar() {
        this.reservada = false;
        this.reservaDataHora = null;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "numero=" + numero +
                ", reservada=" + reservada +
                ", reservaDataHora=" + reservaDataHora +
                '}';
    }
}

