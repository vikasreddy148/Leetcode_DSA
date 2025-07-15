import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {
    private static final String REGEX = "^(?=.*[aeiouAEIOU])(?=.*[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ])[a-zA-Z0-9]{3,}$";

    public boolean isValid(String word) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(word);
        return matcher.matches();
    }
}