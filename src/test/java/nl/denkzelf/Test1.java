package nl.denkzelf;

import nl.denkzelf.test2.Tester2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {

  @Test
  void test1() {
    Assertions.assertEquals("this helps static",Tester2.myStaticHelper());
  }

  @Test
  void test2() {
    Tester2 tester2 = new Tester2();
    Assertions.assertEquals("this helps",tester2.myHelper());
  }

}
