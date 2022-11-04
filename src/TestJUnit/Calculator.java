package TestJUnit;

public class Calculator {
    public static int add(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("3 * 3 = " + Calculator.add(3, 3));
        System.out.println("4 * 4 = " + Calculator.add(4, 4));
        System.out.println("2 * 2 = " + Calculator.add(2, 2));
        System.out.println("6 * 6 = " + Calculator.add(6, 6));

    }
}
