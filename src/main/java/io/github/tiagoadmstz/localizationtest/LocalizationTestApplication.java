package io.github.tiagoadmstz.localizationtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LocalizationTestApplication {

  @Autowired
  private ProfileTest profileTest;

	public static void main(String[] args) {
		SpringApplication.run(LocalizationTestApplication.class, args);
	}

  @Bean
  public CommandLineRunner teste() {
    return (args) -> {
      profileTest.profilePrint();
    };
  }
}
