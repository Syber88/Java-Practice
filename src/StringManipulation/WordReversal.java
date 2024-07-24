package StringManipulation;

import java.util.Arrays;
import java.util.Collections;

public class WordReversal {
    public void reverse(String words){
        String reversedWord = "";
        String[] arrayStr =  words.split(" ");
        Collections.reverse(Arrays.stream(arrayStr).toList());
        for (String word : arrayStr){
            reversedWord += word;
            System.out.println(reversedWord);
        }
//        return reversedWord;
    }
}



131483083