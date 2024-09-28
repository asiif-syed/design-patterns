package State;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);
        String command;
        while (true) {
            System.out.println("\nEnter command: (insert, select, dispense, cancel, outofstock, instock)");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "insert":
                    System.out.print("Enter amount to insert: ");
                    double amount = scanner.nextDouble();
                    vendingMachine.insertMoney(amount);
                    scanner.nextLine(); // Consume newline
                    break;
                case "select":
                    System.out.print("Enter product code : ");
                    String code = scanner.nextLine();
                    vendingMachine.selectProduct(code);
                    break;
                case "dispense":
                    vendingMachine.dispenseProduct();
                    break;
                case "cancel":
                    vendingMachine.requestRefund();
                    break;
                case "outofstock":
                    vendingMachine.setOutOfStock();
                    return;
                case "instock":
                    vendingMachine.setInStock();
                    return;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}
