package org.Comparable_x_Comparator;

import java.util.Comparator;

public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public int compareTo(Livro o) {
        return titulo.compareToIgnoreCase(o.getTitulo());
    }
}

//Comparar Livro por autor
class CompararAutor implements Comparator<Livro> {
    public int compare(Livro o1, Livro o2) {
        return o1.getAutor().compareToIgnoreCase(o2.getAutor());
    }
}

//Comparar Livro por ano
class CompararAno implements Comparator<Livro> {
    public int compare(Livro o1, Livro o2) {
        return Integer.compare(o1.getAno(), o2.getAno());
//        if (o1.getAno() < o2.getAno()) return -1;
//        if (o1.getAno() > o2.getAno()) return 1;
//        return 0;
    }
}

//Comparar por Ano, se igual, por Autor, se igual, por Título
class CompararAnoAutorTitulo implements Comparator<Livro> {
    @Override
    public int compare(Livro o1, Livro o2) {
        int ano = Integer.compare(o1.getAno(), o2.getAno());
        if (ano != 0) return ano;
        int autor = o1.getAutor().compareToIgnoreCase(o2.getAutor());
        if (autor != 0) return autor;
        return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
    }
}
