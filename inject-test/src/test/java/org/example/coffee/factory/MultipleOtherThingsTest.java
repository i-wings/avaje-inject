package org.example.coffee.factory;

import io.avaje.inject.BeanContext;
import io.avaje.inject.BeanContextBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleOtherThingsTest {

  @Test
  public void test() {

    try (BeanContext context = new BeanContextBuilder().build()) {
      final MultipleOtherThings combined = context.getBean(MultipleOtherThings.class);
      assertEquals("blue", combined.blue());
      assertEquals("red", combined.red());
      assertEquals("green", combined.green());
      assertEquals("yellow", combined.yellow());
    }
  }
}
