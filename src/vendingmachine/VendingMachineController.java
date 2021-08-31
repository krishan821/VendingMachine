package vendingmachine;

public interface VendingMachineController {

    CoinBundle calculateChange(VendingMachineRequest request);
}

