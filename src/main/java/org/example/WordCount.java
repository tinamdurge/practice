package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String text = "This is a simple example. This is a example for how to count given words in text";
        String[] words = cleanAndSplitText(text);

        Map<String, Integer> wordCountMap =  new HashMap<>();

        for(String word : words){
            wordCountMap.put(word,wordCountMap.getOrDefault(word,0)+1);
        }

        System.out.println("Word Count: ");
        for(Map.Entry<String,Integer> entry : wordCountMap.entrySet()){
            System.out.println(entry.getKey() +":" +entry.getValue());
        }

    }

    private static String[] cleanAndSplitText(String text) {
        String cleanedText = text.replace(".", "")
                .replace("?","")
                .toLowerCase();

        return cleanedText.split("\\s");
    }
}
