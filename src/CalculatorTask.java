import java.util.Scanner;

public class CalculatorTask {

    static void main() {


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1-ci ededi daxil edin:");
            double num1 = sc.nextDouble();
            System.out.println("emeliyyat daxil edin: +, -,*,/, chixish:#");
            char operation = sc.next().charAt(0);
            if (operation == '#') {
                System.out.println("Sistemdən çıxış olundu");
                break;
            }
            System.out.println("2-ci ededi daxil edin:");
            double num2 = sc.nextDouble();
            double result;
            boolean situ = true;

            switch (operation) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("0-a bolme yoxdur");
                        situ = false;
                        result = 0;
                    }
                }
                default -> {
                    System.out.println("yanlish emeliyyat");
                    result = 0;
                    situ = false;
                }
            }
            if (situ) {
                System.out.println(result);
            }
        }

    }
}
