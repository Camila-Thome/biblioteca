package br.edu.unisep.biblioteca.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Emprestimo {
    private int idEmprestimo;
    private Usuario usuario;
    private Livro livro;
    private Calendar dataEmprestimo;
    private Calendar dataDevolucao;
    private String observacao;

    public Emprestimo() {
    }

    public Emprestimo(int idEmprestimo, Usuario usuario, Livro livro, Calendar dataEmprestimo, Calendar dataDevolucao, String observacao) {
        this.idEmprestimo = idEmprestimo;
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.observacao = observacao;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Calendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Calendar dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        return "Emprestimo{" +
                "idEmprestimo=" + idEmprestimo +  "\n" +
                ", usuario=" + usuario +  "\n" +
                ", livro=" + livro +  "\n" +
                ", dataEmprestimo=" + sdf.format(dataEmprestimo.getTime()) +  "\n" +
                ", dataDevolucao=" + sdf.format(dataDevolucao.getTime()) +  "\n" +
                ", observacao='" + observacao + '\'' +  "\n" +
                '}';
    }
}
