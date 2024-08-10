package StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A utility class for performing operations on strings.
 */
public class StringUtils {

    public static String anagramChecker(String wordInit, String targetInit){
        StringUtils stripper = new StringUtils();
        List<String> wordList = stripper.StripSpaces(wordInit, targetInit);
        String word = wordList.get(0);
        String target = wordList.get(1);

        String notAnagram = targetInit + " is not an anagram of " + wordInit,
                isAnagram = targetInit + " is an anagram of " + wordInit;

        if (word.length() == target.length()){

            StringUtils sorter = new StringUtils();
            List<String> wordSorted = sorter.StringSorter(word, target);

            char[] wordArray = wordSorted.getFirst().toCharArray(),
                    targetArray = wordSorted.get(1).toCharArray();

            for (int i = 0; i < word.length(); i++){
                if (wordArray[i] != targetArray[i]) {
                    return notAnagram;
                }
            } return isAnagram;
        }
        return notAnagram;
    }

    public String reverse(String words){
        String reversedWord = "";
        String[] arrayStr =  words.split(" ");
        List<String> mutableList = new ArrayList<>(Arrays.asList(arrayStr));
        Collections.reverse(mutableList);
        for (String word : mutableList){
            reversedWord += word + " ";
        }
//        System.out.println(reversedWord);
        return reversedWord;
    }


    public String PangramChecker(String word){
        boolean perfectPangram = false;
        String Affirmative = word + " is a Pangram ";
        String Negative = word + " is a not Pangram ";

        if (word.length() == 26) perfectPangram = true;
        String characters = "";

        for (char letter : word.toCharArray()){
            StringUtils charCon = new StringUtils();
            if (!charCon.containsChar(characters.toCharArray(), letter))
                characters += letter;

            if (characters.length() == 26) return Affirmative;
        }
        return Negative;
    }

    /**
     * Removes all white spaces from the given words.
     *
     * @param words a varargs parameter representing one or more words
     * @return a list of words with all white spaces removed
     */
    public List<String> StripSpaces(String... words) {
        List<String> arrayOfWords = new ArrayList<>();
        for (String word : words) {
            word = word.replaceAll("\\s", "");
            arrayOfWords.add(word);
        }
        return arrayOfWords;
    }

    /**
     * Sorts the characters of each string in the given varargs of strings.
     *
     * <p>This method takes a variable number of strings, sorts the characters of each string, and returns a list of strings,
     * where each string is the sorted character array of the corresponding input string. The sorted characters are represented
     * as comma-separated values enclosed in square brackets.
     *
     * @param words Varargs of strings to be sorted. Each string is processed individually.
     * @return A list of strings, where each string is the sorted characters of the corresponding input string.
     *
     * @see java.util.Arrays#sort(char[])
     * @see java.util.Arrays#toString(char[])
     */
    public List<String> StringSorter(String ...words) {
        List<String> stringArray = new ArrayList<>();
        for (String word : words) {
            char[] charWord = word.toCharArray();
            Arrays.sort(charWord);
            stringArray.add(Arrays.toString(charWord));
        }
        return stringArray;
    }

    /**
     * Checks if a given character array contains a specified character.
     *
     * <p>This method iterates through the provided character array and returns {@code true} if the specified character
     * is found in the array. If the character is not found, it returns {@code false}.
     *
     * @param characters An array of characters to be searched.
     * @param letter The character to search for within the array.
     * @return {@code true} if the specified character is found in the array; {@code false} otherwise.
     */
    public boolean containsChar(char[] characters, char letter) {
        for (char character : characters) {
            character = Character.toLowerCase(character);
            if (character == letter)
                return true;
        }
        return false;
    }


}