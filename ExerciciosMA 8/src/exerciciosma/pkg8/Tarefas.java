/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg8;


public class Tarefas {
    private String descricao;
    private Desenvolvedor desenvolvedor;
    private int horasEstimadas;
    private boolean concluida;


    public Tarefas(String descricao, int horasEstimadas) {
        this.descricao = descricao;
        this.horasEstimadas = horasEstimadas;
        this.concluida = false;
    }


    public String getDescricao() {
        return descricao;
    }

    public Desenvolvedor getDesenvolvedor() {
        return desenvolvedor;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public boolean isConcluida() {
        return concluida;
    }

  
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDesenvolvedor(Desenvolvedor desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", concluida=" + concluida +
                '}';
    }
}
