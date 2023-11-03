import java.util.*;

class accountdetails {
    double balance = 0;
    int amount;
    Scanner sc = new Scanner(System.in);
    String userid;
    int password;
    int id;

    public void userdata() {

        System.out.println("enter the user id");
        userid = sc.nextLine();
        System.out.println("enter the password");
        password = sc.nextInt();
    }

    public void deposit() {

        System.out.println("enter amount to deposite");
        amount = sc.nextInt();
        balance += amount;
        System.out.println("The amount is successfully deposited");
        System.out.println("The remaining amount is" + balance);
    }

    public void withdraw() {
        System.out.println("enter amount to withdraw");

        amount = sc.nextInt();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("The amount is successfully withdrawed");
            System.out.println("The remaining amount is" + balance);

        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");

        }
    }

    public void transfer() {
        System.out.println("enter bank account for whom to transfer");
        id = sc.nextInt();

        System.out.println("enter amount to transfer");
        int amount = sc.nextInt();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Them amount transferd is" + amount);
            System.out.println("The remaining amount is" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public void checkbalance() {
        System.out.println("the total balace is" + balance);
    }

}

class Task3 {
    public static void main(String args[]) {
        accountdetails ac = new accountdetails();

        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("ATM Menu:");
            System.out.println("1. Create account");
            System.out.println("2. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ac.userdata();
                    do {
                        System.out.println("1. Deposit");
                        System.out.println("2. Withdraw");
                        System.out.println("3. Transfer");
                        System.out.println("4. Check Balance");
                        System.out.println("5. exit");
                        int choice1;
                        choice1 = sc.nextInt();

                        switch (choice1) {
                            case 1:
                                ac.deposit();
                                break;
                            case 2:
                                ac.withdraw();
                                break;
                            case 3:
                                ac.transfer();
                                break;
                            case 4:
                                ac.checkbalance();
                                break;
                            case 5:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("invalid choice");
                        }

                    } while (true);

                case 2:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice");
            }

        } while (true);
    }
}
