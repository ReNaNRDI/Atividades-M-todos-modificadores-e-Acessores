
package exerciciosma.pkg8;


public class ExerciciosMA8 {

  
    public static void main(String[] args) {
    
        Desenvolvedor dev1 = new Desenvolvedor("Alice");
        Desenvolvedor dev2 = new Desenvolvedor("Bob");


        Projetos projeto = new Projetos("Desenvolvimento de Software");

    
        Tarefas tarefa1 = new Tarefas("Implementar login", 20);
        Tarefas tarefa2 = new Tarefas("Desenvolver dashboard", 30);
        Tarefas tarefa3 = new Tarefas("Testar funcionalidades", 15);

        
        projetosadicionarTarefas(tarefa1);
        projetos.adicionarTarefas(tarefa2);
        projetos.adicionarTarefas(tarefa3);

    
        dev1.adicionarTarefas(tarefa1);
        dev2.adicionarTarefas(tarefa2);
        dev2.adicionarTarefas(tarefa3);

        
        dev1.listarTarefas();
        dev2.listarTarefas();

      
        System.out.println("Carga de trabalho do projeto " + projeto.getNome() + ": " + projeto.calcularCargaTrabalho() + " horas");
    }
}