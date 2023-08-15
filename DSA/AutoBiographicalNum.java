
import java.util.*;

public class AutoBiographicalNum {
    public static int findAutoCount(String n) {
        int sum = 0;
        Set<Integer> digits = new HashSet<>();

        for (char c : n.toCharArray()) {
            int digit = c - '0';
            sum += digit;
            digits.add(digit);
        }

        if (sum == n.length()) {
            return digits.size();
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        sc.close();
        System.out.println(findAutoCount(str));
    }
}
