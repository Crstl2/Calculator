import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("Welcome to the Calculator.");
        System.out.println("--------------------------");

        System.out.println();

        while (true){
            System.out.print("Number A: ");
            int a;

            try {
                a = Integer.parseInt(scan.next());

            }catch (Exception ignored){
                System.out.println("Enter a Valid Number.");
                continue;
            }

            System.out.print("Enter an operation ( *, /, -, +)?: ");
            String op = scan.next();

            System.out.print("Number B: ");
            int b;

            try {
                b = Integer.parseInt(scan.next());

            }catch (Exception ignored){
                System.out.println("Enter a Valid Number.");
                continue;
            }

            System.out.println();
            switch (op){
                default -> System.out.println("Enter a Valid Operation");
                case "*" -> System.out.println(a * b);
                case "/" -> System.out.println(a / b);
                case "-" -> System.out.println(a - b);
                case "+" -> System.out.println(a + b);
            }

            System.out.println();
            System.out.print("Do you want to calculate again (y/n)?:");

            if (!scan.next().equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}