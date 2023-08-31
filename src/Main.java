public class Main {
    public static void main(String[] args) {

        Conta Hugo = new Conta("Hugo Leonardo", "h@gmail.com", "LLL");
        Hugo.adicionarTransacao(new Transacao("12/11/2023", "Dia do lixo", 111.23d));

        Conta Antonio = new Conta("Antonio", "a@gmail.com", "LLL");
        Antonio.adicionarTransacao(new Transacao("11/02/2023", "Comprei um sorvete", 20.30d));

        Conta Alexandre = new Conta("Alexandre", "ale@gmail.com", "LLL");
        Alexandre.adicionarTransacao(new Transacao("11/05/2023", "Comprei uma braba", 25.30d));

        Conta Nati = new Conta("Nati", "Nati@gmail.com", "LLL");
        Nati.adicionarTransacao(new Transacao("11/02/2023", "Comprei uma torta alemã", 49.30d));

        System.out.println(Hugo);
        System.out.println(Antonio);
        System.out.println(Alexandre);
        System.out.println(Nati);

        System.out.println("Total de contas: " + Conta.getTotal());
        System.out.println("Total de transações: " + Transacao.getTotalTransacoes());
    }
}
