package org.List;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();

        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println("Lista Ordem de Inserção");
        System.out.println(ordenacaoPessoas.getPessoaList());
        System.out.println("------------------------------");

        // Ordenando e exibindo por idade
        System.out.println("Lista Ordem por Idade");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println("------------------------------");
        // Ordenando e exibindo por altura
        System.out.println("Lista Ordem por Altura");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println("------------------------------");
    }
}
