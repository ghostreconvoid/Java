package practice.basic_002_variable_type;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;
        System.out.println(hour + " hour " + minute + " minute");

        int totalMinute = (hour*60) + minute;
        System.out.println("Total " + totalMinute + " minute");
    }
}
