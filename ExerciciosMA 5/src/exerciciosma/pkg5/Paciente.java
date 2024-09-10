/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg5;
import java.util.ArrayList;
import java.util.List;

public class Paciente {
     private String nome;
    private List<Consulta> consultas;

 
    public Paciente(String nome) {
        this.nome = nome;
        this.consultas = new ArrayList<>();
    }

   
    public String getNome() {
        return nome;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    
    public void listarProximasConsultas() {
        System.out.println("Próximas consultas de " + nome + ":");
        for (Consulta consulta : consultas) {
            System.out.println(consulta);
        }
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

