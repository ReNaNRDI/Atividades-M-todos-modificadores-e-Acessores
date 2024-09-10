/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg5;

import java.time.LocalDateTime;

public class Consulta {
       private Medico medico;
    private Paciente paciente;
    private LocalDateTime dataHora;

  
    public Consulta(Medico medico, Paciente paciente, LocalDateTime dataHora) {
        this.medico = medico;
        this.paciente = paciente;
        this.dataHora = dataHora;
        medico.adicionarConsulta(this);
        paciente.adicionarConsulta(this);
    }

   
    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }


    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "medico=" + medico +
                ", paciente=" + paciente +
                ", dataHora=" + dataHora +
                '}';
    }
}

