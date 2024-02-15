import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite o número da agencia: ");
        int conta = in.nextInt();
        System.out.println("Digite sua Agência: ");
        String agencia = in.next();
        System.out.println("Digite seu Nome e Sobrenome: ");
        in.nextLine();
        String nome = in.nextLine();
        System.out.println("Digite seu Saldo: ");
        double saldo = in.nextDouble();

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+conta+" e seu saldo "+saldo+" já está diponível para saque.");


    }
}
