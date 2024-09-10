package exerciciosma.pkg2;

import java.util.HashSet;
import java.util.Set;

public class Departamento {
    private String nome;
    private Set<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public Set<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularMediaSalarial() {
        if (funcionarios.isEmpty()) {
            return 0;
        }
        double somaSalarios = 0;
        for (Funcionario f : funcionarios) {
            somaSalarios += f.getSalario();
        }
        return somaSalarios / funcionarios.size();
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                ", funcionarios=" + funcionarios +
                '}';
    }
}
