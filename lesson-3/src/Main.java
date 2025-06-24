//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(10, 1);
        printColor(150);
        compareNumbers(1,3 );
        System.out.println(abuse(10, 2));
        mozgoebka(-5);
        System.out.println(positiveFalseOrNegativeTrue(5));
        stringNumber("Hello", 3);
        System.out.println(isLeapYear(1600));
    }

    static void printThreeWords() {
        System.out.println("""
                Orange,
                Apple,
                Banana.
                """);
    }

    static void checkSumSign(int a, int b){
    int c = a+b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");

        }
    }

    static void printColor(int value){
    if (value <= 0){
        System.out.println("Красный");
    } else if (value <=100){
        System.out.println("Желтый");
    } else {
        System.out.println("Зеленый");
    }

}

    static void compareNumbers(int a, int b){
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    static boolean abuse (int a, int b){
    var c = a+b;
    return c>=10 && c<=20;


    }

    static void mozgoebka (int a){
       String message = "Положительное число";
       if (a<0){
           message = "Отрицательное число";

       }
        System.out.println(message);
    }

    static boolean positiveFalseOrNegativeTrue (int a){
        return a<0;
    }

    static void stringNumber (String s, int a){
        if (a>0){
            System.out.println(s);
            stringNumber(s, --a);
        }

    }

    static boolean isLeapYear (int year){
        return year % 4==0 && year % 100!=0 || year % 400==0;
    }

}




