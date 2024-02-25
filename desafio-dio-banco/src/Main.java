public class Main {
    public static void main(String[] args) {
        Cliente renan = new Cliente();
        renan.setNome("Renan");

        Conta cc = new ContaCorrente(renan);
        Conta poupanca = new ContaPoupanca(renan);

        cc.depositar(100);
        cc.transferir(20, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
