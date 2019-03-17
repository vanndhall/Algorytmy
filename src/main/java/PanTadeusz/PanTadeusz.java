package PanTadeusz;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class PanTadeusz {
    public static void main(String[] args) throws IOException {
        final File file = new File("C:\\Users\\VanndDhall\\Desktop\\pan-tadeusz.txt");
       final String text = FileUtils.readFileToString(file, Charset.defaultCharset());
        final String[] words = text.split("[ \t\n,.;:\"'  \\-()/...!?«»]+");
        final Map<String, Integer> result = new HashMap<>();
        for(String word: words){
            if(word.trim().isEmpty()){
                continue;
            }
            int number =1;
            if(result.containsKey(word)){
                number += result.get(word);
            }
            result.put(word, number);

        }
        for(Map.Entry<String, Integer> entry : result.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
        System.out.println("5 most common words in Pan Tadeusz");
    }
}
