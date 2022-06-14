package exception;

public class Test {

    public static void main(String[] args) {
        try {
            CheckedTest.print("ASHISH");
        } catch (CheckedException e) {
            e.printStackTrace();
        }

        UncheckedTest.print("ASHISH");
        UncheckedTest.print("SATAPATHY");
        UncheckedTest.print("RANJAN");
    }
}

class UncheckedException extends RuntimeException {
    UncheckedException(String message) {
        super(message);
    }
}

class CheckedException extends Exception {
    CheckedException(String message) {
        super(message);
    }
}


class UncheckedTest {

    public static void print(String name) {

        switch(name) {
            case "ASHISH":
            case "SATAPATHY":
                System.out.println(name);
                break;

            default:
                throw new UncheckedException(name + " is not valid.");
        }
    }

}

class CheckedTest {
    public static void print(String name) throws CheckedException {
        switch(name) {
            case "ASHISH":
            case "SATAPATHY":
                System.out.println(name);
                break;

            default:
                throw new CheckedException(name + " is not valid.");
        }
    }
}