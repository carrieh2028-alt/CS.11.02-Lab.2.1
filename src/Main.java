/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Carrie He
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int a = 2;
        int b = -3;
        int c = 4;
        int d = -5;
        double e = 6.6;
        double f = -6.6;
        String name = "Bob";
        String repeat = "hello";

        System.out.println(Main.add(a,b));
        System.out.println(Main.add(a,b,c,d));
        System.out.println(Main.morningGreeting(name));
        System.out.println(Main.afternoonGreeting(name));
        System.out.println(Main.triple(repeat));
        System.out.println(Main.half(a));
        System.out.println(Main.roundPositiveValueToNearestInteger(e));
        System.out.println(Main.roundNegativeValueToNearestInteger(f));

    }

    // 1. add
    public static int add(int a, int b){
        return a + b;
    }
    // 2. add
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }
    // 5. triple
    public static String triple(String repeat) {
        return repeat + repeat + repeat;
    }
    // 6. half
    public static double half(double a) {
        return (a / 2.0);
    }
    // 7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double a) {
        return (int) (a + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double b) {
        return (int) (b - 0.5);
    }
}
