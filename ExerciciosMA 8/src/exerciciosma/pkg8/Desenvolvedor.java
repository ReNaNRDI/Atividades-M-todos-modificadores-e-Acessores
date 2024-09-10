/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg8;

import java.util.ArrayList;
import java.util.List;

public class Desenvolvedor {
     private String nome;
    private List<Tarefas> tarefas;

    
    public Desenvolvedor(String nome) {
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
        tarefa.setDesenvolvedor(this);
    }

 
    public void listarTarefas() {
        System.out.println("Tarefas de " + nome + ":");
        for (Tarefas tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

