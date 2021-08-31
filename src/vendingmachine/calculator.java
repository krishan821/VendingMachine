package vendingmachine;

public interface calculator {
	int calculateTotal(CoinBundle enteredCoins);
    CoinBundle calculateChange(int enteredByUserMoney);
}
