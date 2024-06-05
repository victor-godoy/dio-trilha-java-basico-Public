import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int Numero = Integer.valueOf(args[0]);
        String Agencia = args[1];
        String NomeCliente = args[2];
        double Saldo = Double.valueOf(args[3]);

        System.out.println("Digite o número : ");
        Numero = sc.nextInt();
        sc.nextLine(); // Para pular uma linha

        System.out.println("Digite o número da agência: ");
        Agencia = sc.nextLine();

        System.out.println("Digite o nome do cliente : ");
        NomeCliente = sc.nextLine();

        // resposta
        System.out.println("Conta criada com sucesso!");
        System.out.println("Número: " + Numero);
        System.out.println("Agência: " + Agencia);
        System.out.println("Cliente: " + NomeCliente);
        System.out.println("Saldo: " + Saldo);

        // Frase
        String frase = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                NomeCliente, Agencia, Numero, Saldo);

        System.out.println(frase);

        sc.close();
    }
}
