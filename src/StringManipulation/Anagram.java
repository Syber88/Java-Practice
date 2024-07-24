package StringManipulation;

import java.util.Arrays;

public class Anagram {
    public String anagramChecker(String word, String target){
        String notAnagram = word + "is not an anagram of " + target,
                isAnagram = word + "is an anagram of " + target;
        if (word.length() == target.length()){
            char[] tempArray = word.toCharArray(),targetArray = target.toCharArray();
            Arrays.sort(tempArray);
            Arrays.sort(targetArray);

            for (int i = 0; i < word.length(); i++){
                if (tempArray[i] != targetArray[i])
                    return notAnagram;
            }
        }
        return isAnagram;
    }
}
