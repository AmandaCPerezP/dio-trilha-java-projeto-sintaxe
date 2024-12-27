
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu número inteiro da conta: ");
        int numero = leia.nextInt();
        leia.nextLine(); // Consumir a quebra de linha

        System.out.println("Por favor, digite o código da sua agência: ");
        String agencia = leia.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        String nome = leia.nextLine();

        System.out.println("Por favor, digite saldo que deseja sacar em valores decimais: ");
        double saldo = leia.nextDouble();

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, numero, saldo);

        System.out.println(mensagem);

        leia.close();
    }
}


