package com.company.livros;


public class PilhaLivrosDAO implements IPilhaLivrosDAO {
    public void save (Livro livro) {
        System.out.println("Salvando o livro" + livro.getTitulo());
    }
}
