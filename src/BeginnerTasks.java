import java.time.LocalDate;

public class BeginnerTasks {
    static void main() {


        BeginnerTasks beginnerTasks = new BeginnerTasks();
//        System.out.println(beginnerTasks.sum(2, 4));
//        beginnerTasks.sayHello();
//        System.out.println(beginnerTasks.getSquare(5));
//        System.out.println(beginnerTasks.getMax(555, 50));
//        beginnerTasks.checkAdult(56);
//        System.out.println(beginnerTasks.getLength("Azer"));
//        beginnerTasks.getDate();
//        System.out.println(beginnerTasks.getResult(5));
//        System.out.println(beginnerTasks.getAverage(1, 5, 2));
//        beginnerTasks.getCircleArea(5);
//        beginnerTasks.print(5);
//        beginnerTasks.print("salam");
//        beginnerTasks.checkNum(-2);
//        System.out.println(beginnerTasks.concatStrings("salam", "Azer"));
//        System.out.println(beginnerTasks.getMinNum(2, 1, 0));



     }


    //  1. İki tam ədədi parametr kimi qəbul edən və onların cəmini qaytaran sum ( int a, int b)metodu yazın.

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    //2. Heç bir dəyər qaytarmayan (void), ekrana "Salam, Dünya!" yazan metod yazın.

    public void sayHello() {
        System.out.println("Salam, Dunya!");
    }

    //3. Bir ədədi parametr kimi alıb onun kvadratını qaytaran metod yazın

//    public double getSquare(double a) {
//        double square = Math.pow(a, 2);
//        return square;
//    }

    //4. İki ədəddən böyüyünü tapıb qaytaran max(int a, int b) metodu yazın.

//    public int getMax(int a, int b) {
//        int result = a > b ? a : b;
//        return result;
//    }

    // 5. Verilən yaşa görə "Yetkin" və ya "Yetkin deyil" mesajını ekrana çıxaran metod yazın (18-dən böyük/kiçik).

//    public void checkAdult(int age){
//        String result=age>=18?"Yetkin":"Yetkin deyil";
//        System.out.println(result);
//    }

    // 6. Bir string parametrini alıb onun uzunluğunu qaytaran metod yazın.

//    public int getLength(String s) {
//        int length = s.length();
//        return length;
//    }


// 7. Parametrsiz metod yazın ki, çağırıldıqda cari tarixi (və ya sadəcə mətn) ekrana çıxarsın.

//    public void getDate() {
//        LocalDate date = LocalDate.now();
//        System.out.println(date);
//    }

    // 8. Verilən ədədin cüt və ya tək olduğunu yoxlayıb boolean qaytaran metod yazın.

//    public boolean getResult(int num) {
//        boolean result = num % 2 == 0 ? true : false;
//        return result;
//    }


    // 9. Üç ədədin ortasını (arifmetik ortasını) hesablayıb qaytaran metod yazın.
//
//    public double getAverage(int num1,int num2,int num3){
//        double average=(num1+num2+num3)/3;
//       return average;
//    }

    //10. Bir dairə radiusunu parametr kimi alıb sahəsini hesablayan metod yazın.

//    public void getCircleArea(int r){
//        double area=r*r*3.14;
//        System.out.println("dairenin sahesi:"+ area);
//    }

    // 11. Eyni adlı, lakin fərqli parametrlərlə iki overload edilmiş print() metodu yazın (biri int, digəri String qəbul etsin).

//    public void print(int number) {
//        System.out.println(number);
//    }
//
//    public void print(String text) {
//        System.out.println(text);
//    }

    //12.Verilən ədədin mənfi, müsbət və ya sıfır olduğunu ekrana yazan metod yazın.

//    public void checkNum(int num) {
//        String result = num > 0 ? "musbet" : num < 0 ? "menfi" : "sifir";
//        System.out.println(result);
//    }

    // 13. İki string-i birləşdirib (concatenate) nəticəni qaytaran metod yazın.

//    public String concatStrings(String text1, String text2) {
//        String result = text1 + text2;
//        return result;
//    }



    //15. Verilən üç ədəddən ən kiçiyini tapıb qaytaran metod yazın.

//    public int getMinNum(int num1, int num2, int num3) {
//        if (num1 < num2 && num1 < num3)
//            return num1;
//        else if (num2 < num1 && num2 < num3)
//            return num2;
//        else
//            return num3;
//    }


}


