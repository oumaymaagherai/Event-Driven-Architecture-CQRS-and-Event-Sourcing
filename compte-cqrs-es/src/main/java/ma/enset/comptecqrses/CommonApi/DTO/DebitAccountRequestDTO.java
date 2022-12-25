package ma.enset.comptecqrses.CommonApi.DTO;


public class DebitAccountRequestDTO {
    private String accountId;
    private double debitAmount;
    private String currency;

    public DebitAccountRequestDTO() {
    }

    public DebitAccountRequestDTO(String accountId,double debitAmount, String currency) {
        this.debitAmount = debitAmount;
        this.currency = currency;
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    
    public double getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(double debitAmount) {
        this.debitAmount = debitAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
