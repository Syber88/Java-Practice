package StringManipulation;

import java.util.Arrays;
import java.util.Collections;

public class WordReversal {
    public void reverse(String words){
        String reversedWord = "";
        String[] arrayStr =  words.split(" ");
        Collections.reverse(Arrays.stream(arrayStr).toList());
        for (String word : arrayStr){
            System.out.println(word);
        }
    }
}



131483083