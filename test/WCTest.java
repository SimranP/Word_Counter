import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WCTest {
  @Test
  public void countCharaters_gives_the_number_of_characters_in_piece_of_text(){
    WC someText = new WC("");
    assertEquals(someText.characters(),0);
  };

  @Test
  public void countCharaters_gives_the_number_of_characters_in_piece_of_text1(){
    WC someText = new WC("apple");
    assertEquals(someText.characters(),5);
  };

  @Test
  public void countCharaters_gives_the_number_of_characters_in_piece_of_text2(){
    WC someText = new WC("apple\nmango");
    assertEquals(someText.characters(),11);
  };

  @Test
  public void countCharaters_gives_the_number_of_characters_in_piece_of_text3(){
    WC someText = new WC("apple\n\rmango");
    assertEquals(someText.characters(),12);
  };

  @Test
  public void countWords_gives_the_number_of_words_in_piece_of_text(){
    WC someText = new WC("");
    assertEquals(someText.words(),0);
  };

  @Test
  public void countWords_gives_the_number_of_words_in_piece_of_text1(){
    WC someText = new WC("apple is a red fruit");
    assertEquals(someText.words(),5);
  };

  @Test
  public void countWords_gives_the_number_of_words_in_piece_of_text2(){
    WC someText = new WC(" ");
    assertEquals(someText.words(),0);
  };

  @Test
  public void countWords_gives_the_number_of_words_in_piece_of_text3(){
    WC someText = new WC("\n\r");
    assertEquals(someText.words(),0);
  };

  @Test
  public void countLines_gives_the_number_of_words_in_piece_of_text(){
    WC someText = new WC("\n\r");
    assertEquals(someText.lines(),1);
  };
  @Test
  public void countLines_gives_the_number_of_words_in_piece_of_text2(){
    WC someText = new WC("apple\n\ris\n\rsmall");
    assertEquals(someText.lines(),2);
  };

  @Test
  public void countLines_gives_the_number_of_words_in_piece_of_text3(){
    WC someText = new WC("apple\nis\nsmall");
    assertEquals(someText.lines(),2);
  };
}
