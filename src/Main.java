public class Main {
    public static void main(String[] args) {
        Conta Hugo = new Conta("Hugo Leonardo", "hleomelo1@gmail.com", "LLL");
        Hugo.adicionarTransacao(new Transacao("12/11/2023", "Dia do lixo", 111.23d));
        Hugo.adicionarTransacao(new Transacao("12/12/2023", "Carro 0km", 93_003.43d));

        Conta Gabi = new Conta("Gabriela", "g@gmail.com", "LLL");
        Gabi.adicionarTransacao(new Transacao("11/02/2023", "Comprei uma torta alemã", 20.30d));

        System.out.println(Hugo);
        System.out.println(Gabi);

        System.out.println("Total de contas: " + Conta.getTotal());
        System.out.println("Total de transações: " + Transacao.getTotalTransacoes());
    }
}
