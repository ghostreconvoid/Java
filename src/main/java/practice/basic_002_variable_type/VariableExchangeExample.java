package practice.basic_002_variable_type;

public class VariableExchangeExample {
    public static void main(String[] arg) {
        int x = 3;
        int y = 5;
        System.out.println("x: " + x + ", y: " + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x: " + x + ", y: " + y);
    }
}
