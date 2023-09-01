package HW.HW2;

import java.util.Scanner;

public class Task1 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                System.out.print("Введите дробное число (разделитель - точка): ");
                String input = scanner.nextLine();
                System.out.println("Вы ввели число: "+ Float.parseFloat(input));
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Можно ввести только число. Попробуйте ещё раз: ");
            }
        }
    }
}