public class WrapperStringDemo {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(42);
        Double d = Double.parseDouble("3.14");
        System.out.println("Max int: " + Integer.MAX_VALUE);
        System.out.println("Binary: " + Integer.toBinaryString(i));
        System.out.println("Parsed double: " + d);
        String s = "Hello";
        s = s + " World";
        System.out.println("String: " + s);
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World").insert(5, ",").reverse();
        System.out.println("StringBuffer: " + sb);
    }
}
