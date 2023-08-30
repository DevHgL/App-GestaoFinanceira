public class Main {
    public static void main(String[] args) {
        Conta teste = new Conta();
        teste.setId(1);
        teste.setNome("Hugo Leonardo");
        teste.setEmail("hleo@cucu.com");
        teste.setId(01);
        teste.setSenha("LLL");

        Transacao Pizza = new Transacao();
        Pizza.setId(1);
        Pizza.setData("12/11/2023");
        Pizza.setDescricao("Dia do lixo");
        Pizza.setValor(110.23);

        Transacao Carro = new Transacao();
        Carro.setId(2);
        Carro.setData("12/12/2023");
        Carro.setDescricao("Comprei um carro 0km, modelo Polo e de ano 2023");
        Carro.setValor(93_100.23);
        System.out.println(teste.getNome());
        System.out.println(teste.getEmail());
        System.out.println(teste.getTransacao());


    }
}
