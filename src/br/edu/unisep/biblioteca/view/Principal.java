package br.edu.unisep.biblioteca.view;

import br.edu.unisep.biblioteca.funcoes.Funcoes;
import br.edu.unisep.biblioteca.model.Autor;
import br.edu.unisep.biblioteca.model.Emprestimo;
import br.edu.unisep.biblioteca.model.Livro;
import br.edu.unisep.biblioteca.model.Usuario;

import javax.swing.*;
import java.util.Calendar;

public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNome("Camila Queli Sockenski Thome");
        usuario.setEmail("camilathomest@gmail.com");
        usuario.setSenha("123456");
        usuario.setEndereco("Rua Pompeia, ItaliaII, 392");
        usuario.setTelefone("46 999013535");
        usuario.setCpf("11265018910");

        Autor autor = new Autor();
        autor.setId(1);
        autor.setNome("J.K Rowling");
        autor.setEmail("jk.rowling@gmail.com");
        autor.setBio("blablablabla");
        autor.setLivros("réri poti");

        Livro livro = new Livro();
        livro.setId(1);
        livro.setAutor(autor);
        livro.setAno(1990);
        livro.setTitulo("réri poti e o copo de fogo");
        livro.setEditora("roku");
        livro.setQtd_paginas(678);
        livro.setGenero("ficção");
        livro.setSinopse("blablabla");


        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setIdEmprestimo(1);
        emprestimo.setLivro(livro);
        emprestimo.setUsuario(usuario);
        emprestimo.setDataEmprestimo(Calendar.getInstance());
        emprestimo.setDataDevolucao(Calendar.getInstance());
        emprestimo.setObservacao("está rasgado, igual certas coisas");

        JOptionPane.showMessageDialog(null, emprestimo);
      //  Funcoes f = new Funcoes();
      //  f.adicionarEmprestimo();
    }
}
