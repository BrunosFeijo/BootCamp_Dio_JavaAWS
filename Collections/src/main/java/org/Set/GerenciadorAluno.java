package org.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAluno {
    private Set<Aluno> alunoSet;

    public GerenciadorAluno() {
        this.alunoSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, Long matricula,double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }
    public void removerAlunoPorMatricula(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno aluno : alunoSet) {
                if (aluno.getMatricula() == matricula) {
                    alunoParaRemover = aluno;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("A Lista está vazia");
        }
        if (null == alunoParaRemover) {
            System.out.println("Matricula não encontrada");
        }
    }
    public void exibirAlunosPorNome(){
        if(!alunoSet.isEmpty()){
            Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
            System.out.println(alunosPorNome);
        }else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }
    public void exibirAlunosPorNota(){
        if (!alunoSet.isEmpty()){
            Set<Aluno> alunosPorNota = new TreeSet<>(new CompararNota());
            alunosPorNota.addAll(alunoSet);
            System.out.println(alunosPorNota);
        }else {
            throw new RuntimeException("O conjunto está vazio!");
        }

    }

}
