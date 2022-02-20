package myenum;

public class MyEnumTest {

    public static void main(String[] args) {
        System.out.println(MyEnum.MON.getDay());
        System.out.println(MyEnum.MON.name());

        for (MyEnum en:
             MyEnum.values()) {
            System.out.println(en.getDay());
        }
    }
}
