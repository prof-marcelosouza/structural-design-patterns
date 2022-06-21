import entities.Arquivo;
import entities.ExcecaoLogica;
import entities.GerenciadorDeArquivos;
import entities.Pasta;

public class Programa {

    public static void main(String[] args) throws ExcecaoLogica {

        Pasta raiz = new Pasta("Raiz", "/");
        Pasta pasta1 = new Pasta("Pasta 1", "/pasta1/");
        Pasta pasta2 = new Pasta("Pasta 2", "/pasta2/");
        Pasta pasta2_1 = new Pasta("Pasta 2.1", "/pasta2-1/");
        Pasta pasta3 = new Pasta("Pasta 3", "/pasta3/");

        raiz.adicionar(pasta1);
        raiz.adicionar(pasta2);
        raiz.adicionar(pasta3);
        pasta2.adicionar(pasta2_1);

        Arquivo a1 = new Arquivo("Arquivo 1", "/arq1");
        Arquivo a2 = new Arquivo("Arquivo 2", "/arq2");
        Arquivo a3 = new Arquivo("Arquivo 3", "/arq3");
        Arquivo a4 = new Arquivo("Arquivo 4", "/arq4");
        Arquivo a5 = new Arquivo("Arquivo 5", "/arq5");
        Arquivo a6 = new Arquivo("Arquivo 6", "/arq6");

        pasta1.adicionar(a1);
        pasta1.adicionar(a2);
        pasta2.adicionar(a3);
        pasta2.adicionar(a4);
        pasta2_1.adicionar(a5);
        pasta3.adicionar(a6);

        GerenciadorDeArquivos g1 = new GerenciadorDeArquivos(raiz);
        g1.exibirTodos();

        System.out.println(pasta1.recuperarFilho(0));
    }

}
