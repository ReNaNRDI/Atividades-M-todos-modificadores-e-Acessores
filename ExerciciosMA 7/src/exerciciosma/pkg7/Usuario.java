/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg7;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
      private String nome;
    private List<Emprestimo> emprestimos;

    
    public Usuario(String nome) {
        this.nome = nome;
        this.emprestimos = new ArrayList<>();
    }

    
    public String getNome() {
        return nome;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

  
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

   
    public void listarLivrosEmprestados() {
        System.out.println("Livros emprestados por " + nome + ":");
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println(emprestimo.getLivro());
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

