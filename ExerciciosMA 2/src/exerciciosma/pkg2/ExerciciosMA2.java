package exerciciosma.pkg2;

public class ExerciciosMA2 {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Renan", 5000);
        Funcionario f2 = new Funcionario("Guilherme", 6000);
        Funcionario f3 = new Funcionario("Charlie", 7000);

        Departamento d1 = new Departamento("Desenvolvimento");
        Departamento d2 = new Departamento("Marketing");

        d1.adicionarFuncionario(f1);
        d1.adicionarFuncionario(f2);
        d2.adicionarFuncionario(f3);

        Projeto p1 = new Projeto("Projeto A");
        Projeto p2 = new Projeto("Projeto B");

        p1.adicionarFuncionario(f1);
        p1.adicionarFuncionario(f2);
        p2.adicionarFuncionario(f3);

        System.out.println("Média salarial do departamento de Desenvolvimento: " + d1.calcularMediaSalarial());
        System.out.println("Projetos do funcionário Renan: " + f1.getProjetos());

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(p1);
        System.out.println(p2);
    }
}
