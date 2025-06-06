package testarea;

import java.util.Locale;
import java.util.Scanner;

public class ScannerClass {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("What is your name?");
        String name = scanner.next();

        System.out.println("What is your surname?");
        String surname = scanner.next();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("What is your height?");
        double height = scanner.nextDouble();


    System.out.println("Hi! I'm "+ name + " "+ surname+", and i am "+age+" years old. And I'm "+ height + "cm tall");

    }


}
