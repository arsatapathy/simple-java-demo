package abstractclass;

public abstract class Demo {

    public Demo() {
        System.out.println("Demo");
    }

    public static DemoBuilder builder() {
        return DemoBuilder.getInstance();
    }

    public abstract static class DemoBuilder {
        public DemoBuilder() {
            System.out.println("Demo Builder");
        }

        public abstract Demo build();

        private static DemoBuilder getInstance() {
            return new DemoBuilder() {
                @Override
                public Demo build() {
                    return new Demo() {
                    };
                }
            };
        }
    }



}
