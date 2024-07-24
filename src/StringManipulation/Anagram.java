package StringManipulation;

import java.util.Arrays;
import java.util.List;

import QuickUtils.StringUtils;

public class Anagram {
    public String anagramChecker(String wordInit, String targetInit){
        StringUtils stripper = new StringUtils();
        List<String> wordList = stripper.StripSpaces(wordInit, targetInit);
        String word = wordList.get(0);
        String target = wordList.get(1);

        String notAnagram = targetInit + " is not an anagram of " + wordInit,
                isAnagram = targetInit + " is an anagram of " + wordInit;

        if (word.length() == target.length()){
            char[] tempArray = word.toCharArray(),targetArray = target.toCharArray();
            Arrays.sort(tempArray);
            Arrays.sort(targetArray);

            for (int i = 0; i < word.length(); i++){
                if (tempArray[i] != targetArray[i]) {
                    return notAnagram;
                }
            } return isAnagram;
        }
        return notAnagram;
    }
}
