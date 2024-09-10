


package exerciciosma.pkg3;


public class Comentario {
    private Usuario usuario;
    private String conteudo;

 
    public Comentario(Usuario usuario, String conteudo) {
        this.usuario = usuario;
        this.conteudo = conteudo;
    }

    
    public Usuario getUsuario() {
        return usuario;
    }

    public String getConteudo() {
        return conteudo;
    }

  
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "usuario=" + usuario +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
