import java.util.Scanner;
 
public class C1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
     
        int result = transformToM(n, m);
 
        System.out.println(result);
    }
 
    public static int transformToM(int n, int m) {
        if (m % n != 0) {
            // If m is not divisible by n, it's impossible to transform
            return -1;
        }
 
        int moves = 0;
        int factor = m / n;
 
        // Continue dividing by 2 and 3 until it's no longer divisible
        while (factor % 2 == 0 || factor % 3 == 0) {
            if (factor % 2 == 0) {
                factor /= 2;
                moves++;
            } else if (factor % 3 == 0) {
                factor /= 3;
                moves++;
            }
        }
 
        // If the remaining factor is 1, return the number of moves, otherwise, it's impossible
        return (factor == 1) ? moves : -1;
    }
}
