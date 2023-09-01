public class Main {
    public static void main(String[] args) {
        Conta Hugo = new Conta("Hugo Leonardo", "hleomelo1@gmail.com", "LLL");
        Hugo.adicionarTransacao(new Transacao("12/11/2023", "Dia do lixo", 111.23d));
        Hugo.adicionarTransacao(new Transacao("12/12/2023", "Carro 0km", 93_003.43d));

        Conta Anon = new Conta("Antonio", "anon@gmail.com", "LLL");
        Anon.adicionarTransacao(new Transacao("11/02/2023", "Comprei uma torta alemã", 20.30d));
        Anon.adicionarTransacao(new Transacao("11/12/2023","Processador i9", 1570.23d));

        Conta Ale = new Conta("Alexandre", "ale@gmail.com", "LLL");
        Ale.adicionarTransacao(new Transacao("08/09/2023", "Comprei uma ganja", 11.20d));

        System.out.println(Hugo);
        System.out.println(Hugo.getTransacoes());

        System.out.println(Anon);
        System.out.println(Anon.getTransacoes());

        System.out.println(Ale);
        System.out.println(Ale.getTransacoes());

        System.out.println("Total de contas: " + Conta.getTotal());
        System.out.println("Total de transações: " + Transacao.getTotalTransacoes());
    }
}
