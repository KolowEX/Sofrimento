public class Extrato {
    private int cpf;
    private boolean tipo;
    private double quantia_antiga;
    private double quantia_atual;

    public Extrato(int cpf, boolean tipo, double quantia_antiga, double quantia_atual) {
        this.cpf = cpf;
        this.tipo = tipo;
        this.quantia_antiga = quantia_antiga;
        this.quantia_atual = quantia_atual;
    }

    public int getCpf() {
        return cpf;
    }

    public boolean isTipo() {
        return tipo;
    }

    public double getQuantia_antiga() {
        return quantia_antiga;
    }

    public double getQuantia_atual() {
        return quantia_atual;
    }

    public void extrair() {
        System.out.printf("----------------");
        if (tipo) {
            System.out.printf("Deposito\n");
        } else {
            System.out.printf("Saque\n");
        }
        System.out.printf("----------------\n");
        System.out.printf("Saldo antigo: %.2f\nSaldo atual: %.2f\nCpf da conta: %d\n", quantia_antiga, quantia_atual, cpf);


    }
}