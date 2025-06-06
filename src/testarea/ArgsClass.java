package testarea;

public class ArgsClass {
    
    public static void main(String[] args){

    String name = args[0];
    String surname = args[1];
    int idade = Integer.valueOf(args[2]);
    double altura = Double.valueOf(args[3]);

    System.out.println("Hi! I'm "+ name + " "+ surname+", and i am "+idade+" years old. And I'm "+ altura + "cm tall");



    }
}
