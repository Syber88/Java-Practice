package StringManipulation;

import QuickUtils.StringUtils;

import java.util.List;

public class Pangram {
    private boolean perfectPangram = false;

    public void PangramChecker(String word){
        if (word.length() == 26) this.perfectPangram = true;
        String characters = "";
        for (char letter : word.toCharArray()){
            if (!containsChar(word.toCharArray(), letter))
                characters += letter;

        }
    }
    public boolean containsChar(char[] characters, char letter){
        for (char letters : characters){
            if (letters == letter)
                return true;
        }
        return false;
    }
}
