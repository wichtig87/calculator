
public class ArithmeticHelper {

    public static double sum(int a, int b){
        return a+b;
    }
    public static double subtract(int a, int b){
        return a-b;
    }
    public static double multiply(int a, int b){
        return a*b;
    }
    public static double divide(int a, int b){
        return a/b;
    }
    public static double result(int a, int b, String arithmeticSign){
        double result = 0;
            switch(arithmeticSign){
                case "+": result = sum(a, b);
                    break;
                case "-": result = subtract(a, b);
                    break;
                case "*": result = multiply(a, b);
                    break;
                case "/": result = divide(a, b);
                    break;
            }
        return result;
    }
}
