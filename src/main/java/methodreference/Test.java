package methodreference;

public class Test {

    private String message;

    public Test(String message) {
        this.message = message;
    }

    public Test() {};

    public String getMessage() {
        return message;
    }

    public static void main(String[] args) {
        StringFunc stringFunc1 = Test::reverse;

        System.out.println(stringFunc1.func("ASHISH"));


        StringFunc stringFunc2 = new Test()::reverseString;

        System.out.println(stringFunc2.func("ASHISH"));

        StringFunc2 stringFunc3 = Test::new;

        Test test = stringFunc3.func("ashish");

        System.out.println(test.getMessage());
  }

    public static String reverse(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        return result.toString();

    }

    public String reverseString(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }


}

interface StringFunc {
    String func(String s);
}

interface StringFunc2 {
    Test func(String s);
}
