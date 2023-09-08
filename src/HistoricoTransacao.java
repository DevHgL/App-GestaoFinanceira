import java.util.ArrayList;
import java.util.List;

public class HistoricoTransacao {
    private List<Transacao> historico;

    public HistoricoTransacao() {
        historico = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao) {
        historico.add(transacao);
    }

    public List<Transacao> getHistorico() {
        return historico;
    }

    public void limparHistorico() {
        historico.clear();
    }

    
}
