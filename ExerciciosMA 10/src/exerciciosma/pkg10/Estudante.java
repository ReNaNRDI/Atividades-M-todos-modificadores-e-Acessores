/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg10;

import java.util.HashMap;
import java.util.Map;

public class Estudante {
     private String nome;
    private Map<Disciplina, Double> notas;


    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new HashMap<>();
    }

 
    public String getNome() {
        return nome;
    }

    public Map<Disciplina, Double> getNotas() {
        return notas;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void matricular(Disciplina disciplina) {
        disciplina.adicionarEstudante(this);
    }

    
    public void adicionarNota(Disciplina disciplina, double nota) {
        notas.put(disciplina, nota);
    }


    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0;
        }
        double soma = 0;
        for (double nota : notas.values()) {
            soma += nota;
        }
        return soma / notas.size();
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

