package practice.basic_002_variable_type;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        int var1 = 0b1011;  // 2^ : begin with 0b or 0B
        int var2 = 0206;    // 8^ : begin with 0
        int var3 = 365;     // 10^
        int var4 = 0xB3;    // 16^ : begin with 0x or 0X

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
    }
}
