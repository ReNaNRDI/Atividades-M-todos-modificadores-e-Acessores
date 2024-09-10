package exerciciosma.pkg3;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Publicacao> publicacoes;

  
    public Usuario(String nome) {
        this.nome = nome;
        this.publicacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Publicacao> getPublicacoes() {
        return publicacoes;
    }

  
    public void setNome(String nome) {
        this.nome = nome;
    }

 
    public void criarPublicacao(String conteudo) {
        Publicacao novaPublicacao = new Publicacao(this, conteudo);
        publicacoes.add(novaPublicacao);
    }

  
    public void listarPublicacoes() {
        System.out.println("Publicações de " + nome + ":");
        for (Publicacao publicacao : publicacoes) {
            System.out.println(publicacao);
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
