import java.util.*;
public class CombinationSum {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,5},8));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

    List<List<Integer>> ans =new ArrayList<>();
    List<Integer> cur=new ArrayList<>();

    solve(candidates,target,0,ans,cur);
    return ans;
    }
    public static void solve(int candidates[],int target,int i,List<List<Integer>> ans,List<Integer> cur){
        if(i==candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(cur));
            }
            return ;
        }
        if(candidates[i]<=target){
            cur.add(candidates[i]); //DO
            solve(candidates,target-candidates[i],i,ans,cur); // EXPLORE
            cur.remove(cur.size()-1); // UNDO
        }
        solve(candidates,target,i+1,ans,cur);

        }
    }

