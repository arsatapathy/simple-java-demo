package generics;

public class Gen<T, U> {

    private final T t;
    private final U u;

    Gen(T t, U u) {
        this.t = t;
        this.u = u;
    }


    public T getT() {
        return t;
    }

    public U getU() {
        return u;
    }

    public void print() {
        System.out.println(t);
        System.out.println(u);
    }
}

class SubGen<T, U> extends Gen<T, U> {
    SubGen(T t, U u) {
        super(t, u);
    }
}

class GenFun {
    public static <T> void print(T t) {
        System.out.println(t);
    }
}

class WildFun {
    public static void print(Gen<?, ?> gen) {
        gen.print();
    }
}

class Test {
    public static void main(String... args) {
        Gen<String, String> gen = new Gen<>("ashish", "ranjan");
        gen.print();

        SubGen<Integer, Integer> subGen = new SubGen<>(1, 3);
        subGen.print();

        Gen<Double, Double> doubleGen = new SubGen<>(2.2, 3.2);
        doubleGen.print();


        GenFun.print("ashish satapathy");
        GenFun.print(1);
        GenFun.print(1.3);

        WildFun.print(gen);
    }
}

