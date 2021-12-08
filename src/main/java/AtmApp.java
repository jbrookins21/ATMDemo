import java.util.Scanner;

public class AtmApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Atm myAtm = new Atm(500, "5555");

        System.out.println("Welcome to wcci bank");
        System.out.println("please enter your pin");
        String userEnteredPin = input.nextLine();

        while (myAtm.accessAccount(userEnteredPin) == false) {
            System.out.println("incorrect pin please try again");
            userEnteredPin = input.nextLine();
        }
        System.out.println("Please select from the menu below");
        System.out.println("Press 1 to check balance");
        System.out.println("Press 2 to make a deposit");
        System.out.println("Press 3 to withdraw");
        System.out.println("Press 4 to exit");
        String userChoice = input.nextLine();

        while (!userChoice.equals("4")) {
            if (userChoice.equals("1")) {
                System.out.println("You have chosen to check your balance");
                System.out.println("Your balance is " + myAtm.getBalance());

            } else if (userChoice.equals("2")) {
                System.out.println("You want to make a deposit");
                System.out.println("Enter the amount:");
                int amountToDeposit = input.nextInt();
                input.nextLine();
                myAtm.deposit(amountToDeposit);
            } else if (userChoice.equals("3")) {
                System.out.println("You want to make a withdraw");
                System.out.println("Enter the amount: ");
                int amountToWithdraw = input.nextInt();
                input.nextLine();
                myAtm.withdraw(amountToWithdraw);
            } else {
                System.out.println("Sorry I do not understand your request");
            }
            System.out.println("Please select from the menu below");
            System.out.println("Press 1 to check balance");
            System.out.println("Press 2 to make a deposit");
            System.out.println("Press 3 to withdraw");
            System.out.println("Press 4 to exit");
            userChoice = input.nextLine();
        }
        System.out.println("Thanks for banking with us and have a nice day!");
    }
}
