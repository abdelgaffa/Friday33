import java.util.Scanner;

public class InputArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.0, 10.1};

        try {

            System.out.print("Enter k1: ");
            int k1 = scanner.nextInt();
            System.out.print("Enter k2: ");
            int k2 = scanner.nextInt();


            for (int i = k1; i <= k2; i++) {
                System.out.printf("Enter value for index %d: ", i);
                array[i] = scanner.nextDouble();
            }


            System.out.println("Updated array:");
            for (double element : array) System.out.printf("%.1f ", element);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}