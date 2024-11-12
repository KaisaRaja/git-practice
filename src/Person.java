import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        System.out.println("Hello, person!");
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What is your age?");
    }
}
