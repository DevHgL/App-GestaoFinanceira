import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Conta> contas = new ArrayList<>();
    private static Conta contaLogada = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu: ");

            if (contaLogada == null) {
                System.out.println("1. Criar Conta.");
                System.out.println("2. Fazer Login.");
                System.out.println("3. Sair.");
            } else {
                System.out.println("4. Cadastrar Transacao.");
                System.out.println("5. Editar Transacao.");
                System.out.println("6. Exibir Transacoes.");
                System.out.println("7. Excluir Transacao.");
                System.out.println("8. Fazer Logout.");
                System.out.println("9. Sair.");
            }

            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar a quebra de linha deixada pelo nextInt()

            switch (opcao) {
                case 1 -> criarConta(scanner);
                case 2 -> fazerLogin(scanner);
                case 3, 9 -> System.out.println("Saindo do programa. Adeus!");
                case 4 -> cadastrarTransacao(scanner);
                case 5 -> editarTransacao(scanner);
                case 6 -> exibirTransacoes();
                case 7 -> excluirTransacao(scanner);
                case 8 -> fazerLogout();
                default -> System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 9);

        scanner.close();
    }

    private static void criarConta(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Conta conta = new Conta(nome, email, senha);
        contas.add(conta);

        System.out.println("Conta criada com sucesso!");
    }

    private static void fazerLogin(Scanner scanner) {
        if (contaLogada != null) {
            System.out.println("Voce ja esta logado como " + contaLogada.getEmail());
            return;
        }

        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        for (Conta conta : contas) {
            if (conta.getEmail().equals(email) && conta.getSenha().equals(senha)) {
                contaLogada = conta;
                System.out.println("Login bem-sucedido!");
                return;
            }
        }

        System.out.println("Email ou senha incorretos. Login falhou.");
    }

    private static void fazerLogout() {
        if (contaLogada == null) {
            System.out.println("Nenhum usuario logado.");
            return;
        }

        System.out.println("Logout bem-sucedido. Adeus, " + contaLogada.getNome() + "!");
        contaLogada = null;
    }

    private static void cadastrarTransacao(Scanner scanner) {
        if (contaLogada == null) {
            System.out.println("Voce precisa fazer login antes de cadastrar uma transacao.");
            return;
        }

        System.out.print("Data da Transacao: ");
        String data = scanner.nextLine();
        System.out.print("Descricao: ");
        String descricao = scanner.nextLine();
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpar a quebra de linha deixada pelo nextDouble()

        Transacao transacao = new Transacao(contaLogada.getId(), data, descricao, valor);
        contaLogada.adicionarTransacao(transacao);

        System.out.println("Transacao cadastrada com sucesso!");
    }

    private static void editarTransacao(Scanner scanner) {
        if (contaLogada == null) {
            System.out.println("Voce precisa fazer login antes de editar uma transacao.");
            return;
        }

        System.out.print("ID da Transacao: ");
        int idTransacao = scanner.nextInt();
        scanner.nextLine(); // Limpar a quebra de linha deixada pelo nextInt()

        List<Transacao> transacoes = contaLogada.getTransacoes();

        for (Transacao transacao : transacoes) {
            if (transacao.getId() == idTransacao) {
                System.out.print("Nova Data da Transacao: ");
                String novaData = scanner.nextLine();
                System.out.print("Nova Descricao: ");
                String novaDescricao = scanner.nextLine();
                System.out.print("Novo Valor: ");
                double novoValor = scanner.nextDouble();
                scanner.nextLine(); // Limpar a quebra de linha deixada pelo nextDouble().

                transacao.setData(novaData);
                transacao.setDescricao(novaDescricao);
                transacao.setValor(novoValor);

                System.out.println("Transacao editada com sucesso!");
                return;
            }
        }

        System.out.println("Transacao nao encontrada.");
    }

    private static void exibirTransacoes() {
        if (contaLogada == null) {
            System.out.println("Voce precisa fazer login antes de exibir as transacoes.");
            return;
        }

        List<Transacao> transacoes = contaLogada.getTransacoes();

        if (transacoes.isEmpty()) {
            System.out.println("Nenhuma transacao encontrada para esta conta.");
        } else {
            System.out.println("Transacoes da Conta:");
            for (Transacao transacao : transacoes) {
                System.out.println(transacao);
            }
        }
    }

    private static void excluirTransacao(Scanner scanner) {
        if (contaLogada == null) {
            System.out.println("Voce precisa fazer login antes de excluir uma transacao.");
            return;
        }

        System.out.print("ID da Transacao: ");
        int idTransacao = scanner.nextInt();
        scanner.nextLine(); // Limpar a quebra de linha deixada pelo nextInt()

        List<Transacao> transacoes = contaLogada.getTransacoes();

        for (Transacao transacao : transacoes) {
            if (transacao.getId() == idTransacao) {
                transacoes.remove(transacao);
                System.out.println("Transacao excluida com sucesso!");
                return;
            }
        }

        System.out.println("Transacao nao encontrada.");
    }

}
