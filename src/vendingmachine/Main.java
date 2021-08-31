package vendingmachine;
import vendingmachine.TextVendingMachine;
import vendingmachine.VendingMachineInterface;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        VendingMachineInterface machineInterface = new TextVendingMachine();

        machineInterface.displayProducts();

        String selectedProduct = sc.nextLine();
        machineInterface.selectProduct(Integer.parseInt(selectedProduct));

        machineInterface.displayEnterCoinsMessage();

        String userEnteredCoins = sc.nextLine();
        int[] enteredCoins = Coin.parseCoins(userEnteredCoins);
        machineInterface.enterCoins(enteredCoins);

        machineInterface.displayChangeMessage();

    }
}