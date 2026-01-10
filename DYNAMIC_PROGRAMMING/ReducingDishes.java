import java.util.*;
public class ReducingDishes {

    public static void main(String[] args) {

    }

    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n=satisfaction.length;
        int arr[]=new int[n+1];
        Arrays.fill(arr,-1);
        return solveRec(satisfaction,0,0);
    }
    public int solveMem(int [] satisfication,int index,int time,int arr[],int n)
    {
        //BASE CASE
        if(index== satisfication.length)
        {
            return 0;
        }
        if(arr[n]!=-1)
            return arr[n];

        int include=satisfication[index]*(time+1)+ solveMem(satisfication,index+1,time+1,arr,n);
        int exclude=0+ solveMem(satisfication,index+1,time,arr,n);
        arr[n]=Math.max(include,exclude);
        return arr[n];

    }

    public int solveRec(int [] satisfication,int index,int time)
    {
        //BASE CASE
        if(index== satisfication.length)
            return 0;

        int include=satisfication[index]*(time+1) + solveRec(satisfication,index+1, time+1);
        int  exclude=0 + solveRec(satisfication,index+1,time);
        return Math.max(include,exclude);
    }
}
