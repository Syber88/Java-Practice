package StringManipulation;

import java.util.Arrays;

public class Anagram {
    public String anagramChecker(String wordInit, String targetInit){
        String word = wordInit.replaceAll("\\s", "");
        String target = targetInit.replaceAll("\\s", "");

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
