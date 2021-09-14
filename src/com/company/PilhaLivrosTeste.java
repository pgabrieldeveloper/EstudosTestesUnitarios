package com.company;

import com.company.livros.IPilhaLivrosDAO;
import com.company.livros.Livro;
import com.company.livros.PilhaLivrosDAO;
import com.company.livros.PilhasLivros;
import org.junit.*;

public class PilhaLivrosTeste {

    private static IPilhaLivrosDAO pilhaDAO =  new PilhaLivrosDAO();

    private static PilhasLivros pilha;

    @BeforeClass
    public static void  setUpBeforeClass() {

        pilha = new PilhasLivros(pilhaDAO);
    }

    @AfterClass
    public static void tearDownAfterClass() {
        pilha = null;
    }

    @Before
    public void setUp() {
        Livro livro1 = new Livro("A caçada1");
        Livro livro2 = new Livro("A caçada2");
        Livro livro3 = new Livro("A caçada3");
        Livro livro4 = new Livro("A caçada4");
        Livro livro5 = new Livro("A caçada5");
        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);
        pilha.push(livro5);
        System.out.println(pilha.count());

    }
    @After
    public void tearDown() {
        Integer count = pilha.count();
        while (count > 0){
            pilha.pop();
            count--;
        }
    }

    @Test
    public void naoAdicionaLivroAlemDoLimite() {
        try {
            pilha.push(new Livro("A volta dos que n forama"));
            Assert.fail();
        }catch(ArrayStoreException e){
            Assert.assertTrue(true);
        }
    }

    @Test
    public void naoAdicionaLivroComONomeForaDoPadrao() {
        pilha.pop();
        pilha.push(new Livro("Lumens guerreiros da luz"));
        Assert.assertEquals("A caçada4",pilha.pop().getTitulo());

    }
}
