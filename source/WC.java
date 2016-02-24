import java.util.regex.Pattern;

class WC{
  private String text;
  private String fileName;

  public WC(String text,String fileName){
    this.text = text;
    this.fileName = fileName;
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
    return p.split(this.text).length;
  };

  public String representation(){
    return "\t"+this.lines()+"\t"+this.words()+"\t"+this.characters()+"\t"+this.fileName;
  };
};
