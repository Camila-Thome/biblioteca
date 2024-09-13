package br.edu.unisep.biblioteca.model;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String cpf;
    private String endereco;

    public Usuario() {
    }

    public Usuario(int id, String nome, String email, String senha, String telefone, String cpf, String endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Usuario{" + "\n" +
                "id=" + id + "\n" +
                ", nome='" + nome + '\'' + "\n" +
                ", email='" + email + '\'' + "\n" +
                ", senha='" + senha + '\'' + "\n" +
                ", telefone='" + telefone + '\'' + "\n" +
                ", cpf='" + cpf + '\'' + "\n" +
                ", endereco='" + endereco + '\'' + "\n" +
                '}';
    }
}
