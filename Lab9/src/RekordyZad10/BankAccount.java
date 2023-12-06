package RekordyZad10;

public record BankAccount(String AccountNumber,double balance) {
    public BankAccount(String AccountNumber){
        this(AccountNumber, 0.0);
    }
}