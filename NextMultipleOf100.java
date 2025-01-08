package ps002;
import java.util.Scanner;
public class NextMultipleOf100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println(-1);
        } else {
            int nextMultiple = ((number / 100) + 1) * 100;
            System.out.println("Next multiple of 100: " + nextMultiple);
        }
        sc.close();
  }
}
