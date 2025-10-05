//https://leetcode.com/problems/combinations/description/
import java.util.*;
public class Combination {
    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();

        solve(1, k, n, list, new ArrayList<>());
        return list;
    }
    public static void solve(int start, int k, int n, List<List<Integer>> list, List<Integer> temp)
    {
        if(temp.size()==k)
        {
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=n;i++)
        {
            temp.add(i);
            solve(i+1,k,n,list,temp);
            temp.remove(temp.size()-1);
        }
    }
}
