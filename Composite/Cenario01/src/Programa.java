import entities.Arquivo;
import entities.Pasta;

public class Programa {

    public static void main(String[] args) {

        Pasta raiz = new Pasta("Raiz", "/");

        Arquivo a1 = new Arquivo("Arquivo 1", "/arq1");
        Arquivo a2 = new Arquivo("Arquivo 2", "/arq2");
        Arquivo a3 = new Arquivo("Arquivo 3", "/arq3");
        Arquivo a4 = new Arquivo("Arquivo 4", "/arq4");
        Arquivo a5 = new Arquivo("Arquivo 5", "/arq5");
        Arquivo a6 = new Arquivo("Arquivo 6", "/arq6");

        raiz.adicionar(a1);
        raiz.adicionar(a2);
        raiz.adicionar(a3);
        raiz.adicionar(a4);
        raiz.adicionar(a5);
        raiz.adicionar(a6);

        raiz.exibir();
    }

}
