/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg10;

import java.util.ArrayList;
import java.util.List;

public class Professor {
        private String nome;
    private List<Disciplina> disciplinas;

   
    public Professor(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

  
    public String getNome() {
        return nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

  
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        disciplina.setProfessor(this);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

