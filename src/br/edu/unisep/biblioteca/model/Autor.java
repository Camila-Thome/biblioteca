package br.edu.unisep.biblioteca.model;

public class Autor {
    private int id;
    private String nome;
    private String email;
    private String bio;
    private String livros;

    public Autor() {
    }

    public Autor(int id, String nome, String email, String bio, String livros) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.bio = bio;
        this.livros = livros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLivros() {
        return livros;
    }

    public void setLivros(String livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id + "\n" +
                ", nome='" + nome + '\'' +  "\n" +
                ", email='" + email + '\'' +  "\n" +
                ", bio='" + bio + '\'' +  "\n" +
                ", livros='" + livros + '\'' +  "\n" +
                '}';
    }
}
