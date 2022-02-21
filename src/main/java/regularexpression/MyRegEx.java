package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegEx {

    public static void main(String[] args) {
        String expression = ".*[a-z][0-9].";

        Pattern pattern = Pattern.compile(expression);

        Matcher matcher = pattern.matcher("123abc123@xy");

        if (matcher.find()) {
            System.out.println("Matched");
        } else {
            System.out.println("Not Matched");
        }
    }
}
