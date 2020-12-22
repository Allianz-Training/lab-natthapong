package com.something.testsb1.testsb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.something.testsb1.testsb.lab221220.BankAccount;
import com.something.testsb1.testsb.lab221220.BankAccountRepository;

@RestController
public class SimpleControlller {
  private static final boolean BankAccount = false;
  @Autowired
  private BankAccountRepository bankRepository;

  @GetMapping("/")
  @ResponseBody
  String home() {
    return "get success";
  }

  @PostMapping("/accounts")
  @ResponseBody
  public BankAccount create(@RequestBody BankAccount bankAccount) {
    return bankRepository.save(bankAccount);
  }

  @GetMapping("/accounts")
  public List<BankAccount> getAll() {
    return (List<BankAccount>) bankRepository.findAll();
  }

  @GetMapping("/account/{id}")
  public BankAccount get(@PathVariable("id") String account_id) {
    Iterable<BankAccount> bankAccounts = bankRepository.findAll();
    for (BankAccount b : bankAccounts) {
      if (b.getAccountNo().equals(account_id)) {
        return b;
      }
    }
    return new BankAccount();
  }

  @PutMapping("/account/{id}/updates")
  public BankAccount update(@RequestBody BankAccount bankAccount) {
    Iterable<BankAccount> bankAccounts = bankRepository.findAll();
    for (BankAccount b : bankAccounts) {
      if (b.getAccountNo().equals(bankAccount.getAccountNo())) {
        bankRepository.delete(b);
        return bankRepository.save(bankAccount);
      }
    }
    return new BankAccount();
  }

  @DeleteMapping("/account/{id}")
  public String delete(@RequestBody BankAccount bankAccount) {
    bankRepository.delete(bankAccount);
    return "success";
  }
}

