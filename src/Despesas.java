public class Despesas extends Transacao {

    private  String formaDePagamento;

    private String categoria;

    public Despesas(String formaDePagamento, String categoria) {
        this.formaDePagamento = formaDePagamento;
        this.categoria = categoria;
    }


    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Despesas [formaDePagamento=" + formaDePagamento + ", categoria=" + categoria + "]";
    }
    
}
