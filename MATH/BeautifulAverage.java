import java.util.*;
public class BeautifulAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       int ans[]=new int[t];

        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
           int arr[]=new int[n];
           for(int j=0;j<n;j++)
           {
               arr[j]=sc.nextInt();
           }
           int e=0;
           int o=0;
            for(int k:arr)
            {
                if(k%2==0)
                    e++;
                else
                    o++;
            }
            if(e==o)
            {
                Arrays.sort(arr);
            }
            if(e!=o && (e!=0 && o!=0))
            {
                Arrays.sort(arr);
            }
            for(int j:arr)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
