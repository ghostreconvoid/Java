package practice.basic_002_variable_type;

public class VariableScopeExample {
    public static void main(String[] arg) {
        int v1 = 15;
        if(v1>10) {
            int v2;
            v2 = v1 - 10;
        }
//        int v3 = v1 + v2 + 5;   <==== Error! Because v2 exists only in the method block { }.
    }
}
