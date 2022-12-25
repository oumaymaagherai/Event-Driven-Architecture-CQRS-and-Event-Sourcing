package ma.enset.comptecqrses.CommonApi.Events;

public class AccountCreatedEvent extends BaseEvent<String> {
    private double accountBalance;
    private String currency;

    public AccountCreatedEvent(String id, double accountBalance, String currency) {
        super(id);
        this.accountBalance = accountBalance;
        this.currency = currency;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCurrency() {
        return currency;
    }
}
