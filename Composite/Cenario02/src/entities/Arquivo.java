package entities;

public class Arquivo extends Componente {

    private String nome;
    private String caminho;

    public Arquivo(String nome, String caminho) {
        this.nome = nome;
        this.caminho = caminho;
    }

    public String getNome() {
        return nome;
    }

    public String getCaminho() {
        return caminho;
    }

    @Override
    public String toString() {
        return "nome = " + nome + ", caminho = " + caminho;
    }
}
