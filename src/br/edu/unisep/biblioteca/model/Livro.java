package br.edu.unisep.biblioteca.model;

public class Livro {
    private int id;
    private String titulo;
    private Autor autor;
    private String editora;
    private String genero;
    private String sinopse;
    private int ano;
    private int qtd_paginas;

    public Livro() {
    }

    public Livro(int id, String titulo, Autor autor, String editora, String genero, String sinopse, int ano, int qtd_paginas) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
        this.sinopse = sinopse;
        this.ano = ano;
        this.qtd_paginas = qtd_paginas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQtd_paginas() {
        return qtd_paginas;
    }

    public void setQtd_paginas(int qtd_paginas) {
        this.qtd_paginas = qtd_paginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +  "\n" +
                ", titulo='" + titulo + '\'' + "\n" +
                ", autor=" + autor +  "\n" +
                ", editora='" + editora + '\'' +  "\n" +
                ", genero='" + genero + '\'' +  "\n" +
                ", sinopse='" + sinopse + '\'' +  "\n" +
                ", ano=" + ano +  "\n" +
                ", qtd_paginas=" + qtd_paginas +  "\n" +
                '}';
    }
}