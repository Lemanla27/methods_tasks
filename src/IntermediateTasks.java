import java.util.Arrays;

public class IntermediateTasks {
    static void main() {


//        System.out.println(factorial(5));
//        System.out.println(factorial(0));
//        fibonacci(8);
//        calculateArea(4);
//        calculateArea(3,4);
//        calculateArea(3.4, 4);
//        getBinary(13);
//        arrSum(new int[]{3, 4, 5});
//        checkArr(new int[]{1, 2, 3}, new int[]{1, 2, 3, 5});
//        maxNum(new int[]{10000,100,40000000,250});
//        System.out.println(checkIndex(new int[]{1, 5, 6}, 9));
//        checkPrime(100);
//        System.out.println(calculateAverage(1, 5, 6, 4));
//        arrSort(new int[]{2,6,1,19,0});


    }


    // 1. Bir ədədin faktorialını hesablayan rekursiv metod yazın.

//    public static long factorial(long number) {
//        if (number > 1) {
//            long factorial = number * factorial(number - 1);
//            return factorial;
//        } else return 1;
//
//    }


    //1.Sadə metodla
//    public static long factorial(long number) {
//        long factorial = 1;
//        for (long i = number; i > 0; i--) {
//            factorial = factorial * i;
//
//        }
//        return factorial;
//    }


    //2. Fibonacci ardıcıllığının n-ci həddini rekursiya ilə hesablayan metod yazın.

//Sade metodla:

//    public static void fibonacci(int number) {
//        int num1 = 0;
//        int num2 = 1;
//        for (int i = 0; i < number; i++) {
//            System.out.print(num1+" ");
//            int next = num1 + num2;
//            num1 = num2;
//            num2 = next;
//
//        }
//    }

    //9.Overload edilmiş 3 calculateArea() metodu yazın:
    // biri kvadrat, biri düzbucaqlı, biri dairə üçün sahə hesablasın.

//    public static void calculateArea(int side) {
//        int area = side * side;
//        System.out.println(area);
//    }
//
//    public static void calculateArea(int length, int width) {
//        int area = length * width;
//        System.out.println(area);
//    }
//
//    public static void calculateArea(double radius) {
//        double area = Math.PI * radius * radius;
//        System.out.println(area);
//    }


    //11. Ədədin ikilik (binary) sistemə çevrilməsini həyata keçirən metod yazın.

//    public static void getBinary(int number) {
//        String binary = "";
//        while (number > 0) {
//            int remainder = number % 2;
//            binary = remainder + binary;
//            number = number / 2;
//        }
//        System.out.println(binary);
//    }


    //4. Massivi parametr kimi qəbul edib onun elementlərinin cəmini qaytaran metod yazın.

//    public static void arrSum(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);
//    }

    //7. İki massivi müqayisə edib eyni olub-olmadığını yoxlayan metod yazın.

//    public static void checkArr(int arr1[], int arr2[]) {
//        boolean check = false;
//
//        if (arr1.length != arr2.length) {
//            check = false;
//            System.out.println("massivler eyni deyil");
//            return;
//        }
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] == arr2[i]) {
//                check = true;
//            }
//        }
//        if (check) {
//            System.out.println("massivler eynidir");
//        } else
//            System.out.println("massivler eyni deyil");
//
//    }

    //5.Massivi parametr kimi alıb ən böyük elementi tapan metod yazın.

//    public static void maxNum(int arr[]) {
//
//        int maxNum = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] > maxNum) {
//                maxNum = arr[i];
//            }
//        }
//        System.out.println(maxNum);
//    }


    //13. Bir massiv və axtarılacaq ədədi parametr kimi qəbul edib,
    // həmin ədədin massivdə olub-olmadığını yoxlayan(linear search)
    // metod yazın və indeksini qaytarsın (tapılmasa -1).

//    public static int checkIndex(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return i;
//            }
//        }
//        return -1;
//    }


    //6. Verilən ədədin sadə (prime) olub-olmadığını yoxlayan metod yazın.

//    public static void checkPrime(int number) {
//
//        int count = 0;
//        for (int i = 1; i <= number / 2; i++) {
//
//            if (number % i == 0) {
//                count++;
//
//            }
//        }
//        if (number == 1) {
//            System.out.println("eded ne sade ne murekkebdir");
//        } else if (count == 1) {
//            System.out.println("eded sadedir");
//        } else
//            System.out.println("eded murekkebdir");
//    }


    //3. varargs istifadə edərək istənilən sayda ədədin
    // ortalamasını hesablayan metod yazın (double average(int... numbers)).

//    public static double calculateAverage(int... num) {
//        int sum = 0;
//        int count = 0;
//
//        for (int i = 0; i < num.length; i++) {
//            sum = sum + num[i];
//            count++;
//        }
//        double average = sum / count;
//        return average;
//
//    }

    //10. Bir massivi arqument kimi alıb, içindəki elementləri artan sərgi ilə sıralayan (sort)
    // öz metodunuzu yazın (məsələn, bubble sort istifadə edərək).

//    public static void arrSort(int []arr ){
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j =i+1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//}


}