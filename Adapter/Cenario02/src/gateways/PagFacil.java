package gateways;

public class PagFacil {

    private float valor;
    private int parcelas;
    private String numeroCartao;
    private String cvv;

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public boolean validarCartao() {
        if ((this.numeroCartao != "") && (this.cvv != "") && (this.cvv.length() == 3)) {
            return true;
        }
        return false;
    }

    public boolean realizarPagamento() {
        System.out.println("Transação realizada via PagFacil");
        return true;
    }
}
