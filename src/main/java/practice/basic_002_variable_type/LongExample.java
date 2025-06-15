package practice.basic_002_variable_type;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
//        long var3 = 1000000000000;  //java: Ganzzahl zu groß
                                    //type    value saved     memory used         area of allowed values
                                    //long    integer         8 Byte = 64 Bit     (-2^63) -   (2^63 - 1)
        long var4 = 1000000000000L;
        long var5 = 1000000000000l; // possible but better to use the capital "L" instead of "l" because the alphabet
                                    // "l" and the number "1" look similar.

        System.out.println(var1);
        System.out.println(var2);
//        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
    }
}
