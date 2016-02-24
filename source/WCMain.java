import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

public class WCMain{
  private static String fileReader(String fileName) throws FileNotFoundException,IOException{
    File file = new File(fileName);
      FileReader f_reader = new FileReader(file);
      char[] d = new char[(int)file.length()];
      f_reader.read(d);
      String data = new String(d);
      return data;
  };

  private static void getCountForFiles(String[] files)throws IOException{
    long totalChars = 0;
    long totalWords = 0;
    long totalLines = 0;

    for (int i = 0;i<files.length ;i++ ) {
      try{
        String text = fileReader(files[i]);
        WC someText = new WC(text,files[i]);
        totalChars = totalChars+someText.characters();
        totalWords = totalWords+someText.words();
        totalLines = totalLines+someText.lines();
        System.out.println(someText.representation());
      }catch(FileNotFoundException err){
        System.out.println(err.getMessage());
      };
    }
    System.out.println("\t"+totalLines+"\t"+totalWords+"\t"+totalChars+"\t"+"total");
  };

  public static void main(String[] args)  throws IOException{
    getCountForFiles(args);
  };
}
