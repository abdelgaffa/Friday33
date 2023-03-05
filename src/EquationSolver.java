public class EquationSolver {

    public static double solveEquation(double x) {
        double a = Math.random() * 100 - 50;
        double result;
        if (x < 0) {
            try {
                result = x + Math.sin(Math.pow(1 / x - a, 2) + 4);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero");
                return Double.NaN;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                return Double.NaN;
            }
        } else {
            try {
                result = a * x / Math.sqrt(Math.pow(a, 2) - Math.pow(x, 2));
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero");
                return Double.NaN;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                return Double.NaN;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double x = 3.0;
        double result = 0;
        try {
            result = solveEquation(x);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("f(" + x + ") = " + result);
    }
}