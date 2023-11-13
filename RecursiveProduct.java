import java.util.Scanner;

public class RecursiveProduct {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter five numbers to multiply:");

        // Resursive Start: Begin with first number and the count 1
        int product = recursiveMultiply(1, 1);

        System.out.println("The product of the five numbers is: " + product);
    }

    public static int recursiveMultiply(int count, int total) {
        // Base case:  five numbers have been entered, return the total product
        if (count > 5) {
            return total;
        }

        System.out.print("Enter number " + count + ": ");
        int number = scanner.nextInt();

        // Recursive case: multiply total by the current number and increment the count
        return recursiveMultiply(count + 1, total * number);
    }
}

