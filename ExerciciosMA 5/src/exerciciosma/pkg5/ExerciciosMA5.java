

package exerciciosma.pkg5;
import java.time.LocalDateTime;

public class ExerciciosMA5 {

   public static void main(String[] args) {
     
        Medico medico1 = new Medico("Dr. João");
        Medico medico2 = new Medico("Dra. Maria");

       
        Paciente paciente1 = new Paciente("Renan");
        Paciente paciente2 = new Paciente("Guilherme");

      
        Consulta consulta1 = new Consulta(medico1, paciente1, LocalDateTime.of(2024, 9, 15, 10, 0));
        Consulta consulta2 = new Consulta(medico1, paciente2, LocalDateTime.of(2024, 9, 16, 11, 0));
        Consulta consulta3 = new Consulta(medico2, paciente1, LocalDateTime.of(2024, 9, 17, 14, 0));

       
        System.out.println("Pacientes do " + medico1.getNome() + ":");
        for (Paciente paciente : medico1.listarPacientes()) {
            System.out.println(paciente);
        }

      
        paciente1.listarProximasConsultas();
    }
}