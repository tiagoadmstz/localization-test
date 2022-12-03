package io.github.tiagoadmstz.localizationtest;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = "es-AR")
public class ArgentinaProfileTest implements ProfileTest {

  @Override
  public void profilePrint() {
    System.out.println("Argentina profile"); 
  }
}
