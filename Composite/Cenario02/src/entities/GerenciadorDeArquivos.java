package entities;

public class GerenciadorDeArquivos {

    private Componente raiz;

    public GerenciadorDeArquivos(Componente raiz) {
        this.raiz = raiz;
    }

    public void exibirTodos() throws ExcecaoLogica {
        this.raiz.exibir();
    }
}
