import java.util.Scanner;
 
public class CF {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long total = 0;
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            boolean isFalse=false;
            long[] arr = new long[(int) a];
 
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextLong();
            }
 
   
 
            if(Math.min(arr[0] * c, d)>=b){
                System.out.println("NO");
                continue;
            }
            total += Math.min(arr[0] * c, d);
            for (int i = 0; i < arr.length - 1; i++) {
                long diff = Math.abs(arr[i+1] - arr[i]);
                if (diff * c < d) {
                    total += diff * c;
          
                } else if (diff * c >= d) {
                    total += d;
                }
                // System.out.println(total);
                if(total>=b){
                  isFalse=true;
                  break;
                }
         
            }
 
            if (!isFalse) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
