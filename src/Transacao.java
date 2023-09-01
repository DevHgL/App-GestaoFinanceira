import java.util.ArrayList;
import java.util.List;

public class Transacao {
    private int id;
    private String data;
    private String descricao;
    private double valor;
    private static int totalTransacoes;

    public Transacao(String data, String descricao, double valor) {
        Transacao.totalTransacoes++;
        this.id = Transacao.totalTransacoes;
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

    public String getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Transacao [id=" + id + ", data=" + data + ", descricao=" + descricao + ", valor=" + valor + "]";
    }
}
