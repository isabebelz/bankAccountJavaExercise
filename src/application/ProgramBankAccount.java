package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBankAccount {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();

        System.out.print("Is there na initial deposit? (y/n)");
        char yesOrNo = sc.next().charAt(0);

        double initialDeposit = 0;
        if(yesOrNo == 'y') {
            System.out.print("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
        }

        BankAccount bankData = new BankAccount(accountNumber, accountHolder, initialDeposit);

        System.out.println("Account data: ");
        System.out.println(bankData);

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        bankData.addDeposit(deposit);

        System.out.println("Update account data: ");
        System.out.println(bankData);

        System.out.println("Enter a withdraw value: ");
        double withDraw = sc.nextDouble();
        bankData.withDraw(withDraw);

        System.out.println("Update account data: ");
        System.out.println(bankData);

        sc.close();
    }

}