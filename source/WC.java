import java.util.regex.Pattern;
import java.util.regex.Matcher;

class WC {
  private String text;

  public WC(String text){
    this.text = text;
  };

  public int characters(){
    return this.text.length();
  };

  public int words(){
    if(this.text.isEmpty()) return 0;
    Pattern p = Pattern.compile("\\s+");
    return p.split(this.text).length;
  };

  public int lines(){
    Pattern p = Pattern.compile("\\n");
    return p.split(this.text).length-1;
  };

}
