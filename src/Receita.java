public class Receita extends Transacao {

    private String fonteDeRenda;
    private String origem;

    public Receita(int id, String data, String descricao, double valor, String fonteDeRenda, String origem) {
        super(id, data, descricao, valor, origem, origem);
        this.fonteDeRenda = fonteDeRenda;
        this.origem = origem;
    }

    public String getFonteDeRenda() {
        return fonteDeRenda;
    }

    public void setFonteDeRenda(String fonteDeRenda) {
        this.fonteDeRenda = fonteDeRenda;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    @Override
    public String toString() {
        return "Receita [fonteDeRenda=" + fonteDeRenda + ", origem=" + origem + ", " + super.toString() + "]";
    }
}
