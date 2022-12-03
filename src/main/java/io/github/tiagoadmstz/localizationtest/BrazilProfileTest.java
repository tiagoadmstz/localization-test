package io.github.tiagoadmstz.localizationtest;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = "pt-BR")
public class BrazilProfileTest implements ProfileTest {

  @Override
  public void profilePrint() {
    System.out.println("Brazil profile"); 
  }
}
