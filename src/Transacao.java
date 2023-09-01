public class Transacao {
    private int id;
    
    private String data;

    private String descricao;

    private double valor;

    public Transacao() {

        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String obterCategoria(){
        String categoria = getDescricao();

        return "a sua categoria é: " + categoria;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String desc) {
        this.descricao = desc;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

