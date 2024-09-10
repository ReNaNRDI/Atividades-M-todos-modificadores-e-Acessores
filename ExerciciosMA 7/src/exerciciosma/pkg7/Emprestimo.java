/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg7;
import java.time.LocalDate;


public class Emprestimo {
      private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

  
    public Emprestimo(Livro livro, Usuario usuario, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        livro.setDisponivel(false);
        livro.adicionarEmprestimo(this);
        usuario.adicionarEmprestimo(this);
    }

 
    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

   
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

   
    public double calcularMulta() {
        if (LocalDate.now().isAfter(dataDevolucao)) {
            long diasAtraso = LocalDate.now().toEpochDay() - dataDevolucao.toEpochDay();
            return diasAtraso * 0.50; // Multa de R$0.50 por dia de atraso
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "livro=" + livro +
                ", usuario=" + usuario +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}

