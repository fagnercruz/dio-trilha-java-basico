import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
         int numero;
         String agencia;
         String nomeCliente;
         double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da agência: ");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Agora informe a agência: ");
        agencia = sc.nextLine();

        System.out.print("Informe agora o seu nome completo: ");
        nomeCliente = sc.nextLine();

        System.out.print("Agora informe o saldo da sua conta: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!\n" +
                "Sua agência é " + agencia + ", conta " + numero + " e seu " +
                "saldo " + saldo + " já está disponível para saque.");

        sc.close();

    }
}
