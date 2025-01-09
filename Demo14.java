package core;
import java.util.Scanner; 
public class Demo14 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();
        System.out.print("Enter number of months: ");
        int months = scanner.nextInt();
        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();
        long totalMinutes = convertToMinutes(years, months, days);
        System.out.println("Total time in minutes: " + totalMinutes);
        scanner.close();
    }
    public static long convertToMinutes(int years, int months, int days) {
        final int MINUTES_IN_A_DAY = 1440; 
        final int AVERAGE_DAYS_IN_A_YEAR = 365; 
        final int AVERAGE_DAYS_IN_A_MONTH = 30;
        long totalDays = years * AVERAGE_DAYS_IN_A_YEAR 
                         + months * AVERAGE_DAYS_IN_A_MONTH 
                         + days;
        return totalDays * MINUTES_IN_A_DAY;
    }
}