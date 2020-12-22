package com.something.testsb1.testsb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
// import com.something.testsb1.testsb.lab221220.BankAccountRepository;

@SpringBootApplication
public class TestsbApplication {

  // @Autowired
  // private BankAccountRepository bankRepository;

  public static void main(String[] args) {
    System.out.println(1111);
    SpringApplication.run(TestsbApplication.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
    return args -> {
      System.out.println("Test test");
      //
      // BankAccount account = new BankAccount("Babe2", "TSTKUB2", new BigDecimal(100030), 10);
      // System.out.println(bankRepository.save(account));
      // System.out.println(account.toString());
      // System.out.println(bankRepository.findAll());
      // account = new BankAccount("Babe2", "TSTKUB2", new BigDecimal(100030), 10);
      // bankRepository.delete(account);

      // System.exit(0);
      // if (args[0] == "exit") {
      // System.exit(0);
      // }
    };
  }
}
