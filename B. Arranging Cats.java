
import java.util.*;
public class CF {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            String b=sc.next();
            String c=sc.next();
            int count=0;
            int count1=0;
            int count2=0;
            for(int i=0;i<b.length();i++){
               if(b.charAt(i)=='1') count1++;
               if(c.charAt(i)=='1') count2++;
                if( b.charAt(i)== c.charAt(i) && b.charAt(i)=='1'){
                count++;
                }
            }
            int an=Math.max(count1,count2);
            System.out.println(an-count);
           }
        }
    }
