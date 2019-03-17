package PanTadeusz;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;

public class PanTadeusz {
    public static void main(String[] args) throws IOException {
        final File file = new File("C:\\Users\\VanndDhall\\Desktop\\pan-tadeusz.txt");
       final String text = FileUtils.readFileToString(file, Charset.defaultCharset());
        final String[] words = text.split("[ \t\n,.;:\"'  \\-()/...!?«»]+—");
        final String[] lowerCaseWords = new  String[words.length];

        for(int i = 0; i<words.length;i++){
            lowerCaseWords[i] = words[i].toLowerCase();
        }
        final Map<String, Integer> result = new HashMap<>();
        for(String word: lowerCaseWords){
            if(word.trim().length() <=3){
//        for(String word: words){
//            if(word.trim().isEmpty() ||
//                    Arrays.asList("i","z","na","w","się","jak","do","nie","że","to","A","I","za","po").contains(word))
//            {
                continue;
            }
            int number =1;
            if(result.containsKey(word)){
                number += result.get(word);
            }
            result.put(word, number);

        }

        final List<Map.Entry<String, Integer>> list = new ArrayList<>(result.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println("5 most common words in Pan Tadeusz");
        int top =5;
        while(top -->0){
            System.out.println(list.get(list.size() - top - 1));
        }
//        //alternatywa:
//        for(int i=0;i<5;i++){
//            System.out.println(list.get(i));
//        }
//        for(Map.Entry<String, Integer> entry : result.entrySet()){
//            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }

    }

