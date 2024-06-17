public class Main {
    public static void main(String[] args) {

        conta conta1 = new conta("João", 12345, 2500.0);
        conta conta2 = new conta("Maria", 67890, 3200.0);

        conta contaComMaisDinheiro = conta.compararQuantidades(conta1, conta2);

        System.out.println("Detalhes das contas:");
        System.out.println("Conta 1: Titular = " + conta1.getTitular() + ", Número da Conta = " + conta1.getNumeroConta() + ", Quantidade = " + conta1.getQuantidade());
        System.out.println("Conta 2: Titular = " + conta2.getTitular() + ", Número da Conta = " + conta2.getNumeroConta() + ", Quantidade = " + conta2.getQuantidade());

        if (conta1.getQuantidade() > conta2.getQuantidade()) {
            System.out.println("A conta com mais dinheiro pertence a: " + conta1.getTitular());
        } else if (conta1.getQuantidade() < conta2.getQuantidade()) {
            System.out.println("A conta com mais dinheiro pertence a: " + conta2.getTitular());
        } else {
            System.out.println("Ambas as contas têm a mesma quantidade de dinheiro.");
        }
    }
}