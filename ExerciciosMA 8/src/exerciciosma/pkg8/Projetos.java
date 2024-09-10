
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg8;

import java.util.ArrayList;
import java.util.List;

public class Projetos {
    private String nome;
    private List<Tarefas> tarefas;


    public Projetos(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }


    public String getNome() {
        return nome;
    }

    public List<Tarefas> getTarefas() {
        return tarefas;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

 
    public void adicionarTarefa(Tarefas tarefa) {
        tarefas.add(tarefa);
    }

 
    public int calcularCargaTrabalho() {
        int cargaTrabalho = 0;
        for (Tarefas tarefa : tarefas) {
            cargaTrabalho += tarefa.getHorasEstimadas();
        }
        return cargaTrabalho;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}  

