public class MethodOverloading {
    // overloaded method1
    public static int add(int a, int b) {
        return a + b;
    }

    // overloaded method1
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    // overloaded method1
    public static double add(double a, double b) {
        return a + b;
    }
    // overloaded method1
    public static String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add(10.5, 20.5));
        System.out.println(add("Hello ", "Khuman"));
    }
}