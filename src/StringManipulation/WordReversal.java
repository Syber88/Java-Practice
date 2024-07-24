package StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordReversal {
    public void reverse(String words){
        String reversedWord = "";
        String[] arrayStr =  words.split(" ");
        List<String> mutableList = new ArrayList<>(Arrays.asList(arrayStr));
        Collections.reverse(mutableList);
        for (String word : mutableList){
            reversedWord += word + " ";
        }
        System.out.println(reversedWord);
//        return reversedWord;
    }
}

