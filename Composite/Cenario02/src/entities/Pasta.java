package entities;

import java.util.ArrayList;

public class Pasta extends Componente {

    private String nome;
    private String caminho;
    private ArrayList<Componente> componentes;

    public Pasta(String nome, String caminho) {
        this.nome = nome;
        this.caminho = caminho;
        this.componentes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCaminho() {
        return caminho;
    }

    public void adicionar(Componente componente) {
        componentes.add(componente);
    }

    public void remover(Componente componente) {
        for (Componente indice : componentes) {
            this.componentes.remove(indice);
        }
    }

    public Componente recuperarFilho(int indice) {
        return this.componentes.get(indice);
    }

    public void exibir() {
        for (Componente comp : componentes) {
            System.out.println(comp);
        }
    }

    @Override
    public String toString() {
        return "Pasta{" +
                "nome='" + nome + '\'' +
                ", caminho='" + caminho + '\'' +
                ", componentes=" + componentes +
                '}';
    }
}
