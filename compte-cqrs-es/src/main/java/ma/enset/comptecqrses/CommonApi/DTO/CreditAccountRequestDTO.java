package ma.enset.comptecqrses.CommonApi.DTO;


public class CreditAccountRequestDTO {
    private String accountId;
    private double creditAmount;
    private String currency;

    public CreditAccountRequestDTO() {
    }

    public CreditAccountRequestDTO(String accountId,double creditAmount, String currency) {
        this.creditAmount = creditAmount;
        this.currency = currency;
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    
    public double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
