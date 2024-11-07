package fontys.sem6.circline.authentication;

import fontys.sem6.circline.authentication.persistence.AccountRepository;
import fontys.sem6.circline.authentication.persistence.entity.AccountEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class AuthenticationCirclineApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationCirclineApplication.class, args);
	}
//@Bean
//	CommandLineRunner initDatabase(AccountRepository accountRepository, PasswordEncoder passwordEncoder) {
//	return args -> {
//
//
//		AccountEntity account1 = new AccountEntity();
//			account1.setUserId(Long.valueOf(123));
//			account1.setEmail("Sallyphan@gmail.com");
//			account1.setPassword(passwordEncoder.encode("123456"));
//			account1.setRole("USER");
//			accountRepository.save(account1);
//
//				AccountEntity account2 = new AccountEntity();
//		       account2.setUserId(Long.valueOf(456));
//				account2.setEmail("Mary@gmail.com");
//			account2.setPassword(passwordEncoder.encode("123456"));
//			account2.setRole("ADMIN");
//			accountRepository.save(account2);
//
//		};
//	}
}
