package application;
import entities.Account;
import java.util.Locale;
import java.util.Scanner;
import entities.Transaction;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account ac = new Account();
        //Definindo dados de nome
        System.out.print("Enter the account holder: ");
        String name = sc.nextLine();
        ac.setName(name);

        //Definindo dados de conta
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        ac.setAccountNumber(accountNumber);
        sc.nextLine();

        //Questionando se há depósito inicial
        System.out.print("Is there a initial deposit (y/n)? ");
        String isInitialDeposit = sc.nextLine();


        //Validação do depósito inicial e inserção do valor no balanço final da conta
        if ("y".equalsIgnoreCase(isInitialDeposit)) {
            System.out.print("Enter the initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            ac.setInitialDeposit(initialDeposit);
            ac.setBalance(initialDeposit);
            System.out.println("Account data with deposit: " + ac);
        } else {
            System.out.println("Account data without deposit: " + ac);
        }

        Transaction tc = new Transaction();

        //Questionando depósito posterior
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        tc.setDeposit(depositValue);
        System.out.println(tc.getDeposit());
        System.out.println("Updated account data: " + ac);

        //Questionando saque
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        tc.setWithdraw(withdrawValue);
        System.out.println(tc.getWithdraw() + ac.getBalance());
        System.out.println("Updated account data: " + ac);

        sc.close();

    }
}
