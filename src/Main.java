import come.challenge._1_series.Series;

public class Main {
  public static void main(String[] args) {
    int sum = Series.nSum(10);
    System.out.println("Sum: " + sum);
    int product = Series.factorial(10);
    System.out.println("Product: " + product);
    int fibonacci = Series.fibonacci(10);
    System.out.println("Fibonacci: " + fibonacci);
  }
}