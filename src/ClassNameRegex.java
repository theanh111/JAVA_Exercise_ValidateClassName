import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameRegex {
    private static final String CLASS_NAME_REGEX = "[CAP]+[0-9]{4}[G-M]{1}";

    public ClassNameRegex() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
