package gateways;

public class TopPagamentos {

    private float valor;
    private int parcelas;
    private String numeroCartao;
    private String cvv;

    public void setValorTotal(float total) {
        this.valor = total;
    }

    public void setQuantidadeParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public void setCartao(String numeroCartao, String cvv) {
        this.numeroCartao = numeroCartao;
        this.cvv = cvv;
    }

    public boolean realizarPagamento() {
        System.out.println("Transação realizada via TopPagamentos.");
        return true;
    }
}
