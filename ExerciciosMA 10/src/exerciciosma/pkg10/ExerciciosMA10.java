/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosma.pkg10;


public class ExerciciosMA10 {

  
      public static void main(String[] args) {
      
        Disciplina disciplina1 = new Disciplina("Matemática");
        Disciplina disciplina2 = new Disciplina("Programação");

      
        Professor professor1 = new Professor("Dr. Silva");
        Professor professor2 = new Professor("Profa. Oliveira");

   
        professor1.adicionarDisciplina(disciplina1);
        professor2.adicionarDisciplina(disciplina2);

       
        Estudante estudante1 = new Estudante("Ana");
        Estudante estudante2 = new Estudante("João");

       
        estudante1.matricular(disciplina1);
        estudante1.matricular(disciplina2);
        estudante2.matricular(disciplina2);

    
        estudante1.adicionarNota(disciplina1, 8.5);
        estudante1.adicionarNota(disciplina2, 9.0);
        estudante2.adicionarNota(disciplina2, 7.5);

        
        System.out.println(estudante1.getNome() + " - Média: " + estudante1.calcularMedia());
        System.out.println(estudante2.getNome() + " - Média: " + estudante2.calcularMedia());

    
        System.out.println("Disciplinas do " + professor1.getNome() + ": " + professor1.getDisciplinas());
        System.out.println("Disciplinas do " + professor2.getNome() + ": " + professor2.getDisciplinas());
    }
}