import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WCTest {
  @Test
  public void countCharaters_gives_the_number_of_characters_in_piece_of_text(){
    int chars = WC.countCharacters("apple");
    assertEquals(chars,5);
  };
  @Test
  public void countCharaters_gives_the_number_of_characters_in_piece_of_text2(){
    int chars = WC.countCharacters("apple\nmango");
    assertEquals(chars,11);
  };
  @Test
  public void countCharaters_gives_the_number_of_characters_in_piece_of_text3(){
    int chars = WC.countCharacters("apple\n\rmango");
    assertEquals(chars,12);
  };
}
