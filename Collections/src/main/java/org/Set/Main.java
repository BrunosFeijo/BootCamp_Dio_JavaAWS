package org.Set;

public class Main {
    public static void main(String[] args) {
        GerenciadorAluno gerenciadorAlunos = new GerenciadorAluno();

        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.getAlunoSet());

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAlunoPorMatricula(1001L);
        gerenciadorAlunos.removerAlunoPorMatricula(123457L);
        System.out.println(gerenciadorAlunos.getAlunoSet());

        // Exibindo alunos ordenados por nome
        System.out.println("\n------------Por Nome------------");
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        System.out.println("\n------------Por Nota------------");
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
