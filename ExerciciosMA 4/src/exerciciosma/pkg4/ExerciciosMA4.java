/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg4;


public class ExerciciosMA4 {

public static void main(String[] args) {
        
        Passageiro p1 = new Passageiro("Renan");
        Passageiro p2 = new Passageiro("João");

       
        Voo v1 = new Voo("ABC123", 2); 
        Voo v2 = new Voo("XYZ789", 1);

      
        Reserva r1 = new Reserva(p1, v1);
        Reserva r2 = new Reserva(p2, v1);
        Reserva r3 = new Reserva(p1, v2);

      
        if (v1.adicionarReserva(r1)) {
            p1.adicionarReserva(r1);
            System.out.println("Reserva de " + p1.getNome() + " no voo " + v1.getNumeroVoo() + " confirmada.");
        } else {
            System.out.println("Reserva de " + p1.getNome() + " no voo " + v1.getNumeroVoo() + " não pôde ser confirmada.");
        }

        if (v1.adicionarReserva(r2)) {
            p2.adicionarReserva(r2);
            System.out.println("Reserva de " + p2.getNome() + " no voo " + v1.getNumeroVoo() + " confirmada.");
        } else {
            System.out.println("Reserva de " + p2.getNome() + " no voo " + v1.getNumeroVoo() + " não pôde ser confirmada.");
        }

        if (v2.adicionarReserva(r3)) {
            p1.adicionarReserva(r3);
            System.out.println("Reserva de " + p1.getNome() + " no voo " + v2.getNumeroVoo() + " confirmada.");
        } else {
            System.out.println("Reserva de " + p1.getNome() + " no voo " + v2.getNumeroVoo() + " não pôde ser confirmada.");
        }

        
        p1.listarReservas();
        p2.listarReservas();
    }
}