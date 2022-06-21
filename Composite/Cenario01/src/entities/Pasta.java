package entities;

import java.util.ArrayList;

public class Pasta {

    private String nome;
    private String caminho;
    private ArrayList<String> componentes;

    public Pasta(String nome, String caminho) {
        this.nome = nome;
        this.caminho = caminho;
        this.componentes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public void adicionar(Arquivo componente) {
        componentes.add(String.valueOf(componente));
    }

    public void remover(Arquivo componente) {

    }

    public void exibir() {
        for (String str : componentes) {
            System.out.println(str);
        }
    }
}
