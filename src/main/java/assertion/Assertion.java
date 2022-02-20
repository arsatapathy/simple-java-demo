package assertion;


import com.sun.tools.javac.util.Assert;

public class Assertion {

    public static void main(String[] args) {
        Integer value = null;

        Assert.checkNonNull(value);
    }
}
