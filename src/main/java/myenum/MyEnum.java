package myenum;

public enum MyEnum {
    MON("MONDAY"),
    TUE("TUESDAY");

    private String day;

    MyEnum(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

}