/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg3;
import java.util.ArrayList;
import java.util.List;

public class Publicacao {
    private Usuario usuario;
    private String conteudo;
    private List<Comentario> comentarios;

    // Construtor
    public Publicacao(Usuario usuario, String conteudo) {
        this.usuario = usuario;
        this.conteudo = conteudo;
        this.comentarios = new ArrayList<>();
    }

    // Métodos Acessores
    public Usuario getUsuario() {
        return usuario;
    }

    public String getConteudo() {
        return conteudo;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    // Adicionar um comentário
    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    @Override
    public String toString() {
        return "Publicacao{" +
                "usuario=" + usuario +
                ", conteudo='" + conteudo + '\'' +
                ", comentarios=" + comentarios +
                '}';
    }
}