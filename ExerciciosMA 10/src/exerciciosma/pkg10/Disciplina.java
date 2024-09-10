/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg10;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
      private String nome;
    private List<Estudante> estudantes;
    private Professor professor;

  
    public Disciplina(String nome) {
        this.nome = nome;
        this.estudantes = new ArrayList<>();
    }


    public String getNome() {
        return nome;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public Professor getProfessor() {
        return professor;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

  
    public void adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", professor=" + professor +
                '}';
    }
}
