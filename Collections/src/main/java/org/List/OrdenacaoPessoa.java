package org.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        if (!pessoasPorIdade.isEmpty()){
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        }else{
            throw new RuntimeException("A Lista está vazia");
        }
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        if (!pessoasPorAltura.isEmpty()){
            Collections.sort(pessoasPorAltura,new CompararAltura());
            return pessoasPorAltura;
        }else {
            throw new RuntimeException("A Lista está vazia");
        }
    }

    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }
}
