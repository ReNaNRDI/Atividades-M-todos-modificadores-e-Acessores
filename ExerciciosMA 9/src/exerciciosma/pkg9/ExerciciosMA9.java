/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg9;

import java.time.LocalDateTime;

public class ExerciciosMA9 {

public static void main(String[] args) {
     
        Prato prato1 = new Prato("Pizza Margherita", 29.90);
        Prato prato2 = new Prato("Espaguete à Bolonhesa", 24.90);
        Prato prato3 = new Prato("Salada Caesar", 19.90);

   
        Mesa mesa1 = new Mesa(1);
        Mesa mesa2 = new Mesa(2);

    
        mesa1.reservar(LocalDateTime.of(2024, 9, 15, 19, 0));
        mesa2.reservar(LocalDateTime.of(2024, 9, 16, 20, 0));

   
        Pedido pedido1 = new Pedido(mesa1);
        pedido1.adicionarPrato(prato1);
        pedido1.adicionarPrato(prato2);
        pedido1.finalizar();

        Pedido pedido2 = new Pedido(mesa2);
        pedido2.adicionarPrato(prato3);

      
        System.out.println("Total da conta do pedido 1: R$" + pedido1.calcularTotal());
        System.out.println("Total da conta do pedido 2: R$" + pedido2.calcularTotal());

     
        System.out.println("Reservas futuras:");
        if (mesa1.isReservada()) {
            System.out.println(mesa1);
        }
        if (mesa2.isReservada()) {
            System.out.println(mesa2);
        }
    }
}