package StringManipulation;

import QuickUtils.StringUtils;

public class Pangram {
    private boolean perfectPangram = false;

    public String PangramChecker(String word){

        String Affirmative = word + " is a Pangram ";
        String Negative = word + " is a not Pangram ";

        if (word.length() == 26) this.perfectPangram = true;
        StringBuilder characters = new StringBuilder();

        for (char letter : word.toCharArray()){
            StringUtils charCon = new StringUtils();
            if (!charCon.containsChar(word.toCharArray(), letter))
                characters.append(letter);

            if (characters.length() == 26) return Affirmative;
        }
        return Negative;
    }
}
