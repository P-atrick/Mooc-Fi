import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = Integer.parseInt(reader.nextLine());

        System.out.println("Enter another number");
        int b = Integer.parseInt(reader.nextLine());

        int sum = a + b;

        System.out.println("Sum of the numbers: " + sum);
    }
}
