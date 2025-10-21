import java.util.*;
public class bepsoitive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int res[]=new int[t];

        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int none=0;
            int zero=0;
            int oper=0;
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
                if(arr[j]==-1)
                    none++;
                else if(arr[j]==0)
                    zero++;
            }
            if(none%2==0)
            {
                oper=zero*1;
            }
            else if(none%2!=0)
            {
                oper=2+zero*1;
            }
            res[i]=oper;
        }
        for(int a:res)
        {
            System.out.println(a);
        }
    }

}
