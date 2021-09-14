package com.company.livros;

import java.util.ArrayList;
import java.util.List;

public class PilhasLivros {
    private List<Livro> livros = new ArrayList<>();
    private IPilhaLivrosDAO pilhaDAO;

    public PilhasLivros(IPilhaLivrosDAO pilhaDAO) {
        this.pilhaDAO = pilhaDAO;
    }

    public void push(Livro livro) {
        if(livros.size() == 5){
            throw  new ArrayStoreException();
        }
        if( !(livro.getTitulo().startsWith("A") || livro.getTitulo().startsWith("O"))){

            return;
        }
        pilhaDAO.save(livro);
        livros.add(livro);
    }

    public Integer count () {
        return livros.size();
    }

    public Livro pop () {
        Livro livro;
        livro = livros.get(livros.size() - 1);
        livros.remove(livros.size() - 1);
        return livro;
    }
}
