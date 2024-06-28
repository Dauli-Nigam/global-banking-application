package global.bank.application.service;

import global.bank.application.domain.Account;

public interface NotificationService {

  void notifyAboutTransfer(Account account, String transferDescription);
}
