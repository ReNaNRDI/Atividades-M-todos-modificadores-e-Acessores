/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg7;

import java.util.ArrayList;
import java.util.List;

public class Livro {
       private String titulo;
    private Autor autor;
    private int anoPublicacao;
    private boolean disponivel;
    private List<Emprestimo> emprestimos;

 
    public Livro(String titulo, Autor autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
        this.emprestimos = new ArrayList<>();
        autor.adicionarLivro(this);
    }

    // Métodos Acessores
    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

   
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

   
    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", anoPublicacao=" + anoPublicacao +
                ", disponivel=" + disponivel +
                '}';
    }
}

