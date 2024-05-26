import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Exemplo de conta criada com sucesso: " + conta.toString());

        System.out.println("Para criar uma conta, siga as instruções solicitadas:");

        System.out.println("Por favor, digite o número da conta!");
        conta.setNumero(scanner.nextInt());

        System.out.println("Por favor, digite o número da agência!");
        conta.setAgencia(scanner.next());

        System.out.println("Por favor, digite seu nome!");
        conta.setNome(scanner.next());

        System.out.println("Por favor, digite o saldo que será inserido em sua conta!");
        double saldo = scanner.nextDouble();
        while (saldo <=0) {
            System.out.println("O valor do saldo deve ser maior que 0!");
            System.out.println("Por favor, digite o saldo que será inserido em sua conta!");
            saldo = scanner.nextDouble();
        }
            conta.setSaldo(saldo);
               
        
        System.out.println(conta.toString());    
    }


}
