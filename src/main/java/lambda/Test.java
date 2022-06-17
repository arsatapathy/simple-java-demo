package lambda;

interface Display {
    public void display(String s);
}

interface GenericDisplay<T> {
    public void display(T t);
}



public class Test {
    public static void main(String[] args) {
        Display display1 = new Display() {
            @Override
            public void display(String s) {
                System.out.println(s);
            }
        };

        Display display2 = (s) -> System.out.println(s);

        Display display3 = System.out::println;


        display1.display("Anonymous");
        display2.display("Lambda");
        display3.display("Method Reference");

        GenericDisplay<String> genericDisplay1 = System.out::println;

        genericDisplay1.display("Generic Display String");

        GenericDisplay<Integer> genericDisplay2 = (i) -> {
            System.out.println("Generic Display Integer " + i * 5);
        };

        genericDisplay2.display(5);
    }
}
