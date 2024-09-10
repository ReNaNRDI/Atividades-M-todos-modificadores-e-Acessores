/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg5;
import java.util.ArrayList;
import java.util.List;

public class Medico {
      private String nome;
    private List<Consulta> consultas;

  
    public Medico(String nome) {
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

  
    public List<Paciente> listarPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        for (Consulta consulta : consultas) {
            if (!pacientes.contains(consulta.getPaciente())) {
                pacientes.add(consulta.getPaciente());
            }
        }
        return pacientes;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

