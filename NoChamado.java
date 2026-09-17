public class NoChamado {

    int codigo;
    String solicitante;
    String problema;

    // next representa a referência para o próximo nó da lista encadeada.
    NoChamado next;

    public NoChamado(int codigo, String solicitante, String problema) {
        this.codigo = codigo;
        this.solicitante = solicitante;
        this.problema = problema;
        this.next = null;
    }
}
