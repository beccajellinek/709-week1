import java.util.Scanner;

class ConvertTemp {
  public static void main(String[] args) {
    double celsius, farhenheit;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a temperature in Celsius: ");
    celsius = in.nextDouble();
    farhenheit = (celsius) * (9.0 / 5.0) + 32.0;
    System.out.printf("%.1f C = %.1f F\n", celsius, farhenheit);
  }
}