public class InnerClassDemo {
    class MemberInner {
        void show() {
            System.out.println("Member Inner Class");
        }
    }

    void demo() {
        class LocalInner {
            void show() {
                System.out.println("Local Inner Class");
            }
        }
        new LocalInner().show();
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Anonymous Inner Class");
            }
        };
        r.run();
    }

    public static void main(String[] args) {
        InnerClassDemo obj = new InnerClassDemo();
        obj.new MemberInner().show();
        obj.demo();
    }
}
