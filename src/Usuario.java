public class Usuario{
    private String nome;
    private int cpf;
    private double dinheiro;
    private ContaBancaria[] conta;
    private int i;

    public Usuario(String nome, int cpf, double dinheiro) {
        this.nome = nome;
        this.cpf = cpf;
        this.dinheiro = dinheiro;
        conta = new ContaBancaria[100];
    }

    public void ListarContas() {
        for (int i = 0; i < this.i; i++) {
            conta[i].ResumoConta();
        }
    }

    public boolean Cadasatrar_Conta(int N, double dinheiro, boolean ativa, String nome_banco) {
        if (dinheiro <= 0 || N <= 0) {
            System.out.printf("Conta invalida!\n");
            return false;
        }
        ContaBancaria Conta = new ContaBancaria(N, dinheiro, ativa, nome_banco);
            conta[i] = Conta;
            i++;
            return true;
    }

    public int getCpf() {
        return cpf;
    }

    public Boolean Realizar_Saque(ContaBancaria conta, int quantidade) {
        if (quantidade > conta.getDinheiro()) {
            System.out.printf("Erro! Quantia não existe no banco");
            return false;
        }
        conta.adicionar_extrato(cpf, false, conta.getDinheiro(), conta.getDinheiro() - quantidade);

        dinheiro += quantidade;
        conta.RemoverDinheiro(quantidade);

        return true;
    }

    public Boolean Depositar_Saque(ContaBancaria conta, int quantidade) {
        if (quantidade >  dinheiro) {
            System.out.printf("Erro! Quantia para ser depositada é menor do que o usuário possui");
            return false;
        }
        conta.adicionar_extrato(cpf, true, conta.getDinheiro(), conta.getDinheiro() + quantidade);

        dinheiro -= quantidade;
        conta.GiveDinheiro(quantidade);
        return true;
    }
}
