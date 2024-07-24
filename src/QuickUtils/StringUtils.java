package QuickUtils;

import java.util.ArrayList;
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
}