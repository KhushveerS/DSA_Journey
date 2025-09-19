//https://codeforces.com/problemset/problem/2009/A
import java.util.*;
public class Minimize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int res[]=new int[t];

        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            res[i]=b-a;
        }
        for(int a:res)
        {
            System.out.println(a);
        }
    }
}
