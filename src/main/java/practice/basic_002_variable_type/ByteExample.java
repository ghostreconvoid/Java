package practice.basic_002_variable_type;

public class ByteExample {
    public static void main(String[] args) {
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
//        byte var6 = 128;    //java: Inkompatible Typen: Möglicher Verlust bei Konvertierung von int in byte
                            //type    value saved     memory used         area of allowed values
                            //byte    integer         1 Byte = 8 Bit      (-2^7)  -   (2^7 - 1)

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
//        System.out.println(var6);
    }
}
