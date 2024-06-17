public class conta {
    private String titular;
    private int numeroConta;
    private double quantidade;

    public conta(String titular, int numeroConta, double quantidade) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.quantidade = quantidade;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public static conta compararQuantidades(conta conta1, conta conta2) {
        if (conta1.getQuantidade() > conta2.getQuantidade()) {
            return conta1;
        } else {
            return conta2;
        }
    }
}
