import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by simranp on 25/02/16.
 */
public class File_reader {
    private String fileName;
    public File_reader(String fileName){
        this.fileName = fileName;
    };
    public String read() throws IOException {
        File file = new File(fileName);
        FileReader f_reader = new FileReader(file);
        char[] d;
        d = new char[(int)file.length()];
        f_reader.read(d);
        String data = new String(d);
        return data;
    };
}
