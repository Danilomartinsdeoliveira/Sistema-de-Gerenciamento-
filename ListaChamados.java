public class ListaChamados {

    NoChamado head;

    public ListaChamados() {
        this.head = null;
    }

    public void inserirInicio(int codigo, String solicitante, String problema) {
        NoChamado novo = new NoChamado(codigo, solicitante, problema);

        novo.next = head;
        head = novo;
    }

    
    public void inserirFim(int codigo, String solicitante, String problema) {
        NoChamado novo = new NoChamado(codigo, solicitante, problema);

        if (head == null) {
            head = novo;
            return;
        }

        NoChamado atual = head;
        while (atual.next != null) {
            atual = atual.next;
        }
        atual.next = novo;
    }

    
    public void exibirChamados() {
        NoChamado atual = head;

        if (atual == null) {
            System.out.println("Nenhum chamado cadastrado.");
            return;
        }

        while (atual != null) {
            System.out.println("Código: " + atual.codigo);
            System.out.println("Solicitante: " + atual.solicitante);
            System.out.println("Problema: " + atual.problema);
            System.out.println("-----------------");
            atual = atual.next;
        }
    }

    
    public boolean buscar(int codigo) {
        NoChamado atual = head;
        while (atual != null) {
            if (atual.codigo == codigo) {
                return true;
            }
            atual = atual.next;
        }
        return false;
    }

   
    public boolean remover(int codigo) {
        if (head == null) {
            return false;
        }

        if (head.codigo == codigo) {
            head = head.next;
            return true;
        }

        NoChamado anterior = head;
        NoChamado atual = head.next;

        while (atual != null) {
            if (atual.codigo == codigo) {
                // A referência next do nó anterior passou a apontar para o próximo nó, retirando o 107 da cadeia.
                anterior.next = atual.next;
                return true;
            }
            anterior = atual;
            atual = atual.next;
        }
        return false;
    }
}
