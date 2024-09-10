

package exerciciosma.pkg3;

public class ExerciciosMA3 {

    public static void main(String[] args) {
       
        Usuario u1 = new Usuario("Renan");
        Usuario u2 = new Usuario("Guilherme");

       
        u1.criarPublicacao("Minha primeira publicação!");
        u1.criarPublicacao("Amo Java!");

   
        Comentario c1 = new Comentario(u2, "Ótima publicação!");
        Comentario c2 = new Comentario(u2, "Java é incrível!");

   
        Publicacao p1 = u1.getPublicacoes().get(0);
        p1.adicionarComentario(c1);
        p1.adicionarComentario(c2);

       
        u1.listarPublicacoes();
    }
}