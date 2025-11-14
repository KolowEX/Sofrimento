public class ContaBancaria {
    private int numeroConta;
    private double dinheiro;
    private String nome_banco;
    private boolean ativa;
    private Extrato[] extratos;
    private int i;

    public ContaBancaria(int numeroConta, double dinheiro, boolean ativa, String nome_banco) {
        this.numeroConta = numeroConta;
        this.dinheiro = dinheiro;
        this.ativa = ativa;
        this.i = 0;
        this.nome_banco = nome_banco;
        extratos = new Extrato[100];
    }

    public void ResumoConta() {
        System.out.printf("CPF do cliente: %d\nQuantidade de dinheiro: %.2f\n", numeroConta, dinheiro);
        if(ativa) {
            System.out.printf("Atividade: Ativa\n");
        } else {
            System.out.printf("Atividade: Inativa");
        }
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public String getNome_banco() {
        return nome_banco;
    }

    public void RemoverDinheiro(int N) {
        dinheiro -= N;
    }

    public void GiveDinheiro(int N) {
        dinheiro += N;
    }

    public void listar_extratos() {
        for (int i = 0; i < this.i; i++) {
            System.out.printf("%dºvez:\n");
            extratos[i].extrair();
        }
    }

    public void adicionar_extrato(int cpf, boolean tipo, double quantia_antiga, double quantia_atual) {
        Extrato Carlinhos = new Extrato(cpf, tipo, quantia_antiga, quantia_atual);
        extratos[i] = Carlinhos;
        i++;
    }
}
