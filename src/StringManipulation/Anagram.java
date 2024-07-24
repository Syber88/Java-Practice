package StringManipulation;

import java.util.Arrays;

public class Anagram {
    public String anagramChecker(String word, String target){
        String notAnagram = word + "is  not an anagram of " + target;

        if (word.length() == target.length()){
            char[] tempArray = word.toCharArray(),targetArray = target.toCharArray();
            Arrays.sort(tempArray);
            Arrays.sort(targetArray);

            for (int i = 0;i < word.length();i++){
                int left = i, right = word.length();
            }
        } else{
            return notAnagram;
        }

    }
}
