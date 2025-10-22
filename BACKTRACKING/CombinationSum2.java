//https://leetcode.com/problems/combination-sum-ii/description/
import java.util.*;
public class CombinationSum2 {
    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{10,1,2,7,6,1,5},8));
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,target,0,cur,res);
        return res;
    }
    public static void solve(int candiates[],int target,int indx,List<Integer> cur,List<List<Integer>> res){

        if(target<0)
        {
            return;
        }

        if(target==0)
        {
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=indx;i<candiates.length;i++)
        {

            if (candiates[i] > target) break;

            cur.add(candiates[i]);
                solve(candiates, target - candiates[i], i + 1, cur, res);
                cur.remove(cur.size()-1);


        }
    }
}
