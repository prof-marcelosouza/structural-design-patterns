package entities;

public abstract class Componente {

    public void adicionar(Componente componente) throws ExcecaoLogica {
        throw new ExcecaoLogica("Operação não suportada.");
    }

    public void remover(Componente componente) throws ExcecaoLogica {
        throw new ExcecaoLogica("Operação não suportada.");
    }

    public Componente recuperarFilho(int indice) throws ExcecaoLogica {
        throw new ExcecaoLogica("Operação não suportada.");
    }

    public void exibir() throws ExcecaoLogica {
        throw new ExcecaoLogica("Operação não suportada.");
    }

    public String getNome() throws ExcecaoLogica {
        throw new ExcecaoLogica("Operação não suportada.");
    }

    public String getCaminho() throws ExcecaoLogica {
        throw new ExcecaoLogica("Operação não suportada.");
    }
}
