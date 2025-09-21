import java.util.*;
public class kthlargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(findkthlargest(new int[]{1,2,4,5,6,7},3));
    }
    public static int findkthlargest(int nums[],int k)
    {
        PriorityQueue<Integer>  minh = new PriorityQueue<>();
        for(int it:nums)
        {
            minh.add(it);
            if(minh.size()>k)
            {
                minh.remove();
            }
        }
        return minh.peek();
    }
}
