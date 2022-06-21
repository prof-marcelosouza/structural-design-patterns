import entities.Cobranca;
import gateways.PagFacil;

public class Programa {

    public static void main(String[] args) {

        PagFacil pagFacil = new PagFacil();
        Cobranca cobranca = new Cobranca(pagFacil);

        cobranca.setValor(200);
        cobranca.setParcelas(5);
        cobranca.setNumerocartao("522366698554411");
        cobranca.setCVV("654");

        if (cobranca.realizarPagamento()) {
            System.out.println("Pagamento efetuado com sucesso!");
        } else {
            System.out.println("Falha na transação :(");
        }
    }

}
