import java.io.IOException;
import java.io.FileNotFoundException;

public class WCMain{
  private static void getCountForFiles(String[] files)throws IOException{
    Total total = new Total(files).invoke();
    if(files.length>1)
      System.out.println("\t" + total.getTotalLines() + "\t" + total.getTotalWords() + "\t" + total.getTotalChars() + "\t" + "total");
  };



  private static class Total {
    private String[] files;
    private long totalChars = 0;
    private long totalWords = 0;
    private long totalLines = 0;

    public Total(String[] files) {
      this.files = files;
    }

    public long getTotalChars() {
      return totalChars;
    }

    public long getTotalWords() {
      return totalWords;
    }

    public long getTotalLines() {
      return totalLines;
    }

    public Total invoke() throws IOException {
      for (int i = 0;i<files.length ;i++ ) {
        try{
          String text = new File_reader(files[i]).read();
          WC someText = new WC(text,files[i]);
          totalChars += someText.characters();
          totalWords += someText.words();
          totalLines += someText.lines();
          System.out.println(someText.representation());
        }catch(FileNotFoundException err){
          System.out.println(err.getMessage());
        }
      }
      return this;
    }
  }
    public static void main(String[] args)  throws IOException{
        getCountForFiles(args);
    }
}
