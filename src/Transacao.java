public class Transacao {
    private int id;
    private String data;

    private String descricao;

    private double valor;

    private static int totalTransacoes;

    public Transacao(int id, String data, String descricao, double valor) {
        Transacao.totalTransacoes++;
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }

    public static int getTotalTransacoes() {
        return totalTransacoes;
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

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

