public interface Bankinterface {

    double checkBalance();
    String addMoney(int amount);
    String withdrawMoney(int amount, String enteredPassword);
    double calculateInterest(int years);
}
