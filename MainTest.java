import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

  @Test
  public void test() {
    Assertions.assertEquals(2, Main.hammingDistance(1, 4));
    Assertions.assertEquals(1, Main.hammingDistance(3, 1));
  }
}
