package StringManipulation;

import QuickUtils.StringUtils;

public class Pangram {
    private boolean perfectPangram = false;

    public void PangramChecker(String word){
        if (word.length() == 26) this.perfectPangram = true;
        String characters = "";
        for (char letter : word.toCharArray()){
            StringUtils charCon = new StringUtils();
            if (!charCon.containsChar(word.toCharArray(), letter))
                characters += letter;

        }
    }
}
