import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
        int celsius = -5;
        System.out.println(getFahrenheit(celsius) + " F");

        getDay(0);
        workOrsleep(7);
        printOnetoten();
       // printNtom();
        printOddnumbers();
        sumOfnaturalnumbers();
        printHelloeveryone();
        displayFizzbuzz();

    }

    public static double getFahrenheit(int celsius) {
        double fahrenheit = celsius * 1.8 + 32;

        return fahrenheit;
    }

    public static void getDay(int num) {

        if (num == 0) {
            System.out.println("Sunday");
        } else if (num == 1) {
            System.out.println("Monday");
        } else if (num == 2) {
            System.out.println("Tuesday");
        } else if (num == 3) {
            System.out.println("Wednesday");
        } else if (num == 4) {
            System.out.println("Thursday");
        } else if (num == 5) {
            System.out.println("Friday");
        } else if (num == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("No day of the week exists for the given number ");
        }

    }

    public static void workOrsleep(int num) {

        switch (num) {
            case 0:
                System.out.println("Sleep in");
                break;
            case 1:
                System.out.println("Go to work");
            case 2:
                System.out.println("Go to work");
                break;
            case 3:
                System.out.println("Go to work");
                break;
            case 4:
                System.out.println("Go to work");
                break;
            case 5:
                System.out.println("Go to work");
                break;
            case 6:
                System.out.println("Sleep in");
                break;

            default:
                System.out.println("Not a valid number");

        }
    }

    public static void printOnetoten() {
        int num = 1;
        System.out.println("Printing numbers from 1 to 10");
        while (num <= 10) {

            System.out.println(num);
            num++;
        }

    }

    public static void printNtom() {
        System.out.println("Enter start ");
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        System.out.println("Start from :" + start);

        System.out.println("Enter end :");
        Scanner e = new Scanner(System.in);
        int end = e.nextInt();
        System.out.println("End on " + end);
        while (start <= end) {
            System.out.println(start);
            start++;
        }

    }

    public static void printOddnumbers() {
        int num = 1;
        System.out.println("Printing odd numbers");
        while (num <= 10) {
            if (num % 2 != 0)
                System.out.println(num);
            num++;
        }
    }

    public static void sumOfnaturalnumbers(){
        int sum = 0;
        int num = 1;
        do{
            sum+=num;
             num++;
        }while(num <=100);
        System.out.println("The sum of the natural numbers from 1 to 100 is :"+sum);
    }

    public static void printHelloeveryone(){
        String[] names = {"Linda", "John", "Maya","Nerine","Gary"};

        for(String name : names){
            System.out.println("Hello "+name+"!");
        }
    }
    public  static  void displayFizzbuzz(){
        int num = 1;
        while (num <= 15) {
            fizzbuzz(num);
            num++;
        }
    }
    public static void fizzbuzz(int num) {


        if (num % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(num);
        }
        // String s = " ";

      /*
       if(num % 3 == 0){
           s+="Fizz";

         //  b = s;
       }

        if(num % 5 == 0){
           s+="Buzz";
       }
       else{
           s += Integer.toString(num);
       }
        System.out.println(s);
       */


    }
}