package br.edu.unisep.biblioteca.funcoes;

import br.edu.unisep.biblioteca.model.Autor;
import br.edu.unisep.biblioteca.model.Emprestimo;
import br.edu.unisep.biblioteca.model.Livro;

import javax.swing.*;

public class Funcoes {
    public Autor adicionarAutor(){
        int idAutor = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome do autor"));
        String nomeAutor = JOptionPane.showInputDialog("Digite o nome do autor");
        String emailAutor = JOptionPane.showInputDialog("Digite o e-mail do autor");
        String bioAutor = JOptionPane.showInputDialog("Digite a bio do autor");
        String livrosAutor = JOptionPane.showInputDialog("Digite os livros do autor");

        Autor autor = new Autor();
        autor.setLivros(livrosAutor);

        return autor;

    }

    public Livro adicionarLivro(){
        int idLivro = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do livro"));
        String tituloLivro = JOptionPane.showInputDialog("Digite o nome do livro");
        String autorLivro = JOptionPane.showInputDialog("Digite o nome do autor");
        String editoraLivro = JOptionPane.showInputDialog("Digite o nome do editora");
        String generoLivro = JOptionPane.showInputDialog("Digite o genero");
        String sinopseLivro = JOptionPane.showInputDialog("Digite o sinopse");
        int qtd_paginasLivro = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de páginas"));
        int anoLivro = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do livro"));
        Livro livro = new Livro();
        livro.setAutor(adicionarAutor());

        return livro;
        }

    public void adicionarUsuario(){
        int idUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do usuario"));
        String nomeUsuario = JOptionPane.showInputDialog("Digite o nome do usuario");
        String emailUsuario = JOptionPane.showInputDialog("Digite o e-mail do usuario");
        String cpfUsuario = JOptionPane.showInputDialog("Digite o cpf do usuario");
        String endereçoUsuario = JOptionPane.showInputDialog("Digite o endereço do usuario");
        String telefoneUsuario = JOptionPane.showInputDialog("Digite o telefone do usuario");
        String senhaUsuario = JOptionPane.showInputDialog("Digite o senha");
    }

    public void  adicionarEmprestimo(){
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setLivro(adicionarLivro());

    }
}

