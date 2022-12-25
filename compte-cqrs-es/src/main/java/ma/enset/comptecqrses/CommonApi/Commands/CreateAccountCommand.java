package ma.enset.comptecqrses.CommonApi.Commands;

public class CreateAccountCommand extends BaseCommand<String> {
    private double initialBalance;
    private String currency;

    public CreateAccountCommand(String id, double accountBalance, String currency) {
        super(id);
        this.initialBalance = accountBalance;
        this.currency = currency;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public String getCurrency() {
        return currency;
    }
}
