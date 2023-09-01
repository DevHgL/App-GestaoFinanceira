import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private static int total;
    private List<Transacao> transacoes;

    public Conta(String nome, String email, String senha) {
        Conta.total++;
        this.id = Conta.total;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.transacoes = new ArrayList<>();
    }

    public static int getTotal() {
        return total;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    @Override
    public String toString() {
        return "Conta [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
    }
}
