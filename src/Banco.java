public class Banco {
    private Usuario[] usuarios;
    private String nome;
    private int i;
    private ContaBancaria[] contaBancarias;

    public Banco(String nome) {
        this.nome = nome;
        this.i = 0;
        usuarios = new Usuario[100];
        contaBancarias = new ContaBancaria[100];
    }

    public void ListarContas() {
        for (int i = 0; i < this.i; i++) {
            contaBancarias[i].ResumoConta();
        }
    }

    public void ListarContasCPF(int N) {
        for (int i = 0; i < this.i; i++) {
            if (usuarios[i].getCpf() == N) {
                usuarios[i].ListarContas();
            }
        }
    }


}
