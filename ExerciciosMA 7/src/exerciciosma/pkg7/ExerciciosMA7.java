/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg7;

import java.time.LocalDate; 

public class ExerciciosMA7 {
  public static void main(String[] args) {
    
        Autor autor1 = new Autor("J.K. Rowling");
        Autor autor2 = new Autor("George R.R. Martin");

        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", autor1, 1997);
        Livro livro2 = new Livro("Harry Potter e a Câmara Secreta", autor2, 1998);
        Livro livro3 = new Livro("A Guerra dos Tronos", autor2, 1996);

       
        Usuario usuario1 = new Usuario("João");
        Usuario usuario2 = new Usuario("Maria");

    
        Emprestimo emprestimo1 = new Emprestimo(livro1, usuario1, LocalDate.of(2024, 8, 1), LocalDate.of(2024, 8, 15));
        Emprestimo emprestimo2 = new Emprestimo(livro2, usuario1, LocalDate.of(2024, 8, 5), LocalDate.of(2024, 8, 20));
        Emprestimo emprestimo3 = new Emprestimo(livro3, usuario2, LocalDate.of(2024, 7, 20), LocalDate.of(2024, 8, 5));

    
        System.out.println("Multa por atraso no empréstimo 1: R$" + emprestimo1.calcularMulta());
        System.out.println("Multa por atraso no empréstimo 2: R$" + emprestimo2.calcularMulta());
        System.out.println("Multa por atraso no empréstimo 3: R$" + emprestimo3.calcularMulta());

   
        usuario1.listarLivrosEmprestados();
        usuario2.listarLivrosEmprestados();
    }
}