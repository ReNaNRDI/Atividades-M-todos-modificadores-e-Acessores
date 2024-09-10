/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg7;
import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private List<Livro> livros;


    public Autor(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

 
    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

 
    public void setNome(String nome) {
        this.nome = nome;
    }

 
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                '}';
    }
}