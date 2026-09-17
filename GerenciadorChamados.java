public class GerenciadorChamados {

    public static void main(String[] args) {
        ListaChamados lista = new ListaChamados();

        System.out.println("=== Cadastro inicial de chamados ===");
        lista.inserirFim(103, "Mariana", "Sistema não abre");
        lista.inserirFim(107, "Carlos", "Impressora desconectada");
        lista.inserirFim(112, "Beatriz", "Internet lenta");
        lista.inserirFim(118, "Lucas", "Erro ao acessar o sistema");
        lista.exibirChamados();

        System.out.println("\n=== Missão 2: inserindo chamado 100 no início ===");
        lista.inserirInicio(100, "Rafael", "Computador não liga");
        // O chamado 100 tornou-se o primeiro porque foi inserido no início e passou a ser o novo head.
        lista.exibirChamados();

        System.out.println("\n=== Missão 4: pesquisando chamados ===");
        if (lista.buscar(112)) {
            System.out.println("Chamado 112 encontrado.");
        } else {
            System.out.println("Chamado 112 não encontrado.");
        }

        if (lista.buscar(999)) {
            System.out.println("Chamado 999 encontrado.");
        } else {
            System.out.println("Chamado 999 não encontrado.");
        }

        System.out.println("\n=== Missão 5: removendo chamado 107 ===");
        lista.remover(107);
        lista.exibirChamados();
    }
}
