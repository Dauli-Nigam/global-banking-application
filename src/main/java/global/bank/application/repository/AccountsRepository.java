package global.bank.application.repository;

import global.bank.application.domain.Account;
import global.bank.application.exception.DuplicateAccountIdException;

import java.util.List;

public interface AccountsRepository {

  void createAccount(Account account) throws DuplicateAccountIdException;

  Account getAccount(String accountId);

  void clearAccounts();

    List<Account> findAll();
}
