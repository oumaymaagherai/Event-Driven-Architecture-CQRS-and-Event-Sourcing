package ma.enset.comptecqrses.CommonApi.Events;

import ma.enset.comptecqrses.CommonApi.Enum.AccountStatus;

public class AccountActivatedEvent extends BaseEvent<String> {
    private AccountStatus accountStatus;

    public AccountActivatedEvent(String id, AccountStatus accountStatus) {
        super(id);
        this.accountStatus = accountStatus;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }
}
