import java.util.*;
public class SublimeSeq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        int res[]=new int[t];

        for(int i=0;i<t;i++)
        {
            int x=sc.nextInt();
            int n=sc.nextInt();
            if(n%2==0)
            {
                res[i]=0;
            }
            else {
                res[i]=x;
            }
        }
        for(int a:res)
        {
            System.out.println(a);
        }
    }
}
