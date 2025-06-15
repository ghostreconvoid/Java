package practice.basic_002_variable_type;

public class FloatDoubleExample {
    public static void main(String[] args) {
//        float var1 = 3.14;  //java: Inkompatible Typen: Möglicher Verlust bei Konvertierung von double in float
                            //Because Java interprets real number literals as "double" by default,
                            // you must store them in a double-type variable. Otherwise, Error!
        float var2 = 3.14f;
        double var3 = 3.14;

        float var4 = 0.1234567890123456789f;
        double var5 = 0.1234567890123456789;    //compare var5 with var4 (x2 accuracy)

        double var6 = 3e6;
        float var7 = 3e6F;
        double var8 = 2e-3;

//        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);
        System.out.println("var6: " + var6);
        System.out.println("var7: " + var7);
        System.out.println("var8: " + var8);
    }
}
