import java.util.*;
public class DNASequence {
    public static void main(String[] args) {
        System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }
    public static  List<String> findRepeatedDnaSequences(String s) {
        ArrayList<String> list=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();

        for(int i=0;i<=s.length()-10;i++)
        {
            String na=s.substring(i,i+10);
            if(map.containsKey(na))
                map.put(na,map.getOrDefault(na,0)+1);
            else
                map.put(na,1);

        }
        for(Map.Entry<String,Integer> e:map.entrySet())
        {
            if(e.getValue()>=2)
                list.add(e.getKey());
        }



        return list;

    }
}
