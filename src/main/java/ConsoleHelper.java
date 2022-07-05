import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static String helpMessage = "Калькулятор создан для выполнения арифметических действий с арабскими и римскими числами \n" +
            "Допустимы числа от 1 до 10 либо в арабской либо в римской записи\n" +
            "Доступные действия - сложение, вычитание, умножение, деление";

    public static void initialMessage(){
        System.out.println("***********");
        System.out.println("Калькулятор арабских и римских чисел\n Введите help для справки или Enter для продолжения");
    }
    public static String readString() throws IOException {
        return reader.readLine();
    }
    public static void writeMessage(String message){
        System.out.println(message);
    }
    public static int parseRoman(String number){
        int result = 0;
            if(number.equals(RomanDigits.I.toString())){
            result = 1;
            }
            else if(number.equals(RomanDigits.II.toString())){
            result = 2;
            }
            else if(number.equals(RomanDigits.III.toString())){
            result = 3;
            }
            else if(number.equals(RomanDigits.IV.toString())){
            result = 4;
            }
            else if(number.equals(RomanDigits.V.toString())){
            result = 5;
            }
            else if(number.equals(RomanDigits.VI.toString())){
            result = 6;
            }
            else if(number.equals(RomanDigits.VII.toString())){
            result = 7;
            }
            else if(number.equals(RomanDigits.VIII.toString())){
            result = 8;
            }
            else if(number.equals(RomanDigits.IX.toString())){
            result = 9;
            }
            else{
                writeMessage("Неверный формат числа");
            }
        return result;
    }
    public static int parseNumber(String number){
        int result = 0;

            if(isArabic(number)){
                result = Integer.parseInt(number);
            } else if (isRoman(number)) {
                result = parseRoman(number);
            }
            else{
                writeMessage("Неверный формат числа");
        }
        return result;
    }
    public static boolean isValidArithmeticSign(String arithmeticSign){
        return arithmeticSign.matches("[\\+\\-\\/\\*]{1}");
    }
    public static boolean isRoman(String digit){
        return digit.matches("[IVX]{1,4}");
    }
    public static boolean isArabic(String digit){
        return digit.matches("[0-9]{1}");
    }

}
