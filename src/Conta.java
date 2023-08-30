public class Conta {
    private int id;
    private String nome;
    private String email;
    private String senha;

    Transacao transacao;

    public Conta(){

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }

    public Transacao getTransacao() {
        return transacao;
    }
}
