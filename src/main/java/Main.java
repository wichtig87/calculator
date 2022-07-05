//Calc main class

import java.io.IOException;

public class Main {

    public static void main(String[] args){
        String first;
        String second;
        String arithmeticSign;
        String userInput;
        int firstDigit = 0;
        int secondDigit = 0;
        int result;

        try {
            ConsoleHelper.initialMessage();

            while (true) {
                userInput = ConsoleHelper.readString();
                if (userInput.equals("help")) {
                    ConsoleHelper.writeMessage(ConsoleHelper.helpMessage);
                    ConsoleHelper.initialMessage();

                } else if (userInput.equals("")) {
                    ConsoleHelper.writeMessage("Введите первое число:");
                    break;
                } else {
                    ConsoleHelper.writeMessage("Неверный ввод");
                }
            }
            while (true) {
                userInput = ConsoleHelper.readString();
                if (!ConsoleHelper.isRoman(userInput) & !ConsoleHelper.isArabic(userInput)) {
                    ConsoleHelper.writeMessage("Неверный формат числа");
                    ConsoleHelper.writeMessage("Введите первое число:");

                } else {
                    first = userInput;
                    break;
                }
            }

            ConsoleHelper.writeMessage("Введите действие");
            while (true) {
                userInput = ConsoleHelper.readString();
                if (!ConsoleHelper.isValidArithmeticSign(userInput)) {
                    ConsoleHelper.writeMessage("Неверный знак действия");
                    ConsoleHelper.writeMessage("Введите действие");

                } else {
                    arithmeticSign = userInput;
                    break;
                }
            }

            ConsoleHelper.writeMessage("Введите второе число:");
            while (true) {
                userInput = ConsoleHelper.readString();
                if (!ConsoleHelper.isRoman(userInput) & !ConsoleHelper.isArabic(userInput)) {
                    ConsoleHelper.writeMessage("Неверный формат числа");
                    ConsoleHelper.writeMessage("Введите второе число:");

                } else {
                    second = userInput;
                    break;
                }
            }

            if ((ConsoleHelper.isRoman(first) & ConsoleHelper.isRoman(second)) | (ConsoleHelper.isArabic(first) & ConsoleHelper.isArabic(second))) {
                firstDigit = ConsoleHelper.parseNumber(first);
                secondDigit = ConsoleHelper.parseNumber(second);
            } else {
                ConsoleHelper.writeMessage("Оба числа должны быть в одной системе счисления");
            }

            result = (int)ArithmeticHelper.result(firstDigit, secondDigit, arithmeticSign);
            ConsoleHelper.writeMessage("Результат: " + result);

        }catch(IOException e){
            ConsoleHelper.writeMessage("Возникло исключение" + e.getMessage());
        }

    }
}
