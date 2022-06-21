package entities;

import gateways.PagFacil;

public class Cobranca {

    private PagFacil gateway;

    public Cobranca() {
    }

    public Cobranca(PagFacil gateway) {
        this.gateway = gateway;
    }

    public void setGateway(PagFacil gateway) {
        this.gateway = gateway;
    }

    public void setValor(float valor) {
        this.gateway.setValor(valor);
    }

    public void setParcelas(int parcelas) {
        this.gateway.setParcelas(parcelas);
    }

    public void setNumerocartao(String numerocartao) {
        this.gateway.setNumeroCartao(numerocartao);
    }

    public void setCVV(String cvv) {
        this.gateway.setCvv(cvv);
    }

    public boolean realizarPagamento() {
        if (this.gateway.validarCartao()) {
            return this.gateway.realizarPagamento();
        }
        return false;
    }
}
