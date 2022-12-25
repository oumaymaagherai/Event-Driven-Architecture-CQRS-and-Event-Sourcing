package ma.enset.comptecqrses.Query.Repository;

import ma.enset.comptecqrses.Query.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {

}

