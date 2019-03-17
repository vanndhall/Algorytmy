package PanTadeusz;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class PanTadeusz {
    public static void main(String[] args) throws IOException {
        final File file = new File("C:\\Users\\VanndDhall\\Desktop\\pan-tadeusz.txt");
       final String text = FileUtils.readFileToString(file, Charset.defaultCharset());
        final String[] words = text.split("[ \t\n,.;:\"'\\-()/]+");
        for(String word: words){
            if(word.trim().isEmpty()){
                continue;
            }
            System.out.println(word);
        }
    }
}
