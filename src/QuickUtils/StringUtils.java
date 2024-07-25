package QuickUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//you can use this to strip the white space within words. no limits as too how many to parameterise
//just need to make sure i know how to access list variables
/**
 * A utility class for performing operations on strings.
 */
public class StringUtils {

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
        for (char letters : characters) {
            if (letters == letter)
                return true;
        }
        return false;
    }
}