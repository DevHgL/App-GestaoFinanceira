public class Main {
    public static void main(String[] args) {
        Conta teste = new Conta();

        teste.setNome("Hugo Leonardo");
        teste.setEmail("hleo@gmail.com");
        teste.setId(01);
        teste.setSenha("LLL");


        Transacao Pizza = new Transacao("12/11/2023", "Dia do lixo", 111.23);
//        Pizza.setId(1);
//        Pizza.setData("12/11/2023");
//        Pizza.setDescricao("Dia do lixo");
//        Pizza.setValor(110.23);

        Transacao Carro = new Transacao("12/12/2023", "Carro 0km", 93_003.43);
//        Carro.setId(2);
//        Carro.setData("12/12/2023");
//        Carro.setDescricao("Comprei um carro 0km, modelo Polo e de ano 2023");
//        Carro.setValor(93_100.23);
        System.out.println(teste.getNome());
        System.out.println(teste.getEmail());


        System.out.println("Total de contas: " + Conta.getTotal() );
        System.out.println("Total de transações: " + Transacao.getTotalTransacoes());

    }
}
