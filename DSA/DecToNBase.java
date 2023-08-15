
import java.util.*;

public class DecToNBase {
    public static String dectoNBase(int n, int num) {
        StringBuilder res = new StringBuilder();
        int quotient = num / n;
        res.append(Character.forDigit(num % n, n)); // Append first remainder

        while (quotient != 0) {
            res.insert(0, Character.forDigit(quotient % n, n)); // Insert remainders at the beginning
            quotient = quotient / n;
        }

        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and num: ");
        int n = sc.nextInt();
        int num = sc.nextInt();
        sc.close();
        System.out.println(dectoNBase(n, num));
    }
}
