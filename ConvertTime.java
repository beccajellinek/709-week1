import java.util.Scanner;

class ConvertTime {
  public static void main(String[] args) {
    final int SEC_PER_MIN = 60;
    final int MIN_PER_HOUR = 60;
    final int SEC_PER_HOUR = SEC_PER_MIN * MIN_PER_HOUR;
    
    int hour, minute, second;
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the hour: ");
    hour = in.nextInt();

    System.out.print("Enter the minute: ");
    minute = in.nextInt();

    System.out.print("Enter the second: ");
    second = in.nextInt();

    int total = (hour * SEC_PER_HOUR) + 
      (minute * SEC_PER_MIN) + 
      second;

    System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n", total, hour, minute, second);

    
  }
}