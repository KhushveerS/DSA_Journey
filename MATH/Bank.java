import java.util.*;
public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=7)
        {
            System.out.println(n*(n+1)/2);
        }
        int sum=0;
        int c=0;
        int q=n/7;
        int rem=n%7;
        for(int i=1;i<=q;i++)
        {
            sum=sum+ 28 + 7*(i-1);
        }
        System.out.println(sum);

        for(int i=1;i<=rem;i++)
        {
            c=c+(q+i);
            System.out.println(c);
        }
        System.out.println(c);
    }
    public int totalMoney(int n) {

        if(n<=7)
        {
            return n*(n+1)/2;
        }
        int sum=0;
        int q=n/7;
        int rem=n%7;
        for(int i=1;i<=q;i++)
        {
            sum=sum+ 28 + 7*(i-1);
        }

        for(int i=1;i<=rem;i++)
        {
            sum=sum+(q+1);
        }
        return sum;
    }
}
